package com.devon.programacao.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class TrabalhoArquivosPersistencia {
	
	
	/***
	 *  -- Para verificar
	 * Ao inserir novo animal, verificar a identificação para não haver duplicidade
	 * 
	 */

	int chave = 0;

	public static void main(String[] args) {

		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		// testando se o usuário clicou em Abrir/OK
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			try {
				// abrir o arquivo de entrada e de saída
				BufferedReader entrada = new BufferedReader(new FileReader(file));
				String novoNome = file.getAbsolutePath() + ".saida";
				
				//ler arquivo binario para dentro do objeto
				
				
				System.out.println("Será gerado o arquivo " + novoNome);
				BufferedWriter saida = new BufferedWriter(new FileWriter(novoNome));
				int lido = entrada.read();
				while (lido != -1) { // -1 indica fim de arquivo
					System.out.print((char) lido);
					lido = entrada.read();
				}
				entrada.close();
				saida.close();
			} catch (FileNotFoundException fnfe) {
				System.out.println("Arquivo de entrada não encontrado");
			} catch (IOException ex) {
				System.out.println("Erro na leitura do arquivo " + file.getAbsolutePath());
			}
		} else {
			System.out.println("Usuário cancelou a operação.");
		}

	}

}
