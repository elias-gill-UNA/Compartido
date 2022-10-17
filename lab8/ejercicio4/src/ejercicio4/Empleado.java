package ejercicio4;

// @author Abeld
import java.util.LinkedList;
import java.util.Set;

public class Empleado {

    private double sueldoBruto;
    private int horasTrabajadas;
    private float tarifaPorHora;

    public Empleado(int horasTrabajadas, float tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void calcularSueldoBruto(LinkedList<Empleado> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            calculoSueldoBruto(empleados.get(i));
        }
    }

    private void calculoSueldoBruto(Empleado e) {
        /*
            Si la cantidad de horas es menor o igual a cero, el sueldo bruto se
        considera cero por defecto.
            Si la tarifa por hora es menor o igual a cero, el sueldo bruto se
        considera cero por defecto.
         */
        double sueldoBruto = 0;
        int horasExtras = 0;
        int horasTrabajadas = e.getHorasTrabajadas();
        float tarifaPorHora = e.getTarifaPorHora();
        if (horasTrabajadas > 0 && tarifaPorHora > 0) {
            if (horasTrabajadas > 40) {
                horasExtras = horasTrabajadas - 40;
                horasTrabajadas = 40;
            }
            sueldoBruto = horasTrabajadas * tarifaPorHora + horasExtras * tarifaPorHora * 1.5;
        }
        e.setSueldoBruto(sueldoBruto);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

}
