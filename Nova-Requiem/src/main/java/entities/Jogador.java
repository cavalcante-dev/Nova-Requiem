package main.java.entities;

import java.util.Random;
import main.java.util.Cores;

public class Jogador {

    private String nome;

    private int intelecto;
    private int intelectoBarra;

    private int coracao;
    private int coracaoBarra;

    public Jogador(){
    }

    public void definirArquetipo(int arquetipo) {

        this.intelectoBarra = 0;
        this.coracaoBarra = 0;

        if (arquetipo == 1) {
            this.intelecto = 1;
            this.coracao = 2;
        } else if (arquetipo == 2) {
            this.intelecto = 2;
            this.coracao = 1;
        }

    }

    // Metodo de Testes para definir sucessos e falhas - a abastração do conceito de rolar 2 dados de 6 lados

    public boolean rolarTeste(int atributo, int dt){

        //DT = Dificuldade do TESTE

        boolean resultado = false;
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int result = dado1 + dado2 + atributo;

        if (result >= dt) {

            System.out.println(Cores.VERDE + "\n[TESTE] - (" + dado1 + ", " + dado2 + ") + " + atributo + " - SUCESSO (" + result + ")" + Cores.RESET);
            resultado = true;

        } else if (result < dt) {

            System.out.println(Cores.VERMELHO + "\n[TESTE] - (" + dado1 + ", " + dado2 + ") + " + atributo + " - FALHA (" + result + ")" + Cores.RESET);
            resultado = false;

        }

        return resultado;

    }

    // Aumenta o atributo do personagem ao final do capitulo.
    public void uparAtributo() {
        if (this.coracaoBarra >= 2) {
            this.coracao++;
            this.coracaoBarra = 0;
        } else if (this.intelectoBarra >= 2) {
            this.intelecto++;
            this.intelectoBarra = 0;
        }
    }

    public int getIntelectoBarra() {
        return intelectoBarra;
    }

    public void setIntelectoBarra(int intelectoBarra) {
        this.intelectoBarra = intelectoBarra;
    }

    public int getCoracaoBarra() {
        return coracaoBarra;
    }

    public void setCoracaoBarra(int coracaoBarra) {
        this.coracaoBarra = coracaoBarra;
    }

    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
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
