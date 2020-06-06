package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import patronesDiseño.IControlFisico;
import patronesDiseño.IProductoControl;
import patronesDiseño.IVivero;

public class Vivero implements IVivero{
    private int codigo;
    private String nombre;
    private String departamento;
    private String municipio;
    private ArrayList<Labor> labores = new ArrayList();

    public Vivero() {
    }

    public Vivero(int codigo, String nombre, String departamento, String municipio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.municipio = municipio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public ArrayList<Labor> getLabores() {
        return labores;
    }

    public void setLabores(ArrayList<Labor> labores) {
        this.labores = labores;
    }

    
    
        
    @Override
    public Labor crearLabor() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombreLabor;
        boolean estaAgregando = true;
        Labor nuevaLabor = new Labor();
        
        ArrayList<IProductoControl> productosControl = new ArrayList();
        IProductoControl nuevoProducto = new ProductoControl();
        
        ArrayList<IControlFisico> controlesFisicos = new ArrayList();
        IControlFisico nuevoControl = new ControlFisico();
        
        System.out.println("Nombre de la labor");
        nombreLabor = entrada.readLine();
        
        nuevaLabor.setNombre(nombreLabor);
        nuevaLabor.setProductosControl(productosControl);
        nuevaLabor.setControlesFisicos(controlesFisicos);
        
        nuevaLabor.agregarProductoControl();
        nuevaLabor.agregarControlFisico();
        
        
        return nuevaLabor;
    }
    
    @Override
    public void agregarLabor() throws IOException{
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        Labor nuevoLabor;
        int opcion;
        boolean estaAgregando = true;
        
        while(estaAgregando){
            nuevoLabor = crearLabor();
            this.labores.add(nuevoLabor);
            System.out.println("¿Desea agregar otra labor?: 1. Si, 2. No");
            opcion = Integer.parseInt(entrada.readLine());
            if(opcion == 2){
                estaAgregando = false;
            }
        }
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("");
        System.out.println("------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Municipio: " + this.municipio);
        System.out.println("------------");
        System.out.println("");
    }
    
    @Override
    public void mostrarInformacionLabores(){
        System.out.println("");
        
        System.out.println("Nombre vivero: " + this.nombre);
        System.out.println("Labores: ");
        
        for (Labor labor : this.labores) {
            System.out.println("---------------------------");
            System.out.println("Nombre labor: " + labor.getNombre());
            System.out.println("Productos control: ");
            labor.mostrarInformacionProductosControl();
            System.out.println("Controles fisicos: ");
            labor.mostrarInformacionControlesFisicos();
            System.out.println("");
        }
    }
    
}
