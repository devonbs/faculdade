package prova3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Cadastro {
	
	private SortedSet<Contribuinte> dados;

	public Cadastro() {
		dados = new TreeSet<Contribuinte>();
	}
	
	public boolean incluirContribuinte(Contribuinte contribuinte) {
		if(!dados.contains(contribuinte)) {
			return dados.add(contribuinte);
		}
		return false;
	}
	
	public boolean excluirContribuinte(String cpf) {
		Contribuinte cont = buscarContribuinte(cpf);
		if(dados.contains(cont)) {
			dados.remove(cont);
			return true;
		} else {
			return false;
		}
	}
	
	public Set<Contribuinte> fiscalizar(String prim, String ult) {
		Contribuinte c1 = buscarContribuinte(prim);
		Contribuinte c2 = buscarContribuinte(ult);
		if(c1 == null) {
			c1 = dados.first();
		}
		if(c2 == null) {
			c2 = dados.last();
		}
		return dados.subSet(c1, c2);
	}
	
	public Iterator<Contribuinte> iterador() {
		Iterator<Contribuinte> it = new Iterator<Contribuinte>() {
			
			@Override
			public Contribuinte next() {
				return dados.iterator().next();
			}
			
			@Override
			public boolean hasNext() {
				return dados.iterator().hasNext();
			}
		};
		return it;
	}
	
	public Iterator<Contribuinte> iteradorPorNascimento() {
		Iterator<Contribuinte> it = new Iterator<Contribuinte>() {
			
			@Override
			public Contribuinte next() {
				return dados.iterator().next();
			}
			
			@Override
			public boolean hasNext() {
				return dados.iterator().hasNext();
			}
		};
		return it;
	}
	
	public String getUltimoCpf() {
		return dados.last().getCpf();
	}
	
	public int getQtdContribuintes() {
		return dados.size();
	}
	
	//Não encontrei nenhuma outra forma de fazer
	public Contribuinte buscarContribuinte(String cpf) {
		Iterator<Contribuinte> it = dados.iterator();
	    while (it.hasNext()) {
	      Contribuinte contribuinte = it.next();
	      if(contribuinte.getCpf().equals(cpf)) {
	    	  return contribuinte;
	      }
	    }
	    return null;
	}
	
	Comparator<Contribuinte> comp = new Comparator<Contribuinte>() {
		@Override
		public int compare(Contribuinte o1, Contribuinte o2) {
			if(o1.getDataNascimento().compareTo(o2.getDataNascimento()) < 0) {
				return -1;
			} else if(o1.getDataNascimento().compareTo(o2.getDataNascimento()) > 0) {
				return 1;
			}
			return o1.compareTo(o2);
		}
	};
	
}
