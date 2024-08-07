package br.ufpb.dcx.laisa.sistemaComercial;

import java.util.Collection;

public interface SistemaComercial {
        public boolean existeProduto(Produto produto);

        public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException;

        public boolean cadastraProduto(Produto produto);

        public boolean cadastraPedido(Produto produto);

        public boolean existePedido(Produto produto);

        public boolean cadastraCliente(Cliente cliente);

        public boolean existeCliente(Cliente cliente);

        public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException;

        public Collection<Cliente> pesquisaClientesComNomeComecandoCom(String prefixo);

        public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria);

}

