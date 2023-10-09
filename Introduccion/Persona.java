

public class Persona {
    // Atributos
    String nombre;
    int edad;
    
    // Método constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    public static void main(String[] args) {
        Persona juana = new Persona("Juana", 25);
        juana.saludar();
    }
}