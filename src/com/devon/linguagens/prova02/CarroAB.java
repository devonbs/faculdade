package com.devon.linguagens.prova02;

public class CarroAB extends Thread {
	
	private Ponte ponte;

	public CarroAB(Ponte ponte) {
		this.ponte = ponte;
	}
	
	@Override
	public void run() {
		ponte.bloquear();
		ponte.passarAparaB();
		ponte.liberar();
		System.out.println("Terminou de passar A para B");
	};
	
}
