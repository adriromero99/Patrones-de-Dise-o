package Cupones;

import Envio.EnvioInternacional;
import Envio.EnvioLocal;

public class CuponEnvioLocal extends Cupon {

    public CuponEnvioLocal(){
        this.descuento = 1;
    }

    @Override
    public double modificarPrecio(double precio, EnvioLocal envioLocal) {
        return 0;
    }

}
