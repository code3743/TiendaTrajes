package controllers;

import views.View;
import models.TrajeModel;
import models.Inventario;
import models.TiendaModel;
import services.DBService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaController {
    TiendaModel tienda;
    View vista;
    Acciones acciones;
    DBService dbAlmacen = new DBService("db/trajes.txt");
    DBService dbVentas = new DBService("db/ventas.txt");

    public TiendaController(View vista) {
        dbAlmacen.init();
        dbVentas.init();
        tienda = new TiendaModel(dbAlmacen.cargarRegistro());
        tienda.setInventario(new Inventario(dbVentas.cargarRegistro()));
        this.vista = vista;
        vista.init(this);
    }

    public void setAccion(Acciones accion) {
        acciones = accion;
    }

    public void insertarTraje(TrajeModel traje) {
        if (tienda.insetarTraje(traje)) {
            dbAlmacen.guardarRegistro(traje);
        }
    }

    public int buscarTraje(String nombre) {
        return tienda.buscarTrajeNombre(nombre);
    }

    public boolean eliminarTraje(String nombre) {
        int index = buscarTraje(nombre);
        if (index == -1)
            return false;
        if (tienda.eliminarTraje(index)) {
            dbAlmacen.eliminarRegistro(index);
            return true;
        }
        return false;
    }

    public boolean actualizarTraje(int index, TrajeModel nuevoTraje) {
     
        if (index == -1)
            return false;
        if (tienda.actualizarTraje(index, nuevoTraje)) {
           System.out.println( dbAlmacen.actualizaRegistro(index, nuevoTraje));
            return true;
        }
        return false;
    }
    public boolean comprarTraje(String nombre){
         int index = buscarTraje(nombre);
        if (index == -1)
            return false;
        if(tienda.comprarTraje(index)){
            dbVentas.guardarRegistro(tienda.listarTrajes().get(index));
            return true;
        }
        return false;
    }

    public TiendaModel getTienda() {
        return tienda;
    }

    public void actionPerformed(Acciones acciones) {
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
                vista.listadoDeTrajes(tienda.listarTrajes());
                break;
            case Comprar:
                break;
        }
    }

}
