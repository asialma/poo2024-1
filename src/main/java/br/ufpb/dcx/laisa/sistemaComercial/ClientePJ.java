package br.ufpb.dcx.laisa.sistemaComercial;

public class ClientePJ extends Cliente{
    private String CNPJ;

    public ClientePJ(String nome, String endereco, String email, String CNPJ) {
        super(nome, endereco, email);
        this.CNPJ = CNPJ;
    }

    public ClientePJ() {
        this("", "", "", "");
    }

    @Override
    public String getId() {
        return CNPJ;
    }
}
