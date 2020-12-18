package Personajes.Gemas;

import Personajes.IronMan;
import Personajes.Thanos;

public class ConGemas implements EstadoGemas {
    @Override
    public int modificarDañoA(IronMan ironMan) {
        ironMan.morir();
        return ironMan.calcularDaño()*4;
    }

    @Override
    public int modificarDañoA(Thanos thanos) {
        return thanos.calcularDaño()*4;
    }
}
