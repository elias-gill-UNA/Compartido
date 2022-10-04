/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.Scanner;

/**
 *
 * @author Elias
 */
public class Ventas {

    public static void main(String[] args) {
        // [producto][vendedor]
        int ventas[][] = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 0;
            }
        }

        System.out.println("1- Ingresar valores manualmente");
        System.out.println("2- Valores por defecto");

        Scanner entrar = new Scanner(System.in);
        if (Integer.parseInt(entrar.nextLine()) == 1) {
            int c = 0;
            int num_producto = 0, valor_total = 0;
            while (c < 4) {
                System.out.println("Ingrese la cantidad de notas del vendedor" + " " + c);
                int notas = entrar.nextInt();
                for (int i = 0; i < notas; i++) {
                    System.out.println("Ingrese numero del producto");
                    num_producto = entrar.nextInt();
                    while (num_producto < 1 || num_producto > 5) {
                        System.out.println("Error, Ingrese numero del producto entre 1 y 5");
                        num_producto = entrar.nextInt();
                    }
                    System.out.println("Ingrese el valor total del producto");
                    valor_total = entrar.nextInt();
                    while (valor_total < 1) {
                        System.out.println("Error, el valor del producto no puede ser negativo, vuelva a introducir");
                        valor_total = entrar.nextInt();
                    }
                    ventas[num_producto - 1][c] = valor_total;
                }
                c++;
            }
        } else {
            for (int i = 0; i < 4; i++) {
                // cantidad de notas del vendedor
                int aux = (int) ((Math.random() * (5 - 0)) + 0);
                for (int k = 0; k < aux; k++) {
                    int producto = (int) ((Math.random() * (5 - 0)) + 0);
                    int venta = (int) ((Math.random() * (230 - 10)) + 0);
                    ventas[producto][i] += venta;
                }
            }
        }

        System.out.printf("%16s %10s %10s %10s %10s %10s", " ", "Vendedor1", "Vendedor2", "Vendedor3",
                "Vendedor4", "Totales\n");
        int i = 1;
        for (int[] fila : ventas) {
            int total = fila[0] + fila[1] + fila[2] + fila[3];
            System.out.printf("Producto%3d %10d %10d %10d %10d %10d\n", i, fila[0], fila[1], fila[2], fila[3],
                    total);
            i++;
        }

        System.out.printf("%12s", "total");
        for (i = 0; i < 4; i++) {
            int total = 0;
            for (int k = 0; k < 5; k++) {
                total += ventas[k][i];
            }
            System.out.printf(" %10d", total);
        }
    }
}
