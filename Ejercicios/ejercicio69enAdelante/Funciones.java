package ejercicio69enAdelante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Funciones {

    public static String reversa(String cadena) {
        try {
            if (cadena == null) throw new CadenaVaciaException();
            List<Character> cadenaInvertida = new ArrayList<>();
            for (char letra : cadena.toCharArray()) {
                cadenaInvertida.add(letra);
            }
            Collections.reverse(cadenaInvertida);
            
            StringBuilder stringBuilder = new StringBuilder(cadenaInvertida.size());

            for (Character character : cadenaInvertida) {
                stringBuilder.append(character);
            }

            return stringBuilder.toString();  
    } catch (CadenaVaciaException e) {
        System.out.println(e.getMessage());
        return null;
    }
    }

    public static HashMap<String, Integer> maxMin(String cadenaEnteros) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        String[] arrayEnteros = cadenaEnteros.split(" ");
        for (String entero : arrayEnteros) {
            try {
                int num = Integer.parseInt(entero);
                if (num < min) min = num;
                if (num > max) max = num;
            } catch (NumberFormatException e) {
                System.out.println("Un caracter no es un numero, fue ignorado");
            }
        }
        HashMap<String, Integer> maxMin = new HashMap<>();
        maxMin.put("max", (int) max);
        maxMin.put("min", (int) min);
        return maxMin;
    }
    public static void main(String[] args) {
        System.out.println(reversa("hola"));
        System.out.println(reversa("123"));
        System.out.println(reversa(null));

        String cadenaEnteros = "-2 3 0 4 j".toString();
        System.err.println(cadenaEnteros);
        System.out.println("maximo: " + maxMin(cadenaEnteros).get("max"));
        System.out.println("minimo: " + maxMin(cadenaEnteros).get("min"));
    }
}
