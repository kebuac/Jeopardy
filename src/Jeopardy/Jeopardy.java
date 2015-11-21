package Jeopardy;

import auxiliar.OperacionesFicheros;
import controller.JeopardyController;
import java.io.IOException;
import java.util.ArrayList;
import model.Pregunta;
import view.JeopardyView;

public class Jeopardy {
    
    private static final String FILENAME1 = "Peliculas.dat";
    private static final String FILENAME2 = "Videojuegos.dat";
    private static final String FILENAME3 = "preguntasBolivia.dat";
    private static final String FILENAME4 = "preguntasGeografia.dat";
    private static final String FILENAME5 = "preguntasHistoria.dat";
    private static final String FILENAME6 = "preguntasMatematicas.dat";
    
    
    public static void main(String[] args) {
        
        try{
            ArrayList<Pregunta>  modelo = null;
            modelo = OperacionesFicheros.readFileCategoria(FILENAME1, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME2, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME3, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME4, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME5, modelo);
            modelo = OperacionesFicheros.readFileCategoria(FILENAME6, modelo);
            /*
            for (int i = 0; i < modelo.size(); i++)
            {
                System.out.println(modelo.get(i).getCategoria());
                System.out.println(modelo.get(i).getTextoPregunta());
                System.out.println(modelo.get(i).getValorPregunta());
                for (int j = 0; j < modelo.get(i).getRespuestas().size(); j++)
                {
                    System.out.println(modelo.get(i).getRespuestas().get(j).getTexto());
                    System.out.println(modelo.get(i).getRespuestas().get(j).getValor());
                }
            }*/
                    
            JeopardyView view = new JeopardyView(modelo);
           
           
            JeopardyController controller = new JeopardyController(modelo, view);
        } catch (IOException ex) {
            System.out.println("Fin del programa por no poder acceder a datos fuente");
        } catch (NumberFormatException ex) {
            System.out.println("Fin del programa por error de formato en datos fuente");
        }
    }
    
}
