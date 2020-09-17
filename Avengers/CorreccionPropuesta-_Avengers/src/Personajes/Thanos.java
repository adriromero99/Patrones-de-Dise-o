package Personajes;

import Personajes.Gemas.ConGemas;
import Personajes.Gemas.EstadoGemas;
import Personajes.Gemas.SinGemas;

public class Thanos implements Personaje {

    private int daño = 15;
    private int vida = 250;
    private EstadoGemas estadoGemas = new SinGemas();

    @Override
    public void atacar(Personaje personaje) {
        int daño = this.estadoGemas.modificarDañoA(this);
        personaje.recibirDaño(daño);
    }

    @Override
    public int calcularDaño() {
        return this.daño;
    }

    @Override
    public void recibirDaño(int daño) {
        this.vida -= daño;
        if(vida < 0){
            morir();
        }
    }

    @Override
    public void curarse(int vida) {
        this.vida += vida;
    }

    @Override
    public void morir() {
        this.vida = 0;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    public void conseguirGemas(){
        this.estadoGemas = new ConGemas();
    }

    public void serRobado(){
        this.estadoGemas = new SinGemas();
    }



}
