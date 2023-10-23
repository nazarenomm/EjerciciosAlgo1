package ejercicio62;

public class Test {
    public int unMetodo(){
        try {
        System.out.println("Va a retornar 1");
        return 1;
        } finally {
        System.out.println("Va a retornar 2");
        return 2;
        }
    }
    public static void main(String[] args) {
    Test res = new Test();
    System.out.println(res.unMetodo());
    }
}
