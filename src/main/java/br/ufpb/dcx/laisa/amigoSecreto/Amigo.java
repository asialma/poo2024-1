package br.ufpb.dcx.laisa.amigoSecreto;

import java.util.Objects;

public class Amigo {
    private String nome;
    private String email;
    private String amigoSorteado;

    public Amigo (String nome, String email, String amigoSorteado){
        this.nome = nome;
        this.email = email;
        this.amigoSorteado = amigoSorteado;
    }

    public Amigo(){
        this("", "", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    public String getAmigoSorteado() {
        return amigoSorteado;
    }

    public void setAmigoSorteado(String amigoSorteado) {
        this.amigoSorteado = amigoSorteado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amigo amigo = (Amigo) o;

        if (!Objects.equals(nome, amigo.nome)) return false;
        if (!Objects.equals(email, amigo.email)) return false;
        return Objects.equals(amigoSorteado, amigo.amigoSorteado);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (amigoSorteado != null ? amigoSorteado.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", amigoSorteado='" + amigoSorteado + '\'' +
                '}';
    }
}
