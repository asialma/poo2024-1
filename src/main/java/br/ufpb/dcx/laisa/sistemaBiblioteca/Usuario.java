package br.ufpb.dcx.laisa.sistemaBiblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Usuario{
    private String matricula;
    private String nome;
    private TipoUsuario tipo;
    private Collection<Livro> livrosEmprestados;

    public Usuario(String matricula, String nome, TipoUsuario tipo){
        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
    }

    public void adicionarEmprestimoDeLivro(Livro livro){
        livrosEmprestados.add(livro);
    }
    public void removerEmprestimoDeLivro(Livro livro){
        livrosEmprestados.remove(livro);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Collection<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (!Objects.equals(matricula, usuario.matricula)) return false;
        if (!Objects.equals(nome, usuario.nome)) return false;
        return Objects.equals(livrosEmprestados, usuario.livrosEmprestados);
    }

    @Override
    public int hashCode() {
        int result = matricula != null ? matricula.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (livrosEmprestados != null ? livrosEmprestados.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", livrosEmprestados=" + livrosEmprestados +
                '}';
    }
}
