package model;

public class ProductoControlPlaga extends ProductoControl{
    private int periodoCarencia;

    public ProductoControlPlaga() {}

    public ProductoControlPlaga(int periodoCarencia, String registroICA, String nombre, int frecuenciaAplicacion, int valorProducto) {
        super(registroICA, nombre, frecuenciaAplicacion, valorProducto);
        this.periodoCarencia = periodoCarencia;
    }

    public int getPeriodoCarencia() {
        return periodoCarencia;
    }

    public void setPeriodoCarencia(int periodoCarencia) {
        this.periodoCarencia = periodoCarencia;
    }
    
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Registro ICA: " + this.registroICA);
        System.out.println("Nombre producto: " + this.nombre);
        System.out.println("Frecuancia aplicacion: " + this.frecuenciaAplicacion);
        System.out.println("Valor producto " + this.valorProducto);
        System.out.println("Periodo de carencia: " + this.periodoCarencia);
        System.out.println("");
    }
    
}