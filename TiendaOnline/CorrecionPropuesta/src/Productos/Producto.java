package Productos;

public abstract class Producto {
    protected double precio;
    protected String nombre;
    protected int cantidad;

    public double getPrecio(){
        return this.precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }
}
