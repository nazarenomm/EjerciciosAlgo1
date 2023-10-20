package Ejercicio16;

public class Empleado {

    private int numero;
    private String nombre;

    public Empleado(String nombre, int numero) throws NumeroEmpleadoInvalido {
        if (numero < 18) {
            throw new NumeroEmpleadoInvalido();
        } else {
            this.nombre = nombre;
            this.numero = numero;
        }
    }

    public void verDatos() {
        System.out.println("Nombre de empleado: " + nombre);
        System.out.println("Numero de empleado: " + numero);
    }


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        String[] nombres = {"Agustin", "Diego", "Mauro", "Leonel", "Nazareno"};
        Empleado[] empleados = new Empleado[nombres.length];
        for (int i = 1; i <= nombres.length; i++) {
            try {
                Empleado empleado = new Empleado(nombres[i - 1], i);
                empleados[i - 1] = empleado;
            } catch (NumeroEmpleadoInvalido e) {
                System.out.println(e.getMessage());
            }
        }

        for (Empleado empleado : empleados) {
            empleado.verDatos();
        }

    }
    
}
