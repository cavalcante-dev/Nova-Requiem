package main.java.entities;

import java.util.Random;

public class Jogador {

    private String nome;
    private int intelecto;
    private int fisico;
    private int coracao;

    public Jogador(){
    }

    public void definirArquetipo(int arquetipo) {
        if (arquetipo == 1) {
            this.intelecto = 0;
            this.fisico = 2;
            this.coracao = 1;
        } else if (arquetipo == 2) {
            this.intelecto = 2;
            this.fisico = 0;
            this.coracao = 1;
        } else if (arquetipo == 3) {
            this.intelecto = 0;
            this.fisico = 1;
            this.coracao = 2;
        }

    }

    public boolean rolarAtributo(int atributo, int dt){

        //DT = Dificuldade do TESTE

        boolean resultado = false;
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int result = dado1 + dado2 + atributo;

        if (result >= dt) {
            System.out.println("[TESTE] - (" + dado1 + ", " + dado2 + ") + " + atributo + " - SUCESSO (" + result + ")");
            resultado = true;
        } else if (result < dt) {
            System.out.println("[TESTE] - (" + dado1 + ", " + dado2 + ") + " + atributo + " - FALHA (" + result + ")");
            resultado = false;
        }

        return resultado;

    }

    public int getintelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
