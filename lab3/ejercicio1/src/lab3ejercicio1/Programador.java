package lab3ejercicio1;

// @author Abeld

public class Programador extends Informatico {
    boolean onCall; // si esta de guardia o no
    String nivel; // junior o senior

    public Programador(String primerNombre, String apellidoPaterno, int numeroCedula, String seccion,
            String especialidad, String nivel, boolean onCall) {
        super(primerNombre, apellidoPaterno, numeroCedula, seccion, especialidad);
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
}
