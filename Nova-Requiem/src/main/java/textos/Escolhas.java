package main.java.textos;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.SofiaVentura;
import main.java.util.Cores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Escolhas {

    private Jogador jogador;
    private String[] opcoes = new String[4];
    private List<NPC> npcs;

    public Escolhas(Jogador jogador, List<NPC> npcs) {
        this.jogador = jogador;
        this.npcs = npcs;
    }

    // Imprime o gancho de turno e as opções disponiveis

    public void alternativas(int capitulo, int turno){

        if (capitulo == 1) {

            if (turno == 0) {

                System.out.println("""
                        Você se acomoda resistindo a vontade de abrir os olhos. Tudo parece distante.
                        Tick-Tack do relógio não revela as horas se não se levantar.
                        """);

                imprimirOpcoes();

            } else if (turno == 1) {

                System.out.println("""
                        Sofia está sentada na bancada do seu pequeno apartamento, o olhar impaciente e
                        cansado revela que algo aconteceu mais cedo.
                        """);

                imprimirOpcoes();

            } else if (turno == 2) {

                System.out.println("""
                        O Impala bem cuidado de Sofia atravessa Santa Tereza com pressa, no seu colo
                        uma pasta com documentos do caso e detalhes coletados pelo Distrito 41.
                        """);

                imprimirOpcoes();

            }

        } else if (capitulo == 2) {

            if (turno == 0) {

                System.out.println("""
                        
                        """);

                imprimirOpcoes();

            } 

            else if (turno == 1) {

                System.out.println("""
                        
                        """);

                imprimirOpcoes();

            } 

            else if (turno == 2) {

                System.out.println("""
                        
                        """);

                imprimirOpcoes();

            } 

        } else if (capitulo == 3) {

            if (turno == 0) {

                System.out.println("""
                        
                        """);

                imprimirOpcoes();

            }

        }

    }

    // Metodos de definição de opções por turno

    public void limparOpcoes() {
        Arrays.fill(opcoes, "");
    }

    public void removerOpcao(int resposta) { 
        for (int i = 0; i < opcoes.length; i++) {
            if ((resposta - 1) == i) {
                opcoes[i] = " ";
            }
        }
    }

    public void imprimirOpcoes() {
        for (String opcao : opcoes) {
            if (opcao.equals(" ")) {
                System.out.println(Cores.VERDE + "----------------------" + Cores.RESET);
            } else {
                System.out.println(opcao);
            }
        }
    }

    public void definirOpcoes(int capitulo, int turno) {
        if (capitulo == 1) {
            if (turno == 0) {
                opcoes[0] = "1. Levantar do sofá.";
                opcoes[1] = "2. Permanecer na inconsciência.";
                opcoes[2] = "3. Olhar em volta.";
                opcoes[3] = (Cores.AMARELO + "4. [TESTE (INTELECTO) - DIFICULDADE: Médio (8)] A noite passada?" + Cores.RESET);
            } else if (turno == 1) {
                opcoes[0] = "1. 'O que te trás aqui tão cedo? Aconteceu algo?'";
                opcoes[1] = "2. 'Você está bonita hoje...'";
                opcoes[2] = "3. 'O que aconteceu ontem a noite?'";
                opcoes[3] = "4. Oferecer um café.";
            } else if (turno == 2) {
                opcoes[0] = "1. Examinar documentos.";
                opcoes[1] = "2. 'O que você sabe sobre os suspeitos?'";
                opcoes[2] = "3. 'Quais pistas nós temos?'";
                opcoes[3] = "4. Olhas pela janela.";
            }
        }
        if (capitulo == 2) {

            if (turno == 0) {
                opcoes[0] = "1. Examinar as provas.";
                opcoes[1] = (Cores.AMARELO + "2. [TESTE (INTELECTO) - DIFICULDADE MÉDIA (8)] Ver além do óbvio" + Cores.RESET);
                opcoes[2] = "3. Organizar os acontecimentos.";
                opcoes[3] = "4. 'Tem algo aqui que ainda não vismo...'";
            } else if (turno == 1) {
                opcoes[0] = "1. Perguntar a opinião dela sobre os suspeitos";
                opcoes[1] = "2. Fazer piada com o caso ou com a vítima ";
                opcoes[2] = "3. Falar que está cansado e que talvez esteja exagerando nas suspeitas";
                opcoes[3] = "4. Oferecer mais um café para Sofia e demonstrar preocupação com ela";
            } else if (turno == 2) {
                opcoes[0] = "1. Montar um plano de Interrogatório baseada na ordem dos acontecimentos";
                opcoes[1] = "2. Dizer que não se importa, todos vão mentir de qualquer jeito.";
                opcoes[2] = "3. Deixar Sofia decidir a ordem";
                opcoes[3] = (Cores.AMARELO + "4. [TESTE (CORAÇÃO) - DIFICULDADE (8)] - Mostrar confiança na Investigação e nela " + Cores.RESET);;
            }

        }
        if (capitulo == 3) {
            if (turno == 0) {
                opcoes[0] = "1. Opção Neutra - 3";
                opcoes[1] = "2. Opção Neutra";
                opcoes[2] = "3. Opção Boa";
                opcoes[3] = "4. Opção Ruim";
            }
        }
        if (capitulo == 4) {
            if (turno == 0) {
                opcoes[0] = "1. Opção Neutra - 4";
                opcoes[1] = "2. Opção Neutra";
                opcoes[2] = "3. Opção Boa";
                opcoes[3] = "4. Opção Ruim";
            }
        }
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

}

