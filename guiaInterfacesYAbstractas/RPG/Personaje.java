package RPG;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected int daño;
    protected int defensa;
    protected boolean defendiendo;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public abstract void atacar(Personaje contrincante);

    public abstract void defender();

    public abstract String clase();

    @Override
    public String toString() {
        return this.nombre + " (" + this.clase() + "), " + "lvl: " + this.nivel + ", hp: " + this.puntosVida;
    }
}
