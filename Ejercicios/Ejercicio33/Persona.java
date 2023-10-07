package Ejercicio33;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String direccion;
    private String ciudad;

    public Persona(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Ciudad: " + ciudad);
    }

    public static Persona leer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();

        scanner.close();
        return new Persona(nombre, direccion, ciudad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
