package controller;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import model.Pregunta;
import view.Emergente;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import model.RespuestaIncorrectaException;
import javax.swing.ImageIcon;

public class EmergenteController implements ActionListener {

    private Pregunta modelo;
    private Emergente vista;
    private JeopardyController jeopardyController;
    
    public EmergenteController (Pregunta modelo, Emergente vista, JeopardyController jeopardyController)
    {
        this.modelo = modelo;
        this.vista = vista;
        this.jeopardyController = jeopardyController;
        this.vista.addListeners(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() != vista.getOrderButton()) {
             
            for (int i = 0; i < 4; i++) {
                
                if (vista.getOrderButton().getText().equalsIgnoreCase(modelo.getRespuestas().get(i).getTexto())) {

                    String aux;
                    aux = modelo.getRespuestas().get(i).getValor();
                    
                    if (aux.equals("Y")) {
                        JFrame ventanaCorrecta;
                        JLabel respuestaCorrecta;
                        ventanaCorrecta = new JFrame();
                        ventanaCorrecta.setLayout(new BorderLayout());
                        ventanaCorrecta.setLocation(750,400);
                        ventanaCorrecta.setPreferredSize(new Dimension(300, 200));
                        
                        ImageIcon iconoCorrecto = new ImageIcon("smile.png");

                        respuestaCorrecta = new JLabel("Respuesta correcta" ,iconoCorrecto, JLabel.CENTER);
                        respuestaCorrecta.setFont(new Font("BOLD", 0, 20));
                        respuestaCorrecta.setHorizontalAlignment(SwingConstants.CENTER);
                        ventanaCorrecta.add(respuestaCorrecta, BorderLayout.CENTER);
                        ventanaCorrecta.pack();
                        ventanaCorrecta.setVisible(true);
                        
                        
                    }else{
                        try {
                          throw new RespuestaIncorrectaException("Respuesta incorrecta");
                        } catch (RespuestaIncorrectaException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            }
            
            this.vista.dispatchEvent(new WindowEvent(vista, WindowEvent.WINDOW_CLOSING));
         }
            
    }
    
}
