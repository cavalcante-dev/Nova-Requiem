package main.java.entities.npcs;

import main.java.entities.NPC;
import main.java.util.Cores;

public class SofiaVentura extends NPC {

    public SofiaVentura(String nome, int afinidade) {
        super(nome, afinidade);
    }

    public void diaglogar(int capitulo, int turno) {
        if (capitulo == 1) {

            if (turno == 0) {

                System.out.println(Cores.ROXO + "Sofia: Oi! Você veio.\n" + Cores.RESET);

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
