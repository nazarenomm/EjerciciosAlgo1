package busquedaLineal;

import java.util.ArrayList;
import java.util.List;

public class BusquedaLinealGenerica {
    
    public static <T> int busquedaLineal(T elemento, List<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Crear una lista de números enteros para la prueba
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(5);

        // Probar la búsqueda lineal con un número existente
        int resultado1 = BusquedaLinealGenerica.busquedaLineal(3, listaEnteros);
        if (resultado1 != -1) {
            System.out.println("El número 3 se encuentra en la posición: " + resultado1);
        } else {
            System.out.println("El número 3 no se encuentra en la lista.");
        }

        // Probar la búsqueda lineal con un número inexistente
        int resultado2 = BusquedaLinealGenerica.busquedaLineal(10, listaEnteros);
        if (resultado2 != -1) {
            System.out.println("El número 10 se encuentra en la posición: " + resultado2);
        } else {
            System.out.println("El número 10 no se encuentra en la lista.");
        }

        // Crear una lista de cadenas para la prueba
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Java");

        // Probar la búsqueda lineal con una cadena existente
        int resultado3 = BusquedaLinealGenerica.busquedaLineal("Mundo", listaCadenas);
        if (resultado3 != -1) {
            System.out.println("La cadena 'Mundo' se encuentra en la posición: " + resultado3);
        } else {
            System.out.println("La cadena 'Mundo' no se encuentra en la lista.");
        }
    }
}
