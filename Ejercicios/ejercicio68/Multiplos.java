package ejercicio68;

public class Multiplos {
    public static int[] multiplos(int x, int y) {
        int[] multiplos = new int[y];
        for (int i = 0; i < y; i++) {
            multiplos[i] = x*(i+1);
        }
        return multiplos;
    }

    public static void main(String[] args) {
        System.out.print("[");
        for (int num : multiplos(3, 6)) {
            System.out.print(num + ", ");
        }
        System.out.print("]");
    }
    
}
