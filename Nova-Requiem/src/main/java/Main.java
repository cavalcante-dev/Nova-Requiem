package main.java;

import main.java.entities.Jogador;
import main.java.textos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arquetipo = 0;
        int resposta = 0;
        Turnos turnos = new Turnos();
        List<Capitulos> capitulos = new ArrayList<>();
        Jogador jogador = new Jogador();
        Escolhas escolhas = new Escolhas(jogador);
        Finais finais = new Finais();
        Respostas respostas = new Respostas(jogador, escolhas, finais);

        // Número de capitulos ainda a ser decidido - valores de exemplo.
        capitulos.add(new Capitulos(1, 1));
        capitulos.add(new Capitulos(2, 1));
        capitulos.add(new Capitulos(3, 1));
        capitulos.add(new Capitulos(4, 1));

        turnos.introducao();

        //Definição de atributos do personagem baseado em arquetipos pré-definidos
        arquetipo = sc.nextInt();
        jogador.definirArquetipo(arquetipo);

        turnos.narrar(0, 0);

        //Definição do nome do personagem que irá permanecer por toda a execução do programa
        String nome = sc.next();
        jogador.setNome(nome);

        //Testar laço for - Transformar os Capítulos em uma Classe com Turno:

        for (Capitulos capitulo : capitulos) {

            for (int t = 0; t < capitulo.getTurnosPorCapitulo(); t++) {

                escolhas.definirOpcoes(capitulo.getCapitulo(), t);
                do {

                    turnos.narrar(capitulo.getCapitulo(), t);

                    escolhas.alternativas(capitulo.getCapitulo(), t);
                    resposta = sc.nextInt();
                    respostas.responder(resposta, capitulo.getCapitulo(), t);

                } while (!respostas.isFimTurno());

                escolhas.limparOpcoes();

            }

            respostas.setFimTurno(false);

            capitulo.finalCapitulo();
            if (capitulo.getCapitulo() == 4) {
                finais.narrarFinal();
            }

        }

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