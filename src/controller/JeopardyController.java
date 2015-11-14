package controller;

import model.Pregunta;
import java.util.ArrayList;
import view.JeopardyView;

public class JeopardyController {
    private ArrayList<Pregunta> modelo;
    private JeopardyView vista;
    
    public JeopardyController(ArrayList<Pregunta> modelo, JeopardyView vista)
    {
        this.modelo = modelo;
        this.vista = vista;
    }
}
