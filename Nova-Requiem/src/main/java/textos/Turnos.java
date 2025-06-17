package main.java.textos;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.SofiaVentura;
import main.java.util.Cores;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Turnos {

    private Jogador jogador;
    private List<NPC> npcs;

    public Turnos(Jogador jogador, List<NPC> npcs) {
        this.jogador = jogador;
        this.npcs = npcs;
    }

    public void introducao() {

        System.out.println(Cores.ROXO + """
                ----------------------------------------------------------------------------------

                                                NOVA REQUIEM

                ----------------------------------------------------------------------------------
           
                """ + Cores.RESET);

        System.out.println(Cores.AMARELO + "> CRIE SEU PERSONAGEM - MOLDE SUA HISTÓRIA <\n" + Cores.RESET);

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
                        ((SofiaVentura) npc).diaglogar(capitulo, turno);
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
                        ((SofiaVentura) npc).diaglogar(capitulo, turno);
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

            }  else if (turno == 2) {
                System.out.println("""
                        Sofia está de pé, olhando fixamente para as fotos dos suspeitos presas no quadro.
                        
                        Ela respira fundo.
    
                        — “Você decide por onde começamos amanhã, mas faça isso com certeza. Por que errar... Ele vai sair impune.”
    
                        Você sente o peso dessa responsabilidade.
                        Ainda há tempo para mais uma decisão antes de dormir.
    
                        """);
            } 

        } else if (capitulo == 3) {

            if (turno == 0) {
                System.out.println("\nNarração de Turno 3");
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
