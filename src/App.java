
import models.PaisEnum;
import models.TrajeModel;
import services.DBService;

public class App {
    public static void main(String[] args) throws Exception {
        DBService dbTrajes = new DBService("db/trajes.txt");
        dbTrajes.init();
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("qeqw", PaisEnum.Colombia, 0,"Hola")));
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("rfds", PaisEnum.CaboVerde, 1,"AD")));
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("qeqws", PaisEnum.Ecuador, 2,"ASDSA")));
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("qeq", PaisEnum.India, 3, "FCRD")));
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("qeqw", PaisEnum.Colombia, 0,"ADCDA")));
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("rfds", PaisEnum.CaboVerde, 1,"CADCA")));
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("qeqws", PaisEnum.Ecuador, 2,"DEWC")));
        System.out.println(dbTrajes.guardarRegistro(new TrajeModel("qeq", PaisEnum.India, 3, "WEWCDE")));

        dbTrajes.eliminarRegistro(1);
        dbTrajes.actualizaRegistro(0, new TrajeModel("Alejandro", PaisEnum.Colombia, 1000, "Adios"));
        for (TrajeModel trajeModel : dbTrajes.cargarRegistro()) {
            System.out.println(trajeModel);
        }

    }
}
