package br.ufpb.dcx.ayla.quiz;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ProgramaTeste {
    public static void main(String[] args) {
        System.out.println("Oi");
        Pergunta pergunta = new PerguntaDissertativa();
        System.out.println(pergunta.toString());
        Pergunta pergunta2 = new PerguntaDissertativa("Quanto é 2+2?", "4");
        Pergunta pergunta3 = new PerguntaDissertativa("Quanto é 1+1?", "2");

        List<Pergunta> perguntasList = new Vector<>();
        perguntasList.add(pergunta);
        perguntasList.add(pergunta2);
        perguntasList.add(pergunta3);

        Collections.sort(perguntasList);
        for (Pergunta p : perguntasList){
            System.out.println(p.getEnunciado());
        }

    }
}
