package Envio;

import Cupones.Cupon;

public class EnvioLocal implements Envio {

    private double recargo;

   public EnvioLocal(){
       this.recargo = 1.1;
   }

    public double recargar(double precio, Cupon cupon){
        return cupon.modificarPrecio(precio*recargo, this);
    }
}
