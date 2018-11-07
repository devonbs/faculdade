package com.devon.linguagens.lp12;

public class Principal {

	public Principal() {
		Buffer b = new Buffer(0);
		ImplementacaoThreadSoma i = new ImplementacaoThreadSoma(b);
		ImplementacaoThreadSubtrai d = new ImplementacaoThreadSubtrai(b);
		i.start();
		d.start();
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	
}
