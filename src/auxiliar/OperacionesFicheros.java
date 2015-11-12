package auxiliar;

import model.Categoria;
import java.util.ArrayList;
import model.Pregunta;
import model.Respuesta;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OperacionesFicheros {
    
    private static final String FILENAME1 = "Peliculas.txt";
    private static final String FILENAME2 = "Series.txt";
    private static final String FILENAME3 = "Videojuegos.txt";
    
    public static ArrayList<Categoria> readFileCategoria()throws IOException, NumberFormatException
    {
        ArrayList<Categoria> auxCategorias = new ArrayList<>();
        BufferedReader br1, br2, br3;
        
        br1 = Files.newBufferedReader(Paths.get(FILENAME1), java.nio.charset.StandardCharsets.UTF_8);
        
        String linea = br1.readLine();

        while (linea != null) {
            String[] str = linea.split(";");
            
        }
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
