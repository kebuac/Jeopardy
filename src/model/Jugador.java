package model;

public class Jugador {
    private String nombre;
    private int puntuacion;
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

    public boolean isTurno() {
        return turno;
    }
    
    public void addPuntuacion()
    {
        this.puntuacion = puntuacion + puntuacion;
    }
    
    public void minusPuntuacion()
    {
        this.puntuacion = puntuacion - puntuacion;
        if (this.puntuacion<0) this.puntuacion=0;
    }
    
    public String turnoJugador()
    {
        if (this.turno == false)
        {
            return this.nombre = "Jugador 1";
        }else {
            return this.nombre = "Jugador 2";
        }
        
    }
    
    @Override
    public String toString()
    {
        return "El nombre del jugador es: "+nombre+" y su puntuacion es: "+puntuacion;
    }
}
