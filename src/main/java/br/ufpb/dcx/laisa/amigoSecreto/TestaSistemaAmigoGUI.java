package br.ufpb.dcx.laisa.amigoSecreto;

import java.util.Scanner;

public class TestaSistemaAmigoGUI {
    public static void main(String[] args) {
        //a) Inicialize a variável do tipo SistemaAmigo.
        SistemaAmigo sistemaAmigoGui = new SistemaAmigo();

        //b) Leia a quantidade total de amigos a participar da brincadeira
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade de amigos participantes do sorteio");
        int totaldeAmigosParticipantes = Integer.parseInt(leia.next());

        //c) Leia os dados (nome e e-mail) de cada um dos amigos e os cadastre.
        System.out.println("\nCADASTRANDO AMIGOS PARTICIPANTES");
        for (int i = 0; i < totaldeAmigosParticipantes; i++) {
            System.out.println("Digite o nome do amigo que deseja cadastrar");
            String nomeAmigo = leia.next();
            System.out.println("Digite seu email");
            String emailAmigo = leia.next();
            sistemaAmigoGui.cadastraAmigo(nomeAmigo, emailAmigo);
        }

        //d) Cadastre os resultados do sorteio dos amigos secretos (diga quem pegou quem).
        System.out.println("\nCADASTRANDO AMIGOS SORTEADOS:");
        for (int i = 0; i < totaldeAmigosParticipantes; i++) {
            try {
                System.out.println("Qual o email da pessoa que deseja configurar?");
                String emailPessoa = leia.next();
                System.out.println("Qual o email do amigo sorteado?");
                String emailAmigoSorteado = leia.next();
                sistemaAmigoGui.configuraAmigoSecreto(emailPessoa, emailAmigoSorteado);
            } catch (Exception e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
                System.out.println("erro na hora de configurar tente novamente passando os parametros corretos\n " + e.getMessage());
            }
        }

        //e) Envie uma mensagem de algum dos amigos para todos, coletando para isso os dados necessários (ex: remetente,  texto, se a mensagem é anônima ou não).
        System.out.println("\nENVIANDO MENSAGEM PARA TODOS:");
        System.out.println("Digite o email do remetente");
        String emailRemetente = leia.next();
        System.out.println("A mensagem é anônima? Responda: true/false");
        boolean ehAnonima = Boolean.parseBoolean(leia.next());
        System.out.println("Digite o texto da mensagem");
        String texto = leia.next();

        sistemaAmigoGui.enviarMensagemParaTodos(texto, emailRemetente, ehAnonima);
        for(Mensagem m: sistemaAmigoGui.pesquisaTodasAsMensagens()){
            System.out.println(m.getTextoCompletoAExibir());
        }

    }

}
