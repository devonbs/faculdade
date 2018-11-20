package com.devon.programacao.lista03;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class Main {
	
	Collection<Integer> collLista;
	
	int[] lista = new int[100000];
	
	public static void main(String[] args) {
		Main main = new Main();
		Random random = new Random();
		for (int i = 0; i < 99999; i++) {
			main.lista[i] = random.nextInt(10000000);
		}
		main.lista[99999] = 10000001;
		
		main.geraNumerosLinkedList(main.lista);
		main.geraNumerosArrayList(main.lista);
		main.geraNumerosVector(main.lista);
		main.geraNumerosHashSet(main.lista);
		main.geraNumerosLinkedHashSet(main.lista);
		main.geraNumerosTreeSet(main.lista);
		main.geraNumerosPriorityQueue(main.lista);
		main.geraNumerosArrayDeque(main.lista);
		
	}
	
	public void geraNumerosLinkedList(int[] lista) {
		System.out.println("-----Gerando valores-------");
		Long inicio = System.currentTimeMillis();
		collLista = new LinkedList<>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		
		verificaOutrasOpcoes();
		removeElementos();
	}

	private void removeElementos() {
		System.out.println("-----remove elementos------");
		Long inicio = System.currentTimeMillis();
		Iterator<Integer> iterador = collLista.iterator();
		int contador = 1;
		while(iterador.hasNext()) {
			Integer atual = iterador.next();
			if(contador % 2 == 0) {
				iterador.remove();
			}
			contador++;
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
	}

	private void verificaOutrasOpcoes() {
		System.out.println("-----verifica outras opcoes------");
		Iterator<Integer> iterador = collLista.iterator();
		while(iterador.hasNext()) {
			Integer atual = iterador.next();
			if(atual.equals(10000001)) {
				System.out.println("Existe 10.000.001");
				break;
			}
		}
		if(collLista.contains(99000000)) {
			System.out.println("Existe 99.000.000");
		}
	}
	
	public void geraNumerosArrayList(int[] lista) {
		System.out.println("---- gera array list -----");
		Long inicio = System.currentTimeMillis();
		collLista = new ArrayList<>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		verificaOutrasOpcoes();
		removeElementos();
	}
	
	public void geraNumerosVector(int[] lista) {
		System.out.println("---- gera vector -----");
		Long inicio = System.currentTimeMillis();
		collLista = new Vector<>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		verificaOutrasOpcoes();
		removeElementos();
	}
	
	public void geraNumerosHashSet(int[] lista) {
		System.out.println("---- gera hashset -----");
		Long inicio = System.currentTimeMillis();
		collLista = new HashSet<Integer>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		verificaOutrasOpcoes();
		removeElementos();
	}
	
	public void geraNumerosLinkedHashSet(int[] lista) {
		System.out.println("---- gera linked hashset -----");
		Long inicio = System.currentTimeMillis();
		collLista = new LinkedHashSet<Integer>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		verificaOutrasOpcoes();
		removeElementos();
	}
	public void geraNumerosTreeSet(int[] lista) {
		System.out.println("---- gera treeset -----");
		Long inicio = System.currentTimeMillis();
		collLista = new TreeSet<Integer>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		verificaOutrasOpcoes();
		removeElementos();
	}
	public void geraNumerosPriorityQueue(int[] lista) {
		System.out.println("---- gera priority queue -----");
		Long inicio = System.currentTimeMillis();
		collLista = new PriorityQueue<Integer>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		verificaOutrasOpcoes();
		removeElementos();
	}
	public void geraNumerosArrayDeque(int[] lista) {
		System.out.println("---- gera array deque -----");
		Long inicio = System.currentTimeMillis();
		collLista = new ArrayDeque<Integer>();
		for (int i = 0; i < lista.length; i++) {
			collLista.add(lista[i]);
		}
		System.out.println(System.currentTimeMillis() - inicio);
		System.out.println(collLista.size());
		verificaOutrasOpcoes();
		removeElementos();
	}
	
	
	

}
