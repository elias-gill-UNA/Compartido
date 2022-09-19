package lab3_ejercicio1;

// @author Abeld
public class Prueba {

    public static void main(String[] args) {
        TecnicoMantenimiento tecnico = new TecnicoMantenimiento("Nestor", "Ramirez", 1405206, "Industrial", 3000000);
        System.out.println("\tDatos del empleado\n" + tecnico.toString());

        Gerente gerente = new Gerente("Alberto", "Ruiz", 2403856, "Comercial", "General", 2500000);
        System.out.println("\n\tDatos del empleado\n" + gerente.toString());

        Informatico informatico = new Informatico("Leonardo", "Lezcano", 1804606, "Fronted", "Frontend y Testing", 4000000);
        System.out.println("\n\tDatos del empleado\n" + informatico.toString());

        Analista analista = new Analista("Fabian", "Romero", 4457425, "Testing", "Testing y Backend", "Senior", 3500000);
        System.out.println("\n\tDatos del empleado\n" + analista.toString());

        Programador programador = new Programador("Uriel", "Britez", 4237325, "Backend", "Fronted y Backend", "Junior", true, 3500000);
        System.out.println("\n\tDatos del empleado\n" + programador.toString());

        Operador operador = new Operador("Arnaldo", "Gomez", 3231325, "Backend", "Fronted y Backend", "Noche", 3500000);
        System.out.println("\n\tDatos del empleado\n" + operador.toString());

    }
}
