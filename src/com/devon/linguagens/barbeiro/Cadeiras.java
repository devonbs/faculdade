/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devon.linguagens.barbeiro;

import java.util.ArrayList;
/**
 * 
 * @author Luciana
 *
 */
public class Cadeiras { //Classe 
	ArrayList<Cliente> fila; //Lista de objetos do tip Cliente
	private int tamanho;

	public Cadeiras(int numCadeiras) {
		this.fila = new ArrayList<Cliente>(numCadeiras); //Criação da fila de clientes
		this.tamanho = numCadeiras;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Cliente removeCliente() {
		if (fila != null && fila.size() > 1 && fila.get(0) != null) { //ALTERADO
			System.out.println("Barbeiro atendeu o cliente " + fila.get(0).getId());
			return this.fila.remove(0); 
		}
		System.out.println("Barbeiro dormindo...");
		return null;
	}

	public void addCliente(Cliente c) {
		if (fila.size() == tamanho) {
			System.out.println("Cliente " + c.getId() + " foi embora.");
		}
		this.fila.add(c);
		System.out.println("Cliente " + c.getId() + " sentou.");
	}

}
