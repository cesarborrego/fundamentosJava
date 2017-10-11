package com.company;

import com.company.LabFinal.*;
import com.company.estatico.PersonaStatic;
import com.company.herencia.Cliente;
import com.company.herencia.Empleado;
import com.company.sobrecarga.EmpleadoSobrecarga;
import com.company.sobrecarga.PersonaSobrecarga;
import com.company.ventas.Orden;
import com.company.ventas.Producto;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //callStatic();
        //callHerencia();
        //callSobrecarga();
        //callVentas();
        callLabComputadoras();
    }

    private static void callLabComputadoras() {
        //creacion de computadora Toshiba
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshi = new Raton("bluetooth", "Toshiba");
        Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);

        //creacion de computadora dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //creacion de computadora armada
        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);

        //Agregamos las computadoras a la orden
        OdenComputadora orden1 = new OdenComputadora();
        orden1.agregarComputadora(compuToshiba);
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuArmada);
        //Imprimimos la orden
        orden1.mostrarOrden();

        //Agregamos una segunda orden
        OdenComputadora orden2 = new OdenComputadora();
        orden2.agregarComputadora(compuArmada);
        orden2.agregarComputadora(compuDell);
        System.out.println("");
        orden2.mostrarOrden();
    }

    private static void callVentas() {
        Producto p1 = new Producto("camisa", 100);
        Producto p2 = new Producto("pantalon", 200);
        Producto p3 = new Producto("corbata", 60);

        Orden orden1 = new Orden();
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);

        orden1.mostrarOrden();

        Orden orden2 = new Orden();

        Producto p4 = new Producto("zapatos", 300);
        Producto p5 = new Producto("blusa", 150);

        orden2.agregarProducto(p1);
        orden2.agregarProducto(p5);
        orden2.agregarProducto(p4);
        orden2.agregarProducto(p3);

        System.out.println("");
        orden2.mostrarOrden();
    }

    private static void callSobrecarga() {
        PersonaSobrecarga p1 = new PersonaSobrecarga("cesar", 29);
        System.out.println("Impresion de objeto persona 1 " + p1);
        PersonaSobrecarga p2 = new PersonaSobrecarga("patsy", 29);
        System.out.println("Impresion de objeto persona 2 " + p2);
        EmpleadoSobrecarga e1 = new EmpleadoSobrecarga("pedro", 29, 3000);
        System.out.println("Impresion de objeto empleado 1 " + e1);
    }

    private static void callHerencia() {
        Empleado e1 = new Empleado("cesar", 2000);
        System.out.println("Impresion de objeto empleado1 " + e1);

        Empleado e2 = new Empleado("juan", 1500);
        e2.setEdad(22);
        e2.setGenero('M');
        e2.setDireccion("xanambres 93");
        System.out.println("Impresion de objeto empleado2 " + e2);

        Cliente c1 = new Cliente("Patsy",
                'F',
                22,
                "10 de abril",
                new Date(),
                false);
        System.out.println("Impresion de objeto cliente1 super " + c1);
        c1.setVip(true);
        System.out.println("Impresion de objeto cliente1 super " + c1);
    }

    private static void callStatic() {
        PersonaStatic personaStatic = new PersonaStatic("cesar");
        System.out.println("persona " + personaStatic);

        PersonaStatic personaStatic2 = new PersonaStatic("patsy");
        System.out.println("persona " + personaStatic2);
        System.out.println("numero de personas " + PersonaStatic.getContadorPersonas());
    }
}
