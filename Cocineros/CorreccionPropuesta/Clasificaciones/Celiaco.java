package Clasificaciones;

import Comida.Comida;
import comensales.Persona;

public class Celiaco implements Clasificacion {
    @Override
    public int modificarCalorias(int calorias) {
        return calorias;
    }

    @Override
    public void comer(Comida comida) {
        comida.getClasificacion().serComidoPor(this);
    }

    @Override
    public void serComidoPor(Celiaco celiaco) {

    }

    @Override
    public void serComidoPor(Hipertenso hipertenso) {
        //excp
    }

    @Override
    public void serComidoPor(Comun comun) {

    }


}
