package com.ejercicio_03.cine;

import com.ejercicio_03.espectador.Espectador;
import com.ejercicio_03.sala.Sala;
import com.ejercicio_03.sala.SalaService;

import java.util.List;
import java.util.Scanner;

public class CineService {
    Scanner sc = new Scanner(System.in);

    public void crearCine(Cine cine){
        System.out.println("Creando la sala");
        SalaService servicioSala = new SalaService();
        Sala sala = new Sala();
        servicioSala.crearSala(sala);
        cine.setSala(sala);

        System.out.println("Ingrese el valor de la entrada");
        cine.setEntrada(sc.nextDouble());
        sc.nextLine();
    }

    public void llenarSala(Cine cine){
        Sala sala = cine.getSala();
        List<Espectador> espectadores = sala.getEspectadores();

        for (Espectador cliente : espectadores) {
            // consigo los asientos en una variable local
            char[][] asientos = sala.getAsientos();
            if (cliente.getDinero() >= cine.getEntrada() && cliente.getEdad() >= sala.getPelicula().getEdadMinima()) {
                while (true) {
                    int fila = (int) Math.floor(Math.random() * 6);
                    int columna = (int) Math.floor(Math.random() * 8);

                    if (asientos[fila][columna] != 'X') {
                        asientos[fila][columna] = 'X';
                        // actualizo los asientos en el objeto Sala
                        sala.setAsientos(asientos);
                        break;
                    }
                }
            }else{
                System.out.printf("{%s}, no entró, tenia {%d} años y {%f} plata\n", cliente.getNombre(), cliente.getEdad(), cliente.getDinero());
            }
        }
    }
    public void mostrarSala(Cine cine){
        char[][] matriz = cine.getSala().getAsientos();
        int A = 65;
        for (char[] filas : matriz) {
            for (int j = 0; j < filas.length; j++) {
                char butaca = filas[j];
                if (j == 0) {
                    System.out.print("|" + (char) A + "|");
                    A++;
                }
                System.out.print(butaca == 'X' || butaca == 'x' ? "|X|" : "| |");
            }
            System.out.println();
        }
        System.out.println("|-||1||2||3||4||5||6||7||8|");
    }
}
