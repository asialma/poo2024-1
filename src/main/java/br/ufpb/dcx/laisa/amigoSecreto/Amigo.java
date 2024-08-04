package br.ufpb.dcx.laisa.amigoSecreto;

import java.util.Objects;

public class Amigo {
    private String nomeAmigo;
    private String emailAmigo;
    private String emailAmigoSorteado;

    public Amigo(String nomeAmigo, String emailAmigo) {
        this.nomeAmigo = emailAmigo;
        this.emailAmigo = emailAmigo;
    }

    public Amigo() {
        this("", "");
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getEmailAmigo() {
        return emailAmigo;
    }

    public void setEmailAmigo(String emailAmigo) {
        this.emailAmigo = emailAmigo;
    }

    public String getEmailAmigoSorteado() {
        return emailAmigoSorteado;
    }

    public void setEmailAmigoSorteado(String amigoSorteado) {
        this.emailAmigoSorteado = emailAmigoSorteado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amigo amigo = (Amigo) o;

        if (!Objects.equals(nomeAmigo, amigo.nomeAmigo)) return false;
        if (!Objects.equals(emailAmigo, amigo.emailAmigo)) return false;
        return Objects.equals(emailAmigoSorteado, amigo.emailAmigoSorteado);
    }

    @Override
    public int hashCode() {
        int result = nomeAmigo != null ? nomeAmigo.hashCode() : 0;
        result = 31 * result + (emailAmigo != null ? emailAmigo.hashCode() : 0);
        result = 31 * result + (emailAmigoSorteado != null ? emailAmigoSorteado.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "nome='" + nomeAmigo + '\'' +
                ", email='" + emailAmigo + '\'' +
                ", amigoSorteado='" + emailAmigoSorteado + '\'' +
                '}';
    }
}
