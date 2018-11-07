package com.devon.linguagens.prova02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro("A");
		Carro c2 = new Carro("A");
		Carro c3 = new Carro("B");
		Carro c4 = new Carro("B");
		Carro c5 = new Carro("A");
		Carro c6 = new Carro("B");
		Carro c7 = new Carro("A");
		Carro c8 = new Carro("A");
		Carro c9 = new Carro("A");
		
		ArrayList<Carro> carros = new ArrayList<>();
		carros.add(c1);
		carros.add(c2);
		carros.add(c3);
		carros.add(c4);
		carros.add(c5);
		carros.add(c6);
		carros.add(c7);
		carros.add(c8);
		carros.add(c9);
		
		
		Ponte ponte = new Ponte();
		
		ponte.adicionaCarrosNaFila(carros);
		
		CarroAB carroAb = new CarroAB(ponte);
		CarroBA carroBa = new CarroBA(ponte);
		
		carroAb.start();
		carroBa.start();
		
		
	}
	
}
