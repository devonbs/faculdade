package com.devon.programacao.prova01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Prova1 {
	
	private Path path;
	
	public static void serializar(String arqOrigem, String arqDest) {
		BufferedReader br = null;
		Path path = Paths.get(arqOrigem);
		Path pathsaida = Paths.get(arqDest);
		String linha = null;
		
		Atleta atleta;
		Endereco endereco;
		
		ArrayList<Atleta> lAtletas = new ArrayList<Atleta>();
		
		try {
			br = new BufferedReader(new FileReader(path.getFileName().toString()));
	        while ((linha = br.readLine()) != null) {
	        	atleta = new Atleta();
	        	endereco = new Endereco();
	            String[] registro = linha.split(",");
	            
	            atleta.setNome(registro[0]);
	            atleta.setAltura(Float.parseFloat(registro[1]));
	            atleta.setPeso(Float.parseFloat(registro[2]));
	            endereco.setRua(registro[3]);
	            endereco.setNumero(registro[4]);
	            endereco.setComplemento(registro[5]);
	            endereco.setCep(registro[6]);
	            endereco.setCidade(registro[7]);
	            endereco.setEstado(registro[8]);
	            
	            atleta.setEndereco(endereco);
	            
	            lAtletas.add(atleta);
	        }
	        
            BufferedWriter saida = new BufferedWriter(new FileWriter(pathsaida.getFileName().toString()));
            
            for (Atleta umAtleta : lAtletas) {
            	 saida.write(umAtleta.toString());
			}
            saida.close();
			
		} catch (EArquivoOrigemNaoExiste e) {
			EArquivoOrigemNaoExiste.imprimeMensagemErro();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		serializar("Entrada.txt", "saida.txt");
	}
	
	
	

}
