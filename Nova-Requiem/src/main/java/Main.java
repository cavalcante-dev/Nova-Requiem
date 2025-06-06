package main.java;

import main.java.systems.Atributos;

public class Main {
    public static void main(String[] args) {

        boolean resultado = false;
        Atributos atributos = new Atributos(1, 1, 1);

        resultado = atributos.rolarAtributo(atributos.getCoracao(), 8);
        resultado = atributos.rolarAtributo(atributos.getMente(), 4);
        resultado = atributos.rolarAtributo(atributos.getFisico(), 12);

    }
}