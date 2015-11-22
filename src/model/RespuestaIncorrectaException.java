package model;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RespuestaIncorrectaException extends Exception{
    
    public RespuestaIncorrectaException(String mensaje)
    {
        super(mensaje);
        
        JFrame ventanaIncorrecta;
        JLabel respuestaIncorrecta;
        ventanaIncorrecta = new JFrame();
        ventanaIncorrecta.setLayout(new BorderLayout());
        ventanaIncorrecta.setLocation(750,400);
        ventanaIncorrecta.setPreferredSize(new Dimension(300, 200));
                    
        
        ImageIcon iconoIncorrecto = new ImageIcon("sad.png");
        
        respuestaIncorrecta = new JLabel("Respuesta incorrecta", iconoIncorrecto, JLabel.CENTER);
        respuestaIncorrecta.setFont(new Font("BOLD", 0, 20));
        respuestaIncorrecta.setHorizontalAlignment(SwingConstants.CENTER);
        ventanaIncorrecta.add(respuestaIncorrecta, BorderLayout.CENTER);
        ventanaIncorrecta.pack();
        ventanaIncorrecta.setVisible(true);
    }
}
