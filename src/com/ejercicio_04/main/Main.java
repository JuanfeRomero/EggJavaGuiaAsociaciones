package com.ejercicio_04.main;


import com.ejercicio_04.baraja.Baraja;
import com.ejercicio_04.baraja.BarajaService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import sun.font.FontRunIterator;

import java.util.Scanner;

/*
* Realizar una baraja de cartas españolas orientada a objetos.
* Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). (done)
* Esta clase debe contener un método toString() que retorne el número de carta y el palo.(done)
* La baraja estará compuesta por un conjunto de cartas, 40 exactamente. (done)
* Las operaciones que podrá realizar la baraja son:
* • barajar(): cambia de posición todas las cartas aleatoriamente. (done)
*
* • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más
*  o se haya llegado al final, se indica al usuario que no hay más cartas. (done)
*
* • cartasDisponibles(): indica el número de cartas que aún se puede repartir. (done)
*
* • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número  de  cartas. (done)
*  En  caso  de  que  haya  menos  cartas  que  las  pedidas,  no devolveremos nada, pero debemos indicárselo al usuario.
*
* • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario (done)
*
* • mostrarBaraja(): muestra todas las cartas hasta el final. (done)
*  Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
* */
public class Main {
    public static void main(String[] args) {
        BarajaService servicio = new BarajaService();

        Baraja baraja = servicio.crearBaraja();

        System.out.println("****************MOSTRANDO BARAJA PRINCIPAL**********************");
        servicio.mostrarBaraja(baraja);


        System.out.println("****************BARAJANDO EL MAZO**********************");
        servicio.barajar(baraja);

        servicio.mostrarBaraja(baraja);

        System.out.println("****************SACANDO 40 CARTAS Y REVISANDO CUANDO NO QUEDA NADA Y CUANDO YA ESTÁ VACIO**********************");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 41; i++) {
            if(i == 39 || i == 40){
                System.out.println("Enter para ultima carta y mazo vacio");
                sc.nextLine();
                servicio.siguienteCarta(baraja);
            }else{
                servicio.siguienteCarta(baraja);
            }
        }

        System.out.println("****************MOSTRANDO SOLO CARTAS DISPONIBLES**********************");
        servicio.cartasDisponibles(baraja);

        System.out.println("llenando mazo de nuevo");
        baraja = servicio.crearBaraja();
        servicio.barajar(baraja);

        System.out.println("****************DANDO CARTAS, PRIMERO MAS DEL MAXIMO Y DESPUES CANTIDAD FIJA**********************");
        servicio.darCartas(baraja);
        servicio.darCartas(baraja);


        System.out.println("****************MOSTRANDO CARTAS DISPONIBLE Y EL MONTON DE CARTAS JUGADAS**********************");
        servicio.cartasDisponibles(baraja);

        servicio.cartasMonton(baraja);

        System.out.println("******************ULTIMO MOSTRAR BARAJA******************************");
        servicio.mostrarBaraja(baraja);
    }
}
