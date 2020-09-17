package especialistas.Panaderia;

import Comida.Pan;

public interface EstrategiaPanadera {
    Pan cocinarPanComun();
    Pan cocinarPanCeliaco();
    Pan cocinarPanHipertenso();
}
