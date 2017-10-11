package com.company.estatico;

public class PersonaStatic {

    private String nombre;
    private int idPersona;
    private static int contadorPersonas;

    public PersonaStatic(String nombre) {
        contadorPersonas++;
        idPersona = contadorPersonas;
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona[idPersona: " + idPersona + ", nombre: " + nombre + "]";
    }
}
