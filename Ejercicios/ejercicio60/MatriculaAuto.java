package ejercicio60;

public class MatriculaAuto {
    private String letra;
    private Integer numero;

    public MatriculaAuto(String letra, Integer numero) throws LetraInvalidaException, NumeroInvalidoException {
        if (letra != null & letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("B")) {
                this.letra = letra.toUpperCase();
         } else {
            throw new LetraInvalidaException();
        }

        if (numero != null & numero.toString().length() == 8) {
            this.numero = numero;
        } else {
            throw new NumeroInvalidoException();
        }
    }

    @Override
    public String toString() {
        return letra + numero;
    }

    public static void main(String[] args) {
        try {
            MatriculaAuto matricula = new MatriculaAuto("A", 123456787);
            System.out.println(matricula);
        } catch (LetraInvalidaException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
