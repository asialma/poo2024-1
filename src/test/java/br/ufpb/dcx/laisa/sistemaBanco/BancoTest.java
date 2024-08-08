package br.ufpb.dcx.laisa.sistemaBanco;

import br.ufpb.dcx.laisa.SistemaBanco.Banco;
import br.ufpb.dcx.laisa.SistemaBanco.Conta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BancoTest {
    @Test
    public void TestaBanco(){
        //Inicializando o banco
        Banco banco = new Banco();
        //Criando uma conta
        banco.criarConta(0260, 123, "Laisa", 1000);

        //Verifica se o saldo foi inicializado corretamente
        assertTrue(banco)
    }
}
