package chat;

import java.applet.*;
import java.net.URL;
import javax.swing.*;

public class ExecutarAudio extends JFrame{
    JButton btnTocar = new JButton();
    
    public ExecutarAudio(){
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/bate-papo.png")).getImage());
        btnTocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toWave.gif")));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(392, 312);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setAlwaysOnTop(true);
        Boolean pausar = true;
        add(btnTocar);

        btnTocar.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                play("/sounds/213284__aderumoro__hello-2-female-friendly");
            }
        });
    }
    
    public void play(String nomeDoAudio){
        URL url = getClass().getResource(nomeDoAudio+".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
}
