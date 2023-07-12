package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.TrajeController;
import models.PaisEnum;
import models.TrajeModel;

public class VistaConsole implements Vista{
    String nombre,precio,indice, material;
    PaisEnum paisOrigen;
    TrajeModel traje;
    TrajeController controller;

    @Override
    public void iniciar(TrajeController control) {
        boolean continuar = true;
        Scanner read = new Scanner(System.in);
        this.controller = control;
        System.out.println("Prueba");
        System.out.print("Nombre: ");
        nombre = read.nextLine();
        System.out.print("Precio: ");
        precio = read.nextLine();
        System.out.print("Material: ");
        material = read.nextLine();
        System.out.print("Pais: ");
        String pais = read.nextLine();

        for (PaisEnum paises : PaisEnum.values()){
            if((paises.toString().toLowerCase().equals(pais.toLowerCase()))){
                paisOrigen = PaisEnum.valueOf(pais.replaceAll(" ",""));
            }
        }
        read.close();
        traje = new TrajeModel(nombre, paisOrigen, Integer.parseInt(precio),material);
        control.insertarTraje();
    }

    @Override
    public TrajeModel getTraje() {
        return traje;
    }

    @Override
    public void actualizarTraje(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarTraje'");
    }

    @Override
    public void eliminarTraje(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarTraje'");
    }

    @Override
    public void buscarTraje(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTraje'");
    }

    @Override
    public ArrayList<String> listarTrajes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTrajes'");
    }

    @Override
    public void comprarTraje(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprarTraje'");
    }
    
}
