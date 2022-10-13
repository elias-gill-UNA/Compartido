package lab7.pkg2;

public abstract class figura{//clase abstracta donde derivan las demas clases, alberga el "modelo" de los metodos de cada clase
    int tipo;
    String nombre;
    float lado;
    float altura;
    float base;
    abstract float obtenerArea();
    abstract float obtenerVolumen();
    abstract void mostrarDescripcion();
}