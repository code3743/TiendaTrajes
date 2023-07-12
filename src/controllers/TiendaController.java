package controllers;

import models.Inventario;
import models.TiendaModel;
import services.DBService;

public class TiendaController {
    TiendaModel tienda;
    DBService dbAlmacen = new DBService("db/trajes.txt");
    DBService dbVentas = new DBService("db/ventas.txt");

    TiendaController() {
        dbAlmacen.init();
        dbVentas.init();
        tienda = new TiendaModel(dbAlmacen.cargarRegistro());
        tienda.setInventario(new Inventario(dbVentas.cargarRegistro()));
    }




}
