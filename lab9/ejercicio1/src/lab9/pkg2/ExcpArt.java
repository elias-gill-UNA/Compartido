package lab9.pkg2;

public class ExcpArt {
    static void atime() {
        int t, r;
        r = (int) Math.random();
        System.out.println("Método atime-LP2");

        // posible division por 0
        try {
            t = 2 / r;
            System.out.println("Division: " + t);
        } catch (ArithmeticException e) {
            System.out.println("El método atime-LP2 realizo una division entre 0");
        }
    }

    static void batime() {
        System.out.println("Método batime-LP2");
        atime();
    }

    static void zatime() {
        System.out.println("Método zatime-LP2");
        batime();
    }

    static public void main(String[] arg) {
        System.out.println("Entrada al programa principal - LP2");
        zatime();
    }
}
