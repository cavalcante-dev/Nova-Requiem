package main.java;

import main.java.entities.Jogador;
import main.java.entities.NPC;
import main.java.entities.npcs.EsmeraldaLobos;
import main.java.entities.npcs.SofiaVentura;
import main.java.textos.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int resposta = 0;
        Jogador jogador = new Jogador();
        List<Capitulos> capitulos = new ArrayList<>();
        List<NPC> npcs = new ArrayList<>();
        Turnos turnos = new Turnos(jogador, npcs);
        Escolhas escolhas = new Escolhas(jogador, npcs);
        Finais finais = new Finais();
        Respostas resultados = new Respostas(jogador, escolhas, finais, npcs);

        // Instancia todos os npcs (personagens não jogaveis)

        npcs.add(new SofiaVentura("Sofia Ventura", 2, jogador));
        npcs.add(new EsmeraldaLobos("Emeralda Lobos", 0, jogador));

        // Instancia o capitulo e quantidade de turnos em cada.

        capitulos.add(new Capitulos(1, 4));
        capitulos.add(new Capitulos(2, 1));
        capitulos.add(new Capitulos(3, 1));
        capitulos.add(new Capitulos(4, 1));

        turnos.introducao();

        //Funcionamento principal de turnos e capitulos

        for (Capitulos capitulo : capitulos) {

            capitulo.inicioCapitulo();

            for (int t = 0; t < capitulo.getTurnosPorCapitulo(); t++) {

                escolhas.definirOpcoes(capitulo.getCapitulo(), t);
                turnos.narrar(capitulo.getCapitulo(), t);

                do {

                    escolhas.alternativas(capitulo.getCapitulo(), t);
                    resposta = resultados.validadeResposta(resposta);
                    resultados.responder(resposta, capitulo.getCapitulo(), t);

                    resposta = 0;

                } while (!resultados.isFimTurno());

                resultados.setFimTurno(false);
                jogador.uparAtributo();
                escolhas.limparOpcoes();

            }

            capitulo.finalCapitulo();

        }

        finais.narrarFinal();

    }
}