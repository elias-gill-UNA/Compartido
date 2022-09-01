package ejercicio1;

// @author AbelDíaz
public class Empleado extends Persona {

    private int idEmpleado;
    private float salario;

    public Empleado(int idEmpleado, float salario, int nroCedula, String nombre, String apellido, int edad) {
        super(nroCedula, nombre, apellido, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void vizualizar() {
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nNúmero de Cedula: "
                + getNroCedula() + "\nEdad: " + getEdad() + "\nID de Empleado: " + getIdEmpleado()
                + "\nSalario: " + getSalario());
    }
}
