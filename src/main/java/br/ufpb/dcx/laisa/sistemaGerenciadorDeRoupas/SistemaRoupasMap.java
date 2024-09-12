package br.ufpb.dcx.laisa.sistemaGerenciadorDeRoupas;

import br.ufpb.dcx.laisa.sistemaBiblioteca.UsuarioJaExisteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaRoupasMap implements SistemaRoupas {

    private Map<String, Roupa> roupas;

    public SistemaRoupasMap() {
        this.roupas = new HashMap<>();
    }

    @Override
    public void cadastrarRoupa(String descricao, TipoRoupa tipo, String[] cores, String tamanho) throws RoupaJaExisteException {
        if (roupas.containsKey(descricao)) {
            throw new RoupaJaExisteException("Roupa já cadastrada no sistema");
        }
        Roupa r = new Roupa(descricao, tipo, cores, tamanho);
        roupas.put(descricao, r);
    }

    @Override
    public List<Roupa> pesquisarRoupasPorTipoETamanho(TipoRoupa tipo, String tamanho) {
        List<Roupa> listaDeRoupasPorTipoETamanho = new ArrayList<>();
        for (Roupa r : roupas.values()) {
            if (r.getTipo().equals(tipo) && r.getTamanho().equals(tamanho)) {
                listaDeRoupasPorTipoETamanho.add(r);
            }
        }
        return listaDeRoupasPorTipoETamanho;
    }

    @Override
    public Roupa pesquisarRoupaPorDescricao(String descricao) throws RoupaNaoExisteException {
        if (roupas.containsKey(descricao)) {
            return roupas.get(descricao);
        } else {
            throw new RoupaNaoExisteException("Roupa não cadastrada no sistema");
        }
    }

    @Override
    public boolean existeRoupaDoTipo(TipoRoupa tipo) {
        for (Roupa r : roupas.values()) {
            if (r.getTipo().equals(tipo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int contaRoupasDoTamanho(String tamanho) {
        int count = 0;
        for (Roupa r : roupas.values()) {
            if (r.getTamanho().equals(tamanho)) {
                count++;
            }
        }
        return count;
    }

}
