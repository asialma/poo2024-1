package br.ufpb.dcx.laisa.sistemaBiblioteca;

public class UsuarioJaExisteException extends Exception {
    public UsuarioJaExisteException(String msg){
        super(msg);
    }
}

