package com.ejercicio_02.jugador;

public class Jugador {
    private static int id = 0;
    private int idAsignado;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
        id++;
        idAsignado = id;
        this.nombre = "Jugador " + idAsignado;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Jugador.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = "Jugador " + idAsignado;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public int getIdAsignado() {
        return idAsignado;
    }

    public void setIdAsignado(int idAsignado) {
        this.idAsignado = idAsignado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", mojado=" + mojado +
                ", id=" + idAsignado +
                '}'+'\n';
    }
}
