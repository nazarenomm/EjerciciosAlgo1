package RPG;

public class Main {
    public static void main(String[] args) {
        Paladin pala = new Paladin("Pala", 10, 100);

        Wizard wizzy = new Wizard("Wizzy", 5, 40);
        Wizard merlin = new Wizard("Merlin", 10, 100);
        Wizard pepe = new Wizard("José", 1, 10);
        Wizard[] magos = {wizzy, merlin, pepe};

        for (Wizard mago : magos) {
            pala.defender();
            mago.atacarDistancia(pala);
            System.out.println(pala);
        }

    }
}