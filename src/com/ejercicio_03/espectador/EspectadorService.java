package com.ejercicio_03.espectador;

import java.util.Scanner;

public class EspectadorService {
    Scanner sc = new Scanner(System.in);

    public void crearEspectador(Espectador espectador){
        System.out.println("Ingrese el nombre del espectador");
        espectador.setNombre(sc.nextLine());

        System.out.println("Ingrese la edad del espectador");
        espectador.setEdad(sc.nextInt());

        System.out.println("Ingrese la cantidad de dinero disponible");
        espectador.setDinero(sc.nextDouble());
        sc.nextLine();
    }
}
