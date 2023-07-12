import controllers.TiendaController;
import views.View;
import views.trajes.inicio;

public class App {
    public static void main(String[] args) throws Exception {
        View inicio = (View) new inicio();
        new TiendaController(inicio);
    }
}
