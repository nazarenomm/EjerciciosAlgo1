package Ejercicio26;

public class Monedero {

    private double saldo;

    public Monedero(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void transferir(double monto) {
        if (monto <= this.saldo) {
            this.saldo = this.saldo - monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + this.getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double deposito) {
        this.saldo = deposito;
    }
    
    public static void main(String[] args) {
        Monedero monedero = new Monedero(3000);
        monedero.consultarSaldo();
        monedero.depositar(500);
        monedero.consultarSaldo();
        monedero.transferir(1000);
        monedero.consultarSaldo();
        monedero.transferir(2501);
        monedero.consultarSaldo();
    }
}
