
package lab7.pkg2;

public class tetraedro extends figuraTridimensional {
    public tetraedro(String nombre, float lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    float obtenerArea() {
        float area = (lado * lado) * (float) java.lang.Math.sqrt(3);
        return area;
    }

    float obtenerVolumen() {
        float volumen = (lado * lado * lado) * ((float) java.lang.Math.sqrt(2) / 12);
        return volumen;
    }

    void mostrarDescripcion() {
        System.out.println("Soy el objeto " + this.nombre + " y soy un tetraedro");
    }
}
