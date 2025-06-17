package main.java.entities.npcs;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.util.Cores;

public class SofiaVentura extends NPC {

    public SofiaVentura(String nome, int afinidade, Jogador jogador) {
        super(nome, afinidade, jogador);
    }

    public void diaglogar(int capitulo, int turno) {
        if (capitulo == 1) {

            if (turno == 1) {

                if (getAfinidade() < 3) {

                    System.out.println("""
                            
                            - Você tá ai dentro? Ou morreu no caminho pra casa ontem? - As batidas ficam
                            mais impacientes e a sua dor de cabeça consequentemente mais forte. Você escuta
                            no fundo da sua inconsciência o som da maçaneta virando.
                            
                            - Eu não acredito que você deixou a maldita porta aberta... Ah meu Deus que bagunça\s""" + getJogadorUtilitarios().getNome() + ", " +
                            """
                            \ne eu achando que a minha manhã não podia ficar pior. Anda levanta desse sofá.
                            
                            Após finalmente abrir os olhos, você vê Sofia em pé e te olhando de braços cruzados. A pele escura
                            se destaca com as tranças loiras presas em um coque e a roupa social bem arrumada em baixo de um
                            sobretudo preto aberto que revela o distintivo do Distrito 41. Ela parece cansada.
                            
                            Não existe outra opção a não ser se levantar e se deixar minimamente apresentável. Ela se senta
                            na bancada da cozinha esperando a sua boa vontade, o olhar dela busca por uma xícara de café.
                            
                            - Rápido, não temos a manhã toda.
                            
                            """
                            );

                } else if (getAfinidade() >= 3) {

                    System.out.println("""
                            Você prontamente vai até a porta e abre antes que ela possa bater mais uma vez.
                            
                            - Você tá ai dent- Ah, bom dia\s""" + getJogadorUtilitarios().getNome() + ". - A surpresa na voz dela é clara." +
                            """
                            
                            \nSofia está em frente a porta te o olhar surpreso te dá certa satisfação. A pele escura
                            se destaca com as tranças loiras presas em um coque e a roupa social bem arrumada em baixo
                            de um sobretudo preto aberto que revela o distintivo do Distrito 41. Ela parece cansada.
                            
                            Ela entra e examina o seu apartamento ajeitado na medida do possível e se senta na bancada
                            da cozinha, o cheiro do café atrai o olhar dela.
                            
                            - Que bicho te mordeu? Levantou antes das duas da tarde e ainda vez café? Aceito um pouco antes de irmos.
                            """);

                }

            } else if (turno == 2) {
                System.out.println("""
                        - Os documentos estão no banco. Recomendo dar uma olhada antes de chegarmos.
                        """);
            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                System.out.println(Cores.ROXO + "Sofia: Eu não sei o que pensar sobre.\n" + Cores.RESET);

                System.out.print("\n> ");

            }

        }
    }

    public void resposta(int capitulo, int turno, int resposta) {

        if (capitulo == 1) {

            if (turno == 1) {

                if (resposta == 1) {

                    System.out.println("""
                            
                            Sofia dá um suspiro longo.

                            - Um empresário foi encontrado morto está manhã. O corpo estava dentro de uma maleta
                            dentro do escritório dele, quem encontrou foram os zeladores. - Outro suspiro longo
                            se segue, ele fecha os olhos e franze o cenho. - A viúva está devastada, principalmente
                            por estar sendo suspeita do caso. 
                           
                            Ela se levanta e hesita, como se quisesse ficar um pouco mais. 

                            - Vamos, a pasta está no carro você pode ver os detalhes lá, o pessoal está começando a 
                            ficar impaciente na delegacia.
                            
                            Sofia espera em frente a porta, aguardando você. 
                            
                            ----------------------------------------------------------------------------------------
                            """);

                } else if (resposta == 2) {

                       System.out.println("""
                            
                            - Não, não estou. - O olhar sério denúncia a sinceridade e um silêncio constrangedor se 
                            estende por alguns segundos. - Mas valeu pela tentativa.

                            ----------------------------------------------------------------------------------------
                            """);

                } else if (resposta == 3) {

                        System.out.println("""
                            
                            - Se você não se lembra não serei eu a te contar. - Ela olha para a janela e observa o 
                            agradável sol da manhã. Você se pergunta o que ela está pensando, sobre o que ela pensa 
                            sobre você.

                            O olhar de Sofia é distante, ao mesmo tempo que caloroso. Ela está bonita hoje.

                            ----------------------------------------------------------------------------------------
                            """);


                } else if (resposta == 4) {

                    if (getAfinidade() >= 3) {

                        System.out.println("""
                                
                                Você serve uma quantidade generosa, o olhar investigativo de Sofia acompanha seus 
                                movimentos, o cheiro de café novo infesta o ambiente e você coloca a xícara próximo 
                                a ela.
                                
                                Ela examina a xícara estampada com uma foto de vocês dois e se pergunta se essa é a 
                                única que você tem inteira. Sofia suspira.
                                
                                - Obrigado, eu tava precisando disso. - Ela toma um gole e da um pequeno 
                                sorriso. - Você é realmente péssimo com café.
                                
                                ----------------------------------------------------------------------------------------
                                """);

                        setAfinidade(getAfinidade() + 1);

                    } else if (getAfinidade() < 3) {

                        System.out.println("""
                                
                                Não tem café, você não fez nenhum.
                                
                                Você olha em volta procurando as coisas para começar a preparar um pouco, Sofia vê 
                                você abrindo os armários.
                                
                                - Não temos tempo para passar um café agora. - Ela parece mais impaciente.
                                
                                ----------------------------------------------------------------------------------------
                                """);

                    }

                }


            } else if (turno == 2) {

               if (resposta == 2) {

                    System.out.println("""
                                    
                                    Não muito para ser sincera, ainda não tive oportunidade de conversar com eles.
                                    Pedro e Guilherme são zeladores do prédio onde Francisco foi encontrado. Henrico
                                    é o irmão mais novo e foi visto no dia do crime com a vítima na parte da manhã
                                    e Esmeralda é a viúva.
                                    
                                    ----------------------------------------------------------------------------------------
                                    """);

                } else if (resposta == 3) {

                    System.out.println("""
                                   
                                    Não encontramos muita coisa na cena do crime, mas o pessoal da perícia recuperou
                                    alguns documentos que falavam sobre a herança que Francisco iria receber, uma carta
                                    suspeita para Francisco que não sabemos o remetente e a aliança que Esmeralda confirmou
                                    ser dela na mesa do escritório.
                                    
                                    ----------------------------------------------------------------------------------------
                                    """);

                }
            }

        }   else if (capitulo == 2) {

            if (turno == 0) {

                if (resposta == 4) {

                    System.out.println("""

                            Sua voz saiu mais baixa do que esperava, quase como um sussurro cansado, mas ela sabia 
                            exatamente o que isso significava. 
                            
                            No fundo, acho que ela sempre soube quando eu estava preso em algo que eu não conseguia ver. 
                            Cruzei os braços, olhando fixamente para aquele quadro cheio de fotos, setas, rabiscos
                            e perguntas que só cresciam e nunca se respondiam.

                            - Sofia… o que não estamos enxergando? O que está aqui, bem na nossa cara, e a gente insiste 
                            em ignorar? - O seu olhar intenso examina todos os cantos do quadro buscando uma resposta.
                            
                            Sofia te encara com certa admiração, ela ainda se lembra o porquê de você ser considerado
                            um dos melhores.
                            
                            - Claramente ainda falta alguma coisa. - Ela diz se apoiando na mesa. - Talvez o depoimento
                            dos suspeitos nos ajude a entender melhor o caso, afinal, eles são a última peça. 
                            
                            ----------------------------------------------------------------------------------------
                            """);

                }

            }

            if (turno == 1) {

                if (resposta == 1) {

                    System.out.println("""
                                
                                — Henrico… tá tentando demais parecer inocente. Cada palavra dele vem ensaiada e limpa
                                demais... ninguém é assim naturalmente, não em uma situação dessas, Esmeralda esconde 
                                algo, isso é certo, dá pra ver no olhar dela. — Ela se levanta e vai até o quadro de 
                                provas, aponta para a aliança. — A boca dela fala uma coisa, mas os olhos... os olhos 
                                gritam outra. Ou ela tá protegendo alguém, ou está se protegendo.
                                
                                "Pedro e Guilherme?"
                                
                                — Por um lado, Pedro parece ser uma carta solta nessa mão, mas Guilherme parece ter um 
                                envolvimento mais... pessoal. - Ela aponta para a carta. - De toda forma, não são de se
                                ignorar totalmente.   
                                
                                ----------------------------------------------------------------------------------------
                                """);

                            setAfinidade(getAfinidade() + 1);


                } else if (resposta == 2) {

                    System.out.println("""
                                
                                Ela franze o rosto, cruzando os braços com aquele olhar de quem não tem mais 
                                paciência pra amadorismo. — Sério? Agora?
                                
                                Sofia se mantém encostada na parede, braços cruzados, olhar fixo no nada, como quem 
                                calcula mil possibilidades ao mesmo tempo. O silêncio pesa na sala, denso, sufocante. 
                                Ela respira fundo e solta um suspiro.
                                
                                ----------------------------------------------------------------------------------------
                                """);

                        setAfinidade(getAfinidade() - 1);

                } else if (resposta == 3) {

                    System.out.println("""
                                
                                — Se você não consegue lidar com pressão, então troca de função. Você conhece o trabalho 
                                e não é pra quem desaba na primeira rachadura. — O semblante dela permanece firma — Se 
                                preferir eu posso te jogar de volta no primeiro beco que encontrar. Ou você se mantém 
                                firme e encara de cabeça erguida, ou vira mais um peso morto na investigação.
                                
                                O voz dela é imponente, você se lembra do porquê ela é a chefe por aqui. 
                                
                                ----------------------------------------------------------------------------------------
                                """);

                    setAfinidade(getAfinidade()+1);

                } else if (resposta == 4) {

                    System.out.println("""
                                Ela escuta, mantém aquele semblante sério, profissional, 
                                mas é impossível não notar...por um segundo, os olhos de Sofia suavizam. 
                                É rápido, quase imperceptível. 
                                Talvez quem não a conheça nem perceba. Mas eu percebo. Sempre percebi.

                                — Obrigada... mas não vamos nos distrair do caso.

                                Sofia gosta. Não diz, não admite, mas gosta. 
                                E por um instante... fica feliz pelo cuidado. 
                                Só que ela é do tipo que aprendeu a não se permitir parar nem por isso. 
                                Afinal, ainda tem um caso pra resolver...
                                ----------------------------------------------------------------------------------------
                                """);

                    setAfinidade(getAfinidade()+1);

                } else {
                    System.out.println("> Opção Indisponivel");
                }
            }

            else if (turno == 2) {

                if (resposta == 1) {

                            setAfinidade(getAfinidade() + 1);


                } else if (resposta == 2) {

                    System.out.println("""
                                Ela aperta os olhos, respira fundo, como quem segura a vontade de não explodir. 
                                E então diz, sem filtrar uma única palavra, a voz carregada de irritação: 

                                - Se você continuar duvidando, a gente já perdeu. 
                                Deixa de ser frouxo e tome uma decisão coerente.

                                No segundo seguinte, vira de costas, jogando as
                                mãos no bolso da jaqueta, frustrada.
                                E, se depender dela, não vai ficar ali pra assistir ninguém se afoga
                                na própria indecisão.
                                

                        ----------------------------------------------------------------------------------------

            """);

                        setAfinidade(getAfinidade() - 1);

                } else if (resposta == 3) {

                    System.out.println("""
                               Por um instante, ela hesita. Um olhar desviado,
                               os lábios que pressionam um no outro como quem calcula 
                               riscos. Não é medo. É peso. Peso de quem sabe que, uma vez que assume,
                               não tem mais volta.

                               Sofia respira fundo, endireita os ombros, e então diz decidida:
                               - “Eu... posso cuidar disso.”

                       ----------------------------------------------------------------------------------------
                    """);
                    setAfinidade(getAfinidade()+1);

                } else if (resposta == 4) {
                    

                } else {
                    System.out.println("> Opção Indisponivel");
                }
            }
        }
        
        
        
        
        
        
        else if (capitulo == 3) {

            if (turno == 0) {

                if (resposta == 1) {

                    System.out.println("Escolha Neutra da Sofia");

                } else if (resposta == 2) {

                    System.out.println("Escolha Neutra da Sofia");

                } else if (resposta == 3) {

                    System.out.println("Escolha boa - Sofia gostou disso!");
                    setAfinidade(getAfinidade()+1);

                } else if (resposta == 4) {

                    System.out.println("Escolha ruim - Sofia não gostou disso.");
                    setAfinidade(getAfinidade()-1);

                } else {
                    System.out.println("> Opção Indisponivel");
                }


            }

        }


    }

}
