
package lab7.pkg2;

public class cubo  extends figuraTridimensional{
    
    public cubo(String nombre,float lado){
        this.nombre=nombre;
        this.lado=lado;
    }
    
    float obtenerArea(){
        float area=(lado*lado*6);
        return area;
    }
    
    float obtenerVolumen(){
        float volumen=(lado*lado*lado);
        return volumen;
    }
    
    void mostrarDescripcion(){
        System.out.println("Soy el objeto "+this.nombre+" y soy un cubo");
    }
}
