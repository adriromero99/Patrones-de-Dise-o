package Personajes.Gemas;

import Personajes.IronMan;
import Personajes.Thanos;

public class SinGemas implements EstadoGemas {
    @Override
    public int modificarDañoA(IronMan ironMan) {
        return ironMan.calcularDaño();
    }

    @Override
    public int modificarDañoA(Thanos thanos) {
        return thanos.calcularDaño();
    }
}
