package main.java.util;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Musica {

    public void AudioAcerto() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/main/java/util/musicas/Instrument-of-Surrender-Sea-Power.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY); //Para repetir o som.
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

}
