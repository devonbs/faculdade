package com.devon.programacao.persistencia;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Historico {

	private List<Animal> animais;
	private Date dataRegistro;
	
	public Animal retornaAnimalPesquisado(int identificacaoAnimal) {
		for (Animal animal : animais) {
			if(animal.getNumeroIdentificacao() == identificacaoAnimal) {
				return animal;
			}
		}
		return null;
	}
	
	public String gerarRelatorioAnimais() {
		StringBuilder sb = new StringBuilder();
		sb.append("Registros da data:" + this.getDataFormatada(getDataRegistro()));
		for (Animal animal : getAnimais()) {
			sb.append(animal.gerarHistorico());
			sb.append("\r \n \t");
		}
		return sb.toString();
	}
	
	public List<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
	public String getDataFormatada(Date data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(data);
	}
	
}
