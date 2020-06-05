package patronesDiseño;

import model.ControlFisico;
import model.ProductoControl;

public interface ILabor {
    public ProductoControl crearProductoControl();
    public ControlFisico crearControlFisico();
    public void agregarProductoControl();
    public void agregarControlFisico();
    public void mostrarInformacionProductosControl();
    public void mostrarInformacionControlesFisicos();
}
