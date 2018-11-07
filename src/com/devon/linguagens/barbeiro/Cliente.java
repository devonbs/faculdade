/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devon.linguagens.barbeiro;

/**
 * 
 * @author Luciana
 *
 */
public class Cliente extends Thread {  //Herança
	
	//Poderia implementar a classe Runnable, sobrescrevendo o método run()

	private Semaforo cadeirasCheias; //Objetos do tipo Semaforo
	private Semaforo cadeirasVazias;
	private Cadeiras fila; //Objeto do tipo Cadeiras
	private int id;

    public Cliente(Semaforo cadeirasCheias, Semaforo cadeirasVazias, int id, Cadeiras fila) { //Construtor com objetos passados como parametros
        super();
        this.cadeirasCheias = cadeirasCheias;
        this.cadeirasVazias = cadeirasVazias;
        this.id = id;
        this.fila = fila;
    }
    
    public long getId() {
    	return id;
    }

    @Override
    public void run() {
        cadeirasVazias.P(); //sentou na cadeira, diminuindo uma unidade.
        this.fila.addCliente(this);
        cadeirasCheias.V(); //há cliente para atender
    }
}
