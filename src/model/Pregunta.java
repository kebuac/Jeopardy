package model;

import java.util.ArrayList;

public class Pregunta {

    private String categoria;
    private String textoPregunta;
    private int valorPregunta;
    private ArrayList<Respuesta> respuestas;

    public Pregunta(String categoria, String textoPregunta, int valorPregunta, ArrayList<Respuesta> respuestas) {
        this.categoria = categoria;
        this.textoPregunta = textoPregunta;
        this.valorPregunta = valorPregunta;
        this.respuestas = respuestas;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public String getTextoPregunta() {
        return textoPregunta;
    }

    public int getValorPregunta() {
        return valorPregunta;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }
}
