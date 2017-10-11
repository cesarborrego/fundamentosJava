package com.company.sobrecarga;

public class PersonaSobrecarga {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int constadorPersona;

    private PersonaSobrecarga(){
        this.idPersona = ++constadorPersona;
    }

    public PersonaSobrecarga (String nombre,
                              int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{"+"idPersona = "+idPersona+", nombre = "+nombre+", edad = "+edad+'}';
    }
}
