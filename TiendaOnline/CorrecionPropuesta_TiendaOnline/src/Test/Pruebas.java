package Test;

import Cupones.Cupon;
import Cupones.CuponEnvioLocal;
import Cupones.CyberMonday;
import Envio.EnvioLocal;
import Envio.EnvioInternacional;
import Productos.ArduinoKit;
import Productos.ArduinoSuperkit;
import Productos.Producto;
import org.junit.Test;
import tiendaonline.Pedido;
import tiendaonline.TiendaOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Pruebas {

    private static final double DELTA = 1e-15;

    @Test
    public void prueba02() {


        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("RaspberryPi3", 5);
        stockProductos.put("ArduinoKit", 6);
        stockProductos.put("ArduinoSuperKit", 2);

        TiendaOnline tienda = new TiendaOnline("Lo de Carlos");

        tienda.setStockProductos(stockProductos);

        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new ArduinoKit(3));
        productos.add(new ArduinoSuperkit(1));

        Pedido pedido = new Pedido(productos);
        pedido.setEnvio(new EnvioLocal());
        pedido.usarCupon(new CuponEnvioLocal());

        assertEquals(0, tienda.cobrarPedido(pedido), DELTA);
    }
}
