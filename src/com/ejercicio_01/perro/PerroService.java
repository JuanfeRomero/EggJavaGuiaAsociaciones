package com.ejercicio_01.perro;

import java.util.Scanner;

public class PerroService {
    public Perro crearPerro(){
        Scanner sc = new Scanner(System.in);
        Perro p = new Perro();

        System.out.println("Ingrese el nombre del perro");
        String nombre = sc.nextLine();
        p.setNombre(nombre);

        System.out.println("Ingrese la raza de " + nombre);
        p.setRaza(sc.nextLine());

        System.out.println("Ingrese la edad de " + nombre);
        p.setEdad(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el tamaño de " + nombre);
        p.setTamanio(sc.nextDouble());

        return p;
    }
}
