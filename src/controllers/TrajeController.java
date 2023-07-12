package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
        System.out.println(tienda.insetarTraje(traje));
    }










    @Override
    public void actionPerformed(ActionEvent e) { 
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
