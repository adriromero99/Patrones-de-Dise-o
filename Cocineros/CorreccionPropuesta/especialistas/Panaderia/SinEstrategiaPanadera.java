package especialistas.Panaderia;

import Comida.Pan;

public class SinEstrategiaPanadera implements EstrategiaPanadera {
    @Override
    public Pan cocinarPanComun() {
        return null;
    }

    @Override
    public Pan cocinarPanCeliaco() {
        return null;
    }

    @Override
    public Pan cocinarPanHipertenso() {
        return null;
    }
}
