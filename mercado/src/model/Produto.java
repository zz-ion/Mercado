package model;

public class Produto {

	private String idProduto;
	private String nomeProd;
	private String codBarra;
	private String tipoUn;
	private String dataFab;
	private String dataVal;
	private String precoUn;
	private String estoque;
	
	
	
	// Construtor carregado
	
	public Produto(String idProduto, String nomeProd, String codBarra, String tipoUn, String dataFab, String dataVal,
			String precoUn, String estoque) {
		super();
		this.idProduto = idProduto;
		this.nomeProd = nomeProd;
		this.codBarra = codBarra;
		this.tipoUn = tipoUn;
		this.dataFab = dataFab;
		this.dataVal = dataVal;
		this.precoUn = precoUn;
		this.estoque = estoque;
	}


	// Construtor vazio
	
	public Produto() {
		super();
	}

	// Getters & Setters
	
	
	public String getidProduto() {
		return idProduto;
	}
	
	
	public void setidProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	
	
	public String getNomeProd() {
		return nomeProd;
	}
	
	
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	
	
	public String getCodBarra() {
		return codBarra;
	}
	
	
	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}
	
	
	public String getTipoUn() {
		return tipoUn;
	}
	
	
	public void setTipoUn(String tipoUn) {
		this.tipoUn = tipoUn;
	}
	
	
	public String getDataFab() {
		return dataFab;
	}
	
	
	public void setDataFab(String dataFab) {
		this.dataFab = dataFab;
	}
	
	
	public String getDataVal() {
		return dataVal;
	}
	
	
	public void setDataVal(String dataVal) {
		this.dataVal = dataVal;
	}
	
	
	public String getPrecoUn() {
		return precoUn;
	}
	
	
	public void setPrecoUn(String precoUn) {
		this.precoUn = precoUn;
	}
	
	
	public String getEstoque() {
		return estoque;
	}
	
	
	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	
	
}


