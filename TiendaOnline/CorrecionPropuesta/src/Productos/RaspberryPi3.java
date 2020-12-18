package Productos;

public class RaspberryPi3 extends Producto{
    public RaspberryPi3(int cantidad){
        this.cantidad = cantidad;
        this.nombre = "RaspberryPi3";
        this.precio = 3500.0* cantidad;
    }
}
