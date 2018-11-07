package com.devon.linguagens.prova02;

import java.util.ArrayList;

public class Ponte {
	
	private ArrayList<Carro> carros;
	
	private boolean isBloqueado = false;

	
	public synchronized void passarAparaB() {
		if(!isBloqueado) {
			try {
				for (Carro umCarro : carros) {
					if(!umCarro.getTipo().equals("A")) {
						isBloqueado = false;
						wait();
						return;
					} else {
						System.out.println(umCarro.getTipo());
						carros.remove(umCarro);
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void passarBparaA() {
		if(!isBloqueado) {
			try {
				for (Carro umCarro : carros) {
					if(!umCarro.getTipo().equals("B")) {
						isBloqueado = false;
						wait();
						return;
					} else {
						System.out.println(umCarro.getTipo());
						carros.remove(umCarro);
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void liberar() {
		isBloqueado = false;
		notify();
	}
	
	public synchronized void bloquear() {
		isBloqueado = true;
	}
	
	
	public ArrayList<Carro> getCarros() {
		return carros;
	}
	
	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}
	
	public void adicionaCarrosNaFila(ArrayList<Carro> carros) {
		if(this.carros == null) {
			this.carros = new ArrayList<Carro>();
		}
		for (Carro umCarro : carros) {
			this.carros.add(umCarro);
		}
		System.out.println("Adicionou carros na fila");
	}
	
	

}
