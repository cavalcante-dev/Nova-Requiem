package main.java.entities.npcs;

import main.java.entities.Jogador;
import main.java.entities.NPC;

public class GuilhermeZelador extends NPC {

    public GuilhermeZelador(String nome, int afinidade, Jogador jogadorUtilitarios) {
        super(nome, afinidade, jogadorUtilitarios);
    }

    public void dialogar(int capitulo, int turno) {



    }


    public void responder(int capitulo, int turno, int resposta) {

        if (capitulo == 3) {

            if (turno == 0) {

                if (resposta == 1) {

                    System.out.println("""

                           Os olhos dele evitam se encontrar com os seus, as mãos suando são perceptíveis
                           e o nervosismo de quem nunca esteve em um interrogatório é claro. Ele demora a
                           responder.
                           
                           - Eu fico enjoado só de lembrar, o jeito que colocaram ele naquela mala… eu não sei
                           nem como é possível. - o desconforto no tópico é quase palpável. - E não, não éramos
                           "amigos", não conhecia muito o chefe, mas ele era uma pessoa boa. Vocês vão pegar quem
                           fez isso certo?”.
                           
                           Você acena positivamente com a cabeça e consegue ver a tensão do rapaz se 
                           aliviando um pouco.
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    setAfinidade(getAfinidade() + 1);

                } else if (resposta == 2) {

                    System.out.println("""
   
                           O rapaz se ajeita na cadeira, olha para os lados buscando algum ponto para se concentrar.
                           
                           - Olha, tudo bem, o dia estava tranquilo como sempre e eu e o Pedro ficamos de hora extra
                           para fazer uma graninha a mais. O escritório não tava muito bagunçado então a gente pensou
                           que ia ser moleza, até que o Pedro viu a primeira poça de sangue no carpete. A gente seguiu
                           o sangue e eu abri o armário e lá tava a mala. O pedro falou pra gente não abrir e só ir
                           embora mas eu não consegui e quando eu abri eu quase desmaiei, o senhor Francisco tava lá,
                           todo empacotado.
                           
                           Ao terminar, volta a se encolher na cadeira. A cooperação dele demonstra certa sinceridade.
   
                           ----------------------------------------------------------------------------------------
                           """);

                    setAfinidade(getAfinidade() + 1);

                } else if (resposta == 3) {

                    System.out.println("""
                           
                           Guilherme se assusta.
                           
                           - “O QUE? Eu nunca faria isso com o meu chefe… e caso com a Esmel? Do que você tá falando?
                           Essas acusações não fazem sentido nenhum, eu não tenho nada para admitir.
                           
                           A irritação na voz dele é clara.
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    setAfinidade(getAfinidade() - 1);

                } else if (resposta == 4) {

                    System.out.println("""
                           
                           Você resolve puxar sua melhor técnica da manga: encarar intensamente até o suspeito 
                           admitir algo. O desconforto de Guilherme é notável.
                            
                           Ele claramente não irá falar dessa maneira.
   
                           ----------------------------------------------------------------------------------------
                           """);

                    setAfinidade(getAfinidade() - 1);

                }

            } else if (turno == 1) {

                if (resposta == 1) {

                    if (getAfinidade() >= 2) {

                        System.out.println("""
                           
                           - Tudo bem, Guilherme. Terminamos por aqui.
                           
                           O jovem se levanta e vai até a porta, antes de sair ele se vira e diz:
                           
                           - Olha cara, eu não queria acusar ninguém… mas a Esmel vivia reclamando que aquele 
                           Henrico era piradão nela. Completamente obcecado mesmo… - Ele te encara relutante e 
                           olha para o vidro espelho atrás de você, após alguns segundos de silêncio ele se retira.\s
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    } else if (getAfinidade() <= 1) {

                        System.out.println("""
   
                           - Tudo bem, Guilherme. Terminamos por aqui.
                            
                           O jovem se levanta e sai da sala, sem mais muito rodeio.
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    }

                } else if (resposta == 2) {

                    if (getAfinidade() >= 2) {

                        System.out.println("""
                           
                           - Ela é simpática comigo, só isso. Às vezes leva refrigerante no horário do almoço e
                           organiza uma resenha pros funcionários nada demais, ta sempre presente com a gente.
                           
                           Ele se vira para a porta, o olhar de preocupação parece buscar o olhar de outra pessoa.
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    } else if (getAfinidade() <= 1) {

                        System.out.println("""
                                    
                                    - Nenhuma, não fico de papinho com a esposa do meu chefe já disse.
                                    
                                    Ele bufa e vira o rosto, incomodado com a insistência no tópico.
        
                                    ----------------------------------------------------------------------------------------
                                    """);

                    }

                } else if (resposta == 3) {

                    if (getAfinidade() >= 2) {

                        System.out.println("""
                           
                           - Sim, estava. Era quarta-feira então todos sabiam que era nosso turno de limpar 
                           o escritório. Não era segredo pra ninguém que a gente ia tá lá, se alguém não sabia
                           é porque não leu o itinerario da semana. 
                           
                           Guilherme dá de ombros.
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    } else if (getAfinidade() <= 1) {

                        System.out.println("""
   
                           Ele parece irritado, como se já estivesse de saco cheio.
                           
                           Quer saber?! Fala com meu advogado, eu já falei tudo que sabia, não tenho mais nada 
                           pra dizer.
                           
                           O incômodo do jovem é palpável e o desconforto com a situação cresce.
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    }

                } else if (resposta == 4) {

                    if (getAfinidade() >= 2) {

                        System.out.println("""
                           
                           - Tudo bem, Guilherme. Terminamos por aqui.
                           
                           O jovem se levanta e vai até a porta, antes de sair ele se vira e diz:
                           
                           - Olha cara, eu não queria acusar ninguém… mas a Esmel vivia reclamando que aquele 
                           Henrico era piradão nela. Completamente obcecado mesmo… - Ele te encara relutante e 
                           olha para o vidro espelho atrás de você, após alguns segundos de silêncio ele se retira.\s
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    } else if (getAfinidade() <= 1) {

                        System.out.println("""
   
                           - Tudo bem, Guilherme. Terminamos por aqui.
                            
                           O jovem se levanta e sai da sala, sem mais muito rodeio.
                           
                           ----------------------------------------------------------------------------------------
                           """);

                    }
                }

            }

        }

    }

}
