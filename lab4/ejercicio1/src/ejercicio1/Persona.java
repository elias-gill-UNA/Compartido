package ejercicio1;

// @author AbelDíaz
public class Persona {

    private int nroCedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int nroCedula, String nombre, String apellido, int edad) {
        this.nroCedula = nroCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(int nroCedula) {
        this.nroCedula = nroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void vizualizar() {
        System.out.println(
                "Nombre: "
                        + getNombre()
                        + "\nApellido: "
                        + getApellido()
                        + "\nNúmero de Cedula: "
                        + getNroCedula()
                        + "\nEdad: "
                        + getEdad());
    }
}
