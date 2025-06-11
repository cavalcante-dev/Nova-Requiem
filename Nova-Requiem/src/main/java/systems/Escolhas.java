package main.java.systems;

import main.java.entities.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Escolhas extends Texto {

    private Jogador jogador;
    private List<String> opcoes = new ArrayList<>();

    public Escolhas(int turno, int capitulo, Jogador jogador) {
        super(turno, capitulo);
        this.jogador = jogador;
    }

    public void alternativas(){

        if (capitulo == 1) {

            if (turno == 1) {

                System.out.print("""
                        \nO sofá velho intensifica o peso que a idade colocou nas suas costas. A boca seca\s
                        ajuda ainda menos.
                        \n""");

                imprimirOpcoes();

                System.out.print("\n> ");

            }

        } else if (capitulo == 2) {

            if (turno == 1) {

            }

        } else if (capitulo == 3) {

            if (turno == 1) {

            }

        }

    }

    public void limparOpcoes() {
        for (int i = 0; i < opcoes.size(); i++) {
            opcoes.remove(i);
        }
        /*
        array [0] = 1
        array [1] = 2
        ...
        ...
         */
    }

    public void removerOpcao(int resposta) {
        for (int i = 0; i < opcoes.size(); i++) {
            if (resposta == (i+1)) {
                opcoes.remove(i);
            } else if (opcoes.size() == 3 && resposta == 4) {
                opcoes.remove(2);
            }
        }
    }

    public void imprimirOpcoes() {
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public void definirOpcoes() {
        if (capitulo == 1) {
            if (turno == 1) {
                opcoes.add("1. Levantar do sofá.");
                opcoes.add("2. Permanecer na sua insignificancia.");
                opcoes.add("3. Olha em volta.");
                opcoes.add("4. [TESTE (MENTE) - DIFICULDADE: HEROICO (8)] A noite passada?");
            }
        }
    }




}

