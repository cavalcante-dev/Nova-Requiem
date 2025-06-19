package main.java.entities.npcs;

import main.java.entities.Jogador;
import main.java.entities.NPC;

public class EsmeraldaLobos extends NPC {

    public EsmeraldaLobos(String nome, int afinidade, Jogador jogador) {
        super(nome, afinidade, jogador);
    }

    public void dialogar(int capitulo, int turno) {

        if (capitulo == 3) {

            if (turno == 4) {

                System.out.println("""
                        - Me- meu Franciso… naquela m- ma- mala... eu n- não...
                        
                        Ela desaba em soluços ao te encarar nos olhos.  Lágrimas de luto? Culpa? Nesse ponto é difícil
                        dizer, tudo o que você é uma viúva fragilizada e uma possível culpada de assassinato.
                       
                        """);

            }

        }

    }

    public void responder(int capitulo, int turno, int resposta) {

        if (capitulo == 3) {

            if (turno == 4) {

                if (resposta ==1 ) {

                    System.out.println("""

                        Os sons de soluço param e o choro fica mais leve, ela parece estar se recompondo melhor.
                    
                        ----------------------------------------------------------------------------------------
                        """);

                    setAfinidade(getAfinidade()+1);

                } else if (resposta == 2) {

                    System.out.println("""

                        Ela pega a aliança com relutância e examina por alguns segundos.
                        
                        - Sim... eu... achei que a tinha perdido...
                        
                        Ela a coloca em cima da mesa novamente, sem encará-lá por muito mais tempo.
 
                        ----------------------------------------------------------------------------------------
                        """);
                    setAfinidade(getAfinidade()+1);

                } else if (resposta == 3) {

                    System.out.println("""

                        Os óculos escuros escondem o nervosismo, mas as batidas rápidas e a respiração são facilmente 
                        identificadas no comportamento de Esmeralda. Os olhos caminham rapidamente pela sala procurando 
                        um ponto para se fixarem, mas ela encontra somente a pressão que você coloca.  
 
                        ----------------------------------------------------------------------------------------
                        """);
                         setAfinidade(getAfinidade()-1);
                } else if (resposta == 4) {

                    System.out.println("""

                        Ela desaba em choro e a voz fica distante.
                        
                        - Eu...e... eu... nã- não... fiz na- n- nada... eu nun- nu- nunca f- faria isso...
                        
                        As palavras se embaralham com o choro e a compreensão fica mais difícil, talvez uma 
                        abordagem mais suave tivesse sido mais eficaz.

                        ----------------------------------------------------------------------------------------
                        """);
                    setAfinidade(getAfinidade()-1);

                }

            } else if (turno == 5) {

                if (resposta == 1) {

                    if (getAfinidade() < 1) {

                        System.out.println("""

                        - Obrigado Esmeralda, você está libera-
                        
                        Antes que você pudesse terminar ela se levanta e sai, te deixando sozinho com o silêncio.
                        
                        ----------------------------------------------------------------------------------------
                         """);

                    } else if (getAfinidade() >= 2) {

                        System.out.println("""

                        - Obrigado Esmeralda, você está liberada. - Ela se levanta.
                        
                        - Existe algo que não contei...Henrico conversou comigo naquela manhã... Ele disse para
                        fugirmos, disse que daria um jeito de pegar o dinheiro da Herança, ele sempre foi insistente
                        com isso... dessa vez pareceu diferente.
                        
                        Ela caminha até a porta e os sons de salto alto deixam a sala juntamente com Esmeralda. 

                        ----------------------------------------------------------------------------------------
                        """);

                    }

                } else if (resposta == 2) {

                    if (getAfinidade() < 1) {

                        System.out.println("""

                        O choro se intensifica e as palavras são dificilmente compreendidas, ela fala alguma
                        coisa sobre casamento e obcecado. 

                        ----------------------------------------------------------------------------------------
                        """);

                    } else if (getAfinidade() >= 2) {

                        System.out.println("""

                        O choro agora está mais tímido, atrapalhando menos suas palavras.

                        - Nunca gostei dele, sempre foi obcecado por mim, até antes mesmo de conhecer Francisco!
                        Sempre odiou que me casei com o irmão invés dele.
                         
                        O ressentimento entre eles é verdadeiro, assim como o conflito familiar. 

                        ----------------------------------------------------------------------------------------
                        """);

                    }

                } else if (resposta == 3) {

                    if (getAfinidade() < 1) {

                        System.out.println("""

                        Mesmo entre os soluços ela se abre para dizer.
                        
                        - Vá a merda se está insinuando que eu traí meu marido.
                        
                        O luto é brevemente substituído por raiva e remorso e as lágrimas se tornam menos
                        intensas por um instante. 

                        ----------------------------------------------------------------------------------------
                        """);

                    }

                    else if (getAfinidade() >= 2) {

                        System.out.println("""

                        - Ele... ele é um rapaz doce, me faz companhia quando Francisco está- quer dizer, 
                        estava, de viagem.
                        
                        O olhar dela evita o seu. Existe remorso em suas palavras ao mesmo tempo que 
                        elas carregam afeto.

                        ----------------------------------------------------------------------------------------
                        """);

                    }

                } else if (resposta == 4) {

                    if (getAfinidade() < 1) {

                        System.out.println(""" 

                        Ela se desaba em um choro mais profundo, um choro de arrependimento, um choro de mágoa,
                        um choro de dor.
                        
                        Ela não é capaz de responder sua pergunta.
                        
                        Talvez nenhuma outra.
                        
                        ----------------------------------------------------------------------------------------
                        """);

                    }

                    else if (getAfinidade() >= 2) {

                         System.out.println("""

                         - Chegou uma… carta. Anónima a princípio. Citava um relacionamento “extraconjugal”. Ele me
                         perguntou sobre e eu o questionei sobre outras questões, discutimos por alguns minutos e eu
                         saí após deixar minha aliança em cima da mesa.
                         
                         Ela encara o dedo vazio.
                         
                         - Mas nada além disso, os ânimos estavam alterados mas nada que me fizesse querer matá-lo.
                         
                         Ela acaricia o próprio braço, ela sente remorso. 
                         
                         Talvez por essa ter sido sua última conversa. Talvez pela suposta traição. 
 
                         ----------------------------------------------------------------------------------------
                         """);

                    }

                }

            }

        }

    }

}
