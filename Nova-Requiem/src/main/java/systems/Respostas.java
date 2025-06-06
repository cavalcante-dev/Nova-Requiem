package main.java.systems;

import main.java.entities.Jogador;

import java.util.List;

public class Respostas extends Texto{

    boolean resultado = false;
    Jogador jogador;

    public Respostas(int turno, int capitulo, Jogador jogador) {
        super(turno, capitulo);
        this.jogador = jogador;
    }


    public void responder(int resposta){

        if (capitulo == 1) {

            if (turno == 1) {


                if (resposta == 1) {
                    System.out.println("Teste 1");
                } else if (resposta == 2) {
                    System.out.println("Teste 2");
                } else if (resposta == 3) {
                    System.out.println("""
                            \nO ventilador de teto velho faz seu máximo para manter o ambiente agradável, o relógio
                            na parede marca 10:40AM. São as únicas coisas que parecem estar no lugar, o sofá velho
                            onde você está fede a mofo, as roupas de ontem estão em locais fora do seu campo de visão
                            e a televisão velha do outro lado da sala continua queimada. """);
                } else if (resposta == 4) {
                    resultado = jogador.rolarAtributo(jogador.getintelecto(), 8);
                    if (resultado == false) {

                    } else if (resultado == true) {
                        
                    }
                }

            }

        } else if (capitulo == 2) {

            if (turno == 1) {

            }

        } else if (capitulo == 3) {

            if (turno == 1) {

            }

        } else if (capitulo == 4) {

            if (turno == 1) {

            }

        }

    }


}
