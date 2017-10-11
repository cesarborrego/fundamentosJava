package com.company.herencia;

import java.util.Date;

public class Cliente extends PersonaHerencia{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente (String nombre,
                    char genero,
                    int edad,
                    String direccion,
                    Date fechaRegistro,
                    boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{idCliente = "+idCliente+", fechaRegistro = "+fechaRegistro+", vip = "+vip+'}';
    }
}
