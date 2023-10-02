package Ejercicio27;

public class CuentaCorriente {
    private double saldo;
    private int cantOps;
    private int cantidadExtraccionesInvalidas;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        //this.cantOps = 0;
    }

    public double saldo() {
        return this.saldo;
    }

    public void deposito(double imp) {
        this.cantOps += 1;
        this.saldo += imp;
    }

    public void extraccion(double imp) {
        if (this.saldo>=0) {
            this.cantOps += 1;
            this.saldo -= imp;
        } else {
            this.cantidadExtraccionesInvalidas += 1;
            System.out.println("Saldo insuficiente\nSaldo :" + this.saldo());
        }
    }

    public int cantidadOperaciones() {
        return this.cantOps;
    }

    public int cantidadExtraccionesInvalidas() {
        return this.cantidadExtraccionesInvalidas;
    }

    public static void main(String[] args) {
        System.out.println("Creo una cuenta con 5000 de saldo inicial");
        CuentaCorriente cc = new CuentaCorriente(5000);
        System.out.println("Saldo: " + cc.saldo());
        System.out.println("Deposito 5000:");
        cc.deposito(5000);
        System.out.println("Saldo: " + cc.saldo());
        System.out.println("Extraigo 8000:");
        cc.extraccion(8000);
        System.out.println("Saldo: " + cc.saldo());
        System.out.println("Extraigo 5000: ");
        cc.extraccion(5000);
        System.out.println("Saldo: " + cc.saldo());
        System.out.println("Intento extraer algo: ");
        cc.extraccion(20);
        System.out.println("Cantidad de operaciones realizadas: " + cc.cantidadOperaciones());
        System.out.println("Cantidad de extracciones inválidas: " + cc.cantidadExtraccionesInvalidas());
    }
}
