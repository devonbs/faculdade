package com.devon.linguagens.lp12;

public class ImplementacaoThreadSoma extends Thread{
	
	private Buffer buffer;
	
	public ImplementacaoThreadSoma(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while(true) {
			buffer.setNumero(buffer.getNumero()+1);
			System.out.println("soma " + buffer.getNumero());
		}
	}
	
	
	
}
