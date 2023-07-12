package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import models.PaisEnum;
import models.TiendaModel;
import models.TrajeModel;
import views.Vista;

public class TiendaController implements  ActionListener{
    Vista vista;
    TrajeModel traje;
    public TiendaModel tienda;

    public void inicializacion(){
        vista.iniciar(this);
        tienda = new TiendaModel();
    }
     public TiendaController(TiendaModel tienda, Vista vista){
        this.tienda = tienda;
        this.vista = vista;
    }
    public TiendaModel getTienda(){
        return tienda;
    }
    
    public void insertarTraje(){
        traje = vista.getTraje();
        tienda.insetarTraje(traje);
    }

    public void listarTrajes(){
        vista.listarTrajes(tienda.listadoDeTrajes());
    }

    public void actualizarTraje(int index,TrajeModel trajecito){
        traje = tienda.listadoDeTrajes().get(index-1);
        if(trajecito.getNombre() != null){
            traje.setNombre(trajecito.getNombre());    
        }
        if(trajecito.getPaisOrigen() != null){
            traje.setPaisOrigen(trajecito.getPaisOrigen());
        }
        if(trajecito.getMaterial() != null){
            traje.setMaterial(trajecito.getMaterial());
        }
        if(trajecito.getPrecio() != 0){
            traje.setPrecio(trajecito.getPrecio());
        }
        vista.actualizarTraje(index-1,traje);
        
    }
    public void buscarTrajeNombre(String name){
        vista.buscarTraje(name);
    }
    public void eliminarTraje(int index){
        vista.eliminarTraje(index);
    }









    @Override
    public void actionPerformed(ActionEvent e) {}
    
}
