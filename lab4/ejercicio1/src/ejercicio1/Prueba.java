package ejercicio1;

// @author AbelDíaz
public class Prueba {

    public static void main(String[] args) {
        // Clase persona
        System.out.println("Datos de la Persona:");
        Persona persona = new Persona(5404806, "Abel", "Díaz", 19);
        persona.vizualizar();
        // Clase cliente
        System.out.println("\nDatos del Cliente:");
        Cliente cliente = new Cliente(2, 4567891, 3257891, "Oscar", "Romero", 25);
        cliente.vizualizar();
        // Clase empleado
        System.out.println("\nDatos del Empleado:");
        Empleado empleado = new Empleado(1, 3214567, 4567891, "Luis", "Morel", 22);
        empleado.vizualizar();
    }
    
}
