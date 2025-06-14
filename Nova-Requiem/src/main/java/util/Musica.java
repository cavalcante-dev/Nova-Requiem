package main.java.util;

import javax.sound.sampled.*;
import java.io.File;

public class Musica {

    private Clip clip;
    private AudioInputStream musica;
    
    public void musicaCapitulo1() {
        try {
            musica = AudioSystem.getAudioInputStream(new File("src/main/java/util/musicas/Instrument-of-Surrender-Sea-Power.wav").getAbsoluteFile());
            this.clip = AudioSystem.getClip();
            this.clip.open(musica);
            this.clip.start();
            this.clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    public void musicaCapitulo2() {
        try {
            musica = AudioSystem.getAudioInputStream(new File("src/main/java/util/musicas/Ecstatic-Vibrations_-Totally-Transcendent-Sea-Power (1).wav").getAbsoluteFile());
            this.clip = AudioSystem.getClip();
            this.clip.open(musica);
            this.clip.start();
            this.clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    public void musicaCapitulo3() {
        try {
            musica = AudioSystem.getAudioInputStream(new File("src/main/java/util/musicas/Whirling-In-Rags-12-PM-Sea-Power (2).wav").getAbsoluteFile());
            this.clip = AudioSystem.getClip();
            this.clip.open(musica);
            this.clip.start();
            this.clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }
    
    public void parar() {
        this.clip.stop();
    }

}
