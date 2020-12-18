package Envio;

import Cupones.Cupon;

public class EnvioInternacional implements Envio {

    private double recargo;

    public EnvioInternacional(){
        this.recargo = 1.2;
    }

    public double recargar(double precio, Cupon cupon){
        return cupon.modificarPrecio(precio*recargo, this);
    }
}
