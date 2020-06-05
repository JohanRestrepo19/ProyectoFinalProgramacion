package model;

public class ProductoControlHongo extends ProductoControl{
    private int periodoCarencia;
    private String nombreHongo;

    public ProductoControlHongo() {}

    public ProductoControlHongo(int periodoCarencia, String nombreHongo, String registroICA, String nombre, int frecuenciaAplicacion, int valorProducto) {
        super(registroICA, nombre, frecuenciaAplicacion, valorProducto);
        this.periodoCarencia = periodoCarencia;
        this.nombreHongo = nombreHongo;
    }

    public int getPeriodoCarencia() {
        return periodoCarencia;
    }

    public void setPeriodoCarencia(int periodoCarencia) {
        this.periodoCarencia = periodoCarencia;
    }

    public String getNombreHongo() {
        return nombreHongo;
    }

    public void setNombreHongo(String nombreHongo) {
        this.nombreHongo = nombreHongo;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Registro ICA: " + this.registroICA);
        System.out.println("Nombre producto: " + this.nombre);
        System.out.println("Frecuancia aplicacion: " + this.frecuenciaAplicacion);
        System.out.println("Valor producto " + this.valorProducto);
        System.out.println("Periodo de carencia: " + this.periodoCarencia);
        System.out.println("Nombre del hongo que afecta a la planta: " + this.nombreHongo);
        System.out.println("");
    }
    
    
    
    
}
