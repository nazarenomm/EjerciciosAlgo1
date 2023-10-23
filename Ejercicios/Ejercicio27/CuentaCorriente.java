package Ejercicio27;

public class CuentaCorriente {
    private double saldo;
    private int cantOps;
    private int cantidadExtraccionesInvalidas;

    public CuentaCorriente(double saldo) throws SaldoInvalidoException{
        if (saldo < 0) {
            throw new SaldoInvalidoException();
        } else {
            this.saldo = saldo;
        }
    }

    public double saldo() {
        return this.saldo;
    }

    public void deposito(double importe) throws ImporteInvalidoException{
        if (importe < 1) {
            throw new ImporteInvalidoException();
        } else {
            this.cantOps += 1;
            this.saldo += importe;
        }
    }

    public void extraccion(double importe) throws ImporteInvalidoException, SaldoInsuficiente{
        if (importe < 0) {
            throw new ImporteInvalidoException();
        } else {
            if (this.saldo>=0) {
                this.cantOps += 1;
                this.saldo -= importe;
            } else {
                this.cantidadExtraccionesInvalidas += 1;
                throw new SaldoInsuficiente();
            }
        }
    }

    public int cantidadOperaciones() {
        return this.cantOps;
    }

    public int cantidadExtraccionesInvalidas() {
        return this.cantidadExtraccionesInvalidas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCantOps() {
        return cantOps;
    }

    public void setCantOps(int cantOps) {
        this.cantOps = cantOps;
    }

    public int getCantidadExtraccionesInvalidas() {
        return cantidadExtraccionesInvalidas;
    }

    public void setCantidadExtraccionesInvalidas(int cantidadExtraccionesInvalidas) {
        this.cantidadExtraccionesInvalidas = cantidadExtraccionesInvalidas;
    }

    public static void main(String[] args) {
        CuentaCorriente cc = null;
        try {
            System.out.println("Creo una cuenta con 5000 de saldo inicial");
            cc = new CuentaCorriente(5000);
        } catch (SaldoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        try {
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
        } catch (ImporteInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficiente e) {
            System.out.println(e.getMessage() + ", su saldo actual es: " + cc.getSaldo());
        } finally {
            System.out.println("Operaciones válidas: " + cc.getCantOps());
            System.out.println("Operaciones inválidas: " + cc.getCantidadExtraccionesInvalidas());
        }
    }

}
