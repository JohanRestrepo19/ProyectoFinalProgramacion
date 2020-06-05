package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Vivero {
    private int codigoVivero;
    private String nombre;
    private String departamento;
    private String municipio;
    private ArrayList<Labor> procesos = new ArrayList();

    
    
        
    private Labor crearLabor() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombreLabor;
        ArrayList<Labor> labores = new ArrayList(); 
        Labor nuevoLabor = new Labor();
        
        System.out.println("Nombre proceso: ");
        nombreLabor = entrada.readLine();
        
        nuevoLabor.setLabores(labores);
        nuevoLabor.setNombreLabor(nombreLabor);
        
        nuevoLabor.agregarLabores();
        
        return nuevoLabor;
    }
    
    public void agragarLabores() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Labor nuevoLabor;
        int opcion;
        boolean estaAgregando = true;
        
        while(estaAgregando){
            nuevoLabor = crearLabor();
            this.procesos.add(nuevoLabor);
            System.out.println("¿Desea agregar otro proceso?: 1. Si, 2. No");
            opcion = Integer.parseInt(entrada.readLine());
            if(opcion == 2){
                estaAgregando = false;
            }
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("");
        System.out.println("------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Codigo: " + this.codigoVivero);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Municipio: " + this.municipio);
        System.out.println("------------");
        System.out.println("");
    }
    
    public void mostrarInformacionLabores(){
        System.out.println("");
        
        System.out.println("Nombre vivero: " + this.nombre);
        System.out.println("Labores: ");
        for (Labor proceso : this.procesos) {
            System.out.println("\tNombre proceso: " + proceso.getNombreProceso());
            System.out.println("\tLabores asociadas al proceso: ");
            for (Labor labor : proceso.getLabores()) {
                labor.mostrarInformacion();
            }
        }
        System.out.println("");
    }
    
    
}
