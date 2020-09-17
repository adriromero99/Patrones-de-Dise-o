package especialistas.Empanadero;

import Clasificaciones.Celiaco;
import Clasificaciones.Comun;
import Clasificaciones.Hipertenso;
import Comida.Empanada;

public class EmpanaderoMasterchefEstrategia implements EstrategiaEmpanadera {
    @Override
    public Empanada cocinarEmpanadaComun() {
        return new Empanada(new Comun());
    }

    @Override
    public Empanada cocinarEmpanadaCeliaca() {
        return new Empanada(new Celiaco());
    }

    @Override
    public Empanada cocinarEmpanadaHipertensa() {
        return new Empanada(new Hipertenso());
    }
}
