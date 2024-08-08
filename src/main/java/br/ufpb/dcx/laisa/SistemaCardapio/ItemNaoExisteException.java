package br.ufpb.dcx.laisa.SistemaCardapio;

public class ItemNaoExisteException extends Exception {
    public ItemNaoExisteException(String msg){
        super(msg);
    }
}
