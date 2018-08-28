package com.devon.exe01;

public class Familia {
	
	private String nomeFamilia;
	private Pessoa primeiroMembro;
	private String origemFamilia;
	
	private String[] descendencia = {"Primeiro membro", "Filho", "Neto", "Bisneto"};
	
	public String getNomeFamilia() {
		return nomeFamilia;
	}
	public void setNomeFamilia(String nomeFamilia) {
		this.nomeFamilia = nomeFamilia;
	}
	public Pessoa getPrimeiroMembro() {
		return primeiroMembro;
	}
	public void setPrimeiroMembro(Pessoa primeiroMembro) {
		this.primeiroMembro = primeiroMembro;
	}
	public String getOrigemFamilia() {
		return origemFamilia;
	}
	public void setOrigemFamilia(String origemFamilia) {
		this.origemFamilia = origemFamilia;
	}

	public String getDescricaoFamilia() {
		int controleDescendencia = 0;
		Pessoa membro = this.getPrimeiroMembro();
		String descricaoFamilia = "Familia " + nomeFamilia + ", de origem " + origemFamilia + ", tendo como seu primeiro membro conhecido "
				+ membro.getNome() + " nascido em " + membro.getDataNascFormatada()
				+ " em " + membro.getLocalNascimento();
		String decendentes = verificaDescendentes(controleDescendencia, membro);
		
		System.out.println(decendentes);
		
		
		return descricaoFamilia;
	}
	
	private String verificaDescendentes(int controleDescendencia, Pessoa membro) {
		StringBuilder sb = new StringBuilder();
		if(membro.getParente() != null) {
			controleDescendencia++;
			for (Pessoa descendente : membro.getParente()) {
				sb.append(descendencia[controleDescendencia] + ": " + descendente.getNome() + " - ");
				sb.append(descendente.getLocalNascimento() + " - ");
				sb.append(descendente.getDataNascFormatada());
				sb.append("\r \n \t");
				if(descendente.getParente() != null) {
					sb.append(verificaDescendentes(controleDescendencia, descendente));
				}
			}
		}
		
		return sb.toString();
	}
	
	
	
	

}
