package br.com.falhas.excecao;

public class Excecao {
	
	public static String tratarExcecao(Exception e){
		if(e instanceof NullPointerException) {
			return "Objeto Nulo";
		}
		else if (e instanceof NumberFormatException) {
			return "Numero Invalido";
		}
		else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor Excedido";
		}
		else {
			return "Excecao nao tratada";
		}
	}
}
