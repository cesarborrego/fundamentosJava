package com.company.ventas;

public class Orden {
    private final int idOrden;
    private final Producto[] productos;
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int maxProductos = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[maxProductos];
    }

    public void agregarProducto(Producto producto) {
        if (contadorOrdenes < maxProductos) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos " + maxProductos);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden # " + idOrden);
        System.out.println("Total de la Orden # " + idOrden + ": $" + calcularTotal());
        System.out.println("Productos de la Orden # " + idOrden + ":");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }

}
