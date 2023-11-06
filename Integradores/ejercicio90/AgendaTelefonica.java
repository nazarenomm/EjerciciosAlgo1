package ejercicio90;

import java.util.ArrayList;
import java.util.List;

import Ejercicio43.Par;

public class AgendaTelefonica {
    private List<Persona> personas;

    public AgendaTelefonica(List<Persona> personas) {
        this.personas = personas;
    }

    public Par<String, Integer> getInfo(String nombre) {
        String direccion;
        int telefono;
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                direccion = persona.getDireccion();
                telefono = persona.getTelefono();
                return new Par<>(direccion, telefono);
            }
        }
        throw new IllegalArgumentException("No hay nadie con ese nombre en la agenda");
    }

    public void mostrarInfo(String nombre) {
        Par<String, Integer> info = this.getInfo(nombre);
        System.out.println("Dirección: " + info.getA());
        System.out.println("Teléfono: " + info.getB());
    }

    public void eliminarPersona(Persona persona) {
        personas.remove(persona);
    }

    public void eliminarPersona(String nombre) {
        boolean eliminada = false;
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                personas.remove(persona);
                eliminada = true;
            }
        }
        if (!eliminada) throw new IllegalArgumentException("No se encontró a nadie con ese nombre");
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void agregarPersona(String nombre, String direccion, int telefono) {
        Persona persona = new Persona(nombre, direccion, telefono);
        agregarPersona(persona);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void mostrar() {
        System.out.println("  Nombre  |  Direccion  |  Teléfono  ");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " | " + persona.getDireccion() + " | " + persona.getTelefono());
        }
    }

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona naza = new Persona("Nazareno", "Cuba 9145", 111858344);
        Persona nico = new Persona("Nicolás", "Triunvirato 52", 111358545);

        personas.add(nico);
        personas.add(naza);

        AgendaTelefonica agenda = new AgendaTelefonica(personas);

        agenda.mostrar();

        System.out.println("agrego a Francisco, usando agregar(Persona)");
        Persona fran = new Persona("Francisco", "La Plata 345", 1145673356);
        agenda.agregarPersona(fran);

        agenda.mostrar();

        System.out.println("agrego a Gregorio, usando agregar(nombre, dir, tel)");
        agenda.agregarPersona("Gregorio", "Rio Atuel", 1133534657);

        agenda.mostrar();

        System.out.println("elimino a naza, usando elim(Perosna)");
        agenda.eliminarPersona(naza);

        agenda.mostrar();

        System.out.println("elimino a fran, usando elim(nombre)");
        agenda.eliminarPersona("Francisco");

        agenda.mostrar();

        System.out.println("busco los datos de Nicolas");
        agenda.mostrarInfo("Nicolás");
    }
}
