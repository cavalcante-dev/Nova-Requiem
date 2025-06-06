package main.java.systems;

import java.util.Random;

public class Atributos {

    private int mente;
    private int fisico;
    private int coracao;

    public Atributos(int mente, int fisico, int coracao) {
        this.mente = mente;
        this.fisico = fisico;
        this.coracao = coracao;
    }

    public boolean rolarAtributo(int atributo, int dt){
        boolean resultado = false;
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int resul = dado1 + dado2 + atributo;

        return resultado;
    }

    public int getMente() {
        return mente;
    }

    public void setMente(int mente) {
        this.mente = mente;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getCoracao() {
        return coracao;
    }

    public void setCoracao(int coracao) {
        this.coracao = coracao;
    }
}
