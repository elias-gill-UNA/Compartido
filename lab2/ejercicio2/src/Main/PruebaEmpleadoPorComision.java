package Main;

public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision("Elias", "Gill", "123456", 1100000, 0.25);

        // datos originales
        System.out.printf(
                "Datos del empleado \nNombre y apellido: %s %s \nCedula: %s \nVentas: %s \nComision: \\% %double (%double)",
                empleado.obtenerPrimerNombre(), empleado.obtenerApellidoPaterno(), empleado.obtenerVentasBrutas(),
                empleado.ingresos(), empleado.obtenerTarifaComision());

        empleado.establecerVentasBrutas(2000);
        empleado.establecerTarifaComision(0.1);
        // nuevos datos
        System.out.printf(
                "Datos del empleado \nNombre y apellido: %s %s \nCedula: %s \nVentas: %s \nComision: \\% %double (%double)",
                empleado.obtenerPrimerNombre(), empleado.obtenerApellidoPaterno(), empleado.obtenerVentasBrutas(),
                empleado.ingresos(), empleado.obtenerTarifaComision());

        // metodo toString
        System.out.println("==================\nMetodo toString()");
        System.out.println(empleado.toString());
    }
}
