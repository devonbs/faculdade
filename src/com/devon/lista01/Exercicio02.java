package com.devon.lista01;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio02 {
	
	private static Character J = 'j';
	private static int VALOR_J = J;
	
	//JFileChooser
	
	
	public void lerArquivo() {
		try {
			BufferedReader arq1 = new BufferedReader(new FileReader("Texto12345.txt"));
			String linhaTrocada = arq1.readLine();
			Character k = 50;
			
			Character valor = (char) (VALOR_J + k);
			
			linhaTrocada.replace(J, valor);
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Character k = 100;
		
		Character valor = (char) (VALOR_J + 10);
		
		System.out.println(k);
		System.out.println(valor);
	}
	
	
	
	
	
}
