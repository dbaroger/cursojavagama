package br.com.colecoes.beans;

public class Cargo implements Comparable<Cargo>{
	private String nome;
	private float salario;
	private String nivel;
	

	
	public void setAll(String nome, float salario, String nivel) {
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	}

	public String getAll() {
		return
				"Nome: " + nome + "\n" +
				"Salario: " + salario + "\n" + 
				"Nivel: " + nivel; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Cargo(String nome, float salario, String nivel) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	}
	public Cargo() {
		super();
	}

//	public int compareTo(Cargo outro) {
//		if (salario<outro.salario) {
//			return -1;
//		}
//		else if (salario>outro.salario) {
//			return 1;
//		}
//		return 0;
//	}
	
	public int compareTo(Cargo outro) {
		return this.nome.compareTo(outro.nome);
		// return this.nome.compareTo(outro.nome)*-1 // para ordenar decrescente;
		// return -nome.compareTo(outro.nome) // para ordenar decrescente;
	}
	
	

}
