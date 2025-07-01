package model;

public class Cliente {
	private String idCliente;
	private String nomeCliente;
	private String cpfCliente;
	private String dataNasc;
	private String telefone;
	private String endereco;
	private String email;
	
	// Metodo construtor carregado
	public Cliente(String idCliente, String nomeCliente, String cpfCliente, String dataNasc, String telefone,
			String endereco, String email) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}

// Metodo construtor vazio
	public Cliente() {
		super();
	}

	
	// Getters & Setters 
	
	
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
