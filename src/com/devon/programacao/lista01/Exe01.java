package com.devon.programacao.lista01;
 
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marcel
 */
public class Exe01 {
    public static void main(String args[]){
        try {
            FileWriter arqTexto = new FileWriter("Texto12345.txt");
            arqTexto.write("12345");
            arqTexto.close();
            
            DataOutputStream arqBin = new DataOutputStream(new FileOutputStream("Binario12345.dat"));
            arqBin.writeInt(12345);
            arqBin.close();
            
            BufferedReader arq1 = new BufferedReader(new FileReader("Texto12345.txt"));
            System.out.println("Lendo string em texto: "+arq1.readLine());
            arq1.close();
            arq1 = new BufferedReader(new FileReader("Binario12345.dat"));
            System.out.println("Lendo string em binário: "+arq1.readLine());
            arq1.close();
            
            DataInputStream arq2 = new DataInputStream(new FileInputStream("Texto12345.txt"));
            System.out.println("Lendo int em texto: "+arq2.readInt());
            arq2.close();
            arq2 = new DataInputStream(new FileInputStream("Binario12345.dat"));
            System.out.println("Lendo int em binário: "+arq2.readInt());
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
