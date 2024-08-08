package br.ufpb.dcx.laisa.SistemaBanco;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(){
        this(0, 0.0);
    }

    public boolean debitar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            return true;

        } else if(valor > saldo){
            saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public void creditar(double valor){
        double valorAtualizdo = saldo + valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
