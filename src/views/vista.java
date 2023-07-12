package views;

import java.util.ArrayList;

import controllers.TiendaController;

import models.TrajeModel;

public interface Vista {

    public void iniciar(TiendaController controller);
    public TrajeModel getTraje();
    public void actualizarTraje(int index, TrajeModel traje);
    public void eliminarTraje(int index);
    public void buscarTraje(String name);
    public void listarTrajes(ArrayList<TrajeModel> trajes);
    public void comprarTraje(int index);
    public void mostrarComprar(ArrayList<TrajeModel> compras);
}
