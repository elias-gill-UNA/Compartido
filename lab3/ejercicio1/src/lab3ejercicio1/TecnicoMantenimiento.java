package lab3ejercicio1;

// @author Abeld
public class TecnicoMantenimiento extends Empleado {

    // En que areaTrabajo trabaja
    private String areaTrabajo;

    TecnicoMantenimiento(String primerNombre, String apellidoPaterno, int numeroCedula, String area, double salario) {
        super(primerNombre, apellidoPaterno, numeroCedula, salario);
        this.areaTrabajo = area;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String area) {
        this.areaTrabajo = area;
    }

    @Override
    public String toString() {
        return "Nombre: " + obtenerPrimerNombre() + "\nApellido: " + obtenerApellidoPaterno()
                + "\nNumero de cedula: " + obtenerNumeroCedula() + "\nArea de trabajo:" + getAreaTrabajo();
    }

}
