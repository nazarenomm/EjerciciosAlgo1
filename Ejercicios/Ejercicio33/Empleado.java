package Ejercicio33;

import java.util.Scanner;

public class Empleado extends Persona {
    private int codigoEmpleado;
    private int horasExtras;
    private String compañiaSeguro;

    public Empleado(String nombre, String direccion, String ciudad, int codigoEmpleado, int horasExtras,
            String compañiaSeguro) {
        super(nombre, direccion, ciudad);
        this.codigoEmpleado = codigoEmpleado;
        this.horasExtras = horasExtras;
        this.compañiaSeguro = compañiaSeguro;
    }

    public static Empleado leer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("Ingrese codigo de empleado: ");
        int codigoEmpleado = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese horas extras: ");
        int horasExtras = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese compañia de seguros: ");
        String compañiaSeguro = scanner.nextLine();

        return new Empleado(nombre, direccion, ciudad, codigoEmpleado, horasExtras, compañiaSeguro);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Ciudad: " + this.getDireccion());
        System.out.println("Codigo de empleado: " + this.codigoEmpleado);
        System.out.println("Horas Extras: " + this.horasExtras);
        System.out.println("Compañía de seguros: " + this.compañiaSeguro);
    }

    public void enviarSalario() {
        System.out.println("Salario enviado a " + this.getNombre() + " a la dirección " + this.getDireccion());
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getCompañiaSeguro() {
        return compañiaSeguro;
    }

    public void setCompañiaSeguro(String compañiaSeguro) {
        this.compañiaSeguro = compañiaSeguro;
    }

    
}
