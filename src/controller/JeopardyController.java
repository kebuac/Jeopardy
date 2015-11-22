package controller;

import model.Pregunta;
import java.util.ArrayList;
import view.JeopardyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import view.Emergente;

public class JeopardyController implements ActionListener{
    private ArrayList<Pregunta> modelo;
    private JeopardyView vista;
   
    private Pregunta modeloPregunta;
    
    public JeopardyController(ArrayList<Pregunta> modelo, JeopardyView vista)
    {
        this.modelo = modelo;
        this.vista = vista;
       
        
        this.vista.addListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        int[] posicionesCategoria1 = {0,6,12,18,24};
        int[] posicionesCategoria2 = {1,7,13,19,25};
        int[] posicionesCategoria3 = {2,8,14,20,26};
        int[] posicionesCategoria4 = {3,9,15,21,27};
        int[] posicionesCategoria5 = {4,10,16,22,28};
        int[] posicionesCategoria6 = {5,11,17,23,29};
        
        JButton[] botones = vista.getBotonesView();
        //Recorrer array para asignar cosas a cada posicion
        int categoriaSeleccionada=0;
        int puntuacionSeleccionada=0;
        for (int i=0; i<botones.length;i++){
            if (botones[i]==ae.getSource()){
                puntuacionSeleccionada = Integer.parseInt(botones[i].getText().substring(0, botones[i].getText().length()-1));
                if (containsElementInArray(i,posicionesCategoria1)){
                    categoriaSeleccionada=0;
                }else if (containsElementInArray(i, posicionesCategoria2))
                {
                    categoriaSeleccionada = 5;

                }else if (containsElementInArray(i, posicionesCategoria3))
                {
                    categoriaSeleccionada = 10;
                   
                }else if (containsElementInArray(i, posicionesCategoria4))
                {
                    categoriaSeleccionada = 15;
                     
                }else if (containsElementInArray(i, posicionesCategoria5))
                {
                    categoriaSeleccionada = 20;
                   
                }else if (containsElementInArray(i, posicionesCategoria6))
                {
                    categoriaSeleccionada = 25;
                     
                }
                botones[i].setEnabled(false);
            break;}
            
        //Si respuesta es correcta actualizar puntuacion jugador y pasar turno
        //Si respuesta es incorrecta actualizar puntuacion jugador y pasa turno
        }
        int posicion = categoriaSeleccionada + (int)(puntuacionSeleccionada/100) -1;
        modeloPregunta = this.modelo.get(posicion);
        Emergente viewPregunta = new Emergente(modeloPregunta);
        EmergenteController controllerPregunta = new EmergenteController(modeloPregunta, viewPregunta, this);
         
        viewPregunta.setLocation(700,350);
        viewPregunta.pack();
        viewPregunta.setVisible(true);
            
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

    public void setPuntacion (int puntuacion){
        System.out.println("JeopardyController leyendo nueva puntuacion "+puntuacion);
    }
}
