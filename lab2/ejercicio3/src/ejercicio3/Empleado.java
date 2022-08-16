package ejercicio3;

// @author AbelDíaz
//  Superclase Empleado
class Empleado {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final int numeroCedula;

    Empleado(String primerNombre, String apellidoPaterno, int numeroCedula) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCedula = numeroCedula;
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
