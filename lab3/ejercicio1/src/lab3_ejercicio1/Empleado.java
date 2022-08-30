package lab3_ejercicio1;

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

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + getPrimerNombre() + "\nApellido: " + getApellidoPaterno()
                + "\nNumero de cedula: " + getNumeroCedula() + "\nSalario: " + getSalario();
    }
}
