package com.devon.programacao.prova01;

import java.io.Serializable;

public class Atleta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7213363015773154227L;
	private String nome;
	private float altura;
	private float peso;
	
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", endereco=" + endereco.toString() + "] \r \n";
	}
	
	

}
