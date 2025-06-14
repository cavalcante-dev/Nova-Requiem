package main.java.textos;

import main.java.entities.NPC;
import main.java.util.Cores;

import java.awt.*;

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
            System.out.println(Cores.VERDE + "Final Bom" + Cores.RESET);
        } else if (finalRuim > finalBom) {
            System.out.println(Cores.VERMELHO + "Final Ruim" + Cores.RESET);
        }
    }

    public void finalSofia(NPC sofia) {
        if (sofia.getAfinidade() >= 3) {
            System.out.println(Cores.VERDE + "Sofia gosta de você." + Cores.RESET);
        } if (sofia.getAfinidade() < 3) {
            System.out.println(Cores.VERMELHO + "Sofia não gosta de você" + Cores.RESET);
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