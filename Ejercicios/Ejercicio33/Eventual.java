package Ejercicio33;

public class Eventual extends Empleado {
    private String daatosEmpleado;
    private String horariosPorHora;

    public Eventual(String nombre, String direccion, String ciudad, int codigoEmpleado, int horasExtras,
            String compañiaSeguro, String daatosEmpleado, String horariosPorHora) {
        super(nombre, direccion, ciudad, codigoEmpleado, horasExtras, compañiaSeguro);
        this.daatosEmpleado = daatosEmpleado;
        this.horariosPorHora = horariosPorHora;
    }

    public void pagarSalario() {
        System.out.println("Se le paga el salario a " + this.getNombre());
    }

    public String getDaatosEmpleado() {
        return daatosEmpleado;
    }

    public void setDaatosEmpleado(String daatosEmpleado) {
        this.daatosEmpleado = daatosEmpleado;
    }

    public String getHorariosPorHora() {
        return horariosPorHora;
    }

    public void setHorariosPorHora(String horariosPorHora) {
        this.horariosPorHora = horariosPorHora;
    }
    
}
