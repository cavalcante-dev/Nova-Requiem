package main.java;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.EsmeraldaLobos;
import main.java.entities.npcs.SofiaVentura;
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
        List<NPC> npcs = new ArrayList<>();
        Escolhas escolhas = new Escolhas(jogador, npcs);
        Finais finais = new Finais();
        Respostas respostas = new Respostas(jogador, escolhas, finais, npcs);

        // Instancia todos os npcs

        npcs.add(new SofiaVentura("Sofia Ventura", 2));
        npcs.add(new EsmeraldaLobos("Emeralda Lobos", 0));

        // Número de capitulos ainda a ser decidido - valores de exemplo.

        capitulos.add(new Capitulos(1, 1));
        capitulos.add(new Capitulos(2, 1));
        capitulos.add(new Capitulos(3, 1));

        //Definição de atributos do personagem baseado em arquetipos pré-definidos

        turnos.introducao();
        arquetipo = sc.nextInt();
        jogador.definirArquetipo(arquetipo);

        //Definição do nome do personagem que irá permanecer por toda a execução do programa

        turnos.narrar(0, 0);
        String nome = sc.next();
        jogador.setNome(nome);

        //Funcionamento principal de turnos e capitulos

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

        }

        finais.narrarFinal();

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