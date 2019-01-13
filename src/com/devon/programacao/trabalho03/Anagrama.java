package com.devon.programacao.trabalho03;

import java.util.*;

/**
 *
 * @author Luísa Remonato e Devon Schwabe
 */
public class Anagrama {


    public static ArrayList<Grupo> getGruposComXItens(int qtd, String txt) {
        ArrayList<Grupo> todosGrupos = criarGrupos(txt);
        ArrayList<Grupo> gruposComXItens = new ArrayList<>();
        for (int i = 0; i < todosGrupos.size(); i++) {
            if (todosGrupos.get(i).getTamanho() == qtd) {
                gruposComXItens.add(todosGrupos.get(i));
            }
        }
        return gruposComXItens;
    }

    private static ArrayList<Grupo> criarGrupos(String txt) {
        ArrayList<String> palavras = new ArrayList<>(Arrays.asList(txt.split(System.getProperty("line.separator"))));
        Collections.sort(palavras, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(palavras, Comparator.comparingInt(String::length));
        return separaPalavras(palavras);
    }

    private static ArrayList<Grupo> separaPalavras(ArrayList<String> palavras) {
        ArrayList<Grupo> grupos = new ArrayList<>();

        String palavraAtual = palavras.remove(0);
        for (int i = 0; 0 < palavras.size(); i++) {

            Grupo grupoAtual = new Grupo();

            grupoAtual.adicionar(palavraAtual);

            for (int j = 0; j < palavras.size(); j++) {

                if (ehAnagrama(palavraAtual, palavras.get(j))) {

                    grupoAtual.adicionar(palavras.get(j));

                    palavras.remove(j);
                    j--;
                }
            }
            if (palavras.size() > 0) {

                palavraAtual = palavras.remove(0);
            }

            grupos.add(grupoAtual);
        }
        return grupos;
    }

    private static boolean ehAnagrama(String esquerda, String direita) {
        
        if (esquerda.length() != direita.length()) {
           
            return false;
        }
       
        ArrayList<String> esquerdaArray = new ArrayList<>(Arrays.asList(esquerda.toLowerCase().split("")));
        ArrayList<String> direitaArray = new ArrayList<>(Arrays.asList(direita.toLowerCase().split("")));
        
        Collections.sort(esquerdaArray, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(direitaArray, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < esquerdaArray.size(); i++) {
      
            if (esquerdaArray.get(i) == null ? direitaArray.get(i) != null : !esquerdaArray.get(i).equals(direitaArray.get(i))) {
                
                return false;
            }
        }
       
        return true;
    }
    
     public static String toString(ArrayList<Grupo> gruposAnag) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < gruposAnag.size(); i++) {
            resultado.append(gruposAnag.get(i).toString() + System.getProperty("line.separator"));
        }
        return resultado.toString();
    }
}
