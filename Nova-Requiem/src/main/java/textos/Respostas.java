package main.java.textos;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.SofiaVentura;
import main.java.util.Cores;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    System.out.println(Cores.VERDE + "Escolha boa" + Cores.RESET);
                    escolhas.removerOpcao(resposta);
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } else if (resposta == 4) {

                    System.out.println(Cores.VERMELHO + "Escolha ruim" + Cores.RESET);
                    escolhas.removerOpcao(resposta);
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    finais.setFinalRuim(finais.getFinalRuim()+1);
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

                    resultado = jogador.rolarAtributo(jogador.getCoracao(), 8);
                    if (!resultado) {
                        System.out.println(Cores.VERMELHO + "Você falhou." + Cores.RESET);
                    } else if (resultado) {
                        System.out.println(Cores.VERDE + "Você conseguiu!" + Cores.RESET);
                        jogador.setIntelectoBarra(jogador.getIntelectoBarra()+1);
                    }

                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    System.out.println(Cores.VERDE + "Escolha boa" + Cores.RESET);
                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } else if (resposta == 4) {

                    System.out.println(Cores.VERMELHO + "Escolha ruim" + Cores.RESET);
                    escolhas.removerOpcao(resposta);
                    finais.setFinalRuim(finais.getFinalRuim()+1);
                    setFimTurno(true);

                } else {
                    System.out.println("> Opção Indisponivel");
                }

            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                if (resposta == 1) {

                    System.out.println("Escolha Neutra");
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 2) {

                    System.out.println("Escolha Neutra");
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    System.out.println(Cores.VERDE + "Escolha boa" + Cores.RESET);
                    escolhas.removerOpcao(resposta);
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } else if (resposta == 4) {

                    System.out.println(Cores.VERMELHO + "Escolha ruim" + Cores.RESET);
                    escolhas.removerOpcao(resposta);
                    ((SofiaVentura) npcs.get(0)).resposta(capitulo, turno, resposta);
                    finais.setFinalRuim(finais.getFinalRuim()+1);
                    setFimTurno(true);

                } else {
                    System.out.println("> Opção Indisponivel");
                }

            }

        }

    }

    // Função de verificação de resposta no turno.
    public int validadeResposta(int resposta) {

        boolean caiuNoCatch;
        Scanner sc = new Scanner(System.in);

        if (resposta == 0) {
            do {

                try {
                    System.out.print("> ");
                    resposta = sc.nextInt();
                    caiuNoCatch = false;
                } catch (InputMismatchException e) {
                    sc.next();
                    caiuNoCatch = true;
                    System.out.println(Cores.VERMELHO + "> CARACTERE INVALIDO <" + Cores.RESET);
                }

                if (resposta < 1 || resposta > 4) {
                    System.out.println(Cores.VERMELHO + "> OPÇÃO INDISPONIVEL: Insira um valor entre 1 e 4 <" + Cores.RESET);
                }

            } while (caiuNoCatch && resposta < 1 || resposta > 4);
        }

        return resposta;

    }

    public boolean isFimTurno() {
        return fimTurno;
    }

    public void setFimTurno(boolean fimTurno) {
        this.fimTurno = fimTurno;
    }


}
