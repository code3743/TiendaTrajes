import controllers.TiendaController;
import views.View;
import views.trajes.Inicio;

public class App {
    public static void main(String[] args) throws Exception {
        // Vista vista = new VistaConsole();
        // TiendaModel tienda = new TiendaModel();
        // TrajeController control = new TrajeController(tienda, vista);
        // control.inicializacion();
        View inicio = (View) new Inicio();
        new TiendaController(inicio);
    }
}
