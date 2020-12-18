package especialistas.Empanadero;

import Comida.Empanada;

public class SinEstrategiaEmpanadera implements EstrategiaEmpanadera {
    @Override
    public Empanada cocinarEmpanadaComun() {
        return null;
    }

    @Override
    public Empanada cocinarEmpanadaCeliaca() {
        return null;
    }

    @Override
    public Empanada cocinarEmpanadaHipertensa() {
        return null;
    }
}
