package Ejercicio33;

import java.util.Scanner;

public class Paciente extends Persona {
    private int codigoDiagnostico;
    private int telefono;
    private String fechaNacimiento;

    public Paciente(String nombre, String direccion, String ciudad, int codigoDiagnostico, int telefono,
            String fechaNacimiento) {
        super(nombre, direccion, ciudad);
        this.codigoDiagnostico = codigoDiagnostico;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static Persona leer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("Ingrese codigo de diagnóstico: ");
        int codigoDiagnostico = scanner.nextInt();

        System.out.println("Ingrese telefóno: ");
        int telefono = scanner.nextInt();

        System.out.println("Ingrese fecha de nacimiento: ");
        String fechaNacimiento = scanner.nextLine();

        scanner.close();

        return new Paciente(nombre, direccion, ciudad, codigoDiagnostico, telefono, fechaNacimiento);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Ciudad: " + this.getDireccion());
        System.out.println("Codigo de diagnóstico: " + this.codigoDiagnostico);
        System.out.println("Telefóno: " + this.telefono);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
    }

    public void enviarFactura() {
        System.out.println("Factura enviada a " + this.getNombre() + " a la dirección " + this.getDireccion());
    }
}
