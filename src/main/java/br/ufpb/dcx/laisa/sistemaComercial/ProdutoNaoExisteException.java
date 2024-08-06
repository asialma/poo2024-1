package br.ufpb.dcx.laisa.sistemaComercial;

public class ProdutoNaoExisteException extends Exception{
    public ProdutoNaoExisteException(String msg){
        super(msg);
    }
}
