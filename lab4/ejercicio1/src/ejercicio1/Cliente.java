package ejercicio1;

// @author AbelDíaz
public class Cliente extends Persona {

    private int idCliente;
    private float montoCredito;

    public Cliente(
            int idCliente,
            float montoCredito,
            int nroCedula,
            String nombre,
            String apellido,
            int edad) {
        super(nroCedula, nombre, apellido, edad);
        this.idCliente = idCliente;
        this.montoCredito = montoCredito;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(float mmontoCredito) {
        this.montoCredito = mmontoCredito;
    }
}
