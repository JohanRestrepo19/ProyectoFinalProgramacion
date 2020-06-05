package model;

import patronesDiseño.IControlFisico;

public class ControlFisico implements IControlFisico{
    
    private String nombre;
    private int frecuenciaEjecucion;

    public ControlFisico() {
    }

    public ControlFisico(String nombre, int frecuenciaEjecucion) {
        this.nombre = nombre;
        this.frecuenciaEjecucion = frecuenciaEjecucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFrecuenciaEjecucion() {
        return frecuenciaEjecucion;
    }

    public void setFrecuenciaEjecucion(int frecuenciaEjecucion) {
        this.frecuenciaEjecucion = frecuenciaEjecucion;
    }
    
    

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre producto control fisico: " + this.nombre);
        System.out.println("Frecuencia de ejecucion: " + this.frecuenciaEjecucion);
        System.out.println("");
    }
    
}
