package com.devon.exe01;

import java.util.List;

public class Cadastro { 

	private List<Familia> familias;

	public List<Familia> getFamilias() {
		return familias;
	}

	public void setFamilias(List<Familia> familias) {
		this.familias = familias;
	}
	
	public void novaFamilia(String nomeNovaFamilia, String origemFamilia, Pessoa primeiroMembro) {
		Familia novaFamilia = new Familia();
		novaFamilia.setNomeFamilia(nomeNovaFamilia);
		novaFamilia.setOrigemFamilia(origemFamilia);
		novaFamilia.setPrimeiroMembro(primeiroMembro);
		familias.add(novaFamilia);
	}
	
	public void listarFamilias() {
		for (Familia familia : familias) {
			System.out.println(familia.getDescricaoFamilia());
		}
	}
	
	
	
	
	
	
}
