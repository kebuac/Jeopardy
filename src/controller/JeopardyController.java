package controller;

import model.Pregunta;
import java.util.ArrayList;
import view.JeopardyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import view.JeopardyPanel;

public class JeopardyController implements ActionListener{
    private ArrayList<Pregunta> modelo;
    private JeopardyView vista;
     
    public JeopardyController(ArrayList<Pregunta> modelo, JeopardyView vista)
    {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Recorrer array para asignar cosas a cada posicion
        for (JButton boton : vista.getBotonesView()){
            if (boton == ae.getSource()){
                  System.out.println("asdasd");
            }}
        //Si posicion es igual a X puntuacion crear nueva Frame donde aparecera la pregunta
        //Si respuesta es correcta actualizar puntuacion jugador y pasar turno
        //Si respuesta es incorrecta actualizar puntuacion jugador y pasa turno
    }

}
