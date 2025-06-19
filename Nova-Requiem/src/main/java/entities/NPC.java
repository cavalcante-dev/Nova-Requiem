package main.java.entities;

public class NPC {

    private String nome;
    private int afinidade;
    private final Jogador jogadorUtilitarios;
    private boolean cuplado;

    public NPC(String nome, int afinidade, Jogador jogadorUtilitarios) {
        this.nome = nome;
        this.afinidade = afinidade;
        this.jogadorUtilitarios = jogadorUtilitarios;
        this.cuplado = false;
    }

    public boolean isCuplado() {
        return cuplado;
    }

    public void setCuplado(boolean cuplado) {
        this.cuplado = cuplado;
    }

    public Jogador getJogadorUtilitarios() {
        return jogadorUtilitarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAfinidade() {
        return afinidade;
    }

    public void setAfinidade(int afinidade) {
        this.afinidade = afinidade;
    }

}
