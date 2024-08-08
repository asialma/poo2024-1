package br.ufpb.dcx.laisa.sistemaBiblioteca;

import javax.swing.plaf.PanelUI;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaBibliotecaCCAE implements SistemaBiblioteca {
    private Map<String, Livro> livros;
    private Map<String, Usuario> usuarios;

    public SistemaBibliotecaCCAE(Map<String, Livro> livros, Map<String, Usuario> usuarios) {
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
    }

    public SistemaBibliotecaCCAE(){
        this(null, null);
    }

    @Override
    public boolean pegarLivro(String matriculaUsuario, String idLivro) throws UsuarioInexistenteException, LivroInexistenteException {
        Usuario usuario = usuarios.get(matriculaUsuario);
        Livro livro = livros.get(idLivro);
        if (usuario == null){
            throw new UsuarioInexistenteException("Usuário inexistente");
        }

        if (livro == null){
            throw new LivroInexistenteException("Livro inexistente");
        }

        if (livro.estahEmprestado()) {
            return false;
        }

        livro.setEstahEmprestado(true);
        usuario.adicionarEmprestimoDeLivro(livro);
        return true;
    }

    @Override
    public boolean devolverLivro(String matriculaUsuario, String idLivro) throws UsuarioInexistenteException, LivroInexistenteException {
        return false;
    }

    @Override
    public boolean cadastrarUsuario(String matricula, String nome, TipoUsuario tipo) throws UsuarioJaExisteException {
        if(usuarios.containsKey(matricula)){
            throw new UsuarioJaExisteException("Usuario já matriculado no sistema");
        }

        Usuario u = new Usuario(matricula, nome, tipo);
        usuarios.put(matricula, u);
        return true;
    }

    @Override
    public void cadastrarLivro(String id, String titulo, List<String> autores) throws LivroJaExisteException {
        if (livros.containsKey(id)){
            throw new LivroJaExisteException("Livro já cadastrado no sistema");
        }

        Livro livro = new Livro(id, titulo, autores);
        livros.put(id, livro);
    }

    @Override
    public Map<String, Livro> getTodosOsLivros() {
        return livros;
    }

    @Override
    public Collection<Usuario> getUsuarios() {
        return usuarios.values();
    }

    @Override
    public Collection<Livro> getLivrosEmprestadosA(String matriculaUsuario) {
        return null;
    }
}
