package Personajes.Armadura;

import Personajes.IronMan;

public class WarMachine implements Armadura {

    private Armadura armaduraAnterior;
    private int dañoWarMachine = 10;

    public WarMachine(Armadura armaduraAnterior){
        this.armaduraAnterior = armaduraAnterior;
    }

    @Override
    public int calcularDañoPara(IronMan ironMan, int daño) {
        int dañoARealizar = this.armaduraAnterior.calcularDañoPara(ironMan, daño) + this.dañoWarMachine;
        ironMan.curarse(dañoARealizar);
        return dañoARealizar;
    }
}
