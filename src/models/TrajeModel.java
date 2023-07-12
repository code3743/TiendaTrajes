package models;

public class TrajeModel {
    private String nombre;
    private PaisEnum paisOrigen;
    private double precio;
    private String material;

   
    public TrajeModel(String nombre, PaisEnum paisOrigen, double precio, String material) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.precio = precio;
        this.material = material;
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
     public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


}
