package Ejercicio18;

public class Vector3D {
    
    private float x;
    private float y;
    private float z;
    
    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Vector3D sumar(Vector3D punto) {
        return new Vector3D(this.x + punto.x, this.y + punto.y, this.z + punto.z);
    }

    public boolean Igualdad(Vector3D punto) {
        if (this.x == punto.x && this.y == punto.y && this.z == punto.z) {
            return true;
        } else {
            return false;
        }
    }
}
