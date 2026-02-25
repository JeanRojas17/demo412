package com.example;

public class Estudiante extends Persona {
    
    public String estudiarMateria;

    Estudiante() {
        super(); // Llamada al constructor de la clase padre (Persona)
        System.out.println("Constructor vacio de Estudiante");
    }

    public void entregar() {
        System.out.println("El estudiante entrega la tarea de la materia: " +estudiarMateria);
    }

    private int revisarNota(String materia) {
        System.out.println("El estudiante revisa la nota de la materia: " +materia);
        // Deberia ir la logica para revisar en base de datos
        return 5;
    }
}