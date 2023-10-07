package Ejercicio33;

import java.util.Scanner;

public class Proveedor extends Persona {
    private int codigoVendedor;
    private double saldo;
    private String fax;
    private int telefono;
    private String descuentos;

    public Proveedor(String nombre, String direccion, String ciudad, int codigoVendedor, double saldo, String fax,
            int telefono, String descuentos) {
        super(nombre, direccion, ciudad);
        this.codigoVendedor = codigoVendedor;
        this.saldo = saldo;
        this.fax = fax;
        this.telefono = telefono;
        this.descuentos = descuentos;
    }

    public static Proveedor leer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("Ingrese codigo de vendedor: ");
        int codigoVendedor = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese saldo: ");
        int saldo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese fax: ");
        String fax = scanner.nextLine();

        System.out.println("Ingrese telefóno: ");
        int telefono = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese descuentos: ");
        String descuentos = scanner.nextLine();

        return new Proveedor(nombre, direccion, ciudad, codigoVendedor, saldo, fax, telefono, descuentos);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Ciudad: " + this.getDireccion());
        System.out.println("Codigo de vendedor: " + this.codigoVendedor);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Telefóno: " + this.telefono);
        System.out.println("Fax: "+ this.fax);
        System.out.println("Descuentos: " + this.descuentos);
    }
    
    public void pagarFactura() {
        System.out.println("Se paga la factura a " + this.getNombre() + " a la dirección " + this.getDireccion());
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }

    
}
