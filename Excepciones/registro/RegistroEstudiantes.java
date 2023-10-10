package registro;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import registro.excepciones.EdadInvalidaException;
import registro.excepciones.NombreInvalidoException;
import registro.excepciones.PromedioInvalidoException;

public class RegistroEstudiantes<E extends Estudiante> {
    private List<E> registro;

    public RegistroEstudiantes(List<E> registro) {
        this.registro = registro;
    }

    public void agregar() throws NombreInvalidoException, EdadInvalidaException, PromedioInvalidoException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        if (nombre == null || nombre.trim().isEmpty()) {
            scanner.close();
            throw new NombreInvalidoException();
        }

        System.out.println("Ingrese edad: ");
        int edad;
        try {
            edad = scanner.nextInt();
            scanner.nextLine();
            if (edad < 0 || edad > 120) {
                scanner.close();
                throw new EdadInvalidaException();
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            scanner.close();
            throw new EdadInvalidaException();
            }

        System.out.println("Ingrese promedio: ");
        float promedio;
        try {
            promedio = scanner.nextFloat();
            scanner.nextLine();
            if (promedio < 0.0 || promedio > 10.0) {
                scanner.close();
                throw new PromedioInvalidoException();
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            scanner.close();
            throw new PromedioInvalidoException();
        } finally {
            scanner.close();
        }

        E nuevoEstudiante = (E) new Estudiante(nombre, edad, promedio);
        registro.add(nuevoEstudiante);
    }

    public void mostrar() {
         for (E e : registro) {
            System.out.println(e.getNombre() + ", " + e.getEdad() + ", promedio: " + e.getPromedio());
         }
    }

    public List<E> getRegistro() {
        return registro;
    }

    public void setRegistro(List<E> registro) {
        this.registro = registro;
    }
}
