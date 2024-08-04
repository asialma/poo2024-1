package br.ufpb.dcx.laisa.amigoSecreto;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public SistemaAmigo(List<Mensagem> mensagens, List<Amigo> amigos) {
        this.mensagens = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public SistemaAmigo() {
        this(null, null);
    }

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) {
        Amigo amigo = new Amigo(nomeAmigo, emailAmigo);
        this.amigos.add(amigo);
    }


    public Amigo pesquisaAmigo(String emailAmigo) {
        for (Amigo a : amigos) {
            if (a.getEmailAmigo().equalsIgnoreCase(emailAmigo)) {
                return a;
            }
        }
        return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
        Mensagem mensagem = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        mensagens.add(mensagem);
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        Mensagem mensagem = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        this.mensagens.add(mensagem);
    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> mensagensAnonimasPesquisadas = new ArrayList<>();
        for (Mensagem m : mensagens) {
            if (m.ehAnonima()) {
                mensagensAnonimasPesquisadas.add(m);
            }
        }
        return mensagensAnonimasPesquisadas;
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        return mensagens;
    }

    public void configuraAmigoSecreto(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        int cont = 0;
        for (Amigo a : this.amigos) {
            if (a.getEmailAmigo().equalsIgnoreCase(emailDaPessoa)) {
                a.setEmailAmigoSorteado(emailAmigoSorteado);
                cont++;
            }
        }
        if (cont == 0) {
            throw new AmigoInexistenteException("Não existe um amigo com esse email cadastrado");
        }
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {
        for (Amigo a : this.amigos) {
            if (a.getEmailAmigo().equalsIgnoreCase(emailDaPessoa)) {
                if (a.getEmailAmigoSorteado() != null) {
                    return a.getEmailAmigoSorteado();
                } else {
                    throw new AmigoNaoSorteadoException("Esse amigo ainda não tem um amigo secreto cadastrado");
                }
            }
        }
        throw new AmigoInexistenteException("Não existe um amigo com esse email");
    }

}
