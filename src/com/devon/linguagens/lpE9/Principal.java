package com.devon.linguagens.lpE9;

public class Principal {

	public static void main(String[] args) {
		String nomeVendedor = "algum nome qualquer";
		
		Vendedor vendedor = new Vendedor(nomeVendedor);
		vendedor.setHorasTrabalhadas(44);
		vendedor.setValorHora(12.5f);
		System.out.println(vendedor.salarioBase());
		
		
	}
	
}
