package com.devon.linguagens.lpE9;

public class Vendedor extends Funcionario {

	public Vendedor(String nome) {
		super(nome);
	}
	
	@Override
	public float salarioBase(float comissao) {
		return (getHorasTrabalhadas() * getValorHora()) + comissao;
	}

	
	
}
