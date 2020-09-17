package Personajes.Armadura;

import Personajes.IronMan;

public class SinArmadura implements Armadura {

    private int dañoSinArmadura = 0;

    @Override
    public int calcularDañoPara(IronMan ironMan, int daño) {
        return daño+this.dañoSinArmadura;
    }
}
