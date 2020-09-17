package especialistas.Panaderia;

import Clasificaciones.Celiaco;
import Clasificaciones.Comun;
import Clasificaciones.Hipertenso;
import Comida.Pan;

public class PanaderoMasterchefEstrategia implements EstrategiaPanadera {
    @Override
    public Pan cocinarPanComun() {
        return new Pan(new Comun());
    }

    @Override
    public Pan cocinarPanCeliaco() {
        return new Pan(new Celiaco());
    }

    @Override
    public Pan cocinarPanHipertenso() {
        return new Pan(new Hipertenso());
    }
}
