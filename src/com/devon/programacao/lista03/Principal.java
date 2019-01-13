package com.devon.programacao.lista03;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Marcel
 */
public class Principal {

    public static void main(String[] args) {
        Veiculo a = new Veiculo("MJT-7432", "Fusca", 1912, "Pedro");
        Veiculo b = new Veiculo("MIT-8008", "Celta", 1999, "Douglas");
        Veiculo c = new Veiculo("MEI-4665", "Gol", 2002, "Carlos");
        Veiculo d = new Veiculo("MIO-6668", "Fusca", 1915, "Aline");
        Veiculo e = new Veiculo("DIO-3333", "Celta", 1999, "Fausto");
        Veiculo f = new Veiculo("PAO-6472", "C3", 2007, "Carolina");
        Veiculo g = new Veiculo("CAO-2890", "C4", 2012, "Kelvin");
        Veiculo h = new Veiculo("UVA-3939", "BMW", 2015, "Zé");
        Veiculo i = new Veiculo("OVO-0000", "Gol", 2000, "Joshua");
        Veiculo j = new Veiculo("ABC-1234", "Ferrari", 2015, "Marta");
        LinkedList<Veiculo> list = new LinkedList();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);
        list.add(j);
        System.out.println("Lista dos veículos criados");
        System.out.print(list.toString()+"\n");
        
        list.remove(f);  // item c) a) deletar um objeto
        list.remove(6);  // item c) b) deletar o sétimo elemento
        
        // item c) c) deletar o antepenúltimo elemento
        // cria um Iterator que percorre de trás para frente, ou seja seu início é no último elemento
        ListIterator<Veiculo> iterator = list.listIterator(list.size());
        System.out.println("Este é o antepenúltimo elemento e que deve ser deletado: "+list.get(list.size()-3));
        int y = 0;
        while (iterator.hasPrevious()) {

            f = iterator.previous();
            if (y == 2) {
                System.out.println("Antepenúltimo deletado:"+f);
                iterator.remove();
                break;
            }
            y++;
        }
        
        System.out.println("Lista dos veículos após remoções");
        System.out.print(list.toString()+"\n");        
        
        // item e)
        // utilizando o algoritmo sort da classe Collections
        Collections.sort(list);
        // list.sort(null);   // a partir do Java 8
        System.out.println("Ordenado por placa");
        System.out.print(list.toString()+"\n");
        
        
        Collections.shuffle(list);  // para embaralhar a lista, visando mostrar que a próxima ordenação vai funcionar sem interferência da anterior
        // implementação de classe anônima em Comparator
        Comparator x = new Comparator() {
            @Override
            public int compare(Object v1, Object v2) {
                if (((Veiculo) v1).getAno() > ((Veiculo) v2).getAno()) {
                    return 1;
                } else if (((Veiculo) v1).getAno() < ((Veiculo) v2).getAno()) {
                    return -1;
                } else {
                    return ((Veiculo)v1).compareTo((Veiculo)v2);
                }
            }
        };
        
        // item f)
        Collections.sort(list,x);
        System.out.println("Ordenado por ano e placa");
        System.out.print(list.toString()+"\n");


        Collections.shuffle(list);
        Comparator z = new Comparator() {
            @Override
            public int compare(Object v1, Object v2) {
                if (((Veiculo) v1).getModelo().compareTo(((Veiculo) v2).getModelo()) == 0) {
                    return x.compare(v1, v2);
                } else {
                    return (((Veiculo) v1).getModelo().compareTo(((Veiculo) v2).getModelo()));
                }
            }
        };
        
        // item g)
        // Collections.sort(list,z);
        // usando o método sort definido na interface List (a partir do Java 8)
        list.sort(z);
        System.out.println("Ordenado por modelo, ano e placa");
        System.out.print(list.toString()+"\n");

    }

}
