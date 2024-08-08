package br.ufpb.dcx.laisa.SistemaBanco;

public class ClientePessoaFisica extends Cliente{
    private String cpf;
    private Sexo sexo;

    public ClientePessoaFisica(String nome, String cpf, Sexo sexo) {
        super(nome);
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public ClientePessoaFisica() {
        this("", "", null);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
