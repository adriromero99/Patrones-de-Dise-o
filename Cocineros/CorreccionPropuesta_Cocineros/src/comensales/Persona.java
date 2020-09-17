package comensales;

import Clasificaciones.Clasificacion;
import Comida.Comida;

public class Persona {
	
	private int calorias;
	private Clasificacion clasificacion;

	public Persona(Clasificacion clasificacion){
		this.calorias = 0;
		this.clasificacion = clasificacion;
	}

	public void comer(Comida comida) {
		clasificacion.comer(comida);
		this.aumentarCalorias(comida.calcularCalorias());
	}

	private void aumentarCalorias(int calorias){
		this.calorias += calorias;
	}

	public int getCalorias(){
		return this.calorias;
	}
}
