package models;

import java.util.ArrayList;

public class TiendaModel {
    private ArrayList<TrajeModel> trajes;
    public TiendaModel(){
        trajes = new ArrayList<TrajeModel>();
    }

    public TiendaModel(ArrayList<TrajeModel> trajes){
        this.trajes = trajes;
    }

    public boolean insetarTraje(TrajeModel nuevoTraje){
        return trajes.add(nuevoTraje);
    }

     public boolean eliminarTraje(int index){
        return trajes.remove(index) != null;
    }

    public int buscarTrajeNombre(String nombre){
        for (int i=0; i< trajes.size(); i++) {
            if(trajes.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<TrajeModel> listadoDeTrajes(){
        return  trajes;
    }

    public void actualizarTraje(TrajeModel traje, int index){
        trajes.set(index, traje);
    }
    public boolean comprarTraje(int index){
        return true;
    }

}
