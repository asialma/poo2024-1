package br.ufpb.dcx.laisa.sistemaGerenciadorDeRoupas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaRoupasMapTest {
    @Test
    public void testaCadastro() {
        SistemaRoupasMap sistema = new SistemaRoupasMap();
        try {
            assertFalse(sistema.existeRoupaDoTipo(TipoRoupa.BERMUDA));
            String[] cores = {"Preta","Branca"};
            sistema.cadastrarRoupa("Bermuda Preta Hering",
                    TipoRoupa.BERMUDA, cores, "GG");
            assertTrue(sistema.existeRoupaDoTipo(TipoRoupa.BERMUDA));

            String[] cores2 = {"Preto","Vermelho"};
            sistema.cadastrarRoupa("Camisa preta e vermelha", TipoRoupa.CAMISA, cores2 , "GG");


            assertEquals(2, sistema.contaRoupasDoTamanho("GG"));

            assertTrue(sistema.existeRoupaDoTipo(TipoRoupa.BERMUDA));

            assertTrue(sistema.pesquisarRoupasPorTipoETamanho(TipoRoupa.CAMISA, "P").isEmpty());

        } catch (RoupaJaExisteException e) {
            fail("Não deveria falhar");
        }
    }
}
