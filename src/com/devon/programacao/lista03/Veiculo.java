package com.devon.programacao.lista03;

/**
 *
 * @author Marcel
 */
public class Veiculo implements Comparable<Veiculo>{

    private String placa;
    private String modelo;
    private int ano;
    private String proprietario;

    public Veiculo(String pl, String m, int a, String pr) {
        this.placa = pl;
        this.modelo = m;
        this.ano = a;
        this.proprietario = pr;
    }

    @Override
    public String toString() {
        return ("Veículo " + modelo + ",placa " + placa + ",ano " + ano + ", de " + proprietario+"\n");
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int compareTo(Veiculo outro) {
           return (this.getPlaca().compareTo(outro.getPlaca()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj ==  null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Veiculo outro = (Veiculo)obj;
        return (this.getPlaca().compareTo(outro.getPlaca())==0);
    }

}
