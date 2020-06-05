package model;

public class ProductoControlFertilizante extends ProductoControl{
    private Fecha fechaUltimaAplicacion;

    public ProductoControlFertilizante() {}

    public ProductoControlFertilizante(Fecha fechaUltimaAplicacion, String registroICA, String nombre, int frecuenciaAplicacion, int valorProducto) {
        super(registroICA, nombre, frecuenciaAplicacion, valorProducto);
        this.fechaUltimaAplicacion = fechaUltimaAplicacion;
    }

    public Fecha getFechaUltimaAplicacion() {
        return fechaUltimaAplicacion;
    }

    public void setFechaUltimaAplicacion(Fecha fechaUltimaAplicacion) {
        this.fechaUltimaAplicacion = fechaUltimaAplicacion;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Registro ICA: " + this.registroICA);
        System.out.println("Nombre producto: " + this.nombre);
        System.out.println("Frecuancia aplicacion: " + this.frecuenciaAplicacion);
        System.out.println("Valor producto " + this.valorProducto);
        System.out.println("Fecha ultima aplicacion: " + this.fechaUltimaAplicacion.mostrarFecha());
        System.out.println("");
    }
    
    
    
    
}
