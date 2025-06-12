package main.java.textos;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.SofiaVentura;

import java.util.List;

public class Respostas {

    private boolean resultado;
    private Jogador jogador;
    private Escolhas escolhas;
    private boolean fimTurno;
    private Finais finais;
    private List<NPC> npcs;

    public Respostas(Jogador jogador, Escolhas escolhas, Finais finais, List<NPC> npcs) {
        this.jogador = jogador;
        this.escolhas = escolhas;
        this.finais = finais;
        this.resultado = false;
        this.fimTurno = false;
        this.npcs = npcs;
    }


    public void responder(int resposta, int capitulo, int turno){

        if (capitulo == 1) {

            if (turno == 0) {

                if (resposta == 1) {

                    System.out.println("Escolha Neutra");
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    escolhas.removerOpcao(resposta);


                } else if (resposta == 2) {

                    System.out.println("Escolha Neutra");
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    System.out.println("Escolha boa");
                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } else if (resposta == 4) {

                    System.out.println("Escolha ruim");
                    escolhas.removerOpcao(resposta);
                    finais.setFinalRuim(finais.getfinalSecreto()+1);
                    setFimTurno(true);

                } else {
                    System.out.println("> Opção Indisponivel");
                }


            }

        } else if (capitulo == 2) {

            if (turno == 0) {

                if (resposta == 1) {

                    System.out.println("Escolha Neutra");
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 2) {

                    System.out.println("Escolha Neutra");
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    System.out.println("Escolha boa");
                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } else if (resposta == 4) {

                    System.out.println("Escolha ruim");
                    escolhas.removerOpcao(resposta);
                    finais.setFinalRuim(finais.getfinalSecreto()+1);
                    setFimTurno(true);

                } else {
                    System.out.println("> Opção Indisponivel");
                }

            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                if (resposta == 1) {

                    System.out.println("Escolha Neutra");
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 2) {

                    System.out.println("Escolha Neutra");
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    System.out.println("Escolha boa");
                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } else if (resposta == 4) {

                    System.out.println("Escolha ruim");
                    escolhas.removerOpcao(resposta);
                    finais.setFinalRuim(finais.getfinalSecreto()+1);
                    setFimTurno(true);

                } else {
                    System.out.println("> Opção Indisponivel");
                }

            }

        }

    }

    public boolean isFimTurno() {
        return fimTurno;
    }

    public void setFimTurno(boolean fimTurno) {
        this.fimTurno = fimTurno;
    }

    /*
                if (resposta == 1) {

                    System.out.println("Teste 1");
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 2) {

                    System.out.println("Teste 2");
                   // Texto.setFinalBom(Texto.getFinalBom() + 1);
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    System.out.println("""
                            \nO ventilador de teto velho faz seu máximo para manter o ambiente agradável, o relógio
                            na parede marca 10:40AM. São as únicas coisas que parecem estar no lugar, o sofá velho
                            onde você está fede a mofo, as roupas de ontem estão em locais fora do seu campo de visão
                            e a televisão velha do outro lado da sala continua queimada.""");

                    escolhas.removerOpcao(resposta);

                } else if (resposta == 4) {

                    resultado = jogador.rolarAtributo(jogador.getintelecto(), 8);
                    if (!resultado) {
                        System.out.println("Você falhou.");
                    } else if (resultado) {
                        System.out.println("Você conseguiu!");
                        jogador.setIntelectoBarra(jogador.getIntelectoBarra()+1);
                    }

                    escolhas.removerOpcao(resposta);

                } else {
                    System.out.println("> Opção Indisponivel");
                }
     */

}
