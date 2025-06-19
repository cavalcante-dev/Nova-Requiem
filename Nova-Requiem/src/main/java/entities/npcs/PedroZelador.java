package main.java.entities.npcs;

import main.java.entities.Jogador;
import main.java.entities.NPC;

public class PedroZelador extends NPC {

    public PedroZelador(String nome, int afinidade, Jogador jogadorUtilitarios) {
        super(nome, afinidade, jogadorUtilitarios);
    }

    public void dialogar(int capitulo, int turno) {
        if (capitulo == 3) {
            if (turno == 2) {
                System.out.println("""
                         - Sr. Policial? - Ele se senta, o porte magro do senhorzinho quase desaparece na imensidão da sala
                        de interrogatório. - Vai demorar demais? Eu tenho que voltar até a janta…
                       
                        """);
            }
        }
    }

    public void responder(int capitulo, int turno, int resposta) {
        if (capitulo == 3) {
            if (turno == 2) {
                if (resposta ==1 ) {
                    System.out.println("""

                        É perceptível a tensão relaxando no corpo de Pedro, ele coloca as mãos sobre a mesa 
                        e você o vê pensando por alguns segundos. 
                        
                        - Claro Sr. Policial, eu respondo tudo que o Sr. perguntar. - O clima fica mais leve, 
                        mas o tic tac do relógio ainda o desconforta.
                    
                        ----------------------------------------------------------------------------------------
                        """);
                        setAfinidade(getAfinidade()+1);
                } else if (resposta == 2) {
                    System.out.println("""

                        O semblante de Pedro se abre quase que em um sorriso e ele se apruma na cadeira, 
                        agora mais disposto do que anteriormente. 

                        - Obrigado viu Sr. Policial, se eu atrasar a patroa esquenta meu coro...
                        Você deve saber como é. - Uma risada descontraída dura por alguns segundos. 

                        Você já soube como é.
 
                        ----------------------------------------------------------------------------------------
                        """);
                         setAfinidade(getAfinidade()+1);
                } 

                else if (resposta == 3) {
                    System.out.println("""

                        Ele se encolhe na cadeira, o som tom de voz imponente o deixa ainda mais tenso. 

                        - Oh Sr. Policial eu não sei do que o Sr. tá falando, eu nem conhecia o Sr. Francisco... 
                        - Ele se fecha e parece estar mais fechado a perguntas posteriores.
 
                        ----------------------------------------------------------------------------------------
                        """);
                         setAfinidade(getAfinidade()-1);
                } 

                else if (resposta == 4) {
                    System.out.println("""

                        Ele coloca a mão na cara e solta um grunhido estranho

                        - Pra que essa luz na minha cara Sr. Policial, isso é realmente necessário? 
                        - Você escuta uma batida vindo do vidro espelho na parte de trás da sala. 

                        Talvez você esteja levando isso longe demais.

                        ----------------------------------------------------------------------------------------
                        """);
                         setAfinidade(getAfinidade()-1);
                } 
            } 

            else if (turno == 3) {
                if (resposta == 1) {
                    if (getAfinidade() < 1) {
                        System.out.println("""

                        - Eu falei tudo que eu sabia, viu Sr. Policial, agora se me der 
                        licença eu vou ir  pra casa. – Os passos rápidos atravessam
                        a sala de interrogatório e a porta se fecha com pressa. 

                        ----------------------------------------------------------------------------------------
                        """);
                    }

                    else if (getAfinidade() >= 2) {
                        System.out.println("""

                        - Não sei se ajuda, mas direto eu via o Sr. Lobos discutir no telefone com o 
                        irmão dele, o tal do Henrico. Alguma coisa sobre dinheiro e tals, não prestava muito 
                        atenção porque era feio mas acho que talvez isso possa ajudar. – Os passos rápidos 
                        atravessam a sala de interrogatório e a porta se fecha com pressa. 

                        ----------------------------------------------------------------------------------------
                        """);
                    }
                } 

                else if (resposta == 2) {
                    if (getAfinidade() < 1) {
                        System.out.println("""

                        - O Sr. Henrico? Vish... acho que vi sim, mas não tenho certeza se era ele não. 
                        Tava muito ocupado. - O pensamento dele está distante, 
                        ele encara o tic tac do relógio se perguntando quando vai poder ir embora. 


                        ----------------------------------------------------------------------------------------
                        """);
                    }

                    else if (getAfinidade() >= 2) {
                        System.out.println("""

                        Ele se apruma na cadeira novamente e colocando a mão sobre o queixo -
                        O irmão do Sr. Lobos deu uma passada por lá sim, ele entrou cedo... 
                        Tava com uma cara feia e carregando uns papel. Não dei muita bola. - O pensamento paira 
                        na cabeça dele por alguns segundos enquanto ele reflete sobre algo, 
                        distante da sala de interrogatório


                        ----------------------------------------------------------------------------------------
                        """);
                    }
                }

                else if (resposta == 3) {
                    if (getAfinidade() < 1) {
                        System.out.println("""

                        - E eu sei lá, não sou pai de ninguém pra ficar me metendo na vida privada deles. 
                        Eu sei de mim e da minha casa. - A impaciência dele é clara, o tic tac do relógio 
                        o deixa ainda relutante e a vontade de deixar a sala aumenta. 

                        ----------------------------------------------------------------------------------------
                        """);
                    }

                    else if (getAfinidade() >= 2) {
                        System.out.println("""

                        - Uai, os dois com certeza alguma coisa tinha... Eu só não sei dizer o que, 
                        o rapaz sempre foi meio quieto e a Esmeralda então nem se fala. 
                        A relação dela e do Sr. Lobos nunca foi muito boa sabe... - Ele evita tocar muito no assunto,
                        percebendo que talvez isso coloque o amigo em maus lençois. 

                        ----------------------------------------------------------------------------------------
                        """);
                    }
                }

                else if (resposta == 4) {
                    if (getAfinidade() < 1) {
                        System.out.println("""

                        - Fiquei ocupado o dia inteiro… não tive tempo de ficar 
                        bicando nas conversa dos outros. - Ele diz evitando contato visual. 

                        ----------------------------------------------------------------------------------------
                        """);
                    }

                    else if (getAfinidade() >= 2) {

                         System.out.println("""

                         - Agora que o Sr. comentou… eu bem que tinha ouvido a Sra. Lobos e o 
                         marido discutindo na parte da tarde, parece ter sido tenso...
                         teve coisa sendo derrubada gritaria pra lá e pra cá, a Sra. Sofia 
                         saiu chorando e eu não a vi ela mais. - Ele diz olhando meio desconfiado para os lados.
 
                         ----------------------------------------------------------------------------------------
                         """);
                    }
                }
            }
        }
    }

}