package viajes;

public class Main {

    public static void main(String[] args){
    Trayecto bariloche = new Trayecto("CABA", "Bariloche", 1500, 5);
    
    Viaje barilocheDiesel = new Diesel(bariloche, 10, 500);
    System.out.println(barilocheDiesel.tiempoDemora());
    
    Viaje barilocheElectrico = new Electrico(bariloche, 10, 500);
    System.out.println(barilocheElectrico.tiempoDemora());
    
    Viaje barilocheAltaVelocidad = new AltaVelocidad(bariloche, 10, 500);
    System.out.println(barilocheAltaVelocidad.tiempoDemora());
    
    }
}
