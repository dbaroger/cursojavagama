package br.com.ecommerce.modelo;

/*
 * Padr�o DTO (TO ou Beans) Data Transfer Object
 * Todo atributo deve ser pivate
 * Todo atributo deve possuir um m�todo GET (output) e SET (input)
 * Deve existir um construtor vazio e um outro para preencher o objeto no m�nimo
 */

public class Produto {

	private int id;
	private String descricao;
	private int qtde;
	private float valorCompra;
	private float valorVenda;
	
	// Metodo construtor.
	// Quando se instanciar o objeto Produto, esse metodo � chamado inicialmente.
	// Podemos inicializar variaveis e/ou outras operacoes logo de inicio.
	// Podemos criar mais de um construtor com o mesmo nome.

	
	
	public int getId() {
		return id;
	}

	public Produto() {
		super();
	}

	public Produto(int id, String descricao, int qtde, float valorCompra, float valorVenda) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public void setAll(int pId, String pDescricao, int pQtde, float pValorCompra, float pValorVenda) {
		id = pId;
		descricao = pDescricao.toUpperCase();
		qtde = pQtde;
		valorCompra = pValorCompra;
		valorVenda = pValorVenda;
	}
	
	public String getAll() {
		return "ID: " + id + 
				"\nDecricao: " + descricao +
				"\nQtde: " + qtde + 
				"\nValor Compra: R$" + valorCompra +
				"\nValor Venda: R$" + valorVenda;
	}
	
	public float getSubtotalVendas() {
		return qtde*valorVenda;
	}
	
	public double getValorVista() {
		return valorVenda*0.9;
	}
	
	public void setAjuste(float porcentagem) {
		valorCompra = valorCompra*(porcentagem/100+1);
		valorVenda = valorVenda*(porcentagem/100+1);
	}
	
	public String avaliarEstoque() {
		if (qtde > 20) {
			return "Estque Cheio";
		}
		else if (qtde >9 && qtde<21) {
			return "Estoque Medio";
		}
		else {
			return "Estoque Baixo";
		}
	}
	
	public String getDescricaoSimples() {
		if (descricao.indexOf(" ")==-1) {
			return descricao;			
		}
		else {
			return descricao.substring(0,descricao.indexOf(" "));
		}
	}
	
}
