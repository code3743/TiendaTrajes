package models;

public class TrajeModel {
    private String nombre;
    private PaisEnum paisOrigen;
    private double precio;

    public TrajeModel(String nombre, PaisEnum paisOrigen, double precio) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PaisEnum getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisEnum paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
