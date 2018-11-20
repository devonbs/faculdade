package com.devon.programacao.prova02;
import java.util.ArrayList;

/**
 *
 * @author Devon
 */
public class Principal {
    
    public static void main(String args[]) {
        // Este ArrayList não pode ser alterado!
        ArrayList<Obra> acervo = new ArrayList();
        
        Autor a1 = new Autor("GAMMA", "Erich",1948);
        Autor a2 = new Autor("Helm","RiCHard", 1952);
        Autor a3 = new Autor("Johnson","RALPH", 1950);
        Autor a4 = new Autor("Vlissides","John", 1954);
        
        // ALTERAÇÕES A PARTIR DESTE PONTO
        
        Obra o1 = new Obra("Design Patterns","Elements of reusable object-Oriented Software",
                            "Addison-Wesley","New Jersey", 1995);
        o1.addAutor(a1);
        o1.addAutor(a2);
        o1.addAutor(a3);
        o1.addAutor(a4);
        
        Obra o2 = new Obra("Use a cabeça!","padrões de projetos",
                            "Alta Books","Rio de Janeiro", 2007);
        o2.addAutor(new Autor("FREEMAN", "Eric",1965));
        o2.addAutor(new Autor("Freeman", "ELISABETH",1968));
        o2.addAutor(new Autor("Kathy", "SieRRa", 1970));
        o2.addAutor(new Autor("Bert", "Bates", 1970));

        
        acervo.add(o1);
        acervo.add(o2);
        
        // PARA ALTERAR ABAIXO
        // definir para a obra 1 que o formato é ISO 690
        // e para a obra 2 que é ABNT NBR 6023:2002
        
        CitacaoBibliografica citacao = new CitacaoBibliografica();
        citacao.setFormatoTexto(new FormatoTextoIsoNbr());
        citacao.setObra(o1);
        
        CitacaoBibliografica citacao2 = new CitacaoBibliografica();
        citacao.setFormatoTexto(new FormatoTextoAbntNbr());
        citacao.setObra(o2);
        
        
        for (Obra o:acervo){
            System.out.println("\nBibliografia:"+o.getBibliografia());
            System.out.println("Citação: "+o.getCitacao());
            System.out.println(citacao.imprimeCitacao(o));
            
        }
        
        // definir para a obra 1 que o formato é ABNT NBR 6023:2002
        // e para a obra 2 que é ISO 690
        
        for (Obra o:acervo){
            System.out.println("\nBibliografia:"+o.getBibliografia());
            System.out.println("Citação: "+o.getCitacao());
        }
        

    }
    
}
