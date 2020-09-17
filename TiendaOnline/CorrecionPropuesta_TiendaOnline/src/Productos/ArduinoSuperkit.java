package Productos;

public class ArduinoSuperkit extends Producto{
    public ArduinoSuperkit(int cantidad){
        this.cantidad = cantidad;
        this.nombre = "ArduinoSuperKit";
        this.precio = 4000.0* cantidad;
    }
}
