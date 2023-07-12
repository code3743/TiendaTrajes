package controllers;

import models.Action;
import models.Inventario;
import models.TiendaModel;
import models.TrajeModel;
import services.DBService;
import views.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaController implements ActionListener {
    TiendaModel tienda;
    Vista vista;
    Action acciones;
    DBService dbAlmacen = new DBService("db/trajes.txt");
    DBService dbVentas = new DBService("db/ventas.txt");

    TiendaController(Vista vista) {
        dbAlmacen.init();
        dbVentas.init();
        tienda = new TiendaModel(dbAlmacen.cargarRegistro());
        tienda.setInventario(new Inventario(dbVentas.cargarRegistro()));
        this.vista = vista;
        vista.iniciar(this);
    }

    public void setAccion(Action accion) {
        acciones = accion;
    }


    public void insertarTraje(TrajeModel traje){
        tienda.insetarTraje(traje);
    }

    public void listarTrajes(){
        vista.listarTrajes(tienda.listarTrajes());
    }

    public void actualizarTraje(int index,TrajeModel traje){
        vista.actualizarTraje(index,traje);
    }
    public void buscarTrajeNombre(String name){
        vista.buscarTraje(name);
    }
    public void eliminarTraje(int index){
        vista.eliminarTraje(index);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (acciones) {
            case Actualizar:
                
                break;
            case Buscar:
                break;
            case Eliminar:
                break;
            case Agregar:
                break;
            case Listar:
                break;
            case Comprar:
                break;
        }
    }

}
