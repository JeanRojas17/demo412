package com.example;

public class Persona {

    // Modificadores de acceso: public, private, protected
    // public (+): Puede ser accedido desde cualquier lugar
    // private (-): Solo puede ser accedido desde la propia clase
    // protected (#): Puede ser accedido desde la propia clase y desde las subclases

    // Atributos de la clase Persona
    //Caracteristicas que identifican a una persona
    private int cedula;
    public String nombre;
    public String correo;
    private int telefono;
    protected int cuentaBancaria;

    // Constructor de la clase Persona
    // Constructor vacio
    Persona() {
        System.out.println("Constructor vacio");
    }

    // Constructor con parametros cedula
    Persona(int cedula) {
        System.out.println("Constructor con parametro cedula");
        this.cedula = cedula;
    }

    // Constructor con todos los parametros
    Persona(int cedula, String nombre, String correo, int telefono) {
        System.out.println("Constructor con todos los parametros");
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Metodos de la clase Persona

    public String hablar(String saludo) {
        //System.out.println(saludo);
        return saludo + " bien gracias!";
    }

    private void dormir(int horas) {
        System.out.println("La persona duerme " +horas+ " horas.");
    }

    public int caminar(int pasos) {
        //System.out.println("La persona camina " +pasos+ " pasos.");
        return pasos;
    }
}