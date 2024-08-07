package br.ufpb.dcx.laisa.sistemaBiblioteca;

public class LivroInexistenteException extends Exception {
    public LivroInexistenteException(String msg){
        super(msg);
    }
}
