package com.ejercicio_03.cine;

import com.ejercicio_03.sala.Sala;

public class Cine {
    private Sala sala;
    private double entrada;

    public Cine() {
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "sala=" + sala +
                ", entrada=" + entrada +
                '}';
    }
}
