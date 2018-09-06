package com.devon.programacao.prova01;

import java.io.FileNotFoundException;

public class EArquivoOrigemNaoExiste extends FileNotFoundException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1147665089383303444L;

	public static void imprimeMensagemErro() {
		System.out.println("Ocorreu um erro ao tentar recuperar o arquivo!");
	}
	
	
}
