package br.ufpb.dcx.laisa.sistemaGerenciadorDeRoupas;

import java.util.Arrays;

public class Roupa {
    private String descricao;
    private TipoRoupa tipo;
    private String[] cores;
    private String tamanho;

    public Roupa(String descricao, TipoRoupa tipo, String[] cores, String tamanho) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.cores = cores;
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoRoupa getTipo() {
        return tipo;
    }

    public void setTipo(TipoRoupa tipo) {
        this.tipo = tipo;
    }

    public String[] getCores() {
        return cores;
    }

    public void setCores(String[] cores) {
        this.cores = cores;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean ehDoTipo(TipoRoupa tipo) {
        return this.tipo == tipo;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", cores=" + Arrays.toString(cores) +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
