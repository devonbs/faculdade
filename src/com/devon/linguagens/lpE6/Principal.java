package com.devon.linguagens.lpE6;

public class Principal {
	
	public Principal() {
		Valor v1 = new Valor();
		Valor v2 = new Valor();
		
		v1.incrementa();
		System.out.println("v1 -/" + v1.getNumero() + " /  v2-/ " + v2.getNumero());
		v2.incrementa();
		System.out.println("v1 -/" + v1.getNumero() + " /  v2-/ " + v2.getNumero());
		
		
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		
		//Por que a variavel est�tica da classe Valor, j� � instanciada em mem�ria ao compilar a classe, 
		//sendo assim, quando alterado o valor, ser� alterado em um �nico endere�o de mem�ria
	}

}
