package br.ufpb.dcx.laisa.sistemaBiblioteca;

public class UsuarioInexistenteException extends Exception {
    public UsuarioInexistenteException(String msg){
        super(msg);
    }
}
