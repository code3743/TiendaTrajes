package services;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import models.PaisEnum;
import models.TrajeModel;

public class DBService {
    private String path;
    private RandomAccessFile db;

    public DBService(String path) {
        this.path = path;
    }

    public void init() {
        try {
             db = new RandomAccessFile(path, "rw");
            System.out.println("DB Inicializada");
        } catch (Exception e) {
            System.out.println("No se pudo iniciar la db - " + e.toString());
        }
    }

    public ArrayList<TrajeModel> cargarRegistro() {
        ArrayList<TrajeModel> trajes = new ArrayList<TrajeModel>();
        try {
            db.seek(0);
            String linea = "";
            while ((linea = db.readLine()) != null) {
                if(linea.isEmpty()) continue;
                String[] datosTraje = linea.split(",");
                TrajeModel traje = new TrajeModel(datosTraje[0].trim(), PaisEnum.valueOf(datosTraje[1].trim().replaceAll(" ", "")),
                        Double.parseDouble(datosTraje[2].trim()), datosTraje[3]);
                trajes.add(traje);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return trajes;
    }

    public boolean actualizaRegistro(int index, TrajeModel trajeModel) {
        try {
            db.seek(0);
            int contador = -1;
            String linea = "";
            String contenido = "";
            while ((linea = db.readLine()) != null) {
                if(linea.isEmpty()) continue;
                contador++;
                if(contador == index){
                    contenido += trajeModel.toString() +"\n";
                }else {
                    contenido += linea +"\n";
                }
            }
          
            db.setLength(0);
            db.writeBytes(contenido);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean guardarRegistro(TrajeModel trajeModel) {
        try {
            db.seek(db.length());
            db.writeBytes("\n" + trajeModel.toString());     
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean eliminarRegistro(int index){
       try {
            db.seek(0);
            int contador = -1;
            String linea = "";
            String contenido = "";
          
            while ((linea = db.readLine()) != null) {
                System.out.println("Hola");
                if(linea.isEmpty()) continue;
                contador++;
                System.out.println(contador);
                if(contador != index){
                contenido += linea +"\n";
                System.out.println(linea);
                }
            }
            db.setLength(0);
            db.writeBytes(contenido);
            System.out.println(contenido);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
