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
            System.out.println("\nFinal do capitulo 2\n");
        } else if (capitulo == 3) {
            System.out.println("\nFinal do capitulo 3\n");
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
            System.out.println("\nFinal do capitulo 2\n");
        } else if (capitulo == 3) {
            System.out.println("\nFinal do capitulo 3\n");
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
