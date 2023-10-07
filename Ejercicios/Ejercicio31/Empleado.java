package Ejercicio31;

public class Empleado extends Persona {
    private String empleo;

    public Empleado(String nacionalidad, int fechaNacimiento, String nombre, String apellido, String sexo,
            String empleo) {
        super(nacionalidad, fechaNacimiento, nombre, apellido, sexo);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }
    
}
