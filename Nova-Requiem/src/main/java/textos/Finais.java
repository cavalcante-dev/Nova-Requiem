package main.java.textos;

import main.java.entities.NPC;

public class Finais {

    private int finalBom;
    private int finalRuim;
    private int finalSecreto;

    public Finais() {
        this.finalBom = 0;
        this.finalRuim = 0;
        this.finalSecreto = 0;
    }

    public void narrarFinal() {
        if (finalBom > finalRuim) {
            System.out.println("Final Bom");
        } else if (finalRuim > finalBom) {
            System.out.println("Final Ruim");
        }
    }

    public void finalSofia(NPC sofia) {
        if (sofia.getAfinidade() >= 3) {
            System.out.println("Sofia gosta de você.");
        } if (sofia.getAfinidade() < 3) {
            System.out.println("Sofia não gosta de você");
        }
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