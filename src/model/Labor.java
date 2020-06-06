package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import patronesDiseño.IControlFisico;
import patronesDiseño.ILabor;
import patronesDiseño.IProductoControl;

public class Labor implements ILabor{
    private String nombre;
    private ArrayList<IProductoControl> productosControl = new ArrayList();
    private ArrayList<IControlFisico> controlesFisicos = new ArrayList();

    public Labor() {
    }

    public Labor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<IProductoControl> getProductosControl() {
        return productosControl;
    }

    public void setProductosControl(ArrayList<IProductoControl> productosControl) {
        this.productosControl = productosControl;
    }

   

    public ArrayList<IControlFisico> getControlesFisicos() {
        return controlesFisicos;
    }

    public void setControlesFisicos(ArrayList<IControlFisico> controlesFisicos) {
        this.controlesFisicos = controlesFisicos;
    }

    @Override
    public IProductoControl crearProductoControl () throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcionProducto, frecuenciaAplicacion, periodoCarencia, valorProducto;
        String registroICA, nombreProducto, nombreHongo;
        Fecha fechaUltimaAplicacion; 
        IProductoControl nuevoProducto;
        
        System.out.println("------------");
        System.out.println("1. Crear producto control plagas.");
        System.out.println("2. Crear producto control fertilizantes.");
        System.out.println("3. Crear producto control hongo");
        System.out.println("------------");
        opcionProducto = Integer.parseInt(entrada.readLine());

        switch (opcionProducto) {
            case 1:
                System.out.println("Nombre producto: ");
                nombreProducto = entrada.readLine();
                System.out.println("Registro ICA: ");
                registroICA = entrada.readLine();
                System.out.println("Frecuencia aplicacion: ");
                frecuenciaAplicacion = Integer.parseInt(entrada.readLine());
                System.out.println("Valor producto: ");
                valorProducto = Integer.parseInt(entrada.readLine());
                System.out.println("Fecha ultima aplicacion: dia/mes/año");
                fechaUltimaAplicacion = new Fecha (Integer.parseInt(entrada.readLine()),Integer.parseInt(entrada.readLine()),Integer.parseInt(entrada.readLine()));
                nuevoProducto = new ProductoControlFertilizante(fechaUltimaAplicacion, registroICA, nombreProducto, frecuenciaAplicacion, valorProducto);
                break;

            case 2: //producto control plaga
                System.out.println("Nombre producto: ");
                nombreProducto = entrada.readLine();
                System.out.println("Registro ICA: ");
                registroICA = entrada.readLine();
                System.out.println("Frecuencia aplicacion: ");
                frecuenciaAplicacion = Integer.parseInt(entrada.readLine());
                System.out.println("Valor producto: ");
                valorProducto = Integer.parseInt(entrada.readLine());
                System.out.println("Periodo de carencia: ");
                periodoCarencia = Integer.parseInt(entrada.readLine());
                nuevoProducto = new ProductoControlPlaga(periodoCarencia, registroICA, nombreProducto, frecuenciaAplicacion, valorProducto);
                break;

            case 3: //Producto control hongo
                System.out.println("Nombre producto: ");
                nombreProducto = entrada.readLine();
                System.out.println("Registro ICA: ");
                registroICA = entrada.readLine();
                System.out.println("Frecuencia aplicacion: ");
                frecuenciaAplicacion = Integer.parseInt(entrada.readLine());
                System.out.println("Valor producto: ");
                valorProducto = Integer.parseInt(entrada.readLine());
                System.out.println("Periodo de carencia: ");
                periodoCarencia = Integer.parseInt(entrada.readLine());
                System.out.println("Nombre del hongo que afecta a la planta: ");
                nombreHongo = entrada.readLine();

                nuevoProducto = new ProductoControlHongo(periodoCarencia, nombreHongo, registroICA, nombreProducto, frecuenciaAplicacion, valorProducto);
                break;

            default:
                throw new AssertionError();
        }

    return nuevoProducto;
    }

    @Override
    public ControlFisico crearControlFisico() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombreControlFisico;
        int frecuenciaEjecucion;
        ControlFisico controlFisico;
        
        nombreControlFisico = entrada.readLine();
        frecuenciaEjecucion = Integer.parseInt(entrada.readLine());
        
        controlFisico = new ControlFisico(nombreControlFisico, frecuenciaEjecucion);
        
        return controlFisico;
    }

    @Override
    public void agregarProductoControl() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        IProductoControl nuevoProducto;
        int opcion;
        boolean estaAgregando =  true;
        
        while(estaAgregando){
            nuevoProducto = crearProductoControl();
            this.productosControl.add(nuevoProducto);
            System.out.println("¿Desea agregar otro producto?: 1. Si, 2. No");
            opcion = Integer.parseInt(entrada.readLine());
            if(opcion == 2){
                estaAgregando = false;
            }
        }
    }

    @Override
    public void agregarControlFisico() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        IControlFisico nuevoControl;
        int opcion;
        boolean estaAgregando =  true;
        
        while(estaAgregando){
            nuevoControl = crearControlFisico();
            this.controlesFisicos.add(nuevoControl);
            System.out.println("¿Desea agregar otro control fisico?: 1. Si, 2. No");
            opcion = Integer.parseInt(entrada.readLine());
            if(opcion == 2){
                estaAgregando = false;
            }
        }
    }

    @Override
    public void mostrarInformacionProductosControl() {
        for (IProductoControl producto : productosControl) {
            System.out.println("---------------------------");
            producto.mostrarInformacion();
            System.out.println("");
        }
    }

    @Override
    public void mostrarInformacionControlesFisicos() {
        for (IControlFisico control : controlesFisicos) {
            System.out.println("---------------------------");
            control.mostrarInformacion();
            System.out.println("");
        }
    }
    
}
