package tiendaonline;

import Cupones.Cupon;
import Envio.Envio;
import Productos.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TiendaOnline {

    private String nombre;

    private Map<String, Integer> stockProductos = new HashMap<String, Integer>();

    public String getNombre() {
        return nombre;
    }

    public TiendaOnline(String nombre){
        this.nombre = nombre;
    }

    public Map<String, Integer> getStockProductos() {
        return stockProductos;
    }

    public void setStockProductos(Map<String, Integer> stockProductos) {
        this.stockProductos = stockProductos;
    }

   public void reducirDelStock(Pedido pedido)  {
        for(Producto producto : pedido.getProductos()){
            int stock = stockProductos.get(producto.getNombre());
            stock -= producto.getCantidad();
            stockProductos.put(producto.getNombre(), stock);
        }
    }

    public double cobrarPedido(Pedido pedido) {
        this.reducirDelStock(pedido);
        return pedido.calcularPrecio();
    }
}
