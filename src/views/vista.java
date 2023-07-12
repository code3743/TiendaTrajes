package views;

import java.util.ArrayList;

public interface vista {
    public void insertarTraje(TrajeModel traje);
    public void actualizarTraje(int index);
    public void eliminarTraje(int index);
    public void buscarTraje(int index);
    public ArrayList<String> listarTrajes();
    public void comprarTraje(int index);
}
