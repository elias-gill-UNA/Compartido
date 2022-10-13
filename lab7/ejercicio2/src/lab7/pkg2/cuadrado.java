
package lab7.pkg2;

public class cuadrado extends figuraBidimensional{
    
    float obtenerVolumen(){
        return 0;
    };
    
    public cuadrado(String nombre,float lado){
        this.nombre=nombre;
        this.lado=lado;
    }
    
    void mostrarDescripcion(){
        System.out.println("Soy el objeto "+this.nombre+" y soy un cuadrado");
    }
    
    float obtenerArea(){
        float area=(lado*lado);
        return area;
    }
}
