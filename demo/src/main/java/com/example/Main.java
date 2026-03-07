package com.example;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto de la clase Persona utilizando el constructor vacio
        Persona persona1 = new Persona(123456789, "Juan Perez", "GZoGn@example.com", 1234567890);

        System.out.println("El nombre de la persona es: "+persona1.getNombre());

        persona1.setNombre("Maria Gomez");

        System.out.println("El nombre de la persona es: "+persona1.getNombre());

        // Llamar al metodo hablar de la clase Persona
        String saludo = persona1.hablar("Hola, ¿Como estas?");
        System.out.println(saludo);

        // persona1.dormir(8);

        int pasos = persona1.caminar(1000);
        System.out.println("La persona camina " +pasos+ " pasos.");
    }
}