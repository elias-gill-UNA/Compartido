package ejercicio4;

// @author Abeld
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        String cadena = "";
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        cadena = leer.nextLine();

        try {
            if (cadena.length() >= 30) {
                throw new CadenaLongitudMayor("El texto excede la longitud maxima!");
            }
            // expresión regular ^[a-zA-Z]*$ para comprobar una string de alfabetos.
            if (!cadena.matches("^[a-zA-z]*$")) {
                throw new CaracteresNoAlfabeticos("El texto contiene caracteres no alfabeticos!");
            }
        } catch (CadenaLongitudMayor e) {
            System.out.println(e.getMessage());
        } catch (CaracteresNoAlfabeticos e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
        }
    }

}
