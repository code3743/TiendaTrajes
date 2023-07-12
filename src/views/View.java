package views;

import java.util.ArrayList;

import controllers.TiendaController;
import models.TrajeModel;

public interface View {
    void init(TiendaController controller);

    public TrajeModel getTrajeModel();

    public void listadoDeTrajes(ArrayList<TrajeModel> trajes);

    public void historialCompras(ArrayList<TrajeModel> compras);

    public void actualizarTraje(int index);

}
