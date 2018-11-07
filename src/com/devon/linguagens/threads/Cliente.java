package com.devon.linguagens.threads;

import java.util.List;

public class Cliente extends Thread {
	
	
	List<Cadeira> cadeiras;
	
	public Cliente(List<Cadeira> cad) {
		this.cadeiras = cad;
	}
	
	@Override
	public void run() {
		super.run();
		verificaDisponibilidadeCadeiras();
		
	}

	private synchronized void verificaDisponibilidadeCadeiras() {
		
	}

}
