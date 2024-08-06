package br.ufpb.dcx.laisa.sistemaComercial;

public class ClienteNaoExisteException extends Exception{
    public ClienteNaoExisteException(String msg){
        super(msg);
    }
}
