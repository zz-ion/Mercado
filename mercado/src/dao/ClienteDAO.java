package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import connectionFactory.ConnectionDatabase;
import model.Cliente;

public class ClienteDAO {

	public void create(Cliente cliente) {
		Connection con = ConnectionDatabase.getConnection();
		PreparedStatement stmt = null;


		try {
			stmt = con.prepareStatement("INSERT INTO Cliente values(?,?,?,?,?,?)");
			stmt.setString(1, cliente.getNomeCliente());
			stmt.setString(2, cliente.getCpfCliente());
			stmt.setString(3, cliente.getDataNasc());
			stmt.setString(4, cliente.getTelefone());
			stmt.setString(5, cliente.getEndereco());
			stmt.setString(6, cliente.getEmail());

			stmt.execute();
			System.out.print("Cliente cadastrado!");



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Erro ao cadastra !", e);
		} finally {
			ConnectionDatabase.closeConnection(con, stmt);

		}
	}
		
		public ArrayList<Cliente>read(){
			Connection con = ConnectionDatabase.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<Cliente> clientes = new ArrayList<>();
			
			try {
				stmt = con.prepareStatement("SELECT * FROM Cliente");
				rs = stmt.executeQuery();
				
				while (rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setIdCliente(rs.getString("idCliente"));
					cliente.setNomeCliente(rs.getString("nomeCliente"));
					cliente.setCpfCliente(rs.getString("cpfCliente"));
					cliente.setDataNasc(rs.getString("dataNasc"));
					cliente.setTelefone(rs.getString("telefone"));
					cliente.setEndereco(rs.getString("endereco"));
					cliente.setEmail(rs.getString("telefone"));
					clientes.add(cliente);
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException("Erro ao ler os dados",e);
			}finally{
				ConnectionDatabase.closeConnection(con,stmt,rs);
			}
			return clientes;
		
		}
		
		public void update(Cliente cliente) {
			Connection con = ConnectionDatabase.getConnection();
			PreparedStatement stmt = null;


			try {
				stmt = con.prepareStatement("UPDATE Cliente set nomeCliente = ? , cpfCliente = ?, dataNasc = ?,"
			+ "telefone = ?, endereco = ?, email = ? where cpfCliente = ? ");
				stmt.setString(1, cliente.getNomeCliente());
				stmt.setString(2, cliente.getCpfCliente());
				stmt.setString(3, cliente.getDataNasc());
				stmt.setString(4, cliente.getTelefone());
				stmt.setString(5, cliente.getEndereco());
				stmt.setString(6, cliente.getEmail());
				stmt.setString(7, cliente.getCpfCliente());

				stmt.execute();
				System.out.print("Cliente Atualizado!");



			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Erro ao atualizar !", e);
			} finally {
				ConnectionDatabase.closeConnection(con, stmt);

			}
		}
		
		public void delete(String cpf) {
			Connection con = ConnectionDatabase.getConnection();
			PreparedStatement stmt = null;


			try {
				stmt = con.prepareStatement("DELETE FROM Cliente where cpfCliente = ?");
				stmt.setString(1, cpf);
				
				stmt.execute();
				System.out.println("Cliente apagado!");
				

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("Erro ao apagar !", e);
			} finally {
				ConnectionDatabase.closeConnection(con, stmt);

			}
		}
		public ArrayList<Cliente> search (String pesquisar) {
			Connection con = ConnectionDatabase.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			pesquisar = "%" + pesquisar + "%";
			ArrayList<Cliente> clientes = new ArrayList<>();
			
			try {
				stmt = con.prepareStatement("SELECT * FROM Cliente where nomeCliente like ? or cpfCliente like ? ");
				stmt.setString(1, pesquisar);
				stmt.setString(2, pesquisar);
				rs = stmt.executeQuery();
				
				while (rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setIdCliente(rs.getString("idCliente"));
					cliente.setNomeCliente(rs.getString("nomeCliente"));
					cliente.setCpfCliente(rs.getString("cpfCliente"));
					cliente.setDataNasc(rs.getString("dataNasc"));
					cliente.setTelefone(rs.getString("telefone"));
					cliente.setEndereco(rs.getString("endereco"));
					cliente.setEmail(rs.getString("telefone"));
					clientes.add(cliente);
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException("Erro ao ler os dados",e);
			}finally{
				ConnectionDatabase.closeConnection(con,stmt,rs);
			}
			return clientes;
		
		
	}
}








