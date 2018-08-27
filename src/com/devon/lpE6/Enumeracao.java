package com.devon.lpE6;

import java.util.Scanner;

public class Enumeracao {
	
	// a) Sobre enumeração
	
	private MesesDoAno mesesDoAno;
	
	public Enumeracao() {
		Scanner scanner = new Scanner(System.in);
		String mesDigitado = scanner.nextLine();
		if(mesDigitado != null && !mesDigitado.equals("")) {
			for (MesesDoAno umMes : MesesDoAno.values()) {
				if(mesDigitado.equalsIgnoreCase(umMes.name())) {
					this.mesesDoAno = umMes;
					break;
				}
			}
			if(mesesDoAno != null) {
				System.out.println(mesesDoAno.name());
			} else {
				System.out.println("Mes nao encontrado.");
			}
		} else {
			System.out.println("Nenhum mes digitado.");
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		Enumeracao enumeracao = new Enumeracao();
	}

}
