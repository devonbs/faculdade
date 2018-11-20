package com.devon.programacao.prova02;

public class CitacaoBibliografica {
	
	//private static CitacaoBibliografica INSTANCE = getInstance();
	
	public CitacaoBibliografica() {
	}
	
//	public static CitacaoBibliografica getInstance() {
//		if(INSTANCE == null) {
//			return new CitacaoBibliografica();
//		}
//		return INSTANCE;
//	}

	private IFormatoTexto formatoTexto;
	private Obra obra;
	
	public void setFormatoTexto(IFormatoTexto formatoTexto) {
		this.formatoTexto = formatoTexto;
	}
	
	public String imprimeCitacao(Obra obra) {
		this.obra = obra;
		return formatoTexto.imprimirFormato(obra);
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

}
