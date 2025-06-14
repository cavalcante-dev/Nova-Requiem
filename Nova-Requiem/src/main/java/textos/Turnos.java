package main.java.textos;

import main.java.entities.Jogador;
import main.java.util.Cores;

import java.util.Scanner;

public class Turnos {

    public void introducao(Jogador jogador) {

        Scanner sc = new Scanner(System.in);

        System.out.println(Cores.ROXO + """
                ----------------------------------------------------------------------------------

                                            NOVA REQUIEM

                ----------------------------------------------------------------------------------
                """ + Cores.RESET);

        System.out.print("""
                                            [INTRODUÇÃO]
                
                ----------------------------------------------------------------------------------   
              
                Atributos:
                Fisico - Sua musculatura, o quão forte você é. Emponha sua vontade através da força.
                Coração - Sua empatia, o quão emocionalmente inteligente você é. Entenda as pessoas e a si mesmo.
                Intelecto - Sua mente, o quão esperto você é. Racionalize o mundo e entenda seus padrões.
               
                > Evoluem a cada 2 testes bem sucedidos com o atributo. 
                
                1. O BRUTAMONTES        2. O INTELECTUAL        3. O SENSITIVO 
                Fisico - 2              Fisico - 0              Fisico - 1    
                Coração - 1             Coração - 1             Coração - 2    
                Intelecto - 0           Intelecto - 2           Intelecto - 0
               
                > ESCOLHA SEU ARQUEITIPO DE PERSONAGEM:\s""");

        //Definição de atributos do personagem baseado em arquetipos pré-definidos

        int arquetipo = sc.nextInt();
        jogador.definirArquetipo(arquetipo);

        //Definição do nome do personagem que irá permanecer por toda a execução do programa

        System.out.print("\n> Qual o seu nome? \n> ");

        String nome = sc.next();
        jogador.setNome(nome);

    }


    public void narrar(int capitulo, int turno) {

        if (capitulo == 1) {

            if (turno == 0) {
                System.out.println("\nNarração de Turno 1");
            }

        } else if (capitulo == 2) {

            if (turno == 0) {
                System.out.println("\nNarração de Turno 2");
            }

        } else if (capitulo == 3) {

            if (turno == 0) {
                System.out.println("\nNarração de Turno 3");
            }

        }
    }

}
