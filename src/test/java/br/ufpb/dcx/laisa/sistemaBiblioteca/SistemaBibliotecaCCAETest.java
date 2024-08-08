package br.ufpb.dcx.laisa.sistemaBiblioteca;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaBibliotecaCCAETest {
    @Test
    public void TestaCadastro() throws LivroJaExisteException {
        //Inicializa o sistema
        SistemaBiblioteca sistema = new SistemaBibliotecaCCAE();

        // Verifica que não há livros no sistema antes do cadastro
        assertTrue(sistema.getTodosOsLivros().isEmpty());

        // Dados do livro a ser cadastrado
        String idLivro = "001";
        String tituloLivro = "O Senhor dos Anéis";
        List<String> autoresLivro = new ArrayList<>();
        autoresLivro.add("J.R.R. Tolkien");

        // Cadastra o livro
        sistema.cadastrarLivro(idLivro, tituloLivro, autoresLivro);

        // Verifica se o livro foi cadastrado corretamente
        Livro livroCadastrado = sistema.getTodosOsLivros().get(idLivro);
        assertEquals(idLivro, livroCadastrado.getId());
        assertEquals(tituloLivro, livroCadastrado.getTitulo());
    }
}
