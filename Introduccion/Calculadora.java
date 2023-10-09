

import java.util.Scanner;
public class Calculadora {

    public static void calcular(float num1, String operador, float num2) {
        if (operador.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operador.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operador.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operador.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Tipo de operador inválido");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        float num1 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese el operador: ");
        String operador = sc.nextLine();
        System.out.println("Ingrese el segundo número: ");
        float num2 = sc.nextFloat();
        sc.close();
        calcular(num1, operador, num2);
    }
}
