package com.devon.programacao.trabalho03;

import java.util.*;

/**
 *
 * @author Luísa Remonato e Devon Schwabe
 */
public class Grupo {

    private ArrayList<String> palavras = new ArrayList<>();
    private int tamanho;

    public ArrayList<String> getPalavras() {
        return palavras;
    }

    public void setPalavras(ArrayList<String> palavras) {
        this.palavras = palavras;
    }

    public int getTamanho() {
        return palavras.size();
    }

    public void adicionar(String plvr) {
        palavras.add(plvr);
        tamanho++;
    }

    public void remover(String plvr) {
        palavras.remove(plvr);
        tamanho--;
    }

    public String remover(int index) {
        tamanho--;
        return palavras.remove(index);
    }
    
    @Override
    public String toString() {
        StringBuilder finalResult = new StringBuilder();
        finalResult.append("[");
        for (int i = 0; i < palavras.size(); i++) {
            finalResult.append(palavras.get(i));
            if (palavras.size() - 1 != i) {
                finalResult.append(", ");
            }
        }
        return finalResult + "]";
    }
}
