package main.java.textos;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.SofiaVentura;
import main.java.util.Cores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Escolhas {

    private Jogador jogador;
    private String[] opcoes = new String[4];
    private List<NPC> npcs;

    public Escolhas(Jogador jogador, List<NPC> npcs) {
        this.jogador = jogador;
        this.npcs = npcs;
    }

    // Imprime o gancho de turno e as opções disponiveis

    public void alternativas(int capitulo, int turno){

        if (capitulo == 1) {

            if (turno == 0) {

                System.out.println("""
                        Você se acomoda resistindo a vontade de abrir os olhos. Tudo parece distante.
                        Tick-Tack do relógio não revela as horas se não se levantar.
                        """);

                imprimirOpcoes();

            } else if (turno == 1) {

                System.out.println("""
                        Sofia está sentada na bancada do seu pequeno apartamento, o olhar impaciente e 
                        cansado revela que algo aconteceu mais cedo.
                        """);

                imprimirOpcoes();

            }

        } else if (capitulo == 2) {

            if (turno == 0) {

                System.out.println("""
                        \nMuito turnos parte 2""");

                imprimirOpcoes();

            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                System.out.println("""
                        \nMuito turnos parte 3""");

                ((SofiaVentura) npcs.get(0)).diaglogar(capitulo, turno);

                imprimirOpcoes();

            }

        }

    }

    // Metodos de definição de opções por turno

    public void limparOpcoes() {
        Arrays.fill(opcoes, "");
    }

    public void removerOpcao(int resposta) { 
        for (int i = 0; i < opcoes.length; i++) {
            if ((resposta - 1) == i) {
                opcoes[i] = " ";
            }
        }
    }

    public void imprimirOpcoes() {
        for (String opcao : opcoes) {
            if (opcao.equals(" ")) {
                System.out.println(Cores.VERDE + "----------------------" + Cores.RESET);
            } else {
                System.out.println(opcao);
            }
        }
    }

    public void definirOpcoes(int capitulo, int turno) {
        if (capitulo == 1) {
            if (turno == 0) {
                opcoes[0] = "1. Levantar do sofá.";
                opcoes[1] = "2. Permanecer na inconsciência.";
                opcoes[2] = "3. Olhar em volta.";
                opcoes[3] = (Cores.AMARELO + "4. [TESTE (INTELECTO) - DIFICULDADE: Médio (8)] A noite passada?" + Cores.RESET);
            } else if (turno == 1) {
                opcoes[0] = "1. 'O que te trás aqui tão cedo? Aconteceu algo?'";
                opcoes[1] = "2. 'Você está bonita hoje...'";
                opcoes[2] = "3. 'O que aconteceu ontem a noite?'";
                opcoes[3] = "4. Oferecer um café.";
            }
        }
        if (capitulo == 2) {
            if (turno == 0) {
                opcoes[0] = "1. Opção Neutra - 2";
                opcoes[1] = (Cores.AMARELO + "2. [TESTE (CORAÇÃO) - DIFICULDADE (8)] " + Cores.RESET);
                opcoes[2] = "3. Opção Boa";
                opcoes[3] = "4. Opção Ruim";
            }
        }
        if (capitulo == 3) {
            if (turno == 0) {
                opcoes[0] = "1. Opção Neutra - 3";
                opcoes[1] = "2. Opção Neutra";
                opcoes[2] = "3. Opção Boa";
                opcoes[3] = "4. Opção Ruim";
            }
        }
        if (capitulo == 4) {
            if (turno == 0) {
                opcoes[0] = "1. Opção Neutra - 4";
                opcoes[1] = "2. Opção Neutra";
                opcoes[2] = "3. Opção Boa";
                opcoes[3] = "4. Opção Ruim";
            }
        }
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

}

