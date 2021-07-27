package com.ejercicio_02.revolver;

public class RevolverService {

    public void llenarRevolver(Revolver r){
        r.setPosicionActual((int) Math.floor(Math.random()*6)+1);
        r.setPosicionDelAgua((int) Math.floor(Math.random()*6)+1);

        System.out.println("Revolver llenado: " + r);
    }
    public boolean mojar(Revolver r){
        return r.getPosicionActual() == r.getPosicionDelAgua();
    }
    public void siguienteChorro(Revolver r){
        int posicion = r.getPosicionActual();
        final int FINAL_DE_TAMBOR = 6;
        final int INICIO_DE_TAMBOR = 1;

        if(posicion==FINAL_DE_TAMBOR){
            r.setPosicionActual(INICIO_DE_TAMBOR);
        }else{
            r.setPosicionActual(posicion+INICIO_DE_TAMBOR);
        }
    }
}
