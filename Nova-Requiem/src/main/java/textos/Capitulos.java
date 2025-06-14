package main.java.textos;

import main.java.util.Musica;

public class Capitulos {

    private int capitulo;
    private int turnosPorCapitulo;

    public Capitulos(int capitulo, int turnosPorCapitulo) {
        this.capitulo = capitulo;
        this.turnosPorCapitulo = turnosPorCapitulo;
    }

    public void trilhaSonora() {

        Musica musica = new Musica();

        if (capitulo == 1) {
            musica.parar();
            musica.musicaCapitulo1();
        } else if (capitulo == 2) {
            musica.parar();
            musica.musicaCapitulo2();
        } else if (capitulo == 3) {
            musica.parar();
            musica.musicaCapitulo3();
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
