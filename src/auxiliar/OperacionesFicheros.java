package auxiliar;

import java.util.ArrayList;
import model.Pregunta;
import model.Respuesta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class OperacionesFicheros {
    
    public static ArrayList<Pregunta> readFileCategoria(String filename, ArrayList<Pregunta> auxPreguntas)throws IOException, NumberFormatException
    {
        
            if (auxPreguntas == null)
            {
                auxPreguntas = new ArrayList<>();
            }
            
            BufferedReader br = null;
            try {
            br = Files.newBufferedReader(Paths.get(filename), java.nio.charset.StandardCharsets.UTF_8);
            
            String linea = br.readLine();
            
            while (linea != null) {
                String[] str = linea.split(";");
                ArrayList<Respuesta> auxRespuestas = new ArrayList<>();
                Respuesta respuesta;
                respuesta = new Respuesta(str[3], str[4]);
                auxRespuestas.add(respuesta);
                respuesta = new Respuesta(str[5], str[6]);
                auxRespuestas.add(respuesta);
                respuesta = new Respuesta(str[7], str[8]);
                auxRespuestas.add(respuesta);
                respuesta = new Respuesta(str[9], str[10]);
                auxRespuestas.add(respuesta);
                Pregunta pregunta = new Pregunta(str[0], str[2], Integer.parseInt(str[1]), auxRespuestas);
                auxPreguntas.add(pregunta);
                linea = br.readLine();
            }
            
        } catch (IOException|NumberFormatException ex) {
            System.out.println("Error: no se ha podido leer el archivo: " +ex.getMessage());
            System.exit(0);
        } finally {
               try{
                   if (br!= null)
                   {
                       br.close();
                   }
               }catch (IOException ex)
               {
                   System.out.println("Error: no se ha podido cerrar el BufferedReader " +ex.getMessage());
               }
            }
        return auxPreguntas;
    }
    public static void writeFile(Path path)
    {
        BufferedWriter escribir = null;
        
        try {
            escribir = Files.newBufferedWriter(path, java.nio.charset.StandardCharsets.UTF_8, java.nio.file.StandardOpenOption.WRITE);
           
            escribir.write("HOLAAAAAAAAAA");
            escribir.newLine();
            
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo: " + ex.getMessage());
        } finally {
            try {
                if (escribir != null) {
                    escribir.close();
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el BufferedWriter: " + ex.getMessage());
            }
        }
    }
}
