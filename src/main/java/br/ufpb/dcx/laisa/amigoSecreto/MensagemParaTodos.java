package br.ufpb.dcx.laisa.amigoSecreto;

public class MensagemParaTodos extends Mensagem{

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }

    public MensagemParaTodos() {
        this("", "", false);
    }

    @Override
    public String getTextoCompletoAExibir() {
        return "Mensagem de " + getEmailRemetente() + " para todos."
                + "\nTexto da mensagem: ";
    }
}
