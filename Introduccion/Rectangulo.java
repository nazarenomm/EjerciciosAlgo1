

public class Rectangulo {
    double base;
    double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2*base + 2*altura;
    }

    public static void main(String[] args){
        Rectangulo rec1 = new Rectangulo(2.5, 3);
        Rectangulo rec2 = new Rectangulo(2, 4.7);
        Rectangulo rec3 = new Rectangulo(2, 2);

        Rectangulo[] rectangulos = {rec1, rec2, rec3};

        for (Rectangulo rectangulo: rectangulos){
            double area = rectangulo.area();
            double perimetro = rectangulo.perimetro();
            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);
        }
    }
}
