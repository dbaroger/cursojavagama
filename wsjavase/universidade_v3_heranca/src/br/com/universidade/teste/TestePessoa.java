package br.com.universidade.teste;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;
import br.com.universidade.tela.Magica;

public class TestePessoa {

	public static void main(String[] args) {
		
		String escolha = Magica.t("Sigite a opcao PRFESSOR ou ALUNO");
		
		if (escolha.equals("ALUNO")){
			Aluno aluno = new Aluno(Magica.t("Nome"), 
									new Endereco(),
									Magica.t("Email"),
									Magica.i("RM")
							);

			aluno.getAll();
			}
		else if (escolha.equals("PROFESSOR")){
			Professor professor = new Professor();
			//professor.setAll(nome, endereco);
			System.out.println(professor.getAll());
			}
		else {
			System.out.println("Escolha invalida.");
		} 

}
}