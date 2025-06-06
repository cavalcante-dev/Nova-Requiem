package main.java;

import main.java.systems.Atributos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean resultado = false;
        int arquetipo = 0;
        Atributos atributos = new Atributos();

        System.out.print("""
                ----------------------------------------------------------------------------------
               
                                                    NOVA REQUIEM
               
                ----------------------------------------------------------------------------------
              
                Acorde.
                
                O mundo é um borrão de néon e dor de cabeça. Restam ecos: um distintivo enferrujado,
                um passado nebuloso e o caso que não espera. Traga a ordem.
                
                Reconstrua-se.
                
                Escolha as vozes na sua cabeça: o Detetive Lógico ou o Vício Brutal? O Empatia que
                sangra ou a Retórica cortante? Cada habilidade molda seu olhar sobre a cidade podre 
                e suas mentiras.
                
                Quando as luzes neon se apagam na noite, quem olha de volta no espelho?  
                
                Defina seu caminho. Escolha quem você é.
              
                ----------------------------------------------------------------------------------   
              
                Atributos:
                Fisico - Sua musculatura, o quão forte você é. Emponha sua vontade através da força.
                Coração - Sua empatia, o quão emocionalmente inteligente você é. Entenda as pessoas e a si mesmo.
                Intelecto - Sua mente, o quão esperto você é. Racionalize o mundo e entenda seus padrões.
               
                > Evoluem a cada 2 testes bem sucedidos com o atributo. 
                
                1. O BRUTAMONTES        2. O INTELECTUAL        3. O SENSITIVO 
                Fisico - 2              Fisico - 0              Fisico - 1    
                Coração - 1             Coração - 1             Coração - 2    
                Intelecto - 0           Intelecto - 2           Intelecto - 0
               
                > ESCOLHA SEU ARQUEITIPO DE PERSONAGEM:\s""");

        arquetipo = sc.nextInt();
        atributos.definirArquetipo(arquetipo);

    }
}