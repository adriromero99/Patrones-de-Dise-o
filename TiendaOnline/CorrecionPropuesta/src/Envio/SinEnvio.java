package Envio;


import Cupones.Cupon;

public class SinEnvio implements Envio {

    private double recargo;

    @Override
    public double recargar(double precio, Cupon cupon){
        return precio*recargo; //DEBE DEVOLVER EXCP
    }

}
