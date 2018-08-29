package com.devon.programacao.exe01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private Date dataNascimento;
	private List<Pessoa> filiacao;
	private String localNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public String getDataNascFormatada() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(getDataNascimento());
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public List<Pessoa> getParente() {
		return filiacao;
	}
	public void setParente(List<Pessoa> parente) {
		this.filiacao = parente;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	

}
