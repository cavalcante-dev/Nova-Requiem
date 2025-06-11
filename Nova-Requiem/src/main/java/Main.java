package main.java;

import main.java.entities.Jogador;
import main.java.systems.Capitulos;
import main.java.systems.Escolhas;
import main.java.systems.Respostas;
import main.java.systems.Texto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arquetipo = 0;
        int resposta = 0;
        Texto texto = new Texto();
        List<Capitulos> capitulos = new ArrayList<>();
        Jogador jogador = new Jogador();
        Escolhas escolhas = new Escolhas(jogador);
        Respostas respostas = new Respostas(jogador, escolhas);

        // Número de capitulos ainda a ser decidido - valores de exemplo.
        capitulos.add(new Capitulos(1, 5));
        capitulos.add(new Capitulos(2, 4));
        capitulos.add(new Capitulos(3, 6));
        capitulos.add(new Capitulos(4, 7));

        texto.introducao();

        //Definição de atributos do personagem baseado em arquetipos pré definidos
        arquetipo = sc.nextInt();
        jogador.definirArquetipo(arquetipo);

        texto.narrar(1, 1);

        //Definição do nome do personagem que irá permanecer por toda a execução do programa
        String nome = sc.next();
        jogador.setNome(nome);

        /*
            Testar laço for - Transformar os Capitulo em uma Classe com Turno:

            for(Capitulo capitulo : capitulos) {
                for(int t = 0; t < capitulo.getTurnosPorCapitulo; t++) {

                    escolhas.definirOpcoes(capitulo.getCapitulo, t);
                    
                    texto.narrar(capitulo.getCapitlo, t); 

                    escolhas.alternativas();
                    resposta = sc.nextInt();
                    respostas.responder(resposta);

                    escolhas.limparOpcoes();

                }
            }

        */

        escolhas.definirOpcoes(1, 1);
        do {

            escolhas.alternativas(1, 1);
            resposta = sc.nextInt();
            respostas.responder(1, 1, resposta);

        } while (resposta != 100);
        escolhas.limparOpcoes();

        /*

        > verificar possibilidade de variavel resposta => array para evitar repetição do processo (Try - Catch).

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