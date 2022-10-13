
package lab7.pkg2;

public class triangulo extends figuraBidimensional{
    
    float obtenerVolumen(){
        return 0;
    };
    
    public triangulo(String nombre,float altura,float base){
        this.nombre=nombre;
        this.base=base;
        this.altura=altura;
    }
    
    void mostrarDescripcion(){
        System.out.println("Soy el objeto "+this.nombre+" y soy un triangulo");
    }
    
    float obtenerArea(){
        float area=(base*altura)/2;
        return area;
    }
}
