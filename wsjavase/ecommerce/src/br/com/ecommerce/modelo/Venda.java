package br.com.ecommerce.modelo;

public class Venda {
	
	private int numeroNotaFiscal;
	private Cliente cliente;
	private Produto produto;
	private float total;
	private String data;
	
	public void setAll(int numeroNotaFiscal, Cliente cliente, Produto produto, float total, String data) {
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.cliente = cliente;
		this.produto = produto;
		this.total = total;
		this.data = data;
	}

	public String getAll() {
		return
				"NF: " + numeroNotaFiscal + "\n" +
				"Cliente: " + cliente.getAll() + "\n" +
				"Produto: " + produto.getTudo() + "\n" +
				"Total: " + total + "\n" +
				"Data: " + data + "\n";
	}

	
	public Venda(int numeroNotaFiscal, Cliente cliente, Produto produto, float total, String data) {
		super();
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.cliente = cliente;
		this.produto = produto;
		this.total = total;
		this.data = data;
	}

	public Venda() {
		super();
	}

	public int getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(int numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
