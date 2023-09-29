package comparacionEstudiantes;

import java.util.Objects;

public class EstudiantePosgrado extends Estudiante {

    private String carreraPosgrado;

    public EstudiantePosgrado(String nombre, int edad, int matricula, String carreraGrado) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carreraPosgrado = carreraGrado;
    }

    public String getCarreraPosgrado() {
        return carreraPosgrado;
    }

    public void setCarreraPosgrado(String carreraPosgrado) {
        this.carreraPosgrado = carreraPosgrado;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }
    
        if (otro == null || this.getClass() != otro.getClass()) {
            return false;
        }
        
        EstudiantePosgrado otro2 = (EstudiantePosgrado) otro;
        return this.getMatricula() == otro2.getMatricula()
                && Objects.equals(this.getCarreraPosgrado(), otro2.getCarreraPosgrado());
    }
    
}
