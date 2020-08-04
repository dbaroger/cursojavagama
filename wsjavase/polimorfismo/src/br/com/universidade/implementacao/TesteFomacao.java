package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Medio;
import br.com.universidade.modelo.Tecnologo;
import br.com.universidade.tela.Magica;

public class TesteFomacao {

	public static void main(String[] args) {
		Bacharelado b = new Bacharelado();
		b.definirDuracao();
		Formacao formacao=null;
		String opcao = "";
		
		do {
		opcao = Magica.t("Digite a Formacao"); 
		
		if (opcao.equals("MEDIO")) {
			formacao = new Medio(										
									Magica.t("Descricao"),
									Magica.i("Periodo"),
									0,
									0,
									Magica.t("Tipo")
									);
		}
		else if (opcao.equals("TECNOLOGO")) {
			formacao = new Tecnologo(										
										Magica.t("Descricao"),
										Magica.i("Periodo"),
										0,
										0,
										Magica.b("É estendido?")
										);
		}
		else if (opcao.equals("BACHARELADO")) {
			formacao = new Bacharelado(
										Magica.t("Descricao"),
										Magica.i("Periodo"),
										0,
										0,
										Magica.t("Conclusao"),
										Magica.i("Carga Horaria Estagio")
										);
		}
		formacao.definirDuracao();
		formacao.calcularMensalidade(Magica.d("Digite o Fator"));
		System.out.println(formacao.getAll());
		
		}while(JOptionPane.showConfirmDialog(null,  "Continuar?","Aplicacao Polimorfismo",JOptionPane.YES_NO_OPTION)==0);	
	}

}
