package br.com.ecommerce.modelo;

public class Livro extends Produto{
	
	private String editora;
	private String autor;
	private int isbn;
	
	public String getAll() {
		return	super.getAll() + "\n" + 
				"Editora: " + editora + "\n" +
				"ISBN: " + isbn;
	}
	
	public void setAll(int id, String descricao, int qtde, float valorCompra, float valorVenda, String editora, String autor, int isbn) {
		super.setAll(id, descricao, qtde, valorCompra, valorVenda);
		this.editora = editora;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public Livro() {
		super();
	}
	public Livro(int id, String descricao, int qtde, float valorCompra, float valorVenda, String editora, String autor,
			int isbn) {
		super(id, descricao, qtde, valorCompra, valorVenda);
		this.editora = editora;
		this.autor = autor;
		this.isbn = isbn;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	
}
