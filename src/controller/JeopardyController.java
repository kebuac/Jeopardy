package controller;

import model.Pregunta;
import java.util.ArrayList;
import view.JeopardyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;

public class JeopardyController implements ActionListener{
    private ArrayList<Pregunta> modelo;
    private JeopardyView vista;
     
    public JeopardyController(ArrayList<Pregunta> modelo, JeopardyView vista)
    {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.addListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String[] posicionesCategoria1 = {"0","1","2","3","4","5"};
        
        JButton[] botones = vista.getBotonesView();
        //Recorrer array para asignar cosas a cada posicion
        int categoriaSeleccionada=0;
        int puntuacionSeleccionada=0;
        for (int i=0; i<botones.length;i++){
            if (botones[i]==ae.getSource()){
                /*puntuacionSeleccionada = Integer.parseInt(botones[i].getText());
                if (containsElementInArray(i,posicionesCategoria1)){
                    categoriaSeleccionada=1;
                }else if ()*/
                botones[i].setEnabled(false);
                //Si posicion es igual a X puntuacion crear nueva Frame donde aparecera la pregunta
                
                JFrame ventanaNueva = new JFrame();
                
                ventanaNueva.setPreferredSize(new Dimension(400, 400));
                ventanaNueva.pack();
                ventanaNueva.setVisible(true);
            }
        }
        
        //Si respuesta es correcta actualizar puntuacion jugador y pasar turno
        //Si respuesta es incorrecta actualizar puntuacion jugador y pasa turno
    }

}
