package main.java.entities.npcs;

import main.java.entities.Jogador;
import main.java.entities.NPC;

public class HenricoLobos extends NPC {

    public HenricoLobos(String nome, int afinidade, Jogador jogadorUtilitarios) {
        super(nome, afinidade, jogadorUtilitarios);
    }

    public void dialogar(int capitulo, int turno) {

        if (capitulo == 3) {

            if (turno == 6) {
                System.out.println("""
                        - Não tenho nada a esconder. Seja breve.
                        
                        Sua voz é firme e seu olhar se concentra juntamente ao seu.

                        Uma testemunha difícil, o que será necessário para falar? O que será necessário para
                        descobrir o que precisa dele?
                       
                        """);
            }

        }

    }

    public void responder(int capitulo, int turno, int resposta) {

        if (capitulo == 3) {

            if (turno == 6) {

                if (resposta == 1) {

                    System.out.println("""
                            
                            Um sorriso cordial está estampado em seu rosto.
                            
                            - Claro detetive, imaginei que sim.
                            
                            Seus olhos observam o vidro espelho no fundo da sala.
                            
                            - Imagino que não queira perder tempo com cordialidades.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    setAfinidade(getAfinidade() + 1);

                } else if (resposta == 2) {

                    System.out.println("""
                            
                            - Nunca os vi. - Sua postura é inalteravel. - Não costumo reparar em zeladores.
                            
                            Essa ainda não é a pergunta correta, você precisa levá-lo ao limite.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    setAfinidade(getAfinidade() + 1);

                } else if (resposta == 3) {

                    System.out.println("""
                            
                            - Tolice! Não sinto nenhum tipo de inveja daquele imbecil. - Ele se recompõe após
                            a agitação temporária. - Tudo o que teve na vida foi sorte, nada além disso. Não sinto
                            inveja de sortudos.
                            
                            Ele ajeita as mangas e retorna a sua postura impecável.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    setAfinidade(getAfinidade() - 1);

                } else if (resposta == 4) {

                    System.out.println("""
                            
                            - Esmeralda não entende! Eu a trataria muito melhor do que aquele estupido do meu irmão
                            e principalmente melhor do que aquele zelador pé rapad-
                            
                            Ele para, de repenTe choque em seu olhar.
                            
                            - Digo, minha opinião sobre Esmeralda é irrelevante, pensei que estavamos investigando
                            um assassinato, não fofocas da familia.
                            
                            ----------------------------------------------------------------------------------------
                            """);
                    setAfinidade(getAfinidade() - 1);

                }

            } else if (turno == 7) {

                if (resposta == 1) {

                    System.out.println("""
                            
                            - Pode se retirar Henrico. - Homem se levanta e repousa uma das mãos pela mesa.
                            
                            - Se fosse vocês ficaria de olho em Esmeralda, aquela mulher é perversa de maneiras
                            que vocês não compreendem, espero que aquelas lagrimas de crocodilo não enganem vocês. 
                            
                            Os passos firmes em direção a saída rapidamente abafados pelo bater da porta. 
                            
                            ----------------------------------------------------------------------------------------
                            """);

                } else if (resposta == 2) {

                    if (getAfinidade() < 1) {
                        System.out.println("""
                                
                                - Estava sim com meu irmão pela manhã. Discutimos a herança de nosso pai que aquele 
                                tolo insistia em receber por completo.
                                
                                Seu sorriso cordial se esvai.
                                
                                - Insite para dividirmos mas ele se recusou a escutar. 
                                
                                ----------------------------------------------------------------------------------------
                                """);
                    } else if (getAfinidade() >= 2) {

                        System.out.println("""
                                
                                - Estava sim com meu irmão pela manhã, falamos assuntos legais, discutíveis somente
                                na presença do meu advogado.
                                
                                O sorriso cordial assombra o rosto aquiliano angular.
                                
                                ----------------------------------------------------------------------------------------
                                """);

                    }

                } else if (resposta == 3) {

                    if (getAfinidade() < 1) {
                        System.out.println("""
                                
                                - Irrelevante. - Ele diz dando de ombros. - Fofocas de família não 
                                são tópico em debate detetive.
                                
                                ----------------------------------------------------------------------------------------
                                """);
                    } else if (getAfinidade() >= 2) {

                        System.out.println("""
                                
                                - Mesmo se quisesse, aquela mulher não saberia apreciar um homem de valor nem se o 
                                mesmo caisse no colo dela. -  O olhar firme de Henrico acompanha sua voz rigida. - Além 
                                do mais, ela é completamente obcecada por qualquer homem que não fosse Francisco, eu, o 
                                zeladorzinho, não importa.
                                 
                                Ele assume um tom irônico, debochando da situação.
                                
                                ----------------------------------------------------------------------------------------
                                """);

                    }

                }

            }
        }
    }
}