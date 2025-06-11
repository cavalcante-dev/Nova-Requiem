package main.java.systems;

public class Capitulos {

    private int capitulo;
    private int turnosPorCapitulo;

    public Capitulos(int turnosPorCapitulo, int capitulo) {
        this.turnosPorCapitulo = turnosPorCapitulo;
        this.capitulo = capitulo;
    }

    public int getTurnosPorCapitulo() {
        return turnosPorCapitulo;
    }

    public void setTurnosPorCapitulo(int turnosPorCapitulo) {
        this.turnosPorCapitulo = turnosPorCapitulo;
    }
 
}