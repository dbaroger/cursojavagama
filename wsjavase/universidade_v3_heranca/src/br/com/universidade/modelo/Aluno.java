package br.com.universidade.modelo;

import br.com.universidade.interfaces.PadraoPessoas;

public class Aluno extends Pessoa implements PadraoPessoas{

	private String email;
	private int rm;
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
				"Email....: " + email + "\n" +
				"RM.......: " + rm + "\n";
	}
	
	public void setAll(String nome, Endereco endereco, String email, int rm) {
		super.setAll(nome, endereco);
		this.email = email;
		this.rm = rm;
	}

	
	public Aluno() {
		super();
	}

	public Aluno(String nome, Endereco endereco, String email, int rm) {
		super(nome, endereco);
		this.email = email;
		this.rm = rm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public boolean verificarDados() {
		if(email.indexOf("@")>-1) {
			return true;
		}
		return false;
	}

	
}








