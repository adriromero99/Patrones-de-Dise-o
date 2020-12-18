package Personajes;

public interface Personaje {
    void atacar(Personaje personaje);
    int calcularDaño();
    void recibirDaño(int daño);
    void curarse(int vida);
    void morir();
    int getVida();
}
