package ejercicio69enAdelante;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import Ejercicio43.Par;

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

    public static int cantidadUnicos(Collection<?> coleccion) {
        HashSet<Object> unicos = new HashSet<>(coleccion);
        return unicos.size();
    }

    public static Collection<?> unicos(Collection<?> coleccion) {
        HashSet<Object> unicos = new HashSet<>(coleccion);
        return unicos;
    }

    public static Par<Integer, Integer> cuentaSuma(int[] arregloEnteros) {
        int cantididPositivos = 0;
        int sumaNegativos = 0;
        for (int entero : arregloEnteros) {
            if (entero >= 0) {
                cantididPositivos++;
            } else {
                sumaNegativos += entero;
            }
        }
        return new Par<>(cantididPositivos, sumaNegativos);
    } 

    public static boolean esAnagrama(String cadena, String cadena2) {

        if (cadena == null && cadena2 == null) return true;

        try {
            if (cadena.length() != cadena2.length()) return false;
            HashMap<Character, Integer> repeticionesCadena = new HashMap<>();
            HashMap<Character, Integer> repeticionesCadena2 = new HashMap<>();

            for (char caracter : cadena.toCharArray()) {
                if (repeticionesCadena.containsKey(caracter)) {
                    int repeticiones = repeticionesCadena.get(caracter) + 1;
                    repeticionesCadena.put(caracter, repeticiones);
                } else {
                    repeticionesCadena.put(caracter, 1);
                }
            }

            for (char caracter : cadena2.toCharArray()) {
                if (repeticionesCadena2.containsKey(caracter)) {
                    int repeticiones = repeticionesCadena2.get(caracter) + 1;
                    repeticionesCadena2.put(caracter, repeticiones);
                } else {
                    repeticionesCadena2.put(caracter, 1);
                }
            }

            return repeticionesCadena.equals(repeticionesCadena2);
        } catch (NullPointerException e) {;
            return false;
        }
    }

    public static boolean esSecuencia(int[] arregloEnteros) {

        if (arregloEnteros == null) throw new IllegalArgumentException("El arreglo es nulo");
        if (arregloEnteros.length == 0) throw new IllegalArgumentException("El arreglo está vacío");

        HashSet<Integer> set = new HashSet<>();
        for (int entero : arregloEnteros) {
            set.add(entero);
        }

        if (set.size() != arregloEnteros.length) return false;
        
        List<Integer> lista = new ArrayList<>(set);
        Collections.sort(lista);
        
        return lista.get(lista.size()-1) == lista.size() + lista.get(0) - 1;
    }

    public static boolean sumaX(int[] arrayEnteros, int x) {
        try {
            for (int i = 0; i < arrayEnteros.length; i++) {
                if (arrayEnteros[i] + arrayEnteros[i+1] + arrayEnteros[i+2] == x) return true;
            }
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

        String cadena1 = "listen";
        String cadena2 = "silent";

        if (esAnagrama(cadena1, cadena2)) {
            System.out.println(cadena2 + " es un anagrama de " + cadena1);
        } else {
            System.out.println(cadena2 + " no es un anagrama de " + cadena1);
        }


        int[] nums = {6, 3, 5, 4, 2, 1};
        int target = 8;

        boolean resultado = sumaX(nums, target);
        System.out.println("¿Existen tres números que sumen " + target + "? " + resultado);
    }
}
