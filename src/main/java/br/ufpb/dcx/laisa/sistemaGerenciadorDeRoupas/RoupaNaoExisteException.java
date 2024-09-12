package br.ufpb.dcx.laisa.sistemaGerenciadorDeRoupas;

public class RoupaNaoExisteException extends Exception {
    public RoupaNaoExisteException(String msg){
        super(msg);
    }
}
