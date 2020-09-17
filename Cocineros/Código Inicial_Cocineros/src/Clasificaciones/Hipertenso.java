package Clasificaciones;

import Comida.Comida;

public class Hipertenso implements Clasificacion {
    @Override
    public int modificarCalorias(int calorias) {
        return calorias*90/100;
    }

    @Override
    public void comer(Comida comida) {
        comida.getClasificacion().serComidoPor(this);
    }

    @Override
    public void serComidoPor(Celiaco celiaco) {
        //excp
    }

    @Override
    public void serComidoPor(Hipertenso hipertenso) {

    }

    @Override
    public void serComidoPor(Comun comun) {

    }
}
