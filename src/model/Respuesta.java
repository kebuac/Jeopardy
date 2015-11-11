package model;


public class Respuesta {
    private String texto;
    private int valor;

    public Respuesta(String texto, int valor) {
        this.texto = texto;
        this.valor = valor;
    }
    
    public String getTexto() {
        return texto;
    }

    public int getValor() {
        return valor;
    }
}
