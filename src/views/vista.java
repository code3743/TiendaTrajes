package views;

import java.util.ArrayList;
import controllers.TrajeController;
import models.TrajeModel;

public interface Vista {
    public void iniciar(TrajeController controller);
    public TrajeModel getTraje();
    public void actualizarTraje(int index);
    public void eliminarTraje(int index);
    public void buscarTraje(int index);
    public ArrayList<String> listarTrajes();
    public void comprarTraje(int index);
}
