package main.java.systems;

import main.java.entities.Jogador;

import java.util.List;

public class Respostas {

    boolean resultado = false;
    Jogador jogador;
    Escolhas escolhas;

    public Respostas(Jogador jogador, Escolhas escolhas) {
        this.jogador = jogador;
        this.escolhas = escolhas;
    }


    public void responder(int resposta, int turno, int capitulo){

        if (capitulo == 1) {

            if (turno == 1) {


                if (resposta == 1) {

                    System.out.println("Teste 1");

                } else if (resposta == 2) {

                    System.out.println("Teste 2");
                   // Texto.setFinalBom(Texto.getFinalBom() + 1);

                } else if (resposta == 3) {

                    System.out.println("""
                            \nO ventilador de teto velho faz seu máximo para manter o ambiente agradável, o relógio
                            na parede marca 10:40AM. São as únicas coisas que parecem estar no lugar, o sofá velho
                            onde você está fede a mofo, as roupas de ontem estão em locais fora do seu campo de visão
                            e a televisão velha do outro lado da sala continua queimada.""");

                    escolhas.removerOpcao(resposta);

                } else if (resposta == 4) {

                    resultado = jogador.rolarAtributo(jogador.getintelecto(), 8);
                    if (resultado == false) {
                        System.out.println("Você falhou.");
                    } else if (resultado == true) {
                        System.out.println("Você conseguiu!");
                        jogador.setIntelectoBarra(jogador.getIntelectoBarra()+1);
                    }

                    escolhas.removerOpcao(resposta);

                } else {
                    System.out.println("> Opção Indisponivel");
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
