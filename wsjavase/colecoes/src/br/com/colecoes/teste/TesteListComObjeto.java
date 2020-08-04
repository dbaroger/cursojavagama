package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListComObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA",15000,"PLENO"));
		lista.add(new Cargo("DBA",12000,"JR"));
		lista.add(new Cargo("ESTAGIARIO",3000,"SENIOR"));
		lista.add(new Cargo("DEV",14000,"PLENO"));
//		System.out.println(lista.get(1).getAll());
//		for (int cont=0;cont<lista.size();cont++) {
//			System.out.println(lista.get(cont).getAll());
//		}
		float totalSalario=0;
//		for (int cont=0;cont<lista.size();cont++) {
//			totalSalario+=lista.get(cont).getSalario();
//		}
//		System.out.println("Salario Total: " + totalSalario);
		Collections.sort(lista);
		Collections.reverse(lista);
		
		for (Cargo c : lista){
			System.out.println(c.getAll());
			totalSalario+=c.getSalario();
		}
		System.out.println("Salario Total: " + totalSalario);

	}

}