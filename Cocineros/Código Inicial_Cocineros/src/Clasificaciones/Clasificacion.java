package Clasificaciones;

import Comida.Comida;


public interface Clasificacion {
    int modificarCalorias(int calorias);
    void comer(Comida comida);
    void serComidoPor(Celiaco celiaco);
    void serComidoPor(Hipertenso hipertenso);
    void serComidoPor(Comun comun);
}
