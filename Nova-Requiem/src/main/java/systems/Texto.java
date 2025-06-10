package main.java.systems;

public class Texto {

    protected int turno;
    protected int capitulo;
    private int finalBom;
    private int finalRuim;

    public Texto(int turno, int capitulo) {
        this.turno = turno;
        this.capitulo = capitulo;
        this.finalBom = 0;
        this.finalRuim = 0;
    }

    public void tutorial() {

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

    }

    public void narrar() {

        if (capitulo == 1) {

            if (turno == 1) {
                System.out.print("""
                        \n============== CAPITULO 1 - LUZES NEON E ASSASSINATO =============
                        
                        A imensidão do nada. Escuridão. Esquecimento. Profundo e indefinido.
                        
                        Tudo parece distante e você se sente afogado em uma dor de cabeça terrível.
                        
                        O som distante de um ventilador velho de teto te trás de volta a realidade, a dor
                        de cabeça parece ter ficado mais forte. Você abre os olhos e tudo está aonde deveria
                        estar, exceto por você.
                        ...
                        ...
                        
                        Quem é você... Você se lembra do seu nome?\s""");
            }

        } else if (capitulo == 2) {

            if (turno == 1) {

            }

        } else if (capitulo == 3) {

            if (turno == 1) {

            }

        } else if (capitulo == 4) {

            if (turno == 1) {

            }

        }

    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public void setFinalBom(int finalBom) {
        this.finalBom = finalBom;
    }

    public int getFinalBom() {
        return finalBom;
    }

    public void setFinalRuim(int finalRuim) {
        this.finalRuim = finalRuim;
    }

    public int getFinalRuim() {
        return finalRuim;
    }


}
