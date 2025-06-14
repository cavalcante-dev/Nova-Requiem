package main.java.textos;

import main.java.util.Cores;

public class Capitulos {

    private int capitulo;
    private int turnosPorCapitulo;

    public Capitulos(int capitulo, int turnosPorCapitulo) {
        this.capitulo = capitulo;
        this.turnosPorCapitulo = turnosPorCapitulo;
    }

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
            System.out.println("\nFinal do capitulo 1\n");
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
