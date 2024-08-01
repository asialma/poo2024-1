package br.ufpb.dcx.laisa.amigoSecreto;

import java.util.Objects;

public abstract class Mensagem {
    private String texto;
    private String emailRemetente;
    private boolean anonima;

    public Mensagem(String texto, String emailRemetente, boolean anonima) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
    }

    public Mensagem(){
        this("", "", false);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public abstract String getTextoCompletoAExibir();

    public boolean ehAnonima(){
        return anonima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mensagem mensagem = (Mensagem) o;

        if (anonima != mensagem.anonima) return false;
        if (!Objects.equals(texto, mensagem.texto)) return false;
        return Objects.equals(emailRemetente, mensagem.emailRemetente);
    }

    @Override
    public int hashCode() {
        int result = texto != null ? texto.hashCode() : 0;
        result = 31 * result + (emailRemetente != null ? emailRemetente.hashCode() : 0);
        result = 31 * result + (anonima ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "texto='" + texto + '\'' +
                ", emailRemetente='" + emailRemetente + '\'' +
                ", anonima=" + anonima +
                '}';
    }
}
