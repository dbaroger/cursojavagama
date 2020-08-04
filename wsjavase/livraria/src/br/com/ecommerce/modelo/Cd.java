package br.com.ecommerce.modelo;

public class Cd extends Produto{
	
	private String artista;
	private String gravadora;
	private String estilo;
	
	
	public void setAll(int id, String descricao, int qtde, float valorCompra, float valorVenda, String artista, String gravadora, String estilo) {
		super.setAll(id, descricao, qtde, valorCompra, valorVenda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.estilo = estilo;
	}
	
	public String getAll() {
		return	super.getAll() + "\n" + 
				"Artista: " + artista + "\n" +
				"Gravadora: " + gravadora + "\n" + 
				"Estilo: " + estilo + "\n";
	}
	
	public Cd() {
		super();
	}
	
	public Cd(int id, String descricao, int qtde, float valorCompra, float valorVenda, String artista, String gravadora, String estilo) {
		super(id, descricao, qtde, valorCompra, valorVenda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.estilo = estilo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
}
