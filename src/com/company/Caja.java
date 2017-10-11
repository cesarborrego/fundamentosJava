package com.company;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja(){}

    public Caja(int ancho,
                int alto,
                int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public void calcularVolumen () {
        System.out.println("El volumen de la caja es "+(ancho*alto*profundo));
    }
}
