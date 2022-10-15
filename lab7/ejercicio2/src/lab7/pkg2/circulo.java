
package lab7.pkg2;

public class circulo extends figuraBidimensional{
    
    float obtenerVolumen(){
        return 0;
    };
    
    public circulo(String nombre,float lado){
        this.nombre= nombre;
        this.lado=lado;
    }
    
    void mostrarDescripcion(){
        System.out.println("Soy el objeto "+this.nombre+" y soy un circulo");
    }
    
    float obtenerArea(){
        float area=(float)(3.14*lado*lado);
        return area;
    }
}
