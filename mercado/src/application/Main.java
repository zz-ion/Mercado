package application;

import connectionFactory.ConnectionDatabase;
import dao.ClienteDAO;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Cliente;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import java.sql.Connection;
import java.util.ArrayList;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ();
		ClienteDAO clientedao = new ClienteDAO();
		
		//create 
		
	/*	cliente.setNomeCliente("Pedro");
		cliente.setCpfCliente("08157290147");
		cliente.setDataNasc("2001-03-11");
		cliente.setTelefone("929392912");
		cliente.setEndereco("Rua 1, numero 66");
		cliente.setEmail("pedro@gmail");
		clientedao.create(cliente); */
		
		
		
		// read ou select
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes = clientedao.read();
		
		for(int i = 0; i < clientes.size(); i++) {
			cliente = clientes.get(i);
			System.out.println("||");
			System.out.print(cliente.getIdCliente());
			System.out.print("|");
			System.out.print(cliente.getNomeCliente());
			System.out.print("|");
			System.out.print(cliente.getCpfCliente());
			System.out.print("|");
			System.out.print( cliente.getDataNasc());
			System.out.print("|");
			System.out.print(cliente.getTelefone());
			System.out.print("|");
			System.out.print( cliente.getEndereco());
			System.out.println("|");
			System.out.print(cliente.getEmail());
		}
		
		clientedao.read();
		
		launch(args);
		
	}
}
