package views;

import java.util.ArrayList;
import controllers.TrajeController;
import models.TrajeModel;

public interface Vista {
    public void iniciar(TrajeController controller);
    public TrajeModel getTraje();
    public void actualizarTraje(int index, TrajeModel traje);
    public void eliminarTraje(int index);
    public void buscarTraje(int index);
    public void listarTrajes(ArrayList<TrajeModel> trajes);
    public void comprarTraje(int index);
}
