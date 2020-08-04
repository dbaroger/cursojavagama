package br.com.universidade.modelo;

import br.com.universidade.interfaces.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{
	
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao()*fator*600)+(cargaHorariaEstagio*12));
	}
	
	public String getAll() {
		return	super.getAll() + "\n" + projetoConclusao + 
				"Conclusao: " + projetoConclusao + "\n" + 
				"Carga Horaria: " +  cargaHorariaEstagio;
	}

	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConstrucao, int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConstrucao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConstrucao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConstrucao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public Bacharelado() {
		super();
	}

	public String getProjetoConstrucao() {
		return projetoConclusao;
	}

	public void setProjetoConstrucao(String projetoConstrucao) {
		this.projetoConclusao = projetoConstrucao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	
	
	

}
