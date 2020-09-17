package Personajes.Gemas;

import Personajes.IronMan;
import Personajes.Thanos;

public interface EstadoGemas {
    int modificarDañoA(IronMan ironMan);
    int modificarDañoA(Thanos thanos);
}
