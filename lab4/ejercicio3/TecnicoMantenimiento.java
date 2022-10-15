package lab3_ejercicio1;

// @author Abeld
public class TecnicoMantenimiento extends Empleado {

    // En que areaTrabajo trabaja
    private String areaTrabajo;
    private final String titulo = "Técnico en Mantenimiento";

    TecnicoMantenimiento(
            String primerNombre,
            String apellidoPaterno,
            int numeroCedula,
            String area,
            double salario) {
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
        return "Nombre: "
                + super.getPrimerNombre()
                + "\nApellido: "
                + super.getApellidoPaterno()
                + "\nNumero de cedula: "
                + super.getNumeroCedula()
                + "\nTitulo: "
                + titulo
                + "\nArea de trabajo: "
                + getAreaTrabajo()
                + "\nSalario: "
                + super.getSalario();
    }
}
