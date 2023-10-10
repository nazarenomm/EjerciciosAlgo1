package registro;

public class Estudiante {
        private String nombre;
        private int edad;
        private float promedio;
        
        public Estudiante(String nombre, int edad, float promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.promedio = promedio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public float getPromedio() {
            return promedio;
        }

        public void setPromedio(float promedio) {
            this.promedio = promedio;
        }
}
