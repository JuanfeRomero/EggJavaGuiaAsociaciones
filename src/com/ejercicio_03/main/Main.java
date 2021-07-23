package com.ejercicio_03.main;

import com.ejercicio_03.cine.Cine;
import com.ejercicio_03.cine.CineService;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();
        CineService servicio = new CineService();

        servicio.crearCine(cine);

        servicio.llenarSala(cine);

        servicio.mostrarSala(cine);
    }
}
