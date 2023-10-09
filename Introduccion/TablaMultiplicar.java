

import java.util.Scanner;
public class TablaMultiplicar {
    public static void tablaMultiplicar(int num) {
        System.out.println("La tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + num + " = " + i*num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int num = sc.nextInt();
        tablaMultiplicar(num);
        sc.close();
    }
}
