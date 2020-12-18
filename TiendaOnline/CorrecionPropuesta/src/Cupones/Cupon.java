package Cupones;

import Envio.Envio;
import Envio.EnvioInternacional;
import Envio.EnvioLocal;
import Envio.SinEnvio;

public abstract class Cupon {

    protected double descuento;

    public double modificarPrecio(double precio, EnvioLocal envioLocal) {
        return precio*descuento;
    }
    public double modificarPrecio(double precio, EnvioInternacional envioInternacional) {
        return precio*descuento;
    }
}
