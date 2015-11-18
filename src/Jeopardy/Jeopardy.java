package Jeopardy;

import auxiliar.OperacionesFicheros;
import controller.JeopardyController;
import java.io.IOException;
import java.util.ArrayList;
import model.Pregunta;
import view.JeopardyView;


public class Jeopardy {
    
    private static final String FILENAME1 = "Peliculas.txt";
    private static final String FILENAME2 = "Videojuegos.txt";
    private static final String FILENAME3 = "preguntasBolivia.dat";
    private static final String FILENAME4 = "preguntasGeografia.dat";
    private static final String FILENAME5 = "preguntasHistoria.dat";
    private static final String FILENAME6 = "preguntasMatematicas.dat";
    private static final String FILENAME7 = "preguntasQuimica.dat";
    
    public static void main(String[] args) {
        
        try{
            ArrayList<Pregunta>  modelo = null;
            modelo = OperacionesFicheros.readFileCategoria(FILENAME1, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME2, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME3, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME4, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME5, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME6, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME7, modelo);
            JeopardyView view = new JeopardyView(modelo);
            JeopardyController controller = new JeopardyController(modelo, view);
        } catch (IOException ex) {
            System.out.println("Fin del programa por no poder acceder a datos fuente");
        } catch (NumberFormatException ex) {
            System.out.println("Fin del programa por error de formato en datos fuente");
        }
    }
    
}
