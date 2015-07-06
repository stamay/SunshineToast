package com.example.administrador.sunshineitic92;

import java.io.Serializable;

/**
 * Created by Administrador on 05/06/2015.
 */
public class Clima implements Serializable{
    private String dia;
    private String estado;
    private String temperatura;
    private int icono;

    public Clima(String dia, String estado, String temperatura, int icono) {
        this.dia = dia;
        this.estado = estado;
        this.temperatura = temperatura;
        this.icono = icono;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    @Override
    public String toString() {
        return "Dia: " + dia + ", estado: " + estado + ", temperatura: " + temperatura;
    }
}
