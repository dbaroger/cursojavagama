package br.com.universidade.modelo;

public abstract class Formacao {
	
	private String descricao = ""; // ou descricao = new String();
	private int periodo;  // primitivos sempre iniciam com 0
	private double mensalidade;
	private int duracao;
	
	// cria o metodo vazio para constar na superclasse e nao dar erro
	public void calcularMensalidade(double fator) {	
	}
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1+ps2)/2;
	}
	
	// Metodo Worker (nao é setter, getter e constructor)
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return (((ps1+ps2)/2*0.8)+((nac1+nac2)/2*0.2))/2;
		// (ps1*0.8 + nac1*0.2)+(ps2*0.8 + nac2*0.2))/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return (((ps1+ps2)/2*0.5)+((nac1+nac2)/2*0.2)+((am1+am2)/2*0.3))/3;
		// (ps1*0.5 + nac1*0.2 + am1*0.3)+(ps2*0.5 + nac2*0.2 + am2*0.3))/2;
	}
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao = 36;
		}
		else if (this instanceof Tecnologo) {
			duracao = 24;
		}
		else if (this instanceof Bacharelado) {
			if (descricao.toUpperCase().indexOf("ENGENHARIA")==-1) {
				duracao = 48;
			}
			else {
				duracao = 60;
			}
		}
	}
	
	public String getAll() {
		return 
				"Descricao: " + descricao + "\n" +
				"Periodo: " + periodo + "\n" +
				"Mensalidade: " + mensalidade + "\n" +
				"Duracao: " + duracao + "\n";
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	
	public Formacao() {
		super();
	}
	
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
