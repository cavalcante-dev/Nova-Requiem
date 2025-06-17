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
    private Jogador jogadorUtilitarios;
    private Escolhas escolhas;
    private boolean fimTurno;
    private Finais finais;
    private List<NPC> npcs;
    private int contadorFimTurno;

    public Respostas(Jogador jogadorUtilitarios, Escolhas escolhas, Finais finais, List<NPC> npcs) {
        this.jogadorUtilitarios = jogadorUtilitarios;
        this.escolhas = escolhas;
        this.finais = finais;
        this.resultado = false;
        this.fimTurno = false;
        this.npcs = npcs;
        this.contadorFimTurno = 0;
    }

    public void responder(int resposta, int capitulo, int turno){

        if (capitulo == 1) {

            if (turno == 0) {

                if (resposta == 1) {

                    // Resposta com aumento de afinidade - usar como modelo posteriormente.

                    System.out.println("""
                            
                            Você decide se levantar, afinal, a cidade não não espera.
                            
                            Você faz o seu máximo para organizar o que pode e colocar no lugar as
                            tralhas espalhas pelo apartamento. Seja lá o que tenha acontecido na
                            noite de ontem você com certeza se divertiu.
                            
                            O relógio marca as 8:35AM.
                            
                            A cozinha minimamente arrumada é convidativa para um café da manhã, preparado
                            para duas pessoas.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    for (NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            npc.setAfinidade((npc.getAfinidade() + 1));
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                } else if (resposta == 2) {

                    System.out.println("""
                            
                            O sofá é desconfortável e mofado, o sol está começando a esquentar
                            as costas e o cheiro de tequila no chão impregnou as suas narinas...
                            
                            Mas particularmente? Qualquer coisa é melhor do que tem lá fora, a
                            podridão aqui dentro não se compara a podridão da cidade e a terrível 
                            realidade. 
                            
                            Esqueça todos os problemas... por mais 5 minutinhos.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    for (NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            npc.setAfinidade((npc.getAfinidade() - 1));
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                } else if (resposta == 3) {

                    System.out.println("""
                            
                            Você se ajeita no sofá e se examina o estrago.
                            
                            O ventilador de teto velho faz seu máximo para manter o ambiente
                            agradável, o relógio na parede marca 7:12AM.
                            
                            Ambos são as únicas coisas que parecem estar no seu devido lugar, o sofá velho 
                            onde você está fede a mofo, as roupas de ontem estão em locais fora do seu campo 
                            de visão e a televisão velha do outro lado da sala continua queimada. 
                            
                            A luz da cozinha está apagada mas o cheiro de louça suja impregna todo o 
                            apartamento e a porta do quarto permanece fechada.
                            
                            Seu telefone encima da mesa tem 15 ligações perdidas de Sofia Ventura
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 4) {

                    // Resposta com teste de habilidade - usar como modelo posteriormente.

                    resultado = jogadorUtilitarios.rolarTeste(jogadorUtilitarios.getIntelecto(), 8);
                    if (!resultado) {
                        System.out.println("""
                             
                             Você fecha os olhos e tenta se lembrar da noite passada, musica disco?
                             Tequila sunset? Abacaxi alguma coisa? Tudo é muito confuso.
                             
                             ----------------------------------------------------------------------------------------
                             """);
                    } else if (resultado) {
                        System.out.println("""
                            
                            As memorias lentamente se colocam no lugar e você começa a ter flashes de ontem.
                            
                            Um dia cansativo na delegacia, uma mulher de tranças claras irritada, aquele
                            velho bar perto do seu apartamento, muita tequila e karaok.
                            
                            O vomito no seu sapato e uma longa caminhada até seu sofá. 
                                
                            Sua cabeça doi ainda mais.
                                
                            ----------------------------------------------------------------------------------------
                            """);
                        jogadorUtilitarios.setIntelectoBarra(jogadorUtilitarios.getIntelectoBarra()+1);
                    }

                    escolhas.removerOpcao(resposta);

                }

            } else if (turno == 1) {

                if (resposta == 1) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                    finalDoTurno();

                } else if (resposta == 2) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                    finalDoTurno();


                } else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                    finalDoTurno();

                } else if (resposta == 4) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                    finalDoTurno();

                }

            } else if (turno == 2) {

                if (resposta == 1) {

                    System.out.println("""
                            
                            Os documentos de perícia mostram fotos do escritório onde o corpo foi encontrado.
                            A foto terrível do homem empacotado na mala embrulha o estômago, você sente toda 
                            a tequila da noite passada voltando pela garganta. 
                            
                            Na próxima página, há fotos de quatro pessoas com o nome escrito na letra da Sofia:
                            Henrico,  Guilherme, Pedro e Esmeralda.
                             
                            Na parte de trás da foto de Guilherme está escrito: ‘Foi esse que encontrou o corpo.
                           
                            ----------------------------------------------------------------------------------------
                            """);
                    escolhas.removerOpcao(resposta);
                    finalDoTurno();

                } else if (resposta == 2) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno();

                } else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno();

                } else if (resposta == 4) {

                    System.out.println("""
                            
                            O sol agradável da manhã é substituído pelo som suave de uma chuva leve. Os prédios
                            altos de Santa Tereza te sufocam. Poucas pessoas caminham pelas ruas e o clima de 
                            tensão aumenta à medida que se aproximam da delegacia.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    escolhas.removerOpcao(resposta);
                    finalDoTurno();

                }
                                       
            }

        } else if (capitulo == 2) {

            if (turno == 0) {

                if (resposta == 1) {

                    System.out.println("""
                            Você começa a organizar os objetos na mesa: carta, recibos, aliança 
                            e alguns registros bancários. 
                            As conexões ainda não estão claras, mas o caos começa a fazer sentido.

                            ----------------------------------------------------------------------------------------
                    """);

                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                } else if (resposta == 2) {

                    resultado = jogadorUtilitarios.rolarAtributo(jogadorUtilitarios.getIntelecto(), 8);

                    if (!resultado) {
                        System.out.println("""

                            Parece tudo igual ao que já viu, você está começando a sentir dor de cabeça
                        
                        ----------------------------------------------------------------------------------------
                        """);
                    } else if (resultado) {
                        System.out.println("""
                            
                            Você percebe que a carta encontrada tem traços de escrita forjados.

                            Não é preciso ser um perito para notar... as linhas são trêmulas demais em alguns pontos e 
                            rígidas demais em outros, como se quem escreveu
                            lutasse contra a própria mão, tentando imitar algo que não dominava. 
                            
                        ----------------------------------------------------------------------------------------
                        """);
                        jogadorUtilitarios.setIntelectoBarra(jogadorUtilitarios.getIntelectoBarra()+1);
                    }

                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    
                    System.out.println("""

                            Você pega as anotações, rabiscos e fotos, começa a puxar linhas no quadro: 
                            Henrico esteve na casa de manhã, 
                            Pedro ouviu uma discussão intensa à tarde, Guilherme encontrou o corpo à noite.
                            Tudo começa a ganhar uma ordem lógica. 

                            ----------------------------------------------------------------------------------------
                            """);

                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                } else if (resposta == 4) {

                    System.out.println("""

                            - Sofia... vem cá.

                            Sua voz saiu mais baixa do que esperava, quase como um sussurro cansado, 
                            mas ela sabia exatamente o que isso significava. 
                            No fundo, acho que ela sempre soube quando eu estava preso em algo que eu não conseguia ver. 
                            Cruzei os braços, olhando fixamente para aquele quadro cheio de fotos, setas, rabiscos
                            e perguntas que só cresciam e nunca se respondiam.

                            - Sofia… eu preciso que você me ajude a pensar. Me diz… o que a gente não tá enxergando? 
                            O que tá aqui, bem na nossa cara, e a gente insiste em ignorar? 
                            Porque, cá entre nós... nada nesse caso faz sentido sem esse detalhe invisível.

                            ----------------------------------------------------------------------------------------

                    
                    """);

                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } else {
                    System.out.println("> Opção Indisponivel");
                }

            } 
            
            else if (turno == 1) {

                if (resposta == 1) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } 
                    else if (resposta == 2) {

                        for(NPC npc : npcs) {
                            if (npc instanceof SofiaVentura) {
                                ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                            }
                        }    
            
                    escolhas.removerOpcao(resposta);
                    finais.setFinalRuim(finais.getFinalRuim()+1);
                    setFimTurno(true);

                } 
                    else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                }  else if (resposta == 4) {
                
                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } 
            }  
            
            else if (turno == 2) {

                if (resposta == 1) {

                    System.out.println("""
                        — Começando por Henrico... depois Pedro, Esmeralda e, por último, Guilherme.

                        marcando cada nome como se organizasse peças em um tabuleiro. 
                        Sua voz carrega aquela segurança de quem sabe exatamente o que está fazendo.

                        — “Uma estratégia lógica. A ordem importa. Cada um desses sabe de algo... 
                        e se a sequência for certa, as máscaras caem mais rápido.

                        ----------------------------------------------------------------------------------------
                """);

                    escolhas.removerOpcao(resposta);
                    finais.setFinalBom(finais.getFinalBom()+1);
                    setFimTurno(true);

                } 
                    else if (resposta == 2) {

                        for(NPC npc : npcs) {
                            if (npc instanceof SofiaVentura) {
                                ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                            }
                        }    
            
                    escolhas.removerOpcao(resposta);
                    finais.setFinalRuim(finais.getFinalRuim()+1);
                    setFimTurno(true);

                } 
                    else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).resposta(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                }  else if (resposta == 4) {
                
                    if (!resultado) {
                        System.out.println("""

                            — “Cuidado pra sua autoconfiança não virar teimosia.”
                        
                        ----------------------------------------------------------------------------------------
                        """);
                    } else if (resultado) {
                        System.out.println("""
                            
                            Pela primeira vez no dia, um sorriso verdadeiro rompe o semblante fechado.

                            — Vamos pegar ele juntos. Do nosso jeito. 
                            
                           Ela sentiu o peso do momento, a força da parceria que a gente construiu no meio do caos. 
                           Porque, no final das contas, 
                           não importa o quão escuro o caso seja — a gente vai desvendar tudo, lado a lado.
                            
                        ----------------------------------------------------------------------------------------
                        """);
                        jogadorUtilitarios.setIntelectoBarra(jogadorUtilitarios.getIntelectoBarra()+1);
                    }

                    escolhas.removerOpcao(resposta);
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
}

    // Metodo de verificação de resposta no turno.

    public int validadeResposta(int resposta) {

        boolean caiuNoCatch;
        Scanner sc = new Scanner(System.in);

        if (resposta == 0) {
            do {

                try {
                    System.out.print("\n> ");
                    resposta = sc.nextInt();
                    caiuNoCatch = false;
                } catch (InputMismatchException e) {
                    sc.next();
                    caiuNoCatch = true;
                    System.out.println(Cores.VERMELHO + "\n> CARACTERE INVALIDO <" + Cores.RESET);
                }

                if (resposta < 1 || resposta > 4) {
                    System.out.println(Cores.VERMELHO + "> OPÇÃO INDISPONIVEL: Insira um valor entre 1 e 4 <" + Cores.RESET);
                }

            } while (caiuNoCatch && resposta < 1 || resposta > 4);
        }

        return resposta;

    }

    private void finalDoTurno() {
        contadorFimTurno++;
        if (contadorFimTurno == 4) {
            setFimTurno(true);
            contadorFimTurno = 0;
        }
    }

    /* MODELO DE RESPOSTA

        if (resposta == 1) {

            escolhas.removerOpcao(resposta);
        } else if (resposta == 2) {

            escolhas.removerOpcao(resposta);
        } else if (resposta == 3) {

            escolhas.removerOpcao(resposta);
        } else if (resposta == 4) {

            escolhas.removerOpcao(resposta);
        }

     */

    public boolean isFimTurno() {
        return fimTurno;
    }

    public void setFimTurno(boolean fimTurno) {
        this.fimTurno = fimTurno;
    }


}
