package Ejercicio31;

public class Estudiante extends Persona {
    private String carrera;
    private String universidad;

    public Estudiante(String nacionalidad, int fechaNacimiento, 
                    String nombre, String apellido, String sexo, 
                    String carrera, String universidad) {
            super(nacionalidad, fechaNacimiento, nombre, apellido, sexo);
            this.carrera = carrera;
            this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    
}
