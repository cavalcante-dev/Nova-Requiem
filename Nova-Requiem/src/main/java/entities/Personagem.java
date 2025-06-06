package main.java.entities;

public class Personagem {
    private String nome;
    private int afinidade;
    private boolean status;

    public Personagem(String nome, int afinidade) {
        this.nome = nome;
        this.afinidade = afinidade;
        this.status = true;
    } 

    public void morrer(Personagem personagem) {
        personagem.setStatus(false);
        
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
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
