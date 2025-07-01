package model;

public class Venda {

	private String idVenda;
	private String FK_idCliente;
	private String FK_idFuncionario;
	private String dataVenda;
	private String precoTotal;
	private String formaPag;
	private String quantTotal;
	
	// Construtor carregado
	
	public Venda(String idVenda, String fK_idCliente, String fK_idFuncionario, String dataVenda, String precoTotal,
			String formaPag, String quantTotal) {
		super();
		this.idVenda = idVenda;
		FK_idCliente = fK_idCliente;
		FK_idFuncionario = fK_idFuncionario;
		this.dataVenda = dataVenda;
		this.precoTotal = precoTotal;
		this.formaPag = formaPag;
		this.quantTotal = quantTotal;
	}

	// Construtor vazio
	
	public Venda() {
		super();
	}

	
	// Getters & Setters
	
	
	public String getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(String idVenda) {
		this.idVenda = idVenda;
	}

	public String getFK_idCliente() {
		return FK_idCliente;
	}

	public void setFK_idCliente(String fK_idCliente) {
		FK_idCliente = fK_idCliente;
	}

	public String getFK_idFuncionario() {
		return FK_idFuncionario;
	}

	public void setFK_idFuncionario(String fK_idFuncionario) {
		FK_idFuncionario = fK_idFuncionario;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(String precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public String getQuantTotal() {
		return quantTotal;
	}

	public void setQuantTotal(String quantTotal) {
		this.quantTotal = quantTotal;
	}
	
	
	
	
}
