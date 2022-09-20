package ejercicio1;

// @author Abeld
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("---------------- PATRÓN A ------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------------- PATRÓN B ------------------");
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("---------------- PATRÓN C ------------------");
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------- PATRÓN D ------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
