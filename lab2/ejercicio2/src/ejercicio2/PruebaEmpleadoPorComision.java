package ejercicio2;

public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision("Elias", "Gill", "123456", 1100000, 0.25);

        // datos originales
        System.out.println("\nDatos originales");
        System.out.println("Informacion del Empleado \n=====================");
        System.out.println(empleado.toString());

        empleado.establecerVentasBrutas(2000);
        empleado.establecerTarifaComision(0.1);

        // metodo toString
        System.out.println("\nDatos modificados");
        System.out.println("Informacion del Empleado \n=====================");
        System.out.println(empleado.toString());
    }
}
