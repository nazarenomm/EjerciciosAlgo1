package Ejercicio33;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresar datos para Persona:");
        Persona persona = Persona.leer();

        System.out.println("\nIngresar datos para Paciente:");
        Paciente paciente = Paciente.leer();

        System.out.println("\nIngresar datos para Empleado de Planta:");
        Empleado empleadoPlanta = Empleado.leer();

        System.out.println("\nIngresar datos para Empleado Eventual:");
        Empleado empleadoEventual = Empleado.leer();

        System.out.println("\nIngresar datos para Proveedor:");
        Proveedor proveedor = Proveedor.leer();

        System.out.println("\nDatos de la Persona:");
        persona.mostrar();

        System.out.println("\nDatos del Paciente:");
        paciente.mostrar();
        paciente.enviarFactura();

        System.out.println("\nDatos del Empleado de Planta:");
        empleadoPlanta.mostrar();
        ((Planta) empleadoPlanta).pagarSalario();

        System.out.println("\nDatos del Empleado Eventual:");
        empleadoEventual.mostrar();
        ((Eventual) empleadoEventual).pagarSalario();

        System.out.println("\nDatos del Proveedor:");
        proveedor.mostrar();
        proveedor.pagarFactura();
    }
}