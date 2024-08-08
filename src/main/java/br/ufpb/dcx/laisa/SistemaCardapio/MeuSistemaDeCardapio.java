package br.ufpb.dcx.laisa.SistemaCardapio;

import br.ufpb.dcx.laisa.artesanato.ItemJaExisteException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeuSistemaDeCardapio implements SistemaGerenciadorDeCardapio{
    private Map<String, ItemDeCardapio> itensCardapioMap;

    public MeuSistemaDeCardapio() {
        this.itensCardapioMap = new HashMap<>();
    }

    @Override
    public void cadastrarItemNoCardapio(ItemDeCardapio item) throws ItemJaExisteException {
        if (this.itensCardapioMap.containsKey(item.getCodigo())) {
            throw new ItemJaExisteException("Já existe item com o código "
                    +item.getCodigo());
        } else {
            this.itensCardapioMap.put(item.getCodigo(), item);
        }
    }

    @Override
    public List<ItemDeCardapio> pesquisaItensDoTipo(TipoItem tipo) {
        return null;
    }

    @Override
    public ItemDeCardapio pesquisaItemDoCardapio(String codigo) throws ItemNaoExisteException {
        for(ItemDeCardapio i : itensCardapioMap.values()){
            if(i.getCodigo().equals(codigo)){
                return i;
            }
        }
        throw new ItemNaoExisteException("Item não cadastrado no sistema");
    }

    @Override
    public boolean existeItemComNome(String nome) {
        for (ItemDeCardapio i : itensCardapioMap.values()){
            if (i.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<ItemDeCardapio> pesquisaItensPeloNome(String nomeItem) {
        List<ItemDeCardapio> listaDeItensComNome = new ArrayList<>();
        for(ItemDeCardapio i : itensCardapioMap.values()){
            if(i.getNome().startsWith(nomeItem)){
                listaDeItensComNome.add(i);
            }
        }
        return listaDeItensComNome;
    }

    @Override
    public int pesquisaQuantidadeDeItensDoTipo(TipoItem tipo) {
        int count = 0;
        for(ItemDeCardapio i : itensCardapioMap.values()){
            if(i.getTipo().equals(tipo)){
                count++;
            }
        }
        return count;
    }
}
