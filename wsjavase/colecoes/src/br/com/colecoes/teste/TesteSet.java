package br.com.colecoes.teste;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		// SET não permite dados duplicados. Ele sobrepoe.
		// É mais lento que LIST para inclusao, mas mais rapido para consulta.
		Set lista = new HashSet();
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("DBA");
		lista.add("DEV");
		lista.add("GP");
		System.out.println("Não ordenada: "+ lista);
//		Collections.sort(lista);  não permite
		lista.remove("DEV");
		System.out.println(lista);
		System.out.println(lista.contains("DBA"));
		System.out.println(lista);
//		lista.remove(0);
//		System.out.println("Com o primeiro elemento removido: " + lista);
	}

}
