package main.java.textos;

public class Capitulos {

    private int capitulo;
    private int turnosPorCapitulo;

    public Capitulos(int capitulo, int turnosPorCapitulo) {
        this.capitulo = capitulo;
        this.turnosPorCapitulo = turnosPorCapitulo;
    }

    public void finalCapitulo() {
        if (capitulo == 1) {
            System.out.println("Final do capitulo 1");
        } else if (capitulo == 2) {
            System.out.println("Final do capitulo 2");
        } else if (capitulo == 3) {
            System.out.println("Final do capitulo 3");
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
