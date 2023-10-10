package registro;

import java.util.ArrayList;
import java.util.List;

import registro.excepciones.EdadInvalidaException;
import registro.excepciones.NombreInvalidoException;
import registro.excepciones.PromedioInvalidoException;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> listaDeEstudiantes = new ArrayList<>();
        RegistroEstudiantes<Estudiante> registro = new RegistroEstudiantes<>(listaDeEstudiantes);

        try {
            registro.agregar();
        } catch (NombreInvalidoException e) {
            System.out.println("Error: Nombre inválido.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: Edad inválida.");
        } catch (PromedioInvalidoException e) {
            System.out.println("Error: Promedio inválido.");
        }
        registro.mostrar();
    }
}