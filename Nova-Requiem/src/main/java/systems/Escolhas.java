package main.java.systems;

import main.java.entities.Jogador;

public class Escolhas extends Texto {

    private Jogador jogador;

    public Escolhas(int turno, int capitulo, Jogador jogador) {
        super(turno, capitulo, finalBom, finalRuim);
        this.jogador = jogador;
    }

    public void alternativas(){

        if (capitulo == 1) {

            if (turno == 1) {

                System.out.print("""
                        \nO sofá velho intensifica o peso que a idade colocou nas suas costas. A boca seca\s
                        ajuda ainda menos.
                        
                        1. Levantar do sofá.
                        2. Permanecer na sua insignificancia.
                        3. Olha em volta.
                        4. [TESTE (MENTE) - DIFICULDADE: HEROICO (8)] A noite passada?
                        
                        >\s""");
            }

        } else if (capitulo == 2) {

            if (turno == 1) {

            }

        } else if (capitulo == 3) {

            if (turno == 1) {

        }

    }

}

