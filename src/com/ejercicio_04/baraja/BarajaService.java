package com.ejercicio_04.baraja;

import com.ejercicio_04.carta.Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaService {
    public Baraja crearBaraja(){
        Baraja b = new Baraja();

        final int PALOS = 4;
        final int ESPADA = 0;
        final int BASTO = 1;
        final int ORO = 2;
        final int COPA = 3;
        final int TAMANIO_POR_PALO = 12;

        List<Carta> cartas = new ArrayList<>();

        for (int i = 0; i < TAMANIO_POR_PALO; i++) {
            for (int j = 0; j < PALOS; j++) {
                if(i == 7 || i == 8){
                    break;
                }else{
                    switch(j){
                        case ESPADA:
                            cartas.add(new Carta(i+1, "espada"));
                            break;
                        case BASTO:
                            cartas.add(new Carta(i+1, "basto"));
                            break;
                        case ORO:
                            cartas.add(new Carta(i+1, "oro"));
                            break;
                        case COPA:
                            cartas.add(new Carta(i+1, "copa"));
                            break;
                    }
                }
            }
        }

        b.setCartas(cartas);
        return b;
    }

    public void barajar(Baraja baraja){
        System.out.println("Abarajando las cartas");
        Collections.shuffle(baraja.getCartas());
    }

    public void siguienteCarta(Baraja baraja){
        List<Carta> mazo = baraja.getCartas();
        if(mazo.isEmpty()){
            System.out.println("No hay mas cartas en el mazo");
        }else{
            System.out.println("Siguiente carta: " + mazo.get(0));
            mazo.remove(0);
            baraja.setCartas(mazo);
            if(mazo.isEmpty()){
                System.out.println("Se ha llegado al final del mazo");
            }
        }
    }

    public void cartasDisponibles(Baraja baraja){
        System.out.println("Hay un total de " + baraja.getCartas().size() + " cartas");
    }

    public void darCartas(Baraja baraja){
        System.out.println("Ingresar cuantas cartas quiere recibir:");
        int cartasADar = new Scanner(System.in).nextInt();

        if(cartasADar > baraja.getCartas().size()){
            System.out.println("Se ha pedido un numero de cartas mayor al disponible");
        }else{
            for (int i = 0; i < cartasADar; i++) {
                siguienteCarta(baraja);
            }
        }
    }

    public void cartasMonton(Baraja baraja){
        Baraja barajaLlena = crearBaraja();
        List<Carta> mazoLleno = barajaLlena.getCartas();
        List<Carta> mazoActual = baraja.getCartas();
        int counter = 0;
        mazoLleno.removeIf(mazoActual::contains);
        System.out.println("Cartas en el mazo ya jugadas: "  + mazoLleno);
        System.out.println("Se han jugado un total de " + mazoLleno.size() + " cartas");
    }

    public void mostrarBaraja(Baraja baraja){
        System.out.println(baraja.getCartas());
        cartasDisponibles(baraja);
    }
}
