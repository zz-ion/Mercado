package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connectionFactory.ConnectionDatabase;
import model.Funcionario;


public class FuncionarioDAO {

	public void create(Funcionario funcionario) {
		Connection con = ConnectionDatabase.getConnection();
		PreparedStatement stmt = null;


		try {
			stmt = con.prepareStatement("INSERT INTO Cliente values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, funcionario.getNomeFuncionario());
			stmt.setString(2, funcionario.getCpfFuncionario());
			stmt.setString(3, funcionario.getDataNasc());
			stmt.setString(4, funcionario.getTelefone());
			stmt.setString(5, funcionario.getEndereco());
			stmt.setString(6, funcionario.getEmail());
			stmt.setString(7, funcionario.getCargo());
			stmt.setString(8, funcionario.getNivel());
			stmt.setString(9, funcionario.getSenha());


			stmt.execute();
			System.out.print("Funcionario cadastrado!");



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Erro ao cadastra !", e);
		} finally {
			ConnectionDatabase.closeConnection(con, stmt);

		}
	}
	

	public ArrayList<Funcionario> read() {
	    Connection con = ConnectionDatabase.getConnection();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    ArrayList<Funcionario> funcionarios = new ArrayList<>();

	    try {
	        stmt = con.prepareStatement("SELECT * FROM Funcionario");
	        rs = stmt.executeQuery();

	        while (rs.next()) {
	            Funcionario funcionario = new Funcionario();
	            funcionario.setIdFuncionario(rs.getString("idFuncionario"));
	            funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
	            funcionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
	            funcionario.setDataNasc(rs.getString("dataNasc"));
	            funcionario.setTelefone(rs.getString("telefone"));
	            funcionario.setEndereco(rs.getString("endereco"));
	            funcionario.setEmail(rs.getString("email"));
	            funcionario.setCargo(rs.getString("cargo"));
	            funcionario.setNivel(rs.getString("nivel"));
	            funcionario.setSenha(rs.getString("senha"));
	            
	            funcionarios.add(funcionario);
	        }

	    } catch (Exception e) {
	        throw new RuntimeException("Erro ao ler os dados ", e);
	        
	    } finally {
	        ConnectionDatabase.closeConnection(con, stmt, rs);
	    }

	    return funcionarios;
	}


	public void update(Funcionario funcionario) {
	    Connection con = ConnectionDatabase.getConnection();
	    PreparedStatement stmt = null;

	    try {
	        stmt = con.prepareStatement("UPDATE Funcionario SET nomeFuncionario = ?, cpfFuncionario = ?, dataNasc = ?, telefone = ?, endereco = ?, email = ?, cargo = ?, nivel = ?, senha = ? WHERE cpfFuncionario = ?");
	        
	        stmt.setString(1, funcionario.getNomeFuncionario());
	        stmt.setString(2, funcionario.getCpfFuncionario()); 
	        stmt.setString(3, funcionario.getDataNasc());
	        stmt.setString(4, funcionario.getTelefone());
	        stmt.setString(5, funcionario.getEndereco());
	        stmt.setString(6, funcionario.getEmail());
	        stmt.setString(7, funcionario.getCargo());
	        stmt.setString(8, funcionario.getNivel());
	        stmt.setString(9, funcionario.getSenha());
	        stmt.setString(10, funcionario.getCpfFuncionario());

	        stmt.executeUpdate();
	        System.out.println("Funcionário atualizado com sucesso!");

	    } catch (SQLException e) {
	        throw new RuntimeException("Erro ao atualizar funcionário!", e);
	    } finally {
	        ConnectionDatabase.closeConnection(con, stmt);
	    }
	}

	public void delete(String cpf) {
		Connection con = ConnectionDatabase.getConnection();
		PreparedStatement stmt = null;


		try {
			stmt = con.prepareStatement("DELETE FROM Funcionario where cpfFuncionario = ?");
			stmt.setString(1, cpf);

			stmt.execute();
			System.out.println("Funcionario apagado!");


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Erro ao apagar !", e);
		} finally {
			ConnectionDatabase.closeConnection(con, stmt);

		}
	}
	public ArrayList<Funcionario> search (String pesquisar) {
		Connection con = ConnectionDatabase.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		pesquisar = "%" + pesquisar + "%";
		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		try {
			stmt = con.prepareStatement("SELECT * FROM Funcionario where nomeFuncionario like ? or cpfFuncionario like ? ");
			stmt.setString(1, pesquisar);
			stmt.setString(2, pesquisar);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setIdFuncionario(rs.getString("idFuncionario"));
				funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
				funcionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
				funcionario.setDataNasc(rs.getString("dataNasc"));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setEndereco(rs.getString("endereco"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setCargo(rs.getString("cargo"));
				funcionario.setNivel(rs.getString("nivel"));
				funcionario.setSenha(rs.getString("senha"));
				funcionarios.add(funcionario);

			}

		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Erro ao ler os dados",e);
		}finally{
			ConnectionDatabase.closeConnection(con,stmt,rs);
		}
		return funcionarios;


	}
	
	
	public Funcionario autenticarUser (String user, String password) {
		Connection con = ConnectionDatabase.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Funcionario funcionario = new Funcionario();

		try {
			stmt = con.prepareStatement("SELECT * FROM Funcionario where cpfFuncionario = ? and senha = ? ");
			stmt.setString(1, user);
			stmt.setString(2, password);
			rs = stmt.executeQuery();

			while (rs.next()) {
				funcionario.setIdFuncionario(rs.getString("idFuncionario"));
				funcionario.setNomeFuncionario(rs.getString("nomeFuncionario"));
				funcionario.setCpfFuncionario(rs.getString("cpfFuncionario"));
				funcionario.setDataNasc(rs.getString("dataNasc"));
				funcionario.setTelefone(rs.getString("telefone"));
				funcionario.setEndereco(rs.getString("endereco"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setCargo(rs.getString("cargo"));
				funcionario.setNivel(rs.getString("nivel"));
				funcionario.setSenha(rs.getString("senha"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Erro ao ler os dados",e);
		}finally{
			ConnectionDatabase.closeConnection(con,stmt,rs);
		}
		return funcionario;


	}
	
}


