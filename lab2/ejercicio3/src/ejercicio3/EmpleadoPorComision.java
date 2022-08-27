package ejercicio3;

// @author AbelDíaz
public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision;// porcentaje de comision

    EmpleadoPorComision(String primerNombre, String apellidoPaterno,
            int numeroCedula, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroCedula);
        // si ventasBrutas no son validas, lanza excepciones
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Ventas brutas debe ser >= 0.0");
        }
        // si tarifaComision no es valida, lanza excepciones
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException(
                    "La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }// fin del constructor

    // establece el valor de ventas brutas
    public void establecerVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException(
                    "Las ventas brutas deben ser >= 0.0");
        }
        this.ventasBrutas = ventasBrutas;
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    // establece la tarifa de comisiÃ³n
    public void establecerTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException(
                    "La tarifa de comisiÃ³n debe ser > 0.0 y < 1.0");
        }

        this.tarifaComision = tarifaComision;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public double ingresos() {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }

    @Override
    public String toString() {

        return super.toString() + "\nLas ventas brutas son: " + obtenerVentasBrutas()
                + "\nLa comision es: " + obtenerTarifaComision();
    }
}
