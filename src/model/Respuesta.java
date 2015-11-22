package model;


public class Respuesta {
    private String texto;
    private String valor;

    public Respuesta(String texto, String valor) {
        this.texto = texto;
        this.valor = valor;
    }
    
    public String getTexto() {
        return texto;
    }

    public String getValor() {
        return valor;
    }
}
