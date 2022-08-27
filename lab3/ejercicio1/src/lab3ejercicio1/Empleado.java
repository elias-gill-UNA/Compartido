package lab3ejercicio1;

// @author Abeld
public abstract class Empleado {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final int numeroCedula;
    private final double salario;

    Empleado(String primerNombre, String apellidoPaterno, int numeroCedula, double salario) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCedula = numeroCedula;
        this.salario = salario;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public int obtenerNumeroCedula() {
        return numeroCedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + obtenerPrimerNombre() + "\nApellido: " + obtenerApellidoPaterno()
                + "\nNumero de cedula: " + obtenerNumeroCedula();
    }
}
