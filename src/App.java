import controllers.TrajeController;
import models.TiendaModel;
import views.Vista;
import views.VistaConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new VistaConsole();
        TiendaModel tienda = new TiendaModel();
        TrajeController control = new TrajeController(tienda, vista);
        control.inicializacion();
    }
}
