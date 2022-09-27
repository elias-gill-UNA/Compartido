package ejercicio2;

// @author Andrés Román
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int bandera = 0;//si el usuario quere dejar de meter valores
        int ganancias[] = {0, 0, 0, 0, 0};
        Scanner eleccion = new Scanner(System.in);
        int precios[] = {10000, 15000, 20000, 25000, 30000};
        int opcion;
        while (bandera == 0) {
            System.out.print("Ingrese una opción: " + "\n1. Para cargar las ganancias."
                    + "\n2. Para notificar las ganancias." + "\n3. Para salir.");
            do {
                System.out.print("\nOpción:");
                opcion = eleccion.nextInt();
                if (opcion != 1 && opcion != 2 && opcion != 3) {
                    System.out.println("Ingrese una opción valida!\n");

                }
            } while (opcion != 1 && opcion != 2 && opcion != 3);

            switch (opcion) {
                case 1:
                    cargar(ganancias);
                    break;
                case 2:
                    mostrar(ganancias, precios);
                    break;
                case 3:
                    bandera = 1;
                    break;
            }
            System.out.println("***********************************************************\n");
        }
        System.out.println("Fin del Programa");
    }

    static void cargar(int[] ganancias) {
        int numero, vendidos;
        Scanner numeroProducto = new Scanner(System.in);
        Scanner cantidadVendida = new Scanner(System.in);
        System.out.print("Ingrese el número del producto: ");
        numero = numeroProducto.nextInt();
        System.out.print("Ingrese el monto que se vendio: ");
        vendidos = cantidadVendida.nextInt();
        switch (numero) {
            case 1:
                ganancias[0] = ganancias[0] + vendidos;
                break;
            case 2:
                ganancias[1] = ganancias[1] + vendidos;
                break;
            case 3:
                ganancias[2] = ganancias[2] + vendidos;
                break;
            case 4:
                ganancias[3] = ganancias[3] + vendidos;
                break;
            case 5:
                ganancias[4] = ganancias[4] + vendidos;
                break;
            default:
                System.out.println("El producto no existe!");
                break;
        }
        System.out.println("");
    }

    static void mostrar(int[] ganancias, int[] precios) {
        int bandera = 0, contador = 0;
        while (bandera == 0) {
            System.out.println("La cantidad de productos" + (contador + 1) + " que se vendieron son "
                    + ganancias[contador] + " y las ganancias fueron " + ganancias[contador] * precios[contador]);
            contador++;
            if (contador == 5) {
                bandera = 1;
            }
        }
        System.out.println("");
    }

}
