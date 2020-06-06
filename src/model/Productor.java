package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import patronesDiseño.IProductor;

public class Productor implements IProductor{
    private int documentoIdentidad;
    private String nombre;
    private String apellido;
    private ArrayList<Vivero> viveros = new ArrayList();

    public Productor() {
    }

    public Productor(int documentoIdentidad, String nombre, String apellido) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Vivero> getViveros() {
        return viveros;
    }

    public void setViveros(ArrayList<Vivero> viveros) {
        this.viveros = viveros;
    }
    
    
    @Override
    public Vivero crearVivero() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int codigo;
        String nombre, departamento, municipio;
        ArrayList<Labor> labores = new ArrayList();
        Vivero nuevoVivero = new Vivero();
        
        System.out.println("Codigo vivero: ");
        codigo = Integer.parseInt(entrada.readLine());
        System.out.println("Nombre Vivero: ");
        nombre = entrada.readLine();
        System.out.println("Departamento en el que se encuentra: ");
        departamento = entrada.readLine();
        System.out.println("Municipio en el que se encuentra: ");
        municipio = entrada.readLine();
        
        nuevoVivero.setCodigo(codigo);
        nuevoVivero.setNombre(nombre);
        nuevoVivero.setDepartamento(departamento);
        nuevoVivero.setMunicipio(municipio);
        nuevoVivero.setLabores(labores);        
        nuevoVivero.agregarLabor();
        
        return nuevoVivero;
    }
    
    @Override
    public void agregarVivero() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Vivero nuevoVivero;
        int opcion;
        boolean estaAgregando = true;
        
        while(estaAgregando){
            nuevoVivero = crearVivero();
            this.viveros.add(nuevoVivero);
            System.out.println("¿Desea agregar otro vivero?: 1. Si, 2. No");
            opcion = Integer.parseInt(entrada.readLine());
            if(opcion == 2){
                estaAgregando = false;
            }
        }
    }
    
    @Override
    public void mostrarInformacionProductor(){
        System.out.println("");
        System.out.printf("Nombre: %s \n", this.nombre);
        System.out.printf("Apellido: %s \n", this.apellido);
        System.out.printf("Documento identidad: %d \n", this.documentoIdentidad);
        System.out.println("");
    }

    @Override
    public void mostrarInformacionViveros() {
        for (Vivero vivero : viveros) {
            vivero.mostrarInformacion();
        }
    }

    @Override
    public void mostrarInformacionViverosLabores() {
        for (Vivero vivero : viveros) {
            vivero.mostrarInformacionLabores();
        }
    }
    
    
    
   
}
