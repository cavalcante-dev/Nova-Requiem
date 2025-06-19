package main.java.textos;

import main.java.entities.NPC;
import main.java.entities.npcs.HenricoLobos;
import main.java.entities.npcs.SofiaVentura;
import main.java.util.Cores;

import java.awt.*;
import java.util.List;

public class Finais {

    private boolean finalSecreto;
    private List<NPC> listaSuspeitos;
    private boolean finalSofia;

    public Finais(List<NPC> listaSuspeitos){
        this.listaSuspeitos = listaSuspeitos;
    }

    public void narrarFinal() {

        for (NPC npc : listaSuspeitos) {

            if (npc instanceof HenricoLobos) {
                if (npc.isCuplado()) { // Final Bom

                    System.out.println(Cores.VERDE + "\nDuas semanas passaram.\n" + Cores.RESET +
                            """
                            \nA chuva ainda cai leve na cidade de Santa Tereza, a delegacia está movimentada e
                            você está de frente com um caso solucionado.
                            
                            Após investigarem Henrico Lobos mais a fundo, foi encontrada a arma utilizada para
                            o crime e depois de mais pressão em interrogatórios uma confissão foi arrancada
                            dele. A cidade descansa tranquila sem um assassino a menos em suas ruas.
                            
                            Você se sente de volta nos trilhos, capaz de conquistar o mundo novamente.
                            
                            Sofia não se arrepende. Ela conhece seu potencial, ela sabe quem você é e o que você
                            consegue conquistar. Ela se lembra do detetive que você era e consegue enxergar isso
                            em você até hoje.
                            
                            Ela confiou em você. Ela *confia* em você.
                            """);

                    if (finalSecreto) { // Cena Secreta

                         System.out.println("""
                                        ===================================================================================
                                        
                                        Em um dos poucos dias de sol no inverno de Santa Tereza, a bancada de um dos cafés
                                        charmosos da cidade recebe clientes inesperados. Uma mulher de tranças loiras e um
                                        detetive de instintos de se orgulhar.
                                        
                                        Eles conversam, se lembram dos bons tempos, tomam um café melhor do que o detetive
                                        pode sequer pensar em fazer e riem. Riem como antigamente, quando ainda existia
                                        algo entre eles.
                                        
                                        Ambos sabem que o amor verdadeiro é possível, na próxima vida - para pessoas novas.
                                        
                                        Porém o café, agora frio, lembra que ainda existem
                                        momentos bons nas tardes de inverno de Santa Tereza.
                                        
                                        """);

                    }

                    System.out.println(Cores.AMARELO + """
                                ----------------------------------------------------------------------------------
                                ===================== UN JOUR JE SERAI DE RETOUR PRÈS DE TOI =====================
                                ----------------------------------------------------------------------------------
                                """ + Cores.RESET);

                    System.out.println(Cores.ROXO     + """
                
                                ----------------------------------------------------------------------------------
                                ====================================== FIM =======================================
                                ----------------------------------------------------------------------------------
                                """ + Cores.RESET);

                } else { // Final Ruim

                    System.out.println(Cores.VERMELHO + "\nDuas semanas passaram.\n" + Cores.RESET +
                                    """
                                    \nA chuva ainda cai leve na cidade de Santa Tereza, a delegacia está movimentada e
                                    você está de frente com um caso não solucionado.
                                    
                                    Após investigação mais aprofundada do seu suspeito não foi encontrado nada que 
                                    o ligasse ao crime, nenhuma arma, nenhuma motivação concreta, apenas um instinto
                                    errado de um detetive velho.
                                    
                                    O tempo que perderam investigando o suspeito errado deu ao assassino tempo de 
                                    limpar seus rastros e fugir. Henrico Lobos não é visto em Santa Tereza a muito 
                                    tempo, ele fugiu assim que a investigação começou a se aprofundar. 
                                    
                                    Um mandado de busca já foi emitido, mas sem resultados.
                                    
                                    O assassino ainda está a solta.
                                    
                                    """);

                    if (finalSofia) {

                        System.out.println("""
                                Sofia confiou em você, ela *confia* em você.
                                
                                Ele viu seus esforços e a sua dedicação e acredita que você estava no caminho
                                certo, mas depositou sua confiança no suspeito errado. Ela acredita que talvez
                                você só precise de um tempo para voltar aos trilhos.
                                
                                Graças a ela, você conseguiu mais uma chance.
                                
                                """);

                    } else {

                        System.out.println("""
                                Sofia se pergunta o porquê de ter ido até seu apartamento, o porquê de ter te 
                                trazido para esse caso. Ela no fundo sabia o resultado, ela sabia que você 
                                não conseguiria e você a provou estar certa, se mostrou ser aquilo que ela 
                                esperava. 
                                
                                Uma bagunça.
                                
                                Não existem mais chances de ser melhor, você já teve demais dessas.
                                
                                """);

                    }

                    System.out.println(Cores.AMARELO + Cores.ITALIC +
                            "Vença o arrependimento. Sacuda a poeira e prossiga. Você conseguirá na próxima vida, " +
                            "\nonde não comete erros. Faça o que puder com esta, enquanto estiver vivo." + Cores.RESET);


                    System.out.println(Cores.ROXO     + """
                                ----------------------------------------------------------------------------------
                                ====================================== FIM =======================================
                                ----------------------------------------------------------------------------------
                                """ + Cores.RESET);

                }
            }

        }

    }

    public void verficarFinalSecetro(int finalSecreto, int sofiaAfinidade) {

        if (finalSecreto >= 2 && sofiaAfinidade >= 5) {
            this.finalSecreto = true;
        }
        if (sofiaAfinidade >= 5) {
            this.finalSofia = true;
        }

    }

    public boolean isFinalSofia() {
        return finalSofia;
    }

    public void setFinalSofia(boolean finalSofia) {
        this.finalSofia = finalSofia;
    }

    public boolean isFinalSecreto() {
        return finalSecreto;
    }

    public void setFinalSecreto(boolean finalSecreto) {
        this.finalSecreto = finalSecreto;
    }

    public List<NPC> getListaSuspeitos() {
        return listaSuspeitos;
    }

    public void setListaSuspeitos(List<NPC> listaSuspeitos) {
        this.listaSuspeitos = listaSuspeitos;
    }
}