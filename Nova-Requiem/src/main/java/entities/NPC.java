package main.java.entities;

public class NPC {

    
    private final Jogador jogadorUtilitarios;
    
    private String nome;
    private int afinidade;
    private boolean culpado;

    public NPC(String nome, int afinidade, Jogador jogadorUtilitarios) {
        this.nome = nome;
        this.afinidade = afinidade;
        this.jogadorUtilitarios = jogadorUtilitarios;
        this.culpado = false;
    }

    public boolean isCulpado() {
        return culpado;
    }

    public void setCulpado(boolean culpado) {
        this.culpado = culpado;
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
