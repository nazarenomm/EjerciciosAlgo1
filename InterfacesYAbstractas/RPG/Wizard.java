package RPG;

public class Wizard extends Personaje implements Ranged{
    
    public Wizard(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.daño = 3;
        this.defensa = 3;
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
    public void atacarDistancia(Personaje contrincante) {
        contrincante.defendiendo = false;
        this.atacar(contrincante);
    }

    @Override
    public String clase() {
        return "Wizard";
    }
}
