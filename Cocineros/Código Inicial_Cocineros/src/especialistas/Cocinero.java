package especialistas;

import Comida.Empanada;
import Comida.Pan;
import especialistas.Empanadero.EstrategiaEmpanadera;
import especialistas.Empanadero.SinEstrategiaEmpanadera;
import especialistas.Panaderia.EstrategiaPanadera;
import especialistas.Panaderia.SinEstrategiaPanadera;

public class Cocinero implements CocineroInterfaz{
    private EstrategiaEmpanadera estrategiaEmpanadera;
    private EstrategiaPanadera estrategiaPanadera;

    public Cocinero(){
        this.estrategiaEmpanadera = new SinEstrategiaEmpanadera();
        this.estrategiaPanadera = new SinEstrategiaPanadera();
    }

    public void setEstrategiaEmpanadera(EstrategiaEmpanadera estrategiaEmpanadera){
        this.estrategiaEmpanadera = estrategiaEmpanadera;
    }

    public void setEstrategiaPanadera(EstrategiaPanadera estrategiaPanadera) {
        this.estrategiaPanadera = estrategiaPanadera;
    }

    @Override
    public Empanada cocinarEmpanadaComun() {
        return this.estrategiaEmpanadera.cocinarEmpanadaComun();
    }

    @Override
    public Empanada cocinarEmpanadaCeliaca() {
        return this.estrategiaEmpanadera.cocinarEmpanadaCeliaca();
    }

    @Override
    public Empanada cocinarEmpanadaHipertensa() {
        return this.estrategiaEmpanadera.cocinarEmpanadaHipertensa();
    }

    @Override
    public Pan cocinarPanComun() {
        return this.estrategiaPanadera.cocinarPanComun();
    }

    @Override
    public Pan cocinarPanCeliaco() {
        return this.estrategiaPanadera.cocinarPanCeliaco();
    }

    @Override
    public Pan cocinarPanHipertenso() {
        return this.estrategiaPanadera.cocinarPanHipertenso();
    }
}
