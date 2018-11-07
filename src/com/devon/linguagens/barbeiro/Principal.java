/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devon.linguagens.barbeiro;

public class Principal {

    public static void main(String[] args) {
        Cadeiras fila = new Cadeiras(5);
        Semaforo cadeirasCheias = new Semaforo(0); //quantidade a atender
        Semaforo cadeirasVazias = new Semaforo(5); //quantidade a sentar

        Barbeiro b = new Barbeiro(cadeirasVazias, cadeirasCheias, fila);
        b.start();
        
        int id = 1;
        for (int i = 0; i < 100; i++) {
            Cliente c = new Cliente(cadeirasVazias, cadeirasCheias, id++, fila);
            c.start();
        }

    }

}
