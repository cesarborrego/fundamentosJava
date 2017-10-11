package com.company.sobrecarga;

public class EmpleadoSobrecarga extends PersonaSobrecarga {

    private double sueldo;

    public EmpleadoSobrecarga (String nombre,
                               int edad,
                               double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{sueldo = "+sueldo+'}';
    }
}
