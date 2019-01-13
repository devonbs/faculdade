package com.devon.programacao.trabalho03;


public class Livro implements Comparable<Livro>{
	
	private String titulo;
	private String isbn;
	private String codigo;
	private int ano;
	
	public Livro(String isbn, String codigo, int ano, String titulo) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.codigo = codigo;
		this.ano = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "(Ano: " + ano + ", ISBN: " + isbn + ", Título: " + titulo + ", Código: " + codigo + ")";
	}

	@Override
	public int compareTo(Livro o) {
		int resultado = this.ano - o.getAno();
		return (resultado == 0 ? this.isbn.compareTo(o.getIsbn()) : resultado );
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (ano != other.ano)
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	
	
	
	

}
