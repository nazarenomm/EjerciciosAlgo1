

import java.util.Scanner;
public class ConversorTemp {
    public static void convertir(float temp, String unidad) {
        if (unidad.equals("C")) {
            // (8 °C × 9/5) + 32 = 46.4 °F
            float nuevaTemp = (temp * 9/5) + 32;
            System.out.println("Temperatura en Fahrenheit: " + nuevaTemp);
        } else if (unidad.equals("F")) {
            // 	(8 °F − 32) × 5/9 = -13.33 °C
            float nuevaTemp = (temp -32) * 5/9;
            System.out.println("Temperatura en Celsius: " + nuevaTemp);
        } else {
            System.out.println("Unidad inválida");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        float temp = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese la unidad (C/F)");
        String unidad = sc.nextLine();
        convertir(temp, unidad);
        sc.close();
    }
}
