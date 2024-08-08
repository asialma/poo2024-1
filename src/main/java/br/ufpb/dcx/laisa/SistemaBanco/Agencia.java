package br.ufpb.dcx.laisa.SistemaBanco;

import java.util.HashMap;
import java.util.Map;

public class Agencia {
    private int numero;
    private Map<Integer, Conta> contas;

    public Agencia(int numero, Map<Integer, Conta> contas) {
        this.numero = numero;
        this.contas = new HashMap<>();
    }

    public Agencia(){
        this(0, null);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Map<Integer, Conta> getContas() {
        return contas;
    }

    public void setContas(Map<Integer, Conta> contas) {
        this.contas = contas;
    }
}
