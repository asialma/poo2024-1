package br.ufpb.dcx.laisa.artesanato;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class SistemaFeiraArtesanatoRioTintoTest {
    @Test
    public void testaCadastro() {
        SistemaFeiraArtesanatoRioTinto sistema = new SistemaFeiraArtesanatoRioTinto();
        try {
            Roupa r = new Roupa();
            sistema.cadastraItem(r);
            fail("Não deve deixar cadastrar!");
        } catch (CodigoInvalidoException e) {
            //OK
        } catch (ItemJaExisteException e) {
            fail("Não deveria lançar estas exceptions");
        }
    }
}
