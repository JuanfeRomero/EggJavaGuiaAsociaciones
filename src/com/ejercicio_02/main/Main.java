package com.ejercicio_02.main;

import com.ejercicio_02.juego.Juego;
import com.ejercicio_02.juego.JuegoService;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        JuegoService service = new JuegoService();

        service.llenarJuego(juego);
        service.ronda(juego);
    }
}
