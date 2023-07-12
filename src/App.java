import controllers.TiendaController;
import models.TiendaModel;
import views.Vista;
import views.VistaConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new VistaConsole();
        TiendaModel tienda = new TiendaModel();
        TiendaController control = new TiendaController(tienda, vista);
        control.inicializacion();
    }
}
