package br.ufpb.dcx.laisa.SistemaCardapio;

public class ItemDeCardapio {
    private String codigo;
    private String nome;
    private double valor;
    private TipoItem tipo;

    public ItemDeCardapio(String codigo, TipoItem tipo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public ItemDeCardapio(){
        this("",TipoItem.GERAL, "",0.0);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }
}
