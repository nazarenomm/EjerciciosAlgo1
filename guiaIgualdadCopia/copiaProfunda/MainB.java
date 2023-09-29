package copiaProfunda;

public class MainB {
    public static void main(String[] args) {
        Persona juana = new Persona("Juana", 22, 12345678);
        
        System.out.println(juana);      // Juana, 22, 12345678
        System.out.println(copiaJuana); // Juana, 22, 12345678

        copiaJuana.setEdad(33);
        copiaJuana.setNroDocumento(87654321);
        
        System.out.println(juana);      // Juana, 22, 87654321
        System.out.println(copiaJuana); // Juana, 33, 87654321
    }
}
