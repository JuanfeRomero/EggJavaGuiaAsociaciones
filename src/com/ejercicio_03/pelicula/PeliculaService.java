package com.ejercicio_03.pelicula;

import java.util.Scanner;

public class PeliculaService {
    Scanner sc = new Scanner(System.in);

    public void crearPelicula(Pelicula pelicula){
        System.out.println("Ingrese el titulo de la pelicula");
        pelicula.setTitulo(sc.nextLine());

        System.out.println("Ingrese el director de la pelicula");
        pelicula.setDirector(sc.nextLine());

        System.out.println("Ingrese la duracion de la pelicula en minutos");
        pelicula.setDuracion(sc.nextInt());

        System.out.println("Ingrese la edad minima para ver la pelicula");
        pelicula.setEdadMinima(sc.nextInt());
    }
//    Otra manera de hacer el metodo para crear pelicula
    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        pelicula.setTitulo(sc.nextLine());

        System.out.println("Ingrese el director de la pelicula");
        pelicula.setDirector(sc.nextLine());

        System.out.println("Ingrese la duracion de la pelicula en minutos");
        pelicula.setDuracion(sc.nextInt());

        System.out.println("Ingrese la edad minima para ver la pelicula");
        pelicula.setEdadMinima(sc.nextInt());

        return pelicula;
    }
}
