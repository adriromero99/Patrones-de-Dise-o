package test;


import Clasificaciones.Celiaco;
import Clasificaciones.Comun;
import Clasificaciones.Hipertenso;
import comensales.Persona;
import especialistas.Cocinero;
import especialistas.Panaderia.EstrategiaPanaderoComun;
import especialistas.Panaderia.PanaderoCeliacoEstrategia;
import especialistas.Panaderia.PanaderoMasterchefEstrategia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonaTest {

	@Test
	public void personaNoCeliacaComeCosasParaNoCeliacosEstaTodoBien() {
		
		Persona personaNoCeliaca = new Persona(new Comun());
		
		Cocinero panadero = new Cocinero();
		panadero.setEstrategiaPanadera(new EstrategiaPanaderoComun());
		personaNoCeliaca.comer(panadero.cocinarPanComun());
		assertEquals(personaNoCeliaca.getCalorias(),10);
	}
	
	@Test
	public void personaCeliacaComeCosasParaCeliacosEstaTodoBien() {
		
		Persona celiaco = new Persona(new Celiaco());
		
		Cocinero panaderoCeliaco = new Cocinero();
		panaderoCeliaco.setEstrategiaPanadera(new PanaderoCeliacoEstrategia());
		celiaco.comer(panaderoCeliaco.cocinarPanCeliaco());
		assertEquals(celiaco.getCalorias(),10);

	}

	@Test
	public void personaCeliacaComeCosasdassParaCeliacosEstaTodoBien() {

		Persona hipertenso = new Persona(new Hipertenso());

		Cocinero cocinero = new Cocinero();
		cocinero.setEstrategiaPanadera(new PanaderoMasterchefEstrategia());
		hipertenso.comer(cocinero.cocinarPanHipertenso());
		assertEquals(hipertenso.getCalorias(),9);

	}

}
