package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Pregunta;
import view.Emergente;
import java.util.ArrayList;


public class EmergenteController implements ActionListener{

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
        if (ae.getSource() == vista.getOrderButton())
        {
            
        }
        
        
    }
    
}
