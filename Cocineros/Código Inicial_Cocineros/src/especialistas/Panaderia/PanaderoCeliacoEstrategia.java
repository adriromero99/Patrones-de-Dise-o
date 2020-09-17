package especialistas.Panaderia;

import Clasificaciones.Celiaco;
import Clasificaciones.Comun;
import Comida.Pan;

public class PanaderoCeliacoEstrategia implements EstrategiaPanadera {

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
		return null;
	}
}
