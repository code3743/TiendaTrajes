package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.TiendaController;
import models.PaisEnum;
import models.TiendaModel;
import models.TrajeModel;

public class VistaConsole implements Vista{
    String nombre,precio,indice, material;
    PaisEnum paisOrigen;
    TrajeModel traje;
    TiendaController controller;

    @Override
    public void iniciar(TiendaController control) {
        boolean continuar = true;
        Scanner read = new Scanner(System.in);
        this.controller = control;
        
        while(continuar){
            System.out.print("\n");
            System.out.println("----WELCOME-----");
            System.out.println("----OPCIONES----");
            System.out.println("1. Insertar traje");
            System.out.println("2. Actualizar traje"); 
            System.out.println("3. Eliminar traje"); 
            System.out.println("4. Buscar traje por nombre");
            System.out.println("5. Listar todos los trajes");
            System.out.println("6. Salir");
            System.out.print("\n");
            
            System.out.print("Seleccion una opcion: ");
            String eleccion = read.nextLine();
            
            switch (Integer.parseInt(eleccion)){
                case 1: 
                    System.out.println("\nDatos del traje\n");
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
                    traje = new TrajeModel(nombre, paisOrigen, Integer.parseInt(precio),material);
                    control.insertarTraje(); 
                    System.out.println("Traje insertado con exito"); break;
                case 2: 
                    control.listarTrajes();
                    System.out.print("\nSelecione el numero en lista del dulce a modificar: ");
                    indice = read.nextLine();
                    System.out.println("\n¿Que desea modificar?");
                    System.out.println("\n1. Modificar nombre");
                    System.out.println("2. Modificar pais de origen");
                    System.out.println("3. Modificar material de fabricacion");
                    System.out.println("4. Modificar precio");

                    System.out.print("Selecione una opcion: "); 
                    String decision = read.nextLine();
                    
                    switch(Integer.parseInt(decision)){
                        case 1: 
                            System.out.print("Digite el nuevo nombre: ");
                            nombre = read.nextLine();
                            traje = new TrajeModel(nombre,null,0,null);
                            control.actualizarTraje(Integer.parseInt(indice),traje);
                            
                            System.out.println("Nombre actualizado correctamente");
                            break;
                        case 2:
                            System.out.print("Digite el nuevo pais de origen: ");
                            String ayuda = read.nextLine();
                            for (PaisEnum paises : PaisEnum.values()){
                                if((paises.toString().toLowerCase().equals(ayuda.toLowerCase()))){
                                    paisOrigen = PaisEnum.valueOf(ayuda.replaceAll(" ",""));
                                }   
                            }
                            traje = new TrajeModel(null,paisOrigen,0,null);
                            control.actualizarTraje(Integer.parseInt(indice),traje);
                            System.out.println("Pais de origen actualizado correctamente");
                            break;
                        case 3:
                            System.out.print("Digite el nuevo material de fabricacion: ");
                            material = read.nextLine();
                            traje = new TrajeModel(null,null,0,material);
                            control.actualizarTraje(Integer.parseInt(indice),traje);
                            System.out.println("Material de fabricacion actualizado correctamente");
                            break;
                        case 4:
                            System.out.print("Digite el nuevo precio: ");
                            precio = read.nextLine();
                            traje = new TrajeModel(null,null,Integer.parseInt(precio),null);
                            control.actualizarTraje(Integer.parseInt(indice),traje);
                            System.out.println("Precio actualizado correctamente");
                            break;
                    }break;
                case 3:  
                    control.listarTrajes();
                    System.out.print("\nDigite el numero en lista del dulce a eliminar: ");
                    indice = read.nextLine();
                    System.out.println("Dulce eliminado correctamente");
                    control.eliminarTraje((Integer.parseInt(indice))-1);break;
                case 4: 
                    System.out.print("Digite el nombre del dulce a buscar: ");
                    String name = read.nextLine();
                    control.buscarTrajeNombre(name); break;
                case 5: control.listarTrajes(); break;
                case 6: System.exit(0); break;
                default:
                    break;
            }
           
        }
        control.actionPerformed(null);
        read.close();
        
    }

    @Override
    public TrajeModel getTraje() {
        return traje;
    }

    @Override
    public void actualizarTraje(int index, TrajeModel traje) {
        controller.getTienda().actualizarTraje(traje,index);
    }

    @Override
    public void eliminarTraje(int index) {
        controller.getTienda().eliminarTraje(index);
    }

    @Override
    public void buscarTraje(String name) {
        controller.getTienda().buscarTrajeNombre(nombre);

    }

    @Override
    public void listarTrajes(ArrayList<TrajeModel> trajes) {
        System.out.print("\n -- Lista de trajes --"+"\n");
        int i=1;
        for(TrajeModel traje : trajes){
            System.out.print(i+". " + traje.getNombre() + " \n");
            i++;
        }
    }

    @Override
    public void comprarTraje(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprarTraje'");
    }
    
}
