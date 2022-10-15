package lab3_ejercicio1;

// @author EliasGill
public class Analista extends Informatico {

    private String nivel; // junior, medio o senior
    private final String titulo = "Analista";

    public Analista(
            String primerNombre,
            String apellidoPaterno,
            int numeroCedula,
            String seccion,
            String especialidad,
            String nivel,
            double salario) {

        super(primerNombre, apellidoPaterno, numeroCedula, seccion, especialidad, salario);

        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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
                + "\nArea de empleo: "
                + super.getSeccion()
                + "\nEspecialidad: "
                + super.getEspecialidad()
                + "\nNivel: "
                + getNivel()
                + "\nSalario: "
                + super.getSalario();
    }
}
