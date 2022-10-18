package ejercicio3;
// @author AbelDíaz

public class PruebaEmpleadoPorComision {

    public static void main(String[] args) {
        EmpleadoPorComision empleado =
                new EmpleadoPorComision("Abel", "Díaz", 5404806, 500000, 0.05);
        System.out.println(empleado.toString());
    }
}
