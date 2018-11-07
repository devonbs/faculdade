package com.devon.linguagens.lp12;

public class ImplementacaoThreadSubtrai extends Thread {

private Buffer buffer;
	
	public ImplementacaoThreadSubtrai(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while(true) {
			buffer.setNumero(buffer.getNumero()-1);
			System.out.println("subrai " + buffer.getNumero());
		}
	}
	
	
	
}
