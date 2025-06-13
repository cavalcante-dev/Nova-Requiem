package main.java.textos;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.SofiaVentura;

import java.util.ArrayList;
import java.util.List;

public class Escolhas {

    private Jogador jogador;
    private String[] opcoes = new String[4];
    private List<NPC> npcs;

    public Escolhas(Jogador jogador, List<NPC> npcs) {
        this.jogador = jogador;
        this.npcs = npcs;
    }

    public void alternativas(int capitulo, int turno){

        if (capitulo == 1) {

            if (turno == 0) {

                System.out.print("""
                        \n Muito turnos parte 1
                        \n""");

                ((SofiaVentura) npcs.get(0)).diaglogar(capitulo, turno);

                imprimirOpcoes();

                System.out.print("\n> ");

            }

        } else if (capitulo == 2) {

            if (turno == 0) {

                System.out.print("""
                        \n Muito turnos parte 2
                        \n""");

                imprimirOpcoes();

                System.out.print("\n> ");

            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                System.out.print("""
                        \n Muito turnos parte 3
                        \n""");

                ((SofiaVentura) npcs.get(0)).diaglogar(capitulo, turno);

                imprimirOpcoes();

                System.out.print("\n> ");

            }

        }

    }

    public void limparOpcoes() {
        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = "";
        }
        /*
        array [0] = 1
        array [1] = 2
        ...
        ...
         */
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
                System.out.println("------------");
            } else {
                System.out.println(opcao);
            }
        }
    }

    public void definirOpcoes(int capitulo, int turno) {
        if (capitulo == 1) {
            if (turno == 0) {
                opcoes[0] = "1. Opção Neutra - 1";
                opcoes[1] = "2. Opção Neutra";
                opcoes[2] = "3. Opção Boa";
                opcoes[3] = "4. Opção Ruim";
            }
        }
        if (capitulo == 2) {
            if (turno == 0) {
                opcoes[0] = "1. Opção Neutra - 2";
                opcoes[1] = "2. Opção Neutra";
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

