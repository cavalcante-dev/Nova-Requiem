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

                            - Um empresário foi encontrado morto está manhã. O corpo estava
                            dentro de uma maleta dentro do escritório dele, quem encontrou 
                            foram os zeladores. - Outro suspiro longo se segue, ele fecha os 
                            olhos e franze o cenho. - A viúva está devastada, principalmente
                            por estar sendo suspeita do caso. 
                            
                            Ela se levanta e hesita, como se quisesse ficar um pouco mais. 

                            - Vamos, a pasta está no carro você pode ver os detalhes lá, o pessoal
                            está começando a ficar impaciente na delegacia.
                            
                            Sofia espera em frente a porta, aguardando você. 
                            
                            ----------------------------------------------------------------------------------------
                            """);

                } else if (resposta == 2) {

                       System.out.println("""
                            
                            - Não, não estou. - O olhar sério denúncia a sinceridade e um
                            silêncio constrangedor se estende por alguns segundos. - Mas valeu
                            pela tentativa.

                            ----------------------------------------------------------------------------------------
                            """);

                } else if (resposta == 3) {

                        System.out.println("""
                            
                            - Se você não se lembra não serei eu a te contar. - Ela olha para a janela e
                            observa o agradável sol da manhã. Você se pergunta o que ela está pensando,
                            sobre o que ela pensa sobre você.

                            O olhar de Sofia é distante, ao mesmo tempo que caloroso. Ela está bonita hoje.

                            ----------------------------------------------------------------------------------------
                            """);


                } else if (resposta == 4) {

                    if (getAfinidade() >= 3) {

                        System.out.println("""
                                
                                Você serve uma quantidade generosa, o olhar investigativo de Sofia acompanha
                                seus movimentos, o cheiro de café novo infesta o ambiente e você coloca a xícara
                                próximo a ela.
                                
                                Ela examina a xícara estampada com uma foto de vocês dois e se pergunta se essa
                                é a única que você tem inteira. Sofia suspira.
                                
                                - Obrigado, eu tava precisando disso. - Ela toma um gole e da um pequeno 
                                sorriso. - Você é realmente péssimo com café.
                                
                                ----------------------------------------------------------------------------------------
                                """);

                        setAfinidade(getAfinidade() + 1);

                    } else if (getAfinidade() < 3) {

                        System.out.println("""
                                
                                Não tem café, você não fez nenhum.
                                
                                Você olha em volta procurando as coisas para começar a preparar 
                                um pouco, Sofia vê você abrindo os armários.
                                
                                - Não temos tempo para passar um café agora. - Ela parece mais impaciente.
                                
                                ----------------------------------------------------------------------------------------
                                """);

                    }

                }


            }

        } else if (capitulo == 3) {

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
