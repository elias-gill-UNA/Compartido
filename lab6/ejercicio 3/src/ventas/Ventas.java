/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ventas {

    public static void main(String[] args) {
        int ventas[][] = new int[6][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 0;
            }
        }
        int c = 0;
        int num_vendedor = 0, num_producto = 0, valor_total = 0;
        Scanner entrar = new Scanner(System.in);
        while (c < 4) {
            System.out.println("Ingrese la cantidad de notas del vendedor" + " " + c);
            int notas = entrar.nextInt();
            for (int i = 0; i < notas; i++) {
                System.out.println("Ingrese numero del producto");
                num_producto = entrar.nextInt();
                while(num_producto<1 || num_producto>5){
                    System.out.println("Error, Ingrese numero del producto entre 1 y 5");
                    num_producto = entrar.nextInt();
                }
                System.out.println("Ingrese el valor total del producto");
                valor_total = entrar.nextInt();
                while(valor_total<1){
                   System.out.println("Error, el valor del producto no puede ser negativo, vuelva a introducir");
                   valor_total = entrar.nextInt();
                }
                ventas[num_producto][c] = valor_total;
            }
            c++;
        }
        int suma_filas = 0;
        int suma_columnas = 0;
         System.out.printf("Productos");
         System.out.printf("\n");
        for (int i = 0; i < 6; i++) {
            System.out.printf(" %6d", i);
            for (int j = 0; j < 5; j++) {
                suma_filas = suma_filas + ventas[i][j];
            }
            System.out.printf(" %10d",suma_filas);
            suma_filas = 0;
            System.out.printf("\n");
        }
        
        System.out.println("\n");
        System.out.printf("Vendedores");
        System.out.printf("\n");
        for (int j = 0; j < 5; j++) {
            System.out.printf(" %6d", j);
            for (int i = 0; i < 6; i++) {
                suma_columnas = suma_columnas + ventas[i][j];
            }
            System.out.printf(" %10d",suma_columnas);
            suma_columnas = 0;
            System.out.printf("\n");
        }
        
    }
}
