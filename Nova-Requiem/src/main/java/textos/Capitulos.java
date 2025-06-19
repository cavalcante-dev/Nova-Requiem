package main.java.textos;

import main.java.util.Cores;

public class Capitulos {

    private int capitulo;
    private int turnosPorCapitulo;

    public Capitulos(int capitulo, int turnosPorCapitulo) {
        this.capitulo = capitulo;
        this.turnosPorCapitulo = turnosPorCapitulo;
    }

    // Titulos dos capitulos, separado em 4 momentos - Introdução / Analise de pistas / Interrogatorio / Final

    public void inicioCapitulo() {

        if (capitulo == 1) {

            System.out.println(Cores.AMARELO     + """
                ----------------------------------------------------------------------------------
                ================================ CAPÍTULO 1: ECOS ================================
                ----------------------------------------------------------------------------------
                """ + Cores.RESET);

        } else if (capitulo == 2) {

            System.out.println(Cores.AMARELO     + """
                ----------------------------------------------------------------------------------
                =============================== CAPÍTULO 2: MORTIS ===============================
                ----------------------------------------------------------------------------------
                """ + Cores.RESET);

        } else if (capitulo == 3) {

            System.out.println(Cores.AMARELO     + """
                ----------------------------------------------------------------------------------
                ============================== CAPÍTULO 3: VERITAS ===============================
                ----------------------------------------------------------------------------------
                """ + Cores.RESET);

        } else if (capitulo == 4) {

            System.out.println(Cores.AMARELO     + """
                ----------------------------------------------------------------------------------
                ============================== CAPÍTULO 4: REQUIEM ===============================
                ----------------------------------------------------------------------------------
                """ + Cores.RESET);

        }

    }

    public void finalCapitulo() {

        if (capitulo == 1) {

            System.out.println("""
                    O Impala 67 estaciona na sua vaga regular em frente ao Distrito 41 e ambos
                    caminham até a delegacia, a chuva está fraca o suficiente para que não incomode
                    nenhum dos dois.
                    
                    Os outros policiais param para te olhar, alguns riem de canto e cochicham, outros
                    olham com um certo respeito mas todos abrem espaço até a sala de Sofia Ventura.
                    
                    Você vê a plaquinha na porta e logo abaixo o espaço onde deveria ter um outro nome.
                    Sua boca seca. Sofia abre a porta e o olhar cansado aponta para o lado de dentro,
                    para a investigação e para a responsabilidade.
                    """);

        } else if (capitulo == 2) {

            System.out.println("""
                    A sala de interrogatório é pequena e mal iluminada, uma mesa metálica é a única coisa
                    que afasta você dos suspeitos. Dá pra se ouvir o som da chuva lá fora, você acharia
                    uma tarde agradável se não fosse pelo assassinato que te tirou de casa.
                    
                    Você se senta na cadeira desconfortável que está de costas para o vidro espelho no
                    fundo da sala e faz um sinal para chamarem o primeiro suspeito.
                    
                    O frio na barriga antes de um interrogatório é sempre difícil de conter, mas você
                    já fez isso antes, você sabe o que tem que ser feito.
                    """);

        } else if (capitulo == 3) {

            System.out.println("""
                    O último interrogado sai da sala e você tem um breve momento de silêncio para
                    refletir sobre o que escutou.
                    
                    O silêncio é interrompido pela entrada de Sofia, ela está inquieta e não diz nada,
                    apenas se senta na cadeira de interrogado. 
                    
                    Ela coloca as mãos sobre a mesa com um olhar determinado. 

                    Chegou a hora de tomar uma decisão.
                    """);

        }

    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getTurnosPorCapitulo() {
        return turnosPorCapitulo;
    }

    public void setTurnosPorCapitulo(int turnosPorCapitulo) {
        this.turnosPorCapitulo = turnosPorCapitulo;
    }

}
