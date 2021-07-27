package com.ejercicio_02.juego;

import com.ejercicio_02.jugador.Jugador;
import com.ejercicio_02.jugador.JugadorService;
import com.ejercicio_02.revolver.Revolver;
import com.ejercicio_02.revolver.RevolverService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JuegoService {
    public void llenarJuego(Juego juego) {
        System.out.println("Ingresando jugadores");
        juego.setJugadores(crearJugadores());
        System.out.println("Ingresando el revolver");
        Revolver r = new Revolver();
        new RevolverService().llenarRevolver(r);
        juego.setRevolver(r);

        System.out.println("Juego listo para comenzar\n" + juego);
    }

    private List<Jugador> crearJugadores() {
        List<Jugador> jugadores = new ArrayList<>();
        System.out.println("Ingrese la cantidad de jugadores a participar (max 6)");
        int cantJugadores = new Scanner(System.in).nextInt();
        if (cantJugadores < 1 || cantJugadores > 6) {
            System.out.println("Error, fuera de rango, empezando con 6");
            cantJugadores = 6;
        }
        for (int i = 0; i < cantJugadores; i++) {
            Jugador jugador = new Jugador();
            System.out.println(jugador);
            jugadores.add(jugador);
        }
        return jugadores;
    }

    public void ronda(Juego juego) {
        List<Jugador> jugadores = juego.getJugadores();
        Revolver revolver = juego.getRevolver();
        String mojado = "";
        for (Jugador jugador : jugadores) {
            System.out.println(jugador + " apuntando y disparando");
            JugadorService jService = new JugadorService();
            jService.disparo(jugador, revolver);
            if(jugador.isMojado()){
                mojado = jugador.getNombre();
                break;
            }
        }
        System.out.println("El ganador/perdedor es " + mojado);
    }
}
