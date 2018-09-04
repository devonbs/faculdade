package com.devon.programacao.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;

public class TrabalhoArquivosPersistencia {

	
	public static Historico carregarHistorico(Path path){
        Historico historico;
        try {
            ObjectInputStream arquivo = new ObjectInputStream(new FileInputStream(path.toFile()));
            historico = (Historico)arquivo.readObject();
            arquivo.close();
        } catch (FileNotFoundException fileNotFoundException){
            historico = new Historico();
        } catch (IOException ioException){
            historico = new Historico();
        } catch (ClassNotFoundException classNotFoundException) {
            historico = new Historico();
        } catch (Exception e) {
        	historico = new Historico();
        }
        return historico;
    }
	
	
	public static void salvarHistorico(Historico historico, Path path){
        try {
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(path.toFile()));
            file.writeObject(historico);
            file.close();
            
            File arquivo = new File(path.toString()+".txt");
            FileWriter fw = new FileWriter(arquivo, true);
    		PrintWriter pw = new PrintWriter(fw);
    		BufferedWriter bw = new BufferedWriter(pw);
    		
    		bw.write(historico.gerarRelatorioAnimais());
    		bw.newLine();
    		
    		fw.close();
    		bw.close();
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
    }


}
