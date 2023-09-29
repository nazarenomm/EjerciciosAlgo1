package comparacionEstudiantes;

public class Main {
    public static void main(String[] args) {
        EstudianteGrado eg1 = new EstudianteGrado("Juan", 25, 1, "IT");
        EstudianteGrado eg2 = new EstudianteGrado("Javier", 23, 3, "IT");
        EstudiantePosgrado ep1 = new EstudiantePosgrado("Jose", 30, 2, "DCF");
        EstudiantePosgrado ep2 = new EstudiantePosgrado("Joaquin", 35, 4, "HRT");
        
        System.out.println("Son iguales? " + eg1.equals(eg2));
        
        System.out.println("Son iguales? " + ep1.equals(ep2));

        Estudiante est1 = new Estudiante("Juan", 32, 12);
        Estudiante est2 = new Estudiante("J", 30, 12);

        System.out.println("Son iguales? " + est1.equals(est2));

        System.out.println("Eran el mismo obj? "+ (est1 == est2));
    }   

}
