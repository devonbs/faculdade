package com.devon.lista01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Marcel
 */
public class ResolucaoExe2 {
    public static void main(String[] args){
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Qual a chave da criptografia? Valor inteiro (0-255):"));
        
        JFileChooser jfc = new JFileChooser();
        int returnVal = jfc.showOpenDialog(null);
        // testando se o usuário clicou em Abrir/OK
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            try {
                // abrir o arquivo de entrada e de saída
                BufferedReader entrada = new BufferedReader(new FileReader(file));
                String novoNome = file.getAbsolutePath()+".saida";
                System.out.println("Será gerado o arquivo "+novoNome);
                BufferedWriter saida = new BufferedWriter( new FileWriter(novoNome) );
                // leitura, criptografia e gravação do conteúdo
                int lido = entrada.read();
                int criptografado;
                while (lido != -1) {   // -1 indica fim de arquivo
                    criptografado = converte(lido,chave);
                    System.out.print((char)lido);
                    saida.write(criptografado);
                    lido = entrada.read();
                }
                entrada.close();
                saida.close();
            } catch (FileNotFoundException fnfe){
                System.out.println("Arquivo de entrada não encontrado");
            } catch (IOException ex) {
              System.out.println("Erro na leitura do arquivo "+file.getAbsolutePath());
            }
        } else {
            System.out.println("Usuário cancelou a operação.");
        }

    }
    public static int converte(int recebido,int chave){
        if (recebido+chave > 255){
            return recebido+chave-256;
        }
        else{
            return recebido+chave;
        } 
        // mais elegante:
        // return ((recebido + chave) % 256)
    }
    
}

