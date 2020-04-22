package chat;

import java.applet.*;
import java.net.URL;
import javax.swing.*;

public class ExecutarAudio extends JFrame{
   
    public ExecutarAudio(){
        JButton btnTocar = new JButton();
        add(btnTocar);
        
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/bate-papo.png")).getImage());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(392, 312);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setAlwaysOnTop(true);
    
        btnTocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toWave.gif")));
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
