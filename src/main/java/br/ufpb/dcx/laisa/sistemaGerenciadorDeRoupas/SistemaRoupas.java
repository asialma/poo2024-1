package br.ufpb.dcx.laisa.sistemaGerenciadorDeRoupas;

import java.util.List;

public interface SistemaRoupas {
    public void cadastrarRoupa(String descricao, TipoRoupa tipo, String [] cores, String tamanho) throws RoupaJaExisteException;
    public List<Roupa> pesquisarRoupasPorTipoETamanho(TipoRoupa tipo, String tamanho);
    public Roupa pesquisarRoupaPorDescricao(String descricao) throws RoupaNaoExisteException;
    public boolean existeRoupaDoTipo(TipoRoupa tipo);
    public int contaRoupasDoTamanho(String tamanho);
}
