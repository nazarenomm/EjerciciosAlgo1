package Ejercicio33;

public class Planta extends Empleado {
    private String datosEmpleado;
    private double salario;
    private int añosAntiguedad;

    public Planta(String nombre, String direccion, String ciudad, int codigoEmpleado, int horasExtras,
            String compañiaSeguro, String datosEmpleado, double salario, int añosAntiguedad) {
        super(nombre, direccion, ciudad, codigoEmpleado, horasExtras, compañiaSeguro);
        this.datosEmpleado = datosEmpleado;
        this.salario = salario;
        this.añosAntiguedad = añosAntiguedad;
    }

    public void pagarSalario() {
        System.out.println("Se le paga el salario a " + this.getNombre());
    }

    public String getDatosEmpleado() {
        return datosEmpleado;
    }

    public void setDatosEmpleado(String datosEmpleado) {
        this.datosEmpleado = datosEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }
}
