package lab3ejercicio1;

// @author Abeld
public class Gerente extends Empleado {

    // Sección encargada
    private String departamento;
    // Gerente funcional o gerente general
    private String tipoGerente;

    Gerente(String primerNombre, String apellidoPaterno, int numeroCedula, double salario, String departamento, String tipoGerente) {
        super(primerNombre, apellidoPaterno, numeroCedula, salario);
        this.departamento = departamento;
        this.tipoGerente = tipoGerente;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoGerente() {
        return tipoGerente;
    }

    public void setTipoGerente(String tipoGerente) {
        this.tipoGerente = tipoGerente;
    }

    @Override
    public String toString() {
        return "Nombre: " + obtenerPrimerNombre() + "\nApellido: " + obtenerApellidoPaterno()
                + "\nNumero de cedula: " + obtenerNumeroCedula() + "\nDepartamento:" + getDepartamento()
                + "\nTipo de Gerente: " + getTipoGerente();
    }

}
