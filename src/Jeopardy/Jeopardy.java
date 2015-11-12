package Jeopardy;

import auxiliar.OperacionesFicheros;
import java.io.IOException;
import java.util.ArrayList;
import model.Pregunta;


public class Jeopardy {
    
    private static final String FILENAME1 = "Peliculas.txt";
    private static final String FILENAME2 = "Videojuegos.txt";
    

    public static void main(String[] args) {
        
        try{
            ArrayList<Pregunta>  model = null;
            model= OperacionesFicheros.readFileCategoria(FILENAME1, model);
            model = OperacionesFicheros.readFileCategoria(FILENAME2, model);
        } catch (IOException ex) {
            System.out.println("Fin del programa por no poder acceder a datos fuente");
        } catch (NumberFormatException ex) {
            System.out.println("Fin del programa por error de formato en datos fuente");
        }
    }
    
}
