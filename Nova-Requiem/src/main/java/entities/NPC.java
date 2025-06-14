package main.java.entities;

public class NPC {

    private String nome;
    private int afinidade;

    public NPC(String nome, int afinidade) {
        this.nome = nome;
        this.afinidade = afinidade;
    }

    /* 
    
    if (status) {
        System.out.println(personagem.getNome() + " está vivo e pode agir!");
    } else {
        System.out.println(personagem.getNome() + " está morto. Nada será feito.");
    }

    */

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
