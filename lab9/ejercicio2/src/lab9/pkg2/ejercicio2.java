package lab9.pkg2;

import java.util.*;

public class ejercicio2 {

    public static void main(String[] args) throws Exception {
        int numero;
        System.out.println("ingrese el numero");
        Scanner sc = new Scanner(System.in);
        numero = Integer.parseInt(sc.nextLine());
        assert (numero < 0 || numero > 10) : "El numero no esta en el rango ";
        try {
            rango(numero);
        } catch (Exception e) {
            System.out.println("El numero esta fuera de rango");
        } finally {
            sc.close();
        }
    }

    static void rango(int numero) throws Exception {
        if (numero < 0 || numero > 10) {
            throw new Exception("El numero no esta en el rango");
        }
    }
}
