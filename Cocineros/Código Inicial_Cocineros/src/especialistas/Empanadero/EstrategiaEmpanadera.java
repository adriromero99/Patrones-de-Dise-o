package especialistas.Empanadero;

import Comida.Empanada;

public interface EstrategiaEmpanadera {
    Empanada cocinarEmpanadaComun();
    Empanada cocinarEmpanadaCeliaca();
    Empanada cocinarEmpanadaHipertensa();
}
