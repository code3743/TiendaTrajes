package models;

import java.util.ArrayList;

public class TiendaModel {
    private ArrayList<TrajeModel> trajes;
    private Inventario inventario;

    public TiendaModel() {
        trajes = new ArrayList<TrajeModel>();

    }

    public void setInventario(Inventario inventario){
        this.inventario = inventario;
    }

    public TiendaModel(ArrayList<TrajeModel> trajes) {
        this.trajes = trajes;

    }

    public boolean insetarTraje(TrajeModel nuevoTraje) {
        return trajes.add(nuevoTraje);
    }

    public boolean eliminarTraje(int index) {
        return trajes.remove(index) != null;
    }

    public boolean actualizarTraje(int index, TrajeModel traje) {
        return trajes.set(index, traje) != null;
    }

    public int buscarTrajeNombre(String nombre) {
        for (int i = 0; i < trajes.size(); i++) {
            if (trajes.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public boolean comprarTraje(int index) {
        return inventario.nuevaVenta(trajes.get(index));
    }

}
