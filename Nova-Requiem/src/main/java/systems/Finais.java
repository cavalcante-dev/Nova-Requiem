package main.java.systems;

public class Finais {

    private int finalBom;
    private int finalRuim;
    private int finalSecreto;


    public Finais(int turno, int capitulo) {
        this.finalBom = 0;
        this.finalRuim = 0;
        this.finalSecreto = 0;
    }

    public void setFinalBom(int finalBom) {
        this.finalBom = finalBom;
    }

    public int getFinalBom() {
        return finalBom;
    }

    public void setFinalRuim(int finalRuim) {
        this.finalRuim = finalRuim;
    }

    public int getFinalRuim() {
        return finalRuim;
    }

    public void setfinalSecreto(int finalSecreto) {
        this.finalSecreto = finalSecreto;
    }

    public int getfinalSecreto() {
        return finalSecreto;
    }

}