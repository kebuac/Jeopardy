package model;

public class Jugador {
    private String nombre;
    private int puntuacion;
    

    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    
    public int addPuntuacion()
    {
        return this.puntuacion = this.puntuacion + puntuacion;
    }
    
    @Override
    public String toString()
    {
        return "El nombre del jugador es: "+nombre+" y su puntuacion es: "+puntuacion;
    }
}
