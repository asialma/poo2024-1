package br.ufpb.dcx.laisa.sistemaComercial;

public class ClientePF extends Cliente{
    private String CPF;

    public ClientePF(String nome, String endereco, String email, String CPF) {
        super(nome, endereco, email);
        this.CPF = CPF;
    }

    public ClientePF() {
        this("", "", "", "");
    }

    @Override
    public String getId() {
        return null;
    }
}
