package com.devon.linguagens.threads;

import java.util.List;

public class Barbeiro extends Thread {
	
	List<Cadeira> cadeiras;
	
	public Barbeiro(List<Cadeira> cad) {
		this.cadeiras = cad;
	}
	
	
	@Override
	public void run() {
		super.run();
		while(true) {
			verificaDisponibilidadeCadeiras();
			
			
		}
	}


	private synchronized void verificaDisponibilidadeCadeiras() {
		
	}
	
	

}
