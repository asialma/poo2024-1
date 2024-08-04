package br.ufpb.dcx.laisa.amigoSecreto;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class TestaSistemaAmigo {
    public static void main(String[] args) {
//        SistemaAmigo sistema = new SistemaAmigo();
//
//        boolean continuar = true;
//        String opcao;
//        while (continuar == true) {
//            opcao = JOptionPane.showInputDialog("Digite a opção desejada: " +
//                    "\n1.Cadastrar amigo\n2.Pesquisar amigo\n3.Enviar mensagem para todos" +
//                    "\n4.Enviar mensagem para alguém\n5.Pesquisar mensagens anônimas" +
//                    "\n6.Pesquisar todas as mensagnes\n7.Configurar amigo secreto" +
//                    "\n8.Pesquisa amigo secreto\n9.Sair");
//
//            if (opcao.equals("1")) {
//                String nome = JOptionPane.showInputDialog("Digite o nome do amigo");
//                String email = JOptionPane.showInputDialog("Digite o email do amigo");
//                sistema.cadastraAmigo(nome, email);
//                JOptionPane.showMessageDialog(null, "Amigo cadastrado com sucesso:");
//
//
//            } else if (opcao.equals("2")) {
//                //TODO
//
//
//            } else if (opcao.equals("3")) {
//                String texto = JOptionPane.showInputDialog("Digite o texto do email");
//                String emailRemetente = JOptionPane.showInputDialog("Digite o email do remetente");
//                boolean ehAnonima = Boolean.parseBoolean(JOptionPane.showInputDialog("É mensagem anônima?"));
//                sistema.enviarMensagemParaAlguem(texto, emailRemetente, emailRemetente, ehAnonima);
//                JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");
//
//
//            } else if (opcao.equals("4")) {
//                String emailDoDestinatario = JOptionPane.showInputDialog("Digite o email do destinatário");
//                String texto = JOptionPane.showInputDialog("Digite o texto do email");
//                String emailRemetente = JOptionPane.showInputDialog("Digite o email do remetente");
//                boolean ehAnonima = Boolean.parseBoolean(JOptionPane.showInputDialog("É mensagem anônima?"));
//                sistema.enviarMensagemParaAlguem(texto, emailRemetente, emailDoDestinatario, ehAnonima);
//                JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");
//
//
//            } else if (opcao.equals("5")) {
//                List<Mensagem> mensagensAnonimas = sistema.pesquisaMensagensAnonimas();
//                for (Mensagem m : mensagensAnonimas) {
//                    JOptionPane.showMessageDialog(null, m.getTextoCompletoAExibir());
//                }
//
//
//            } else if (opcao.equals("6")) {
//                List<Mensagem> mensagens = sistema.pesquisaTodasAsMensagens();
//                for (Mensagem m : mensagens) {
//                    JOptionPane.showMessageDialog(null, m.getTextoCompletoAExibir());
//                }
//
//            } else if (opcao.equals("7")) {
//                try {
//                    String emailDaPessoa = JOptionPane.showInputDialog("Digite o email da pessoa");
//                    String emailAmigoSorteado = JOptionPane.showInputDialog("Digite o email do amigo sorteado");
//                    sistema.configuraAmigoSecreto(emailDaPessoa, emailAmigoSorteado);
//                } catch (AmigoInexistenteException e) {
//                    JOptionPane.showMessageDialog(null, e);
//                }
//
//
//            } else if (opcao.equals("8")) {
//                String emailDaPessoa = JOptionPane.showInputDialog("Digite o email da pessoa para pesquisar o amigo");
//                String emailDoAmigo = JOptionPane.showInputDialog("Digite o email do amigo");
//                try {
//                    String emailAmigoSecretoDe = sistema.pesquisaAmigoSecretoDe(emailDaPessoa);
//                    if (emailAmigoSecretoDe.equals(emailDoAmigo)) {
//                        JOptionPane.showMessageDialog(null, "Ok");
//                    }
//                } catch (AmigoInexistenteException | AmigoNaoSorteadoException e) {
//                    JOptionPane.showMessageDialog(null, "Erro ao configurar/pesquisar amigo secreto: " + e.getMessage());
//                }
//
//
//            } else if (opcao.equals("9")) {
//                continuar = false;
//                JOptionPane.showMessageDialog(null, "FIM!");
//            }
//        }

//      a) Cadastre dois amigos José e Maria com seus e-mails.
        SistemaAmigo sistemaAmigo = new SistemaAmigo();
        sistemaAmigo.cadastraAmigo("José", "jose@gmail.com");
        sistemaAmigo.cadastraAmigo("Maria", "maria@gmail.com");


//      b) Configure o amigo secreto de José como sendo Maria e o amigo secreto de Maria como sendo José. Obs: Lembre  de tratar a exceção que pode ser lançada.
        try {
            sistemaAmigo.configuraAmigoSecreto("jose@gmail.com", "maria@gmail.com");
            sistemaAmigo.configuraAmigoSecreto("maria@gmail.com", "jose@gmail.com");
        } catch (AmigoInexistenteException e) {
            JOptionPane.showMessageDialog(null, e);
        }


//      c) Envie uma mensagem anônima de Maria para José.
        sistemaAmigo.enviarMensagemParaAlguem("Oi, José", "maria@gmail.com", "jose@gmail.com", true);

//      d) Envie uma mensagem anônima de Maria para todos.
        sistemaAmigo.enviarMensagemParaTodos("Oi, pessoal", "maria@gmail.com", true);

//      e) Pesquise as mensagens anônimas e imprima o texto completo dessas mensagens através do método  getTextoCompletoAExibir.
        List<Mensagem> mensagensAnonimas = sistemaAmigo.pesquisaMensagensAnonimas();
        for (Mensagem m : mensagensAnonimas) {
            JOptionPane.showMessageDialog(null, m.getTextoCompletoAExibir());
        }

//      f) Pesquise o e-mail do amigo secreto de José e veja se é o e-mail de Maria, imprimindo “Ok” caso seja.
        String amigo = JOptionPane.showInputDialog("Digite o email do amigo");
        String amigoSecretoDe = JOptionPane.showInputDialog("Digite o email do amigo secreto");
        try {
            // Verificar se o e-mail de Maria é o amigo secreto de José
            if (sistemaAmigo.pesquisaAmigoSecretoDe(amigo).equalsIgnoreCase(amigoSecretoDe)) {
                JOptionPane.showMessageDialog(null, "Ok");
            } else {
                JOptionPane.showMessageDialog(null,"O amigo secreto de José não é Maria.");
            }
        } catch (AmigoInexistenteException | AmigoNaoSorteadoException e) {
            System.out.println(e.getMessage());
        }

    }
}
