package com.devon.linguagens.lpE6;

public class VariaveisEstaticas {    
	
	// c) sobre variáveis estáticas
	
	private static int COMISSAO = 10;
	
	public double calculaSalario(final float salario) {
		return salario + (salario * (COMISSAO / (double) 100));
	}
	
	public VariaveisEstaticas() {
		System.out.println(calculaSalario(1000));
		COMISSAO = 20;
		System.out.println(calculaSalario(1000));
	}
	
	public static void main(String[] args) {
		VariaveisEstaticas variaveis = new VariaveisEstaticas();
	}
	

}
