package models;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<TrajeModel> ventas;

    public ArrayList<TrajeModel> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<TrajeModel> ventas) {
        this.ventas = ventas;
    }

    public Inventario(){
        ventas = new ArrayList<TrajeModel>();
    }

    public Inventario(ArrayList<TrajeModel> inventario){
        ventas = inventario;
    }

    public boolean nuevaVenta(TrajeModel traje){
       return  ventas.add( traje);
    }
    
}
