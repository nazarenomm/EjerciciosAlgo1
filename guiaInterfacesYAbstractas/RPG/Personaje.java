package RPG;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    
    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public abstract void atacar(Personaje contrincante);

    public abstract void defender();
}
