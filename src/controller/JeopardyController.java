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
        
        int[] posicionesCategoria1 = {0,6,12,18,24};
        
        JButton[] botones = vista.getBotonesView();
        //Recorrer array para asignar cosas a cada posicion
        int categoriaSeleccionada=0;
        int puntuacionSeleccionada=0;
        for (int i=0; i<botones.length;i++){
            if (botones[i]==ae.getSource()){
                puntuacionSeleccionada = Integer.parseInt(botones[i].getText().substring(0, botones[i].getText().length()-1));
                if (containsElementInArray(i,posicionesCategoria1)){
                    categoriaSeleccionada=0;
                }
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
    
    private boolean containsElementInArray(int value, int[] array)
    {
        boolean aux = false;
        
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] == value){
                aux = true;
                break;
            }
        }
        return aux;
    }

}
