package lab3_ejercicio1;

// @author Abeld
public class Gerente extends Empleado {

    // Sección encargada
    private String departamento;
    // Gerente funcional o gerente general
    private String tipoGerente;

    private String titulo = "Gerente";

    Gerente(String primerNombre, String apellidoPaterno, int numeroCedula, String departamento, String tipoGerente, double salario) {
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
        return "Nombre: " + super.getPrimerNombre() + "\nApellido: " + super.getApellidoPaterno()
                + "\nNumero de cedula: " + super.getNumeroCedula() + "\nTitulo: " + titulo + "\nDepartamento: " + getDepartamento()
                + "\nTipo de Gerente: " + getTipoGerente() + "\nSalario: " + super.getSalario();
    }

}
