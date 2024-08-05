package br.ufpb.dcx.laisa.amigoSecreto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAmigoMap {
    private Map<String, Amigo> amigos;
    private List<Mensagem> mensagens;
    public SistemaAmigoMap() {
        this.amigos = new HashMap<>();
        this.mensagens = new ArrayList<>();
    }

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaCadastradoException{
        if (amigos.containsKey(emailAmigo)){
            throw new AmigoJaCadastradoException("Amigo já cadastrado!");
        }
        Amigo amigo = new Amigo(nomeAmigo, emailAmigo);
        amigos.put(nomeAmigo, amigo);
    }


    public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException {
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

    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException, AmigoJaCadastradoException {
        return null;
    }
}
