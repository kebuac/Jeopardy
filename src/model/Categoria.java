package model;
import java.util.ArrayList;


public class Categoria {
    private String tema;
    private ArrayList<Pregunta> preguntas;

    public Categoria(String tema, ArrayList<Pregunta> preguntas) {
        this.tema = tema;
        this.preguntas = preguntas;
    }   

    public String getTema() {
        return tema;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
}
