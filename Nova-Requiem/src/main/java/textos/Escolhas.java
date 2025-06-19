package main.java.textos;

import java.util.Arrays;
import java.util.List;
import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.util.Cores;

public class Escolhas {

    private final Jogador jogador;
    private final List<NPC> npcs;

    private String[] opcoes = new String[4];

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
                       Seu quadro de investigação é um caos: fotos amassadas, recibos tortos e rabiscos 
                       confusos. Cada linha vermelha traçada parece mais confundir do que esclarecer.
                       
                       As vozes da delegacia ecoam lá fora e a cidade se esconde da chuva.
                       """);

                imprimirOpcoes();

            } else if (turno == 1) {

                System.out.println("""
                        Do lado de fora, os suspeitos esperam impacientemente. Mas agora, você tem um
                        último momento com Sofia antes de colocar a mão na massa.
                        """);

                imprimirOpcoes();

            } 


        } else if (capitulo == 3) {

            if (turno == 0) {

                System.out.println("""
                        A batida da mão nas pernas de alguém que claramente está nervoso são a única coisa
                        que quebram o silêncio na sala. Guilherme espera sua próxima pergunta.
                        """);

                imprimirOpcoes();

            } else if (turno == 1) {

                System.out.println("""
                        O ar tenso se intensifica a medida que o interrogatorio se prolonga, você sente que
                        ele está chegando em seu limite... talvez se fazer as perguntas certas ele solte algo.
                        """);

                imprimirOpcoes();

            } else if (turno == 2) {

                System.out.println("""
                        O homem franzino te olha com um olhar preocupado, de tempos em tempos ele encara o 
                        relógio por alguns segundos e volta o olhar para você.
                        """);

                imprimirOpcoes();

            } else if (turno == 3) {

                System.out.println("""
                        O tic tac do relógio se torna mais alto e a impaciência de Pedro mais notável, suas 
                        próximas perguntas devem ser pensadas com cuidado.
                        """);

                imprimirOpcoes();

            } else if (turno == 4) {

                System.out.println("""
                        – Eu nã- não sei po- porque eu to aq- aqui...
                        
                        Ela diz entre soluços enquanto enxuga o rosto com um lencinho chique. É difícil dizer o 
                        quanto dessas lágrimas são sinceras, mas no fim, seu trabalho é exatamente esse.
                        """);

                imprimirOpcoes();

            } else if (turno == 5) {

                System.out.println("""
                        O temperamento da viúva fica mais volátil, as informações menos confiáveis. O cuidado é
                        a chave essencial para lidar com Esmeralda.
                        
                        O par de óculos agora descansam no canto da mesa, a maquiagem borrada escorre pelo 
                        rosto jovem da mulher de cabelos ruivos.
                        """);

                imprimirOpcoes();

            } else if (turno == 6) {

                System.out.println("""
                        Henrico está parado na sua frente, suas mãos são bem comportadas e seu olhar firme.
                        Encontre o que é necessário para abri-lo e fazê-lo falar.
                        """);

                imprimirOpcoes();

            } else if (turno == 7) {

                System.out.println("""
                        A postura impecável mostra rachaduras, ele parece saber mais do que deveria.
                        Talvez ele só precise de mais um empurrãozinho.
                        """);

                imprimirOpcoes();

            }

        } else if (capitulo == 4) {

            if (turno == 0) {

                System.out.println("""
                        Sofia respira fundo. Ela encara você, séria, mas com um olhar que mistura cansaço 
                        e talvez orgulho.
                       
                        -  Está nas suas mãos agora.
                        
                        O quadro está completo: horários, depoimentos, contradições, provas, mentiras. Você revisão
                        mentalmente cada rosto, cada palavra dita nas últimas horas. Na sua frente, um formulário 
                        esperando um nome e uma assinatura.
                       
                        Agora não tem volta.
                        
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
                opcoes[i] = (Cores.VERDE + "----------------------" + Cores.RESET);
            }
        }
    }

    public void imprimirOpcoes() {
        for (String opcao : opcoes) {
            System.out.println(opcao);
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
                opcoes[0] = "1. \"O que te trás aqui tão cedo? Aconteceu algo?\"";
                opcoes[1] = "2. \"Você está bonita hoje...\"";
                opcoes[2] = "3. \"O que aconteceu ontem a noite?\"";
                opcoes[3] = "4. Oferecer um café.";
            } else if (turno == 2) {
                opcoes[0] = "1. Examinar documentos.";
                opcoes[1] = "2. \"O que você sabe sobre os suspeitos?\"";
                opcoes[2] = "3. \"Quais pistas nós temos?\"";
                opcoes[3] = "4. Olhar pela janela.";
            }
        }
        if (capitulo == 2) {

            if (turno == 0) {
                opcoes[0] = "1. Examinar as provas.";
                opcoes[1] = (Cores.AMARELO + "2. [TESTE (INTELECTO) - DIFICULDADE MÉDIA (8)] Ver além do óbvio" + Cores.RESET);
                opcoes[2] = "3. Organizar os acontecimentos.";
                opcoes[3] = "4. \"Tem algo aqui que ainda não vimos...\"";
            } else if (turno == 1) {
                opcoes[0] = "1. \"O que você acha sobre os suspeitos?\" ";
                opcoes[1] = "2. \"Teria sido mais fácil deixar o cara na mala e mandar por SEDEX...\"";
                opcoes[2] = "3. \"Talvez seja a tequila de ontem falando, mas talvez estamos exagerando as suspeitas.\"";
                opcoes[3] = "4. \"Aceita mais café? Você parece cansada...\"";
            }

        }
        if (capitulo == 3) {
            if (turno == 0) {
                opcoes[0] = "1. \"Eu sei que deve ter sido difícil ter encontrado o corpo daquela maneira. Vocês eram amigos?\"";
                opcoes[1] = ("2. \"Precisamos saber exatamente como e onde você encontrou o corpo. Entendo que pode ser difícil" + "\nlembrar de certas informações, mas quanto mais detalhes tivermos melhor.\"");
                opcoes[2] = "3. \"Eu sei do seu caso com a Esmeralda. Você tem um motivo e os meios para assassinar Francisco, " + "\nse se entregar agora a pensa será menor.\"";
                opcoes[3] = "4. Encarar até resolver admitir tudo.";
            } else if (turno == 1) {
                opcoes[0] = "1. Finalizar interrogatório";
                opcoes[1] = ("2. \"Qual era a sua relação com Esmeralda?\"");
                opcoes[2] = "3. \"Você estava com Pedro, certo? Mais alguém sabia que estariam lá?\"";
                opcoes[3] = (Cores.AMARELO + "4. [TESTE (CORAÇÃO) - DIFICULDADE: Fácil (4)] - Pressionar sobre Esmeralda." + Cores.RESET);
            }
             else if (turno == 2) {
                opcoes[0] = "1. \"Não se encare como um suspeito Pedro, você é uma testemunha e precisamos saber tudo que você viu e ouviu naquele dia.\"";
                opcoes[1] = "2. \"Não se preocupe, não iremos demorar muito. Vamos trabalhar rápido para que o Sr. chegue em casa a tempo.\"";
                opcoes[2] = "3. \"Vamos direto ao ponto, você me parece muito nervoso, está sendo cúmplice de alguém? Você está escondendo algo.\"";
                opcoes[3] = "4. Colocar a luz na cara dele e dar uma de policial mal. ";
            }           
             else if (turno == 3) {
                opcoes[0] = "1. Finalizar interrogatório";
                opcoes[1] = ("2. \"Você viu Henrico por lá?\"");
                opcoes[2] = "3. \"Qual a relação de Guilherme e Esmeralda?\"";
                opcoes[3] = "4. \"Você escutou alguma discussão no dia do crime?\"";
            }
            else if (turno == 4) {
                opcoes[0] = "1. \"Entendo o seu luto, mas preciso que você se concentre para pegarmos quem fez isso\"";
                opcoes[1] = "2. Colocar a aliança na mesa - \"Isso é seu?\"";
                opcoes[2] = "3. \"Seu nome tá em tudo, Esmeralda. E você sabe bem disso.\"";
                opcoes[3] = "4. \"Discussão... aliança na mesa... caso com zelador... tudo aponta para você\"";
            }
            else if (turno == 5) {
                opcoes[0] = "1. Finalizar interrogatório";
                opcoes[1] = ("2. \"Qual era sua relação com Henrico?\"");
                opcoes[2] = "3. \"Qual é sua relação com Guilherme?\"";
                opcoes[3] = "4. \"Os relatos dizem que você discutiu com seu marido no dia. Qual seria o motivo dessa discussão?\"";
            }
            else if (turno == 6) {
                opcoes[0] = "1. \"Henrico certo? As perguntas que iremos fazer serão breves, esperamos sua colaboração.\"";
                opcoes[1] = ("2. \"Conhecia os zeladores? Você parecia ser frequente em conversas com Francisco.\"");
                opcoes[2] = "3. \"Você o matou por inveja, não foi? Afinal ele tinha tudo o que você gostaria de ter\"";
                opcoes[3] = "4. \"Esmeralda nunca pareceu te querer, a fortuna foi para seu irmão e que sobra para você? Absolutamente nada.\"";
            }
            else if (turno == 7) {
                opcoes[0] = "1. Finalizar interrogatório";
                opcoes[1] = ("2. \"Onde você estava no dia do crime, pela manhã?\"");
                opcoes[2] = "3. \"Qual é sua relação com Guilherme?\"";
                opcoes[3] = (Cores.AMARELO + "4. [TESTE (CORAÇÃO) - DIFICULDADE: Fácil (4)] - Pressionar sobre Esmeralda." + Cores.RESET);;
            }
        }
        if (capitulo == 4) {
            if (turno == 0) {
                opcoes[0] = "1. Culpar Henrico.";
                opcoes[1] = "2. Culpar Esmeralda.";
                opcoes[2] = "3. Culpar Guilherme.";
                opcoes[3] = "4. Culpar Pedro.";
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

