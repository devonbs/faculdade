package com.devon.linguagens.threads;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	
	
	public static void main(String[] args) {
		List<Cadeira> cadeiras = new ArrayList<Cadeira>();
		Barbeiro barbeiro = new Barbeiro(cadeiras);
		Cliente cliente = new Cliente(cadeiras);
		
		barbeiro.start();
		cliente.start();
	}

}
