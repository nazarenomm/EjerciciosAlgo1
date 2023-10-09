

import java.util.Scanner;
public class SumaPares {
    public static void sumarPares(int num) {
        int suma = 0;
        if (num < 0) {
            System.out.println("Debe ingresar un número positivo");
            System.exit(1);
        }
        for (int i = 1; i <= num; i++) {
            if (i%2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println("La suma de los números pares del 1 al " + num + " es: " + suma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número positivo: ");
        int num = sc.nextInt();
        sumarPares(num);
        sc.close();
    }
}
