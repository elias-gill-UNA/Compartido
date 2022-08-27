package lab3ejercicio1;

// @author Abeld

public class Operador extends Informatico {
    // los operadores pueden tener varios turnos, en cambio los demas informaticos
    // solo cuentan con un solo turno fijo
    String turno;

    public Operador(String primerNombre, String apellidoPaterno, int numeroCedula, String seccion,
            String especialidad, String turno) {

        super(primerNombre, apellidoPaterno, numeroCedula, seccion,
                especialidad);

        this.turno = turno;
    }

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
}
