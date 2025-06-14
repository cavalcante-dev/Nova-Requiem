package main.java.util;

import javax.sound.sampled.*;
import java.io.File;

public class Musica {

    private Clip clip;
    private AudioInputStream musica;
    
    public void trilhaSonora(int capitulo) {
        if (capitulo == 1) {
            try {
                musica = AudioSystem.getAudioInputStream(new File("Nova-Requiem\\Nova-Requiem\\src\\main\\java\\util\\musicas\\Instrument-of-Surrender-Sea-Power.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(musica);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
            } catch (Exception ex) {
                System.out.println("Erro ao executar SOM!");
                ex.printStackTrace();
            }
        }
        if (capitulo == 2) {
            try {
                musica = AudioSystem.getAudioInputStream(new File("Nova-Requiem\\Nova-Requiem\\src\\main\\java\\util\\musicas\\Ecstatic-Vibrations_-Totally-Transcendent-Sea-Power (1).wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(musica);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
            } catch (Exception ex) {
                System.out.println("Erro ao executar SOM!");
                ex.printStackTrace();
            }
        }
        if (capitulo == 3) {
            try {
                musica = AudioSystem.getAudioInputStream(new File("Nova-Requiem\\Nova-Requiem\\src\\main\\java\\util\\musicas\\Whirling-In-Rags-12-PM-Sea-Power (2).wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(musica);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
            } catch (Exception ex) {
                System.out.println("Erro ao executar SOM!");
                ex.printStackTrace();
            }
        }
    }

    public void rolarDado() {
        try {
            musica = AudioSystem.getAudioInputStream(new File("Nova-Requiem\\Nova-Requiem\\src\\main\\java\\util\\musicas\\Dice-Roll-Sound.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(musica);
            clip.setFramePosition(1800);
            clip.start();
            clip.loop(0);
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    public void parar() {
        this.clip.stop();
    }

}
