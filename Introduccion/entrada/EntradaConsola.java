package entrada;

import java.util.Scanner;

public class EntradaConsola {
    public static void main(String[] args) {
        int numeroLineas = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeroLineas; i++) {
            System.out.println("Ingrese un mensaje");
            String mensaje = sc.nextLine();
            salida.SalidaConsola.mostrar(mensaje); // Llama al método estático de SalidaConsola
        }
        sc.close();
    }
}
