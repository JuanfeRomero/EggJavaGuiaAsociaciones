package com.ejercicio_02.revolver;

public class Revolver {
    private int posicionActual;
    private int posicionDelAgua;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDelAgua() {
        return posicionDelAgua;
    }

    public void setPosicionDelAgua(int posicionDelAgua) {
        this.posicionDelAgua = posicionDelAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posicionActual=" + posicionActual +
                ", posicionDelAgua=" + posicionDelAgua +
                '}';
    }
}
