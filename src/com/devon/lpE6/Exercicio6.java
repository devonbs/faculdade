package com.devon.lpE6;

public class Exercicio6 {
	
	//b) sobre inferência de tipo
	
	public static void main(String[] args) {
		int n1 = 4;
		int n2 = 3;
		
		System.out.println(n1 + n2);
		System.out.println("" + n1 + n2);
		System.out.println(n1 / n2);
		double resultado = (double) n1 / (double) n2;
		System.out.printf("%.2f", resultado);
	}

}
