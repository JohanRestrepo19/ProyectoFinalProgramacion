package patronesDiseño;

import java.io.IOException;
import model.Vivero;

public interface IProductor {
    public Vivero crearVivero()throws IOException;
    public void agregarVivero()throws IOException;
    public void mostrarInformacionProductor();
    public void mostrarInformacionViveros();
    public void mostrarInformacionViverosLabores();
}
