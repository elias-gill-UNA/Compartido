package lab3ejercicio1;

// @author Abeld

public abstract class Informatico extends Empleado {
    private String especialidad; // frontend, backend, testing
    private String seccion; // frontend, backend, testing

    public Informatico(String primerNombre, String apellidoPaterno, int numeroCedula, String seccion,
            String especialidad, double salario) {
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

}
