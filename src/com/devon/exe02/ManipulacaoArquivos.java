package com.devon.exe02;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulacaoArquivos {
	
	FileSystem file = FileSystems.getDefault();
	File arquivo = new File(file.getRootDirectories().toString() + "teste.txt");
	
	Path path = Paths.get("");
	
	public void exibirInformacoesDiretorio() {
		System.out.println(arquivo.getAbsolutePath());
		System.out.println(arquivo.getPath());
		System.out.println(path.toAbsolutePath().toString());
	}
	
	private void criarArquivo() {
		
		
	}
	
	private void criarDiretorio() {
		
	}
	
	private void moverArquivo() {
		
	}
	
	public static void main(String[] args) {
		ManipulacaoArquivos manipulacao = new ManipulacaoArquivos();
		manipulacao.exibirInformacoesDiretorio();
		manipulacao.criarArquivo();
		manipulacao.criarDiretorio();
		manipulacao.moverArquivo();
	}

}
