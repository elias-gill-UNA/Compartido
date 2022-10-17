package ejercicio4;

// @author Abeld
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Se considera que las horas trabajadas siempre seran numeros enteros
        int cantiEmpleados, horasTrabajadas;
        float tarifaPorHora;

        // Creamos un objeto de tipo Empleado
        Empleado empleado = null;

        // Creamos una lista enlazada de tipo empleado
        LinkedList<Empleado> empleados = new LinkedList<>();

        // Para introducir los datos
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        cantiEmpleados = leer.nextInt();

        // Ciclo que carga los datos de los empleados
        System.out.println("\nIngrese los datos solicitados");
        for (int i = 0; i < cantiEmpleados; i++) {
            System.out.println("\n-->Empleado" + (i + 1) + ":");
            System.out.print("Horas trabajadas:");
            horasTrabajadas = leer.nextInt();
            System.out.print("Tarifa por hora:");
            tarifaPorHora = leer.nextFloat();
            empleado = new Empleado(horasTrabajadas, tarifaPorHora);
            // añado a la lista de empleados
            empleados.add(empleado);
        }
        // Imprime los datos de cada empleado
        empleado.calcularSueldoBruto(empleados);
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("\n-->Empleado" + (i + 1) + ":");
            System.out.println("Horas trabajadas: " + empleados.get(i).getHorasTrabajadas());
            System.out.println("Tarifa por hora: " + empleados.get(i).getTarifaPorHora() + " Gs.");
            System.out.println("Sueldo bruto: " + empleados.get(i).getSueldoBruto() + " Gs.");

        }

    }

}
