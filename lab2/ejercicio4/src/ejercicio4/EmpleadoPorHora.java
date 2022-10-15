package ejercicio4;

// @author AbelDíaz
public class EmpleadoPorHora extends Empleado {

    private double horas;
    private double sueldo;

    EmpleadoPorHora(
            String primerNombre,
            String apellidoPaterno,
            int cedula,
            double sueldoHoras,
            double horasTrabajadas) {
        super(primerNombre, apellidoPaterno, cedula);
        if (horasTrabajadas < 0 || horasTrabajadas > 168) {
            throw new IllegalArgumentException("Cantidad de horas trabajadas invalida!");
        }
        if (sueldoHoras < 0) {
            throw new IllegalArgumentException("El sueldo debe ser mayor o igual a 0!");
        }
        this.horas = horasTrabajadas;
        this.sueldo = sueldoHoras;
    }

    public void establecerHoras(double hora) {
        if (horas < 0 || horas > 168) {
            throw new IllegalArgumentException("Cantidad de horas trabajadas invalida!");
        }
        this.horas = hora;
    }

    public void establecerSueldo(double sueldo) {
        if (sueldo < 0) {
            throw new IllegalArgumentException("El sueldo debe ser mayor o igual a 0!");
        }
        this.sueldo = sueldo;
    }

    public double obtenerHoras() {
        return horas;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double ingresos() {
        if (horas > 40) {
            double horasExtra = horas - 40;
            double sueldoExtra = sueldo * 1.5 * horasExtra;
            return sueldo * 40 + sueldoExtra;
        } else {
            return sueldo * horas;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nHoras Trabajadas: "
                + obtenerHoras()
                + "\nSueldo por hora: "
                + obtenerSueldo()
                + "\nSueldo total: "
                + ingresos();
    }
}
