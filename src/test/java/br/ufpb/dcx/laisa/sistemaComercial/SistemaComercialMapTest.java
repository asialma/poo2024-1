package br.ufpb.dcx.laisa.sistemaComercial;

import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaComercialMapTest {
    @Test
    public void testaCadastroProdutos() {
        SistemaComercialMap sistema = new SistemaComercialMap();
        Collection<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.isEmpty());

        //Cadastrando produto
        Produto p = new Produto("001", "Coxinha", 3.00, 10, CategoriaProduto.ALIMENTO);
        sistema.cadastraProduto(p);

        //Verifica se o produto existe e que a quantidade de produtos da categoria alimento é 1
        alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertEquals(1, alimentos.size());
    }
}
