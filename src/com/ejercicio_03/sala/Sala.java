package com.ejercicio_03.sala;

import com.ejercicio_03.espectador.Espectador;
import com.ejercicio_03.pelicula.Pelicula;

import java.util.Arrays;
import java.util.List;

public class Sala {
    private List<Espectador> espectadores;
    private char[][] asientos = new char[6][8];
    private Pelicula pelicula;

    public Sala(){}

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public char[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(char[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "espectadores=" + espectadores +
                ", asientos=" + Arrays.toString(asientos) +
                ", pelicula=" + pelicula +
                '}';
    }
}
