package Jeopardy;

public class Respuesta extends Categoria{
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

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
