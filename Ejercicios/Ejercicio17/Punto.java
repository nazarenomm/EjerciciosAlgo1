package Ejercicio17;

public class Punto {
    
    private float x;
    private float y;
    
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Punto sumar(Punto punto) {
        return new Punto(this.x + punto.x, this.y + punto.y);
    }

    public boolean Igualdad(Punto punto) {
        if (this.x == punto.x && this.y == punto.y) {
            return true;
        } else {
            return false;
        }
    }
}
