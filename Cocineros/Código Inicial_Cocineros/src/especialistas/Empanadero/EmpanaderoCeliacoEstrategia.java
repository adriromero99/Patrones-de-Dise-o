package especialistas.Empanadero;

import Clasificaciones.Celiaco;
import Clasificaciones.Comun;
import Comida.Empanada;


public class EmpanaderoCeliacoEstrategia implements EstrategiaEmpanadera{
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
		return null;// EXCP
	}
}
