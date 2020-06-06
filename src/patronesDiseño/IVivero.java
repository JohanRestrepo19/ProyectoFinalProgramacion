package patronesDiseño;

import java.io.IOException;

public interface IVivero {
    public ILabor crearLabor() throws IOException;
    public void agregarLabor() throws IOException;
    public void mostrarInformacion();
    public void mostrarInformacionLabores();
}
