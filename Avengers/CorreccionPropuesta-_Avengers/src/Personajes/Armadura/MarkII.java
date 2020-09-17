package Personajes.Armadura;

import Personajes.IronMan;

public class MarkII implements Armadura {

    private Armadura armaduraAnterior;
    private int dañoMarkII = 12;

    public MarkII(Armadura armaduraAnterior){
        this.armaduraAnterior = armaduraAnterior;
    }

    @Override
    public int calcularDañoPara(IronMan ironMan, int daño) {
        return this.armaduraAnterior.calcularDañoPara(ironMan, daño) + this.dañoMarkII;
    }
}
