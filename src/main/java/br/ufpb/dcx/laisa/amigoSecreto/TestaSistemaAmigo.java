package br.ufpb.dcx.laisa.amigoSecreto;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class TestaSistemaAmigo {
    public static void main(String[] args){
        SistemaAmigo sistema = new SistemaAmigo();

        boolean continuar = true;
        String opcao;
        while (continuar == true) {
            opcao = JOptionPane.showInputDialog("Digite a opção desejada: " +
                    "\n1.Cadastrar amigo\n2.Pesquisar amigo\n3.Enviar mensagem para todos" +
                    "\n4.Enviar mensagem para alguém\n5.Pesquisar mensagens anônimas" +
                    "\n6.Pesquisar todas as mensagnes\n7.Configurar amigo secreto" +
                    "\n8.Pesquisa amigo secreto\n9.Sair");

            if (opcao.equals("1")) {
                try {
//                  sistema.cadastraAmigo("José", "jose@gmail.com");
//                  sistema.cadastraAmigo("Maria", "maria@gmail.com");

                    String nome = JOptionPane.showInputDialog("Digite o nome do amigo");
                    String email = JOptionPane.showInputDialog("Digite o email do amigo");
                    sistema.cadastraAmigo(nome, email);
                    JOptionPane.showMessageDialog(null, "Amigo cadastrado com sucesso:");
                } catch (AmigoJaCadastradoException e) {
                    JOptionPane.showMessageDialog(null, e);
                    e.printStackTrace();
                }
            }

            else if (opcao.equals("2")){

            }

            else if (opcao.equals("3")){
                String texto = JOptionPane.showInputDialog("Digite o texto do email");
                String emailRemetente = JOptionPane.showInputDialog("Digite o email do remetente");
                boolean ehAnonima = Boolean.parseBoolean(JOptionPane.showInputDialog("É mensagem anônima?"));
                sistema.enviarMensagemParaAlguem(texto, emailRemetente, emailRemetente, ehAnonima);
                JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");

//                sistema.enviarMensagemParaTodos("Oi, pessoal", "maria@gmail.com", false);
            }

            else if (opcao.equals("4")){
//                sistema.enviarMensagemParaAlguem("Oi, José", "maria@gmail.com", "jose@gmail.com", false);

                String emailDoDestinatario = JOptionPane.showInputDialog("Digite o email do destinatário");
                String texto = JOptionPane.showInputDialog("Digite o texto do email");
                String emailRemetente = JOptionPane.showInputDialog("Digite o email do remetente");
                boolean ehAnonima = Boolean.parseBoolean(JOptionPane.showInputDialog("É mensagem anônima?"));
                sistema.enviarMensagemParaAlguem(texto, emailRemetente, emailDoDestinatario, ehAnonima);
                JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");


            }

            else if (opcao.equals("5")){
                JOptionPane.showMessageDialog(null, sistema.pesquisaMensagensAnonimas());
            }

            else if (opcao.equals("6")){
                JOptionPane.showMessageDialog(null, sistema.pesquisaTodasAsMensagens());
            }

            else if (opcao.equals("7")) {
                try {
//                  sistema.configuraAmigoSecreto("José", "maria@gmail.com");
//                  sistema.configuraAmigoSecreto("Maria", "josé@gmail.com");

                    String emailDaPessoa = JOptionPane.showInputDialog("Digite o email da pessoa");
                    String emailAmigoSorteado = JOptionPane.showInputDialog("Digite o email do amigo sorteado");
                    sistema.configuraAmigoSecreto(emailDaPessoa, emailAmigoSorteado);
                } catch (AmigoInexistenteException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            else if (opcao.equals("8")){
            //TODO
            }

            else if (opcao.equals("9")){
                continuar = false;
                JOptionPane.showMessageDialog(null, "FIM!");
            }
        }
    }
}
