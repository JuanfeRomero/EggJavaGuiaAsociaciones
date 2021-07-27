package com.ejercicio_02.jugador;

import com.ejercicio_02.revolver.Revolver;
import com.ejercicio_02.revolver.RevolverService;

public class JugadorService {
    public void disparo(Jugador j, Revolver r) {
        RevolverService servicioR = new RevolverService();
        String nombre = j.getNombre();
        System.out.println(nombre + " está disparando");
        j.setMojado(servicioR.mojar(r));
        if(j.isMojado()){
            System.out.println(nombre + " se mojó");
        }else{
            System.out.println(nombre + " no se mojó");
        }
        servicioR.siguienteChorro(r);
    }
}
