package br.ufpb.dcx.laisa.sistemaBiblioteca;

import java.util.*;

public class Livro {
    private String id;
    private String titulo;
    private List<String> autores;
    private boolean estahEmprestado;

    public Livro(String id, String titulo, List<String> autores) {
        this.id = id;
        this.titulo = titulo;
        this.autores = new ArrayList<>();
    }

    public Livro(){
        this("", "", null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean estahEmprestado() {
        return estahEmprestado;
    }

    public void setEstahEmprestado(boolean estahEmprestado) {
        this.estahEmprestado = estahEmprestado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (estahEmprestado != livro.estahEmprestado) return false;
        if (!Objects.equals(id, livro.id)) return false;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (estahEmprestado ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", estahEmprestado=" + estahEmprestado +
                '}';
    }
}
