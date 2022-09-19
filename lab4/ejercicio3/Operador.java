package lab3_ejercicio1;

// @author EliasGill
public class Operador extends Informatico {

    // los operadores pueden tener varios turnos, en cambio los demas informaticos
    // solo cuentan con un solo turno fijo
    private String turno;
    private String titulo = "Operador";

    public Operador(String primerNombre, String apellidoPaterno, int numeroCedula, String seccion,
            String especialidad, String turno, double salario) {

        super(primerNombre, apellidoPaterno, numeroCedula, seccion,
                especialidad, salario);

        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getPrimerNombre() + "\nApellido: " + super.getApellidoPaterno()
                + "\nNumero de cedula: " + super.getNumeroCedula() + "\nTitulo: " + titulo + "\nArea de trabajo: "
                + super.getSeccion() + "\nEspecialidad: " + super.getEspecialidad() + "\nTurno: " + getTurno()
                + "\nSalario: " + super.getSalario();
    }
}
