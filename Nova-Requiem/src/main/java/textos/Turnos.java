package main.java.textos;

import main.java.entities.Jogador;
import main.java.util.Cores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Turnos {

    public void introducao(Jogador jogador) {

        System.out.println(Cores.ROXO + """
                ----------------------------------------------------------------------------------

                                                   NOVA REQUIEM

                ----------------------------------------------------------------------------------
           
                """ + Cores.RESET);

        System.out.println(Cores.AMARELO + "\n> CRIE SEU PERSONAGEM - MOLDE SUA HISTÓRIA <\n" + Cores.RESET);

        System.out.print(
                "Atributos:" +
                Cores.ITALIC + Cores.AMARELO + "\nFisico " + Cores.RESET + "- Sua musculatura, o quão forte você é. Emponha sua vontade através da força." +
                Cores.ITALIC + Cores.AMARELO + "\nCoração " + Cores.RESET + "- Sua empatia, o quão emocionalmente inteligente você é. Entenda as pessoas e a si mesmo." +
                Cores.ITALIC + Cores.AMARELO + "\nIntelecto " + Cores.RESET + "- Sua mente, o quão esperto você é. Racionalize o mundo e entenda seus padrões.\n" +
                Cores.VERDE + "\n> Evoluem a cada 2 testes bem sucedidos com o atributo.\n" + Cores.RESET +
                """
               
                1. O BRUTAMONTES        2. O INTELECTUAL        3. O SENSITIVO
                Fisico - 2              Fisico - 0              Fisico - 1    
                Coração - 1             Coração - 1             Coração - 2    
                Intelecto - 0           Intelecto - 2           Intelecto - 0
                
                """);

        //Definição de atributos do personagem baseado em arquetipos pré-definidos
        int arquetipo = 0;
        arquetipo = verificarArquetipo(arquetipo);

        jogador.definirArquetipo(arquetipo);

        System.out.println(Cores.ROXO + "\n----------------------------------------------------------------------------------\n" + Cores.RESET);

        System.out.println(Cores.AMARELO + "\nUN JOUR JE SERAI DE RETOUR PRÈS DE TOI" + Cores.RESET);

        System.out.println(Cores.ROXO + "\n----------------------------------------------------------------------------------\n" + Cores.RESET);

        System.out.print(
                """
                As luzes neon de Santa Tereza brilham intensamente na noite fria. 
                A cidade não para e não espera.
                
                Dois zeladores encontram um corpo dentro de uma mala em um escritório do edifício Guanabara 
                e em um bar barato, o letreiro acabado sobe a porta soletra "Velho Amigo" e lá dentro um detetive
                do Distrito 41 vira outro shot de tequila, esperando encontrar o esquecimento no fundo do 
                copo vazio. 
                """);

        //Definição do nome do personagem que irá permanecer por toda a execução do programa
        String nome = "";
        nome = verificarNome(nome);

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

    public int verificarArquetipo(int arquetipo) {

        boolean caiuNoCatch;
        Scanner sc = new Scanner(System.in);

        // Função de verificação do arquetipo do personagem.
        if (arquetipo == 0) {
            do {

                try {
                    System.out.print("> ESCOLHA SEU ARQUETIPO DE PERSONAGEM: ");
                    arquetipo = sc.nextInt();
                    caiuNoCatch = false;
                } catch (InputMismatchException e) {
                    sc.next();
                    caiuNoCatch = true;
                    System.out.println(Cores.VERMELHO + "> CARACTERE INVALIDO <" + Cores.RESET);
                }

                if (arquetipo < 1 || arquetipo > 3) {
                    System.out.println(Cores.VERMELHO + "> OPÇÃO INDISPONIVEL: Insira um valor entre 1 e 3 <" + Cores.RESET);
                }

            } while (caiuNoCatch && arquetipo < 1 || arquetipo > 3);
        }

        return arquetipo;

    }

    // Função de verificação do nome do personagem.
    public String verificarNome(String nome) {

        boolean caiuNoCatch;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("\nQual é o nome dele?\n> ");
                nome = sc.next();
                caiuNoCatch = false;
            } catch (InputMismatchException e) {
                sc.next();
                caiuNoCatch = true;
                System.out.println(Cores.VERMELHO + "\n> VALOR INVALIDO - TENTE NOVAMENTE. <" + Cores.RESET);
            }
        } while (caiuNoCatch);

        return nome;

    }

}
