package br.ufpb.dcx.laisa.sistemaComercial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaComercialMap implements SistemaComercial {
    private Map<String, Cliente> clientes;
    private Map<String, Produto> produtos;

    public SistemaComercialMap(Map<String, Cliente> clientes, Map<String, Produto> produtos) {
        this.clientes = new HashMap<>();
        this.produtos = new HashMap<>();
    }

    public SistemaComercialMap() {
        this(null, null);
    }

    @Override
    public boolean existeProduto(Produto produto) {
        if (this.produtos.containsKey(produto.getCodigo())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        if (this.produtos.containsKey(codigoProduto)) {
            return this.produtos.get(codigoProduto);
        }
        throw new ProdutoNaoExisteException("Não foi encontrado produto" + " com o código " + codigoProduto);
    }

    @Override
    public boolean cadastraProduto(Produto produto) {
        if (existeProduto(produto)) {
            return false;
        } else {
            this.produtos.put(produto.getCodigo(), produto);
            return true;
        }
    }

    @Override
    public boolean cadastraPedido(Produto produto) {
        //TODO
        return false;
    }

    @Override
    public boolean existePedido(Produto produto) {
        //TODO
        return false;
    }

    @Override
    public boolean cadastraCliente(Cliente cliente) {
        if (existeCliente(cliente)) {
            return false;
        } else {
            this.clientes.put(cliente.getId(), cliente);
            return true;
        }
    }

    @Override
    public boolean existeCliente(Cliente cliente) {
        if (clientes.containsKey(cliente.getId())) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException {
        if (clientes.containsKey(id)) {
            return clientes.get(id);
        } else {
            throw new ClienteNaoExisteException("Cliente não existe");
        }
    }

    public Collection<Cliente> pesquisaClientesComNomeComecandoCom(String prefixo) {
        //TODO
        return null;
    }

    @Override
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        Collection<Produto> produtosDaCategoria = new ArrayList<>();
        for (Produto p : produtos.values()) {
            if (p.getCategoria().equals(categoria)) {
                produtosDaCategoria.add(p);
            }
        }
        return produtosDaCategoria;
    }
}
