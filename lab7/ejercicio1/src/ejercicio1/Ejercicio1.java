package ejercicio1;

// @author Abeld
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Formatos: \n1)MM/DD/AAAA\n2)mes dia, año\n3)DD AAAA");
        System.out.println("\nCasos de Prueba");

        System.out.println("Caso 1:");
        Fecha f1 = new Fecha(10, 10, 2022);
        f1.imprimirFecha();

        System.out.println("\nCaso 2:");
        Fecha f2 = new Fecha("Octubre", 25, 2022);
        f2.imprimirFecha();

        System.out.println("\nCaso 3:");
        Fecha f3 = new Fecha(294, 2022);
        f3.imprimirFecha();

        System.out.println("");
        // Prueba de las funciones de validacion
        f1 = new Fecha(2, 29, 2003);            // 2003 no es bisiesto
        f2 = new Fecha("julioo", 21, 2002);     // esta mal escrito el mes
        f3 = new Fecha(-32, 2017);               // ningun mes tiene 32 dias
    }

}
