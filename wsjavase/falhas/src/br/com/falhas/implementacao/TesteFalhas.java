package br.com.falhas.implementacao;

import br.com.falhas.excecao.Excecao;

public class TesteFalhas {

	public static void main(String[] args) {
		String palavra=null;
		try {
			int numero = Integer.parseInt("a");
			System.out.println(numero);
			
			System.out.println(palavra.length());
			
			int x[] = new int[2];
			x[0]=15;
			x[1]=98;
			x[2]=12;
			
		}catch(Exception e){
			System.out.println(Excecao.tratarExcecao(e));
		}finally { // as linhas deste bloco ser�o executadas se houver ou n�o excec�o
			System.out.println("Tenha um bom dia!!!");
		}

	}
}	
