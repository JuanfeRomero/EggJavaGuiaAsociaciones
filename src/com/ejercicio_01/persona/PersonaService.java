package com.ejercicio_01.persona;

import java.util.Scanner;

public class PersonaService {
    public Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(sc.nextLine());

        System.out.println("Ingrese el apellido de la persona");
        p.setApellido(sc.nextLine());

        String nombreCompleto = p.getNombre() + " " + p.getApellido();
        System.out.println("Ingrese la edad de " + nombreCompleto);
        p.setEdad(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el documento de " + nombreCompleto);
        p.setDocumento(sc.nextInt());
        sc.nextLine();

        return p;
    }
}
