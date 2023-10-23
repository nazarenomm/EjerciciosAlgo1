package ejercicio60;

public class MatriculaAutoB {
    private String letra;
    private Integer numero;

    public MatriculaAutoB(String letra, Integer numero) {
        if (letra != null && (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B"))) {
            this.letra = letra.toUpperCase();
        } else {
            this.letra = null; // Letra inválida, se asigna null
        }

        if (numero != null && numero.toString().length() == 8) {
            this.numero = numero;
        } else {
            this.numero = -1; // Número inválido, se asigna -1
        }
    }

    @Override
    public String toString() {
        if (letra != null && numero != -1) {
            return letra + numero;
        } else {
            return "Matrícula inválida";
        }
    }

    public static void main(String[] args) {
        MatriculaAutoB matricula1 = new MatriculaAutoB("A", 12345678);
        MatriculaAutoB matricula2 = new MatriculaAutoB("C", 12345678);

        System.out.println(matricula1);
        System.out.println(matricula2);
    }
}