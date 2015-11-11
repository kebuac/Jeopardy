package auxiliar;

import model.Categoria;
import java.util.ArrayList;
import model.Pregunta;
import model.Respuesta;

public class OperacionesFicheros {
    
    public static ArrayList<Categoria> readFileCategoria()
    {
        ArrayList<Categoria> auxCategorias = new ArrayList<>();
        
        return auxCategorias;
    }  
    
    public static ArrayList<Pregunta> readFilePregunta()
    {
        ArrayList<Pregunta> auxPreguntas = new ArrayList<>();
        
        return auxPreguntas;
    }
    public static ArrayList<Respuesta> readFileRespuesta()
    {
        ArrayList<Respuesta> auxRespuestas = new ArrayList<>();
        
        return auxRespuestas;
    }
    
    public static void writeFileCategoria(ArrayList<Categoria> categorias, ArrayList<Pregunta> preguntas, ArrayList<Respuesta> respuestas)
    {
        
    }
    
    public static void readAllFiles()
    {
        readFileCategoria();
        readFilePregunta();
        readFileRespuesta();
    }
    public static void writeAllFiles()
    {
        
    }
}
