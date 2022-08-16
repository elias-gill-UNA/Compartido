package  ejercicio2;

public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {
        
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Elias", "Gill", "123456", 1100000, 0.25, 1200000);

        // datos originales
        System.out.println("\nDatos originales");
        System.out.println("Informacion del Empleado \n=====================");
        System.out.println(empleado.toString());

        empleado.establecerVentasBrutas(2000);
        empleado.establecerTarifaComision(0.1);
        empleado.establecerSalarioBase(2000);

        // metodo toString
        System.out.printf("\nDatos modificados");
        System.out.println("\nInformacion del Empleado \n=====================");
        System.out.println(empleado.toString());
    }
}
