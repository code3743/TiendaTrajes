package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import models.PaisEnum;
import models.TiendaModel;
import models.TrajeModel;
import views.Vista;

public class TrajeController implements  ActionListener{
    Vista vista;
    TrajeModel traje;
    TiendaModel tienda;

    public void inicializacion(){
        vista.iniciar(this);
    }
     public TrajeController(TiendaModel tienda, Vista vista){
        this.tienda = tienda;
        this.vista = vista;
    }
    
    public void insertarTraje(){
        traje = vista.getTraje();
        tienda.insetarTraje(traje);
    }

    public void listarTrajes(){
        vista.listarTrajes(tienda.listadoDeTrajes());
    }

    public void actualizarTraje(int index, String nombre, String material,int precio, PaisEnum paisOrigen){
        traje = tienda.listadoDeTrajes().get(index-1);
        if(nombre != null){
            traje.setNombre(nombre);    
        }
        if(paisOrigen != null){
            traje.setPaisOrigen(paisOrigen);
        }
        if(material != null){
            traje.setMaterial(material);
        }
        if(precio != 0){
            traje.setPrecio(precio);
        }
        tienda.actualizarDulce(traje, index-1);
        
    }

    public void eliminarTraje(int index){
        tienda.eliminarTraje(index);
    }









    @Override
    public void actionPerformed(ActionEvent e) {}
    
}
