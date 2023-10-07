package Ejercicio31;

public class Persona {
    private String nacionalidad;
    private int fechaNacimiento;
    private String nombre;
    private String apellido;
    private String sexo;

    
    public Persona(String nacionalidad, int fechaNacimiento, String nombre, String apellido, String sexo) {
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
