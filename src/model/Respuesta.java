package model;


public class Respuesta {
    private String texto;
    private char valor;

    public Respuesta(String texto, char valor) {
        this.texto = texto;
        this.valor = valor;
    }
    
    public String getTexto() {
        return texto;
    }

    public char getValor() {
        return valor;
    }
}
