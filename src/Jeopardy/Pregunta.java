package Jeopardy;
import java.util.ArrayList;

public class Pregunta extends Categoria{
    private String texto;
    private int valor;
    private ArrayList<Respuesta> respuestas;

    public Pregunta(String texto, int valor, ArrayList<Respuesta> respuestas) {        
        this.texto = texto;
        this.valor = valor;
        this.respuestas = respuestas;
    }

    public String getTexto() {
        return texto;
    }

    public int getValor() {
        return valor;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
    
    
}
