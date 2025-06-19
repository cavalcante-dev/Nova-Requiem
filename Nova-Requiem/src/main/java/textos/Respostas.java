package main.java.textos;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.GuilhermeZelador;
import main.java.entities.npcs.PedroZelador;
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
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                    finalDoTurno();

                } else if (resposta == 2) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                    finalDoTurno();


                } else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno();

                } else if (resposta == 4) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
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
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno();

                } else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
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
                            
                            Você observa atentamente os objetos na mesa e busca uma conexão entre eles. 
                            
                            A carta conta sobre o adulterio de Esmeralda, o texto parece ter sido escrito e enviado de 
                            forma anônima, os detalhes são precisos com datas e horários que batem com a rotina de 
                            Esmeralda. A carta revela que o amante era o zelador Guilherme. Talvez os dois tenham
                            agido juntos?
                                                        
                            A aliança fina de casamento, confirmada ser de Esmeralda. Por quê ela a deixou lá? 
                            talvez tenha discutido.
                            
                            Os registros legais da herança da família Lobos e os últimos papeís a serem assinados
                            por Francisco para formalizar o recebimento dos bens. Os documentos revelam que houveram
                            diferentes contestações de Henrico em relação a repartição da herança.    
                            
                            As conexões ainda não estão claras, mas algo parece começar a se encaixar. 
                            
                            ----------------------------------------------------------------------------------------
                            """);

                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);

                } else if (resposta == 2) {

                    resultado = jogadorUtilitarios.rolarTeste(jogadorUtilitarios.getIntelecto(), 8);

                    if (!resultado) {

                        System.out.println("""

                            As pistas não parecem se encaixar e está tudo igual ao que estava antes, a ressaca está
                            começando a bater de novo e a dor de cabeça é eminente.
                        
                            ----------------------------------------------------------------------------------------
                            """);

                    } else if (resultado) {

                        System.out.println("""
                        
                            Você compara os documentos legais com a carta contando sobre o adulterio e nota que existe
                            uma incrivel semelhança entre as letras de Henrico e as da carta. 
                            
                            Os traços de escrita forjada agora se tornam mais claros. As linhas são trêmulas demais em 
                            alguns pontos e rígidas demais em outros, como se quem escreveu lutasse contra a própria mão, 
                            tentando escrever de uma maneira grotescamente diferente.  
                            
                            ----------------------------------------------------------------------------------------
                            """);
                        jogadorUtilitarios.setIntelectoBarra(jogadorUtilitarios.getIntelectoBarra()+1);

                    }

                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {


                    System.out.println("""

                            Você pega as anotações de Sofia, os rabiscos, as fotos e pistas e começar a puxar linhas 
                            no quadro da investigação, fazendo conexões que antes não apareciam e traçando o caminho 
                            dos suspeitos. 
                            
                            Henrico esteve com Francisco pela manhã, Esmeralda estava no Yoga no mesmo horário.
                            
                            Pedro diz ter ouvido uma dicussão intensa na parte da tarde e alguma horas depois encontrou
                            o corpo no escritório junto com Guilherme. 
                            
                            Os caminhos agora parecem se conectar de uma estranha maneira, interrogar os supeitos
                            irá revelar mais informações.
                            
                            ----------------------------------------------------------------------------------------
                            """);

                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);

                } else if (resposta == 4) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);

                }

            }

            else if (turno == 1) {

                if (resposta == 1) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                }
                    else if (resposta == 2) {

                        for(NPC npc : npcs) {
                            if (npc instanceof SofiaVentura) {
                                ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                            }
                        }

                    escolhas.removerOpcao(resposta);

                }
                    else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);

                }  else if (resposta == 4) {

                    for(NPC npc : npcs) {
                        if (npc instanceof SofiaVentura) {
                            ((SofiaVentura) npc).responder(capitulo, turno, resposta);
                        }
                    }

                    escolhas.removerOpcao(resposta);

                }
            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                if (resposta == 1) {

                    for(NPC npc : npcs) {
                        if (npc instanceof GuilhermeZelador) {
                            ((GuilhermeZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);

                } else if (resposta == 2) {

                    for(NPC npc : npcs) {
                        if (npc instanceof GuilhermeZelador) {
                            ((GuilhermeZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);

                } else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof GuilhermeZelador) {
                            ((GuilhermeZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);

                } else if (resposta == 4) {

                    for(NPC npc : npcs) {
                        if (npc instanceof GuilhermeZelador) {
                            ((GuilhermeZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);

                }

            } else if (turno == 1) {

                if (resposta == 1) {

                    for(NPC npc : npcs) {
                        if (npc instanceof GuilhermeZelador) {
                            ((GuilhermeZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);

                } else if (resposta == 2) {

                    for(NPC npc : npcs) {
                        if (npc instanceof GuilhermeZelador) {
                            ((GuilhermeZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 3) {

                    for(NPC npc : npcs) {
                        if (npc instanceof GuilhermeZelador) {
                            ((GuilhermeZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);

                } else if (resposta == 4) {

                    resultado = jogadorUtilitarios.rolarTeste(jogadorUtilitarios.getCoracao(), 4);
                    if (!resultado) {
                        System.out.println("""
                             
                             - Olha… Tudo bem eu admito… a gente tinha… algo! Mas eu juro que não fiz isso, nem ela! 
                             O Francisco era um marido distante e ela ficava muito tempo sozinha, mas isso não é 
                             motivo para matar ele cara!
                             
                             O jovem se sente tirando um peso enorme das costas, até sua respiração fica mais leve. 
                             
                             - Você tem que acreditar em mim, a gente não fez isso.
                                
                             ----------------------------------------------------------------------------------------
                             """);
                    } else if (resultado) {
                        System.out.println("""
                            
                            - Qual sua obsessão com ela? Já falei que a gente não tinha nada. Além do mais, o que 
                            isso tem haver com o cara que morreu?
                            
                            Ele parece ainda mais irritado e faz menção de se levantar.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                        jogadorUtilitarios.setIntelectoBarra(jogadorUtilitarios.getIntelectoBarra()+1);
                    }

                    escolhas.removerOpcao(resposta);

                }
            }

            else if (turno == 2) {

                if (resposta == 1) {

                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);
                } 
                 else if (resposta == 2) {
                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);
                }
                 else if (resposta == 3) {
                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);
                }
                 else if (resposta == 4) {
                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    finalDoTurno(2);
                }

            } else if (turno == 3) {
                if (resposta == 1) {
                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                    setFimTurno(true);
                } 

                else if (resposta == 2) {
                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                }

                else if (resposta == 3) {
                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                }

                else if (resposta == 4) {
                    for(NPC npc : npcs) {
                        if (npc instanceof PedroZelador) {
                            ((PedroZelador) npc).responder(capitulo, turno, resposta);
                        }
                    }
                    escolhas.removerOpcao(resposta);
                }
            }

        }
    }

    // Metodo de verificação de responder no turno.

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


    private void finalDoTurno(int contador) {
        contadorFimTurno++;
        if (contadorFimTurno == contador) {
            setFimTurno(true);
            contadorFimTurno = 0;
        }
    }

    private void finalDoTurno() {
        contadorFimTurno++;
        if (contadorFimTurno == 4) {
            setFimTurno(true);
            contadorFimTurno = 0;
        }
    }

    /* MODELO DE RESPOSTA

        if (responder == 1) {

            escolhas.removerOpcao(responder);
        } else if (responder == 2) {

            escolhas.removerOpcao(responder);
        } else if (responder == 3) {

            escolhas.removerOpcao(responder);
        } else if (responder == 4) {

            escolhas.removerOpcao(responder);
        }

     */

    public boolean isFimTurno() {
        return fimTurno;
    }

    public void setFimTurno(boolean fimTurno) {
        this.fimTurno = fimTurno;
    }


}
