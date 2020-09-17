package especialistas.Panaderia;

import Clasificaciones.Comun;
import Comida.Pan;

public class EstrategiaPanaderoComun implements EstrategiaPanadera{

	@Override
	public Pan cocinarPanComun() {
		return new Pan(new Comun());
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
