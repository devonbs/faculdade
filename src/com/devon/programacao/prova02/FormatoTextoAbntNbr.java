package com.devon.programacao.prova02;

public class FormatoTextoAbntNbr implements IFormatoTexto{
	
	//classe para implementar o formato de texto tipo ABNT
	@Override
	public String imprimirFormato(Obra obra) {
		StringBuilder sb = new StringBuilder();
		for (Autor umAutor : obra.getAutores()) {
			sb.append(umAutor.getSobrenome() + ", " + umAutor.getNome());
		}
		sb.append(" et al " + obra.getAnoPublicacao());
		sb.append(obra.getTitulo() + ":" + obra.getSubtitulo());
		sb.append(obra.getCidade() + ":" + obra.getEditora());
				
		return sb.toString();
	}

}
