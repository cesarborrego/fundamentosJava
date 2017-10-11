package com.company.LabFinal;

public class OdenComputadora {
    private int idOrden;
    private Computadora[] computadoras;
    private int contadorComputadoras;
    private static int contadorOrdenes;
    private static final int maxComputadoras = 10;

    public OdenComputadora() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorOrdenes < maxComputadoras) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de computadoras " + maxComputadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden # " + idOrden);
        System.out.println("Computadoras de la Orden # " + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
