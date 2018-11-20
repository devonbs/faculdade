package com.devon.programacao.prova02;

public class FormatoTextoIsoNbr implements IFormatoTexto{
	
	//Classe para implementar o tipo ISO
	@Override
	public String imprimirFormato(Obra obra) {
		StringBuilder sb = new StringBuilder();
		sb.append("De acordo com (");
		for (Autor umAutor : obra.getAutores()) {
			sb.append(umAutor.getSobrenome() + " et al. " + umAutor.getAnoNascimento());
		}
		sb.append(")");
		sb.append(obra.getTitulo() + ":" + obra.getSubtitulo());
				
		return sb.toString();
	}

}
