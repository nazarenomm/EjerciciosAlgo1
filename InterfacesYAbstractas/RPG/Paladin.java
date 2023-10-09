package RPG;

public class Paladin extends Personaje {

    public Paladin(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.daño = 5;
        this.defensa = 2;
    }

    @Override
    public void atacar(Personaje contrincante) {
        System.out.println(this.nombre + " ataca a " + contrincante.nombre);
        if (contrincante.defendiendo) {
            System.out.println(contrincante.nombre + " se defiende");
            contrincante.puntosVida -= this.daño - contrincante.defensa;
        } else {
            contrincante.puntosVida -= this.daño;
        }
        contrincante.defendiendo = false;
    }

    @Override
    public void defender() {
        this.defendiendo = true;
    }

    @Override
    public String clase() {
        return "Paladin";
    }
}
