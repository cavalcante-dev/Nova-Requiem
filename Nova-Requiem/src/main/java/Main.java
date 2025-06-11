package main.java;

import main.java.entities.Jogador;
import main.java.systems.Escolhas;
import main.java.systems.Respostas;
import main.java.systems.Texto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arquetipo = 0;
        int resposta = 0;
        int turno = 0;
        int capitulo = 0;
        Texto texto = new Texto(1, 1);
        Jogador jogador = new Jogador();
        Escolhas escolhas = new Escolhas(1, 1, jogador);
        Respostas respostas = new Respostas(1, 1, jogador, escolhas);

        texto.tutorial();

        arquetipo = sc.nextInt();
        jogador.definirArquetipo(arquetipo);

        texto.narrar();
        String nome = sc.next();
        jogador.setNome(nome);

        System.out.println("\n" + jogador.getNome() + " ... esse é seu nome. Pelo menos disso você se lembra.");

        escolhas.definirOpcoes();
        do {

            escolhas.alternativas();
            resposta = sc.nextInt();
            respostas.responder(resposta);

            // verificar possibilidade de variavel resposta => array para evitar repetição do processo (Try - Catch).

        } while (!(resposta == 1 || resposta == 2));
        escolhas.limparOpcoes();

        texto.setTurno(turno++);

        System.out.println("FIM DO CAPITULO 1");

        texto.setCapitulo(capitulo++);

        /*

        Array [1, 2, 3, 4]
        > escolha 1

        try
        if (resposta == array [0]) {
            Bla bla bla bla
            array [0] = 0;
        }
        catch () {
            "Opção indisponivel"
        }

         */

    }
}