package patronesDiseño;

import java.io.IOException;
import model.ControlFisico;

public interface ILabor {
    public IProductoControl crearProductoControl()throws IOException;
    public IControlFisico crearControlFisico() throws IOException;
    public void agregarProductoControl()throws IOException;
    public void agregarControlFisico()throws IOException;
    public void mostrarInformacionProductosControl();
    public void mostrarInformacionControlesFisicos();
}
