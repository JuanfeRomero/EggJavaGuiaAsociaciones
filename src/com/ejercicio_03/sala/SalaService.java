package com.ejercicio_03.sala;

import com.ejercicio_03.espectador.Espectador;
import com.ejercicio_03.espectador.EspectadorService;
import com.ejercicio_03.pelicula.PeliculaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaService {
    Scanner sc = new Scanner(System.in);
    final int ASIENTOS = 48;

    public void crearSala(Sala sala) {
        System.out.println("Ingresando la pelicula");


        // otra manera de hacer lo mismo
//        Pelicula peli = new Pelicula();
//        sala.setPelicula(servicioPeli.crearPelicula(peli));
        PeliculaService servicioPeli = new PeliculaService();
        sala.setPelicula(servicioPeli.crearPelicula());

        System.out.println("Ingresando espectadores");
        sala.setEspectadores(juntarEspectadores());

    }

    public List<Espectador> juntarEspectadores(){
        List<Espectador> espectadores = new ArrayList<>();
        EspectadorService ServicioEspectador = new EspectadorService();
        // define si sigue agregando
        String aux;
        // cantidad de asientos disponibles
        int asientos = ASIENTOS;
        do {
            // creo un espectador
            Espectador esp= new Espectador();
            // lleno los datos del espectador
            ServicioEspectador.crearEspectador(esp);
            // agrego el espectador a la lista
            espectadores.add(esp);
            // reducir un asiento
            asientos--;

            // preguntar si quiere seguir agregando
            System.out.println("Desea agregar otro espectador? (s/n)");
            aux = sc.nextLine();
            // chequea que la opcion sea valida
            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")){
                System.out.println("Error. Desea agregar otro espectador? (s/n)");
                aux = sc.nextLine();
            }
        }while(aux.equalsIgnoreCase("s") && asientos > 0);

        return espectadores;
    }

}
