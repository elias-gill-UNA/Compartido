package lab3_ejercicio1;

// @author EliasGill
public class Programador extends Informatico {

    private boolean onCall; // si esta de guardia o no
    private String nivel; // junior o senior
    private String titulo = "Programador";

    public Programador(
            String primerNombre,
            String apellidoPaterno,
            int numeroCedula,
            String seccion,
            String especialidad,
            String nivel,
            boolean onCall,
            double salario) {
        super(primerNombre, apellidoPaterno, numeroCedula, seccion, especialidad, salario);
        // los programadores pueden estar "de guardia" tambien llamado onCall
        this.onCall = onCall;
        this.nivel = nivel; // junior o senior
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
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
                + "\nArea de trabajo: "
                + super.getSeccion()
                + "\nEspecialidad: "
                + super.getEspecialidad()
                + "\nEn guardia: "
                + isOnCall()
                + "\nNivel: "
                + getNivel()
                + "\nSalario: "
                + super.getSalario();
    }
}
