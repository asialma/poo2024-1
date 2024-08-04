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

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaCadastradoException {
        for (Amigo a : amigos) {
            if (a.getNomeAmigo().equals(nomeAmigo) && a.getEmailAmigo().equals(emailAmigo)) {
                throw new AmigoJaCadastradoException("Amigo já cadastrado no sistema");
            } else {
                Amigo amigo = new Amigo(nomeAmigo, emailAmigo);
                this.amigos.add(amigo);
            }
        }
    }

    public Amigo pesquisaAmigo(String emailAmigo) {
        for (Amigo a : amigos) {
            if (a.getEmailAmigo().equals(emailAmigo)) {
                return a;
            }
        }
        return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
        mensagens.add(new MensagemParaAlguem(texto, emailRemetente, ehAnonima));
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        mensagens.add(new MensagemParaAlguem());
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
        return new ArrayList<>(mensagens);
    }

    public void configuraAmigoSecreto(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        for (Amigo a : amigos) {
            if (a.getEmailAmigo().equals(emailDaPessoa)) {
                a.setEmailAmigoSorteado(emailAmigoSorteado);
            } else {
                throw new AmigoInexistenteException("Amigo não cadastrado no sistema");
            }
        }
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {
        for (Amigo a : amigos) {
            if (a.getEmailAmigo().equals(emailDaPessoa)) {
                if (a.getEmailAmigoSorteado().isEmpty()) {
                    throw new AmigoNaoSorteadoException("O amigo não foi sorteado!");
                } else {
                    return a.getEmailAmigoSorteado();
                }
            }
        }
        throw new AmigoInexistenteException("Amigo não cadastrado no sistema");
    }


}
