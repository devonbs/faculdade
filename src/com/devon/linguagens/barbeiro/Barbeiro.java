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
public class Barbeiro extends Thread { //Herança

    private Semaforo cadeirasCheias; //Objetos do tipo Semaforo
    private Semaforo cadeirasVazias;
    private Cadeiras fila; //Objeto do tipo Cadeira
    
    public Barbeiro(Semaforo cadeirasCheias, Semaforo cadeirasVazias, Cadeiras fila) {
        super();
        this.cadeirasCheias = cadeirasCheias;
        this.cadeirasVazias = cadeirasVazias;
        this.fila = fila;
    }

    @Override
    public void run() {
        while (true) {
            cadeirasCheias.P(); 
            fila.removeCliente();
            cadeirasVazias.V();
        }

    }
}
