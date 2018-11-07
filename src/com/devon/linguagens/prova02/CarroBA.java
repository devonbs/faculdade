package com.devon.linguagens.prova02;

public class CarroBA extends Thread {
	
	private Ponte ponte;
	
	public CarroBA(Ponte ponte) {
		this.ponte = ponte;
	}
	
	@Override
	public void run() {
		ponte.bloquear();
		ponte.passarBparaA();
		ponte.liberar();
		System.out.println("Terminou de passar B para A");
	}

}
