package application;

import connectionFactory.ConnectionDatabase;
import dao.ClienteDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Cliente;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;



public class Main extends Application {
	
	// public static String tela = "/view/ViewLogin.fxml";
	private static Stage stage;
	private static Scene main;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			stage = primaryStage;
			
			Parent fxmlLogin = FXMLLoader.load(getClass().getResource("/view/ViewLogin.fxml"));
			main = new Scene(fxmlLogin);
			stage.setTitle("LOG IN");
			stage.setScene(main);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void TelaHome() throws IOException{
		FXMLLoader fxmlHome = new FXMLLoader();
		fxmlHome.setLocation(Main.class.getResource("/view/MainMenu.fxml"));
		Parent TelaHome = fxmlHome.load();
		main = new Scene(TelaHome);
		stage.setTitle("TELA PRINCIPAL");
		stage.setScene(main);
		stage.setResizable(false);
		stage.centerOnScreen();
		stage.show();
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
		
		/*/ArrayList<Cliente> clientes = new ArrayList<>();
		
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
		
		clientedao.read();*/
		
		launch(args);
		
	}
}
