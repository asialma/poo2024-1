package br.ufpb.dcx.laisa.SistemaBanco;

public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(){
        this("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
