package Productos;

public class ArduinoKit extends Producto {
    public ArduinoKit(int cantidad){
        this.cantidad = cantidad;
        this.nombre = "ArduinoKit";
        this.precio = 2000.0*cantidad;
    }
}
