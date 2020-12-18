package Personajes.Armadura;

import Personajes.IronMan;

public class MarkI implements Armadura {

    private Armadura armaduraAnterior;
    private int dañoMarkI = 10;

    public MarkI(Armadura armaduraAnterior){
        this.armaduraAnterior = armaduraAnterior;
    }

    @Override
    public int calcularDañoPara(IronMan ironMan, int daño) {
        return this.armaduraAnterior.calcularDañoPara(ironMan, daño) + this.dañoMarkI;
    }
}
