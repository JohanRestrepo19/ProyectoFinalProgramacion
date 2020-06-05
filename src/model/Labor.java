package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import patronesDiseño.ILabor;

public class Labor implements ILabor{
    private String nombre;
    private ArrayList<ProductoControl> productoControl = new ArrayList();
    private ArrayList<ControlFisico> controlesFisicos = new ArrayList();

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

    public ArrayList<ProductoControl> getProductoControl() {
        return productoControl;
    }

    public void setProductoControl(ArrayList<ProductoControl> productoControl) {
        this.productoControl = productoControl;
    }

    public ArrayList<ControlFisico> getControlesFisicos() {
        return controlesFisicos;
    }

    public void setControlesFisicos(ArrayList<ControlFisico> controlesFisicos) {
        this.controlesFisicos = controlesFisicos;
    }
    
    
    public void agregarLabores() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Labor nuevaLabor;
        int opcion;
        boolean estaAgregando =  true;
        
        while(estaAgregando){
            nuevaLabor = crearLabor();
            this.labores.add(nuevaLabor);
            System.out.println("¿Desea agregar otra labor?: 1. Si, 2. No");
            opcion = Integer.parseInt(entrada.readLine());
            if(opcion == 2){
                estaAgregando = false;
            }
        }
        
    }

    @Override
    public ProductoControl crearProductoControl() {
        try {
            int opcionProducto, frecuenciaAplicacion, periodoDeCarencia, valorProducto;
            String registroICA, nombreProducto, nombreHongo;
            Fecha fechaUltimaAplicacion = new Fecha(); 
            ProductoControl nuevoProducto = new ProductoControl();
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("------------");
            System.out.println("1. Crear producto control plagas.");
            System.out.println("2. Crear producto control fertilizantes.");
            System.out.println("3. Crear producto control hongo");
            System.out.println("------------");
            opcionProducto = Integer.parseInt(entrada.readLine());
            
            switch (opcionProducto) {
                case 1:
                    System.out.println("Nombre: ");
                    nombreProducto = entrada.readLine();
                    System.out.println("Registro ICA: ");
                    registroICA = entrada.readLine();
                    System.out.println("Frecuencia aplicacion: ");
                    frecuenciaAplicacion = Integer.parseInt(entrada.readLine());
                    System.out.println("Valor producto: ");
                    valorProducto = Integer.parseInt(entrada.readLine());
                    System.out.println("Fecha ultima aplicacion: ");
                    periodoDeCarencia = Integer.parseInt(entrada.readLine());
                    nuevoProducto = new ProductoControlPlagas(registroICA, nombreProducto, frecuenciaAplicacion, periodoDeCarencia);
                    break;
                case 2:
                    System.out.println("Nombre: ");
                    nombreProducto = entrada.readLine();
                    System.out.println("Registro ICA: ");
                    registroICA = entrada.readLine();
                    System.out.println("Frecuencia aplicacion: ");
                    frecuenciaAplicacion = Integer.parseInt(entrada.readLine());
                    System.out.println("Fecha de ultima aplicacion: ");
                    fechaUltimaAplicacion = entrada.readLine();
                    nuevoProducto = new ProductoControlFertilizantes(registroICA, nombreProducto, frecuenciaAplicacion, fechaUltimaAplicacion);
                    break;
                case 3:
                    System.out.println("Nombre: ");
                    nombreProducto = entrada.readLine();
                    System.out.println("Registro ICA: ");
                    registroICA = entrada.readLine();
                    System.out.println("Frecuencia aplicacion: ");
                    frecuenciaAplicacion = Integer.parseInt(entrada.readLine());
                    System.out.println("Fecha de ultima aplicacion: ");
                    fechaUltimaAplicacion = entrada.readLine();
                    nuevoProducto = new ProductoControlFertilizantes(registroICA, nombreProducto, frecuenciaAplicacion, fechaUltimaAplicacion);
                    break;
                    
                default:
                    throw new AssertionError();
            }   return nuevoProducto;
        } catch (IOException ex) {
            Logger.getLogger(Labor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ControlFisico crearControlFisico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarProductoControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarControlFisico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarInformacionProductosControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarInformacionControlesFisicos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
