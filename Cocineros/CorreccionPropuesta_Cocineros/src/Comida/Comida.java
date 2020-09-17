package Comida;

import Clasificaciones.Clasificacion;

public abstract class Comida {
    protected int calorias;
    protected Clasificacion clasificacion;

    public int calcularCalorias(){
        return clasificacion.modificarCalorias(calorias);
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
