package Personajes;

import Personajes.Armadura.*;
import Personajes.Gemas.ConGemas;
import Personajes.Gemas.EstadoGemas;
import Personajes.Gemas.SinGemas;

public class IronMan implements Personaje{

    private int daño = 0;
    private int vida = 100;
    private EstadoGemas estadoGemas = new SinGemas();
    private Armadura armadura = new SinArmadura();

    @Override
    public void atacar(Personaje personaje) {
        int daño = this.estadoGemas.modificarDañoA(this);
        personaje.recibirDaño(daño);
    }

    @Override
    public int calcularDaño() {
        return this.armadura.calcularDañoPara(this, daño);
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

    public void robarGemasA(Thanos thanos){
        thanos.serRobado();
        this.estadoGemas = new ConGemas();
    }

    public void equiparMarkI(){
        this.armadura = new MarkI(this.armadura);
    }

    public void equiparMarkII(){
        this.armadura = new MarkII(this.armadura);
    }

    public void equiparWarMachine(){
        this.armadura = new WarMachine(this.armadura);
    }

}
