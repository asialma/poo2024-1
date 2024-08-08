package br.ufpb.dcx.laisa.SistemaCardapio;

import br.ufpb.dcx.laisa.artesanato.ItemJaExisteException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeuSistemaDeCardapioTest {
    @Test
    public void test(){
        MeuSistemaDeCardapio sistema = new MeuSistemaDeCardapio();
        ItemDeCardapio item1 = new ItemDeCardapio("B01", TipoItem.BEBEIDA, "Suco de laranja", 8.00);
        try {
            assertFalse(sistema.existeItemComNome("Suco de laranja"));
            sistema.cadastrarItemNoCardapio(item1);
            assertTrue(sistema.existeItemComNome("Suco de laranja"));

            assertEquals(1, sistema.pesquisaQuantidadeDeItensDoTipo(TipoItem.BEBEIDA));

            ItemDeCardapio item2 = new ItemDeCardapio("B02", TipoItem.BEBEIDA, "Suco de uva", 10);
            sistema.cadastrarItemNoCardapio(item2);
            assertEquals(0, sistema.pesquisaQuantidadeDeItensDoTipo(TipoItem.LANCHE));
        } catch (Exception e) {
            fail("Não deveria lançar exceção");
        }


    }
}
