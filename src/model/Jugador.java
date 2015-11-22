package model;

public class Jugador {
    private String nombre = "";
    private int puntuacion = 0;
    private boolean turno = false;
    
    public Jugador(String nombre, int puntuacion, boolean turno) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPuntuacion() {
        return puntuacion;
    }

    public boolean getTurno() {
        return turno;
    }
    
    @Override
    public String toString()
    {
        return "El nombre del jugador es: "+nombre+" y su puntuacion es: "+puntuacion;
    }
}
