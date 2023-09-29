package comparacionEstudiantes;

import java.util.Objects;

public class EstudianteGrado extends Estudiante {

    private String carreraGrado;

    public EstudianteGrado(String nombre, int edad, int matricula, String carreraGrado) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carreraGrado = carreraGrado;
    }

    public String getCarreraGrado() {
        return carreraGrado;
    }

    public void setCarreraGrado(String carreraGrado) {
        this.carreraGrado = carreraGrado;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }
    
        if (otro == null || this.getClass() != otro.getClass()) {
            return false;
        }
        
        EstudianteGrado otro2 = (EstudianteGrado) otro;
        return this.getMatricula() == otro2.getMatricula()
                && Objects.equals(this.getCarreraGrado(), otro2.getCarreraGrado());
    }
}
