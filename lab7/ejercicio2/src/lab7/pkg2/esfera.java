package lab7.pkg2;

public class esfera extends figuraTridimensional {

    public esfera(String nombre, float lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    float obtenerArea() {
        float area = (float) (lado * lado * 3.14 * 4.0);
        return area;
    }

    float obtenerVolumen() {
        float volumen = (float) (((float) 4 / 3) * 3.14 * lado * lado * lado);
        return volumen;
    }

    void mostrarDescripcion() {
        System.out.println("Soy el objeto " + this.nombre + " y soy una esfera");
    }
}
