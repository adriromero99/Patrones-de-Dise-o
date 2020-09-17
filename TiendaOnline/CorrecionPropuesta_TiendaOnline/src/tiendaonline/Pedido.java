package tiendaonline;

import Cupones.Cupon;
import Cupones.SinCupon;
import Envio.Envio;
import Productos.Producto;
import Envio.SinEnvio;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Producto> productos;
    private Cupon cupon;
    private Envio envio;

    public Pedido(ArrayList<Producto> productos){
        this.productos = productos;
        this.cupon = new SinCupon();
        this.envio = new SinEnvio();
    }

    public void setEnvio(Envio envio){
        this.envio = envio;
    }

    public void usarCupon(Cupon cupon){
        this.cupon = cupon;
    }

    public double calcularPrecio(){
        double precio = this.envio.recargar(this.precioDeLosProductos(), cupon);
        return precio;
    }

    public ArrayList<Producto> getProductos(){
        return this.productos;
    }

    private double precioDeLosProductos(){
        double precioDeLosProductos = 0;
        for(Producto producto : productos){
            precioDeLosProductos += producto.getPrecio();
        }
        return  precioDeLosProductos;
    }

}
