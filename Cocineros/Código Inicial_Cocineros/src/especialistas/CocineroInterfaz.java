package especialistas;

import Comida.Empanada;
import Comida.Pan;

public interface CocineroInterfaz {
    Empanada cocinarEmpanadaComun();
    Empanada cocinarEmpanadaCeliaca();
    Empanada cocinarEmpanadaHipertensa();
    Pan cocinarPanComun();
    Pan cocinarPanCeliaco();
    Pan cocinarPanHipertenso();
}
