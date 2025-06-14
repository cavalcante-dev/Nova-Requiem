package main.java;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.EsmeraldaLobos;
import main.java.entities.npcs.SofiaVentura;
import main.java.textos.*;
import main.java.util.Musica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int resposta = 0;
        Turnos turnos = new Turnos();
        List<Capitulos> capitulos = new ArrayList<>();
        Jogador jogador = new Jogador();
        List<NPC> npcs = new ArrayList<>();
        Escolhas escolhas = new Escolhas(jogador, npcs);
        Finais finais = new Finais();
        Respostas resultados = new Respostas(jogador, escolhas, finais, npcs);

        // Instancia todos os npcs

        npcs.add(new SofiaVentura("Sofia Ventura", 3));
        npcs.add(new EsmeraldaLobos("Emeralda Lobos", 0));

        // Número de capitulos ainda a ser decidido - valores de exemplo.

        capitulos.add(new Capitulos(1, 1));
        capitulos.add(new Capitulos(2, 1));
        capitulos.add(new Capitulos(3, 1));

        turnos.introducao(jogador);

        //Funcionamento principal de turnos e capitulos

        for (Capitulos capitulo : capitulos) {

            for (int t = 0; t < capitulo.getTurnosPorCapitulo(); t++) {

                escolhas.definirOpcoes(capitulo.getCapitulo(), t);
                do {

                    turnos.narrar(capitulo.getCapitulo(), t);

                    escolhas.alternativas(capitulo.getCapitulo(), t);
                    resposta = resultados.validadeResposta(resposta);
                    resultados.responder(resposta, capitulo.getCapitulo(), t);

                    resposta = 0;

                } while (!resultados.isFimTurno());

                resultados.setFimTurno(false);
                escolhas.limparOpcoes();

            }

            capitulo.finalCapitulo();

        }

        finais.narrarFinal();
        finais.finalSofia(npcs.get(0));

    }
}