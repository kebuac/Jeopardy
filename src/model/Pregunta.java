package model;

import java.util.ArrayList;

public class Pregunta {

    private String textoPregunta;
    private int valorPregunta;
    private ArrayList<Respuesta> respuestas;

    public Pregunta(String textoPregunta, int valorPregunta, ArrayList<Respuesta> respuestas) {
        this.textoPregunta = textoPregunta;
        this.valorPregunta = valorPregunta;
        this.respuestas = respuestas;
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

    public void setValorPregunta(int valorPregunta) {
        this.valorPregunta = valorPregunta;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

}
