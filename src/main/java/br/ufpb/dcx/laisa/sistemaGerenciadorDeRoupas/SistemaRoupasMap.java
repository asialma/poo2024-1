package br.ufpb.dcx.laisa.sistemaGerenciadorDeRoupas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaRoupasMap implements SistemaRoupas{

    private Map<String, Roupa> roupas;

    public SistemaRoupasMap() {
        this.roupas = new HashMap<>();
    }

    @Override
    public void cadastrarRoupa(String descricao, TipoRoupa tipo, String[] cores, String tamanho) throws RoupaJaExisteException {

    }

    @Override
    public List<Roupa> pesquisarRoupasPorTipoETamanho(TipoRoupa tipo, String tamanho) {
        return null;
    }

    @Override
    public Roupa pesquisarRoupaPorDescricao(String descricao) throws RoupaNaoExisteException {
        return null;
    }

    @Override
    public boolean existeRoupaDoTipo(TipoRoupa tipo) {
        return false;
    }

    @Override
    public int contaRoupasDoTamanho(String tamanho) {
        return 0;
    }

    // Demais métodos da classe considerando que implementa a interface e que lança em seus
    // métodos as mesmas exceções dos métodos da interface.
}
