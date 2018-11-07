/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devon.linguagens.barbeiro;

public class Semaforo { // Classe

	private int count = 0;

	public Semaforo(int initVal) {
		count = initVal;
	}

	public synchronized void P() {
		boolean taAcordado = true;
		if (count <= 0) {
			try {
				System.out.println("Dormindo...");
				taAcordado = false;
				wait();
			} catch (InterruptedException e) {
			}
		}
		if (count == 1 && !taAcordado) {
			System.out.println("Acordou...");
		}
		count--;
	}

	public synchronized void V() {
		count++;
		notify();
	}
}
