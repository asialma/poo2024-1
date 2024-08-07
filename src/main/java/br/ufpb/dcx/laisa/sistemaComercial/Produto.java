package br.ufpb.dcx.laisa.sistemaComercial;

import java.util.Objects;

public class Produto {
    private String codigo;
    private String descricao;
    private double precoVenda;
    private int quantidadeEmEstoque;
    private CategoriaProduto categoria;

    public Produto(String codigo, String descricao, double precoVenda, int quantidadeEmEstoque, CategoriaProduto categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.categoria = categoria;
    }

    public Produto(){
        this("", "", 0.0, 0, null);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        if (Double.compare(precoVenda, produto.precoVenda) != 0) return false;
        if (quantidadeEmEstoque != produto.quantidadeEmEstoque) return false;
        if (!Objects.equals(codigo, produto.codigo)) return false;
        if (!Objects.equals(descricao, produto.descricao)) return false;
        return categoria == produto.categoria;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = codigo != null ? codigo.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        temp = Double.doubleToLongBits(precoVenda);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantidadeEmEstoque;
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoVenda=" + precoVenda +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", categoria=" + categoria +
                '}';
    }
}
