package com.devon.linguagens.lpE9;

public class Funcionario {

	private String nome;
	private float valorHora;
	private int horasTrabalhadas;
	
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	public float salarioBase() {
		return (getHorasTrabalhadas() * getValorHora());
	}
	
	public float salarioBase(float horaExtra) {
		return (getHorasTrabalhadas() * getValorHora()) + (horaExtra * getValorHora() * 2) ;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
}
