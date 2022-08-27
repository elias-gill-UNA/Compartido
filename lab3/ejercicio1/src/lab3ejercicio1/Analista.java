package lab3ejercicio1;

// @author Abeld

public class Analista extends Informatico {
    String nivel; // junior, medio o senior

    public Analista(String primerNombre, String apellidoPaterno, int numeroCedula, String seccion,
            String especialidad, String nivel) {

        super(primerNombre, apellidoPaterno, numeroCedula, seccion,
                especialidad);

        this.nivel = nivel;
    }

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
