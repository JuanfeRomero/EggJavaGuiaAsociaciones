package com.ejercicio_01.main;


import com.ejercicio_01.perro.Perro;
import com.ejercicio_01.perro.PerroService;
import com.ejercicio_01.persona.Persona;
import com.ejercicio_01.persona.PersonaService;

import java.util.Scanner;

/*
* Realizar un programa para que una Persona pueda adoptar un Perro.
* Vamos a contar de dos  clases.  Perro,  que  tendrá  como  atributos:  nombre,  raza,  edad  y  tamaño; (done)
* y  la  clase Persona con atributos: nombre, apellido, edad, documento y Perro. (done)
* Ahora deberemos en el main crear dos Personas y dos Perros.
* Después, vamos a tener que  pensar  la  lógica  necesaria  para  asignarle  a  cada  Persona  un  Perro
* y  por  ultimo, mostrar desde la clase Persona, la información del Perro y de la Persona.
* */
public class Main {
    public static void main(String[] args) {
        PerroService perroService = new PerroService();
        Perro perro1 = perroService.crearPerro();
        Perro perro2 = perroService.crearPerro();

        PersonaService personaService = new PersonaService();
        Persona persona1 = personaService.crearPersona();
        Persona persona2 = personaService.crearPersona();

        String perro1Nombre = perro1.getNombre();
        String perro2Nombre = perro2.getNombre();
        String perros = "1- " + perro1Nombre + '\n'
                + perro1 + '\n'
                + "2- " + perro2Nombre + '\n'
                + perro2 + '\n';

        System.out.println("Ingrese el perro que le corresponde a " + persona1.getNombre());
        System.out.println(perros);
        int eleccion = new Scanner(System.in).nextInt();

        if(eleccion == 1){
            System.out.println("Eligió a " + perro1Nombre);
            persona1.setPerro(perro1);
            System.out.println(perro2Nombre + " le corresponde a " + persona2.getNombre());
            persona2.setPerro(perro2);
        }else if(eleccion == 2){
            System.out.println("Eligió a " + perro2Nombre);
            persona1.setPerro(perro2);
            System.out.println(perro1Nombre + " le corresponde a " + persona2.getNombre());
            persona2.setPerro(perro1);
        }else{
            System.out.println("No eligio bien, no hay perro para nadie");
        }

        System.out.println(persona1);

        System.out.println(persona2);
    }
}
