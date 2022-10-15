package lab3_ejercicio1;

// @author EliasGill
public class Informatico extends Empleado {

    private String especialidad; // frontend, backend, testing
    private String seccion; // frontend, backend, testing
    private final String titulo = "Informatico";

    public Informatico(
            String primerNombre,
            String apellidoPaterno,
            int numeroCedula,
            String seccion,
            String especialidad,
            double salario) {
        super(primerNombre, apellidoPaterno, numeroCedula, salario);
        this.seccion = seccion;
        this.especialidad = especialidad;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Nombre: "
                + super.getPrimerNombre()
                + "\nApellido: "
                + super.getApellidoPaterno()
                + "\nNumero de cedula: "
                + super.getNumeroCedula()
                + "\nTitulo: "
                + titulo
                + "\nArea de trabajo: "
                + getSeccion()
                + "\nEspecialidad: "
                + getEspecialidad()
                + "\nSalario: "
                + super.getSalario();
    }
}
