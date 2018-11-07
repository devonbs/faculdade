package com.devon.linguagens.prova02;

public class Carro {
	
	private String tipo;
	
	public Carro(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo.equals("A") || tipo.equals("B")) {
			this.tipo = tipo;
		} else {
			System.out.println("Tipo de carro não adicionado");
		}
	}
	
}
