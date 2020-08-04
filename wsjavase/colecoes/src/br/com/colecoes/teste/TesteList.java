package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add("DBA");
		lista.add(15000);
		lista.add("ESTAGIARIO");
		lista.add(1500);
		lista.add("ANALISTA");
		lista.add(16000);
		lista.add("DBA");
		lista.add(15000);
		System.out.println("Não ordenada: "+ lista);
		//Collections.sort(lista) nao é permitido;
		System.out.println("Ordenada: " + lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		//lista.remove(0);
		System.out.println("Com o primeiro elemento removido: " + lista);
		System.out.println("Usando o FOR");
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
		}
		int totalSalario=0;
		for (int contador2=1;contador2<lista.size();contador2+=2) {
				totalSalario+= (int) lista.get(contador2);
			}
		System.out.println(totalSalario);
		}
	}

