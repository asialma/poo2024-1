package br.ufpb.dcx.laisa.SistemaBanco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Integer, Agencia> mapAgencias;

    public Banco(Map<Integer, Agencia> mapAgencias) {
        this.mapAgencias = new HashMap<>();
    }

    public Banco(){
        this(null);
    }

    public boolean adicionarAgencia(Agencia agencia){
        if(agencia == null){
            return false;
        }

        mapAgencias.put(agencia.getNumero(), agencia);
        return true;
    }

    public Collection<Cliente> pesquisarClientesDaAgencia(int numAgencia){
        return new ArrayList<>();
    }

    public boolean transferir(int numAgenciaOrigem, int numContaAgenciaOrigem, int numAgenciaDest,
                              int numContaDest, double valor){
        return false;
    }

    public Agencia pesquisaAgencia(int numAgencia){
        return mapAgencias.get(numAgencia);
    }

    public Collection<Agencia> getAgencias(){
        return null;
    }

    public boolean criarConta(int numAgencia, int numConta, String nomeCliente,
                              double saldoInicial){
        return false;
    }

    public double pesquisarSaldoDeConta(int numAgencia, int numConta){
        return 0.0;
    }


}
