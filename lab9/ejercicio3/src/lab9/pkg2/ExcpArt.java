package lab9.pkg2;

import java.util.*;

public class ExcpArt {
    static public float cociente(int a, int b) {
        try {
            float r = a / b;
            return r;
        } catch (Exception e) {
            return 0;
        }
    }

    static public void main(String[] arg) {
        System.out.println("Ingrese el dividendo");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean t = false;
        // dividendo
        System.out.println("Ingrese el dividendo");
        while (!t) {
            try {
                a = sc.nextInt();
                t = true;
            } catch (InputMismatchException e) {
                System.out.println("Intentelo nuevamente");
                continue;
            }
        }
        t = false;
        // divisor
        System.out.println("Ingrese el divisor");
        while (!t) {
            try {
                b = sc.nextInt();
                t = true;
            } catch (InputMismatchException e) {
                System.out.println("Intentelo nuevamente");
                continue;
            }
        }
        float r = cociente(a, b);
        if (r != 0) {
            System.out.println(r);
        } else {
            System.out.println("Division entre 0 no permitida");
        }
        sc.close();
    }
}
