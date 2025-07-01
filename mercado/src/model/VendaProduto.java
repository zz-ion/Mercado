package model;

public class VendaProduto {

	private String idVendaProduto;
	private String FK_idVenda;
	private String FK_idProduto;
	private String quantidade;
	private String valorTotal;
	
	// Construtor carregado
	
	public VendaProduto(String idVendaProduto, String fK_idVenda, String fK_idProduto, String quantidade,
			String valorTotal) {
		super();
		this.idVendaProduto = idVendaProduto;
		FK_idVenda = fK_idVenda;
		FK_idProduto = fK_idProduto;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	// Construtor vazio
	
	public VendaProduto() {
		super();
	}
	
	// Getters & Setters

	public String getIdVendaProduto() {
		return idVendaProduto;
	}

	public void setIdVendaProduto(String idVendaProduto) {
		this.idVendaProduto = idVendaProduto;
	}

	public String getFK_idVenda() {
		return FK_idVenda;
	}

	public void setFK_idVenda(String fK_idVenda) {
		FK_idVenda = fK_idVenda;
	}

	public String getFK_idProduto() {
		return FK_idProduto;
	}

	public void setFK_idProduto(String fK_idProduto) {
		FK_idProduto = fK_idProduto;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
