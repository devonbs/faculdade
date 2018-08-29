package com.devon.programacao.persistencia;

import java.io.Serializable;

public class Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1642596290729755097L;
	private int numeroIdentificacao;
	private double kilos;
	private short altura;
	private double temperatura;
	
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	public double getKilos() {
		return kilos;
	}
	public void setKilos(double kilos) {
		this.kilos = kilos;
	}
	public short getAltura() {
		return altura;
	}
	public void setAltura(short altura) {
		this.altura = altura;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public String gerarHistorico() {
		return "Animal: Número de identificação = " + numeroIdentificacao + ", Peso(Kg) = " + kilos + ", Altura = " + altura
				+ ", Temperatura do corpo = " + temperatura + "]";
	}
	
	
	
}
