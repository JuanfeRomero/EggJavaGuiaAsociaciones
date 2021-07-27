package com.ejercicio_02.juego;

import com.ejercicio_02.jugador.Jugador;
import com.ejercicio_02.revolver.Revolver;

import java.util.List;

public class Juego {
    List<Jugador> jugadores;
    Revolver revolver;

    public Juego() {
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{\n" +
                "jugadores=" + jugadores +
                "\n, revolver=" + revolver +
                "\n}";
    }
}
