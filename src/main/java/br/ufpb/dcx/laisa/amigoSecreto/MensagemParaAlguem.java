package br.ufpb.dcx.laisa.amigoSecreto;

public class MensagemParaAlguem extends Mensagem {

    private String emailDestinatario;
    public MensagemParaAlguem(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
        this.emailDestinatario = emailDestinatario;
    }

    public MensagemParaAlguem() {
        this("", "", false);
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    @Override
    public String getTextoCompletoAExibir() {
        if (ehAnonima()){
            return "Mensagem de 'ANÔNIMO'" +
                    "\nPara: " + emailDestinatario
                    +"\nTexto da mensagem: " + getTexto();
        } else {
          return   "Mensagem de " + getEmailRemetente()
                  + "\nPara: " + emailDestinatario
                  +"\nTexto da mensagem: " + getTexto();
        }
    }

    @Override
    public String toString() {
        return "MensagemParaAlguem{" + super.toString() +
                "emailDestinatario='" + emailDestinatario + '\'' +
                '}';
    }
}
