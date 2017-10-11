package com.company;

public class Persona {
    String nombre;
    String apePaterno;
    String apeMaterno;

    public void mostrarNombreCompleto() {
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido Paterno "+apePaterno);
        System.out.println("Apellido Materno "+apeMaterno);
    }
}
