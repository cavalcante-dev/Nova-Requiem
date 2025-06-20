
package main.java.textos;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.EsmeraldaLobos;
import main.java.entities.npcs.HenricoLobos;
import main.java.entities.npcs.PedroZelador;
import main.java.entities.npcs.SofiaVentura;
import main.java.util.Cores;

public class Turnos {

    private final Jogador jogador;
    private final List<NPC> npcs;

    public Turnos(Jogador jogador, List<NPC> npcs) {
        this.jogador = jogador;
        this.npcs = npcs;
    }

    public void introducao() {

        System.out.println(Cores.ROXO + """

                        ----------------------------------------------------------------------------------
                        ============================ NOVA-REQUIEM ========================================
                        ----------------------------------------------------------------------------------   
                        """ + Cores.RESET);

        System.out.println(Cores.AMARELO + "> CRIE SEU PERSONAGEM - MOLDE SUA HISTÓRIA <\n" + Cores.RESET);

        System.out.print(
                "Atributos:" +
                Cores.ITALIC + Cores.AMARELO + "\nCoração " + Cores.RESET + "- Sua empatia, o quão emocionalmente inteligente você é. Entenda as pessoas e a si mesmo." +
                Cores.ITALIC + Cores.AMARELO + "\nIntelecto " + Cores.RESET + "- Sua mente, o quão esperto você é. Racionalize o mundo e entenda seus padrões.\n" +
                Cores.VERDE + "\n> Evoluem a cada 2 testes bem sucedidos com o atributo.\n" + Cores.RESET +
                """
               
                1. O INTELECTUAL        2. O SENSITIVO
                Coração - 1             Coração - 2
                Intelecto - 2           Intelecto - 1
                """);

        //Definição de atributos do personagem baseado em arquetipos pré-definidos
        int arquetipo = 0;
        arquetipo = verificarArquetipo(arquetipo);

        jogador.definirArquetipo(arquetipo);

        System.out.println(Cores.AMARELO + """
                
                ----------------------------------------------------------------------------------
                ===================== UN JOUR JE SERAI DE RETOUR PRÈS DE TOI =====================
                ----------------------------------------------------------------------------------
                """ + Cores.RESET);

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

                System.out.println("""
                        O nada, o gracioso vazio do esquecimento.
                        
                        Sem responsabilidades, sem mais casos estúpidos de maridos traídos,
                        mães desconfiadas que o filho está fumando e assaltos leves.
                        
                        Apenas o nada...
                        
                        Interrompido apenas pelos primeiros raios de sol da manhã e
                        a consciência vem acompanhada de uma terrível dor de cabeça.
                        
                        Ao fundo, o som do velho ventilador de teto incomoda menos do que
                        o desconforto do sofá mofado.
                        """);

            } else if (turno == 1) {

                System.out.println(
                        "Sua manhã é bruscamente interrompida por batidas na impacientes na porta\n" +
                        "\n- " + jogador.getNome() + ", você tá em casa?\n" +
                        """
                        
                        Uma voz feminina abafada e claramente irritada fala do outro lado da porta,
                        Sofia Ventura, sua parceira.
                        """);

                for (NPC npc : npcs) {
                    if (npc instanceof SofiaVentura) {
                        ((SofiaVentura) npc).dialogar(capitulo, turno);
                    }
                }

            } else if (turno == 2) {

                System.out.println("""
                        Sofia sai do apartamento e você a acompanha logo atrás e por algum motivo se sente
                        como nos velhos tempos. O caminho até o carro é silencioso, tenso, e quando chegam 
                        você se depara com o velho Impala 67 que ela dirige por Santa Tereza.
                        
                        Sem perder muito tempo, ela entra e dá partida, observando você ocupar o
                        banco do passageiro.
                        """);

                for (NPC npc : npcs) {
                    if (npc instanceof SofiaVentura) {
                        ((SofiaVentura) npc).dialogar(capitulo, turno);
                    }
                }

            }

        } else if (capitulo == 2) {

            if (turno == 0) {

                System.out.println("""
                       A sala de está uma bagunça, o que não é usual, os papeis jogados e o quadro bagunçado
                       revela que muitas coisas foram montadas as pressas essa manhã.
                       
                       Sofia joga uma pasta de papéis sobre a mesa e cruza os braços.
                       
                       — Se a gente não encaixar isso logo, alguém vai sair livre. — o olhar cansado revela que ela 
                       está tentando encaixar essas peças a mais tempo do que gostaria, mas, ao mesmo tempo, ele 
                       revela uma certa admiração, uma esperança de que você vai conseguir resolver esse caso.
                       
                       O cheiro de café velho e papel molhado toma conta da sala.
                       """);
                        
            } else if (turno == 1) {

                System.out.println("""
                        O som da porta abrindo te tira dos seus pensamentos, Fernando, o um dos rapazes novos 
                        está na abaixo da soleira, seu olhar é determinado. 
                        
                        - Senhorita Ventura, os suspeitos chegaram para o interrogatório.
                        
                        Sofia te lança um olhar de desafio e se vira para Fernando. 
                        
                        - Obrigado, iremos interrogo-los daqui a pouco. - o olhar dela se volta a você enquanto 
                        Fernando sai. - Você sabe o que fazer. O palco é todo seu.
                        """);

            }

        } else if (capitulo == 3) {

            if (turno == 0) {

                System.out.println("""
                        O jovem zelador entra na sala, ele não parece ter mais de 25 e anda curvado com
                        as mãos no bolso.
                        
                        Ele se senta na cadeira de costas para a porta.
                        
                        O rosto angular de cabelos curtos escuros revelam um rosto simples,
                        que você veria na multidão e não notaria.
                        """);

            } else if (turno == 2) {

                System.out.println("""
                       Pedro é um homem mais velho, mais velho que Guilherme, ele entra segurando seu chapeuzinho
                       e tem um porte humilde. Deve ter não mais que 1,70 de altura e dificilmente conseguiria
                       colocar um homem adulto em uma mala sem ajuda. 
                       """);

                for (NPC npc : npcs) {
                    if (npc instanceof PedroZelador) {
                        ((PedroZelador) npc).dialogar(capitulo, turno);
                    }
                }

            } else if (turno == 4) {

                System.out.println("""
                       O som de salto alto caro ecoa pela sala pequena, a mulher de cabelos ruivos e vestido preto 
                       se senta desconfortavelmente na pequena cadeira a sua frente. Os olhos inchados de chorar se 
                       escondem atrás de um óculos escuro chamativo. A voz dela é trêmula e o rosto esbelto está 
                       estampado por uma aflição sincera. 
                       """);

                for (NPC npc : npcs) {
                    if (npc instanceof EsmeraldaLobos) {
                        ((EsmeraldaLobos) npc).dialogar(capitulo, turno);
                    }
                }

            } else if (turno == 6) {

                System.out.println("""
                        O homem alto, utilizando um terno fino e caro entra e se senta na cadeira em frente a sua.
                        Seu rosto demonstra calma, seu porte uma certa altivez e desdém.
                        
                        Ele acredita estar acima dessa investigação.
                        """);

                for (NPC npc : npcs) {
                    if (npc instanceof HenricoLobos) {
                        ((HenricoLobos) npc).dialogar(capitulo, turno);
                    }
                }

            }

        } else if (capitulo == 4) {

            if (turno == 0) {

                System.out.println("""
                        As palavras ficam rodando na sua cabeça enquanto observa Sofia, o olhar dela denuncia
                        a urgência. Ela olha pra você.
                       
                        - E agora? Precisamos definir um suspeito para invetigarmos. Esse é um caso que não
                        podemos perder tempo investigando 4 pessoas diferentes. Qualquer atraso ou demora
                        pode significar a fuga do suspeito. - ela diz, cruzando os braços, o pé batendo no 
                        chão ansiosamente.
                        
                        É hora de tentar ligar os fatos. Agora tudo depende de você.
                        """);

            }

        }
    }

    // Função de verificação do arquetipo do personagem.
    public int verificarArquetipo(int arquetipo) {

        boolean caiuNoCatch;
        Scanner sc = new Scanner(System.in);

        if (arquetipo == 0) {
            do {

                try {
                    System.out.print("\n> ESCOLHA SEU ARQUETIPO DE PERSONAGEM: ");
                    arquetipo = sc.nextInt();
                    caiuNoCatch = false;
                } catch (InputMismatchException e) {
                    sc.next();
                    caiuNoCatch = true;
                    System.out.println(Cores.VERMELHO + "\n> CARACTERE INVALIDO <" + Cores.RESET);
                }

                if (arquetipo < 1 || arquetipo > 2) {
                    System.out.println(Cores.VERMELHO + "\n> OPÇÃO INDISPONIVEL: Insira um valor entre 1 e 2 <" + Cores.RESET);
                }

            } while (caiuNoCatch && arquetipo < 1 || arquetipo > 2);
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
