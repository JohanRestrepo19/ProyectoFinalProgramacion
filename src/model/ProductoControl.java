package model;

import patronesDiseño.IProductoControl;

public class ProductoControl implements IProductoControl{
    protected String registroICA;
    protected String nombre;
    protected int frecuenciaAplicacion;
    protected int valorProducto;

    public ProductoControl() {}

    public ProductoControl(String registroICA, String nombre, int frecuenciaAplicacion, int valorProducto) {
        this.registroICA = registroICA;
        this.nombre = nombre;
        this.frecuenciaAplicacion = frecuenciaAplicacion;
        this.valorProducto = valorProducto;
    }

    public String getRegistroICA() {
        return registroICA;
    }

    public void setRegistroICA(String registroICA) {
        this.registroICA = registroICA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFrecuenciaAplicacion() {
        return frecuenciaAplicacion;
    }

    public void setFrecuenciaAplicacion(int frecuenciaAplicacion) {
        this.frecuenciaAplicacion = frecuenciaAplicacion;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Registro ICA: " + this.registroICA);
        System.out.println("Nombre producto: " + this.nombre);
        System.out.println("Frecuancia aplicacion: " + this.frecuenciaAplicacion);
        System.out.println("Valor producto " + this.valorProducto);
        System.out.println("");
    }
    
}
