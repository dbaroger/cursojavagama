package br.com.universidade.modelo;

import br.com.universidade.interfaces.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao{
	
	private boolean planoEstendido;
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao()*fator*600);
	}

	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	public String getAll() {
		return super.getAll() + "\n" + "Plano Estendido" + planoEstendido;
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

}
