package br.ufpb.dcx.laisa.sistemaBiblioteca;

public class LivroJaExisteException extends Exception {
    public LivroJaExisteException(String msg) {
        super(msg);
    }
}
