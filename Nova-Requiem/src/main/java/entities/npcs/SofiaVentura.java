package main.java.entities.npcs;

import main.java.entities.NPC;

public class SofiaVentura extends NPC {

    public SofiaVentura(String nome, int afinidade) {
        super(nome, afinidade);
    }

    public void diaglogar(int capitulo, int turno) {
        if (capitulo == 1) {

            if (turno == 0) {

                System.out.print("Sofia: Oi! Você veio.\n");

            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                System.out.print("Sofia: Eu não sei o que pensar sobre.");

                System.out.print("\n> ");

            }

        }
    }

    public void resposta(int capitulo, int turno, int resposta) {

        if (capitulo == 1) {

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
