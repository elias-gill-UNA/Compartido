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
        int ventas[][]=new int[5][4];
            for (int i = 0; i <5; i++){
                for(int j=0;j<4;j++){
                    ventas[i][j]=0;
                }     
            }
            int c=0;
            int num_vendedor=0, num_producto=0, valor_total=0;
            Scanner entrar=new Scanner (System.in);
            while(c<4){
                System.out.println("Ingrese la cantidad de notas del vendedor"+" "+c);
                int notas=entrar.nextInt();
                for (int i = 0; i<notas; i++) {
                    System.out.println("Ingrese numero del producto");
                    num_producto=entrar.nextInt();
                    System.out.println("Ingrese el valor total del producto");
                    valor_total=entrar.nextInt();
                    ventas[num_producto][c]=valor_total;
                }
                c++;
            }
            int suma_filas=0;
            int suma_columnas=0;
            for (int i = 0; i <5; i++){
                System.out.println("Total ventas del producto"+" "+i);
                for(int j=0;j<4;j++){
                    suma_filas=suma_filas+ventas[i][j];
                }
                System.out.println(suma_filas);
                suma_filas=0;
            }
            System.out.println("\n");
            for(int j=0;j<4;j++){
                System.out.println("Total ventas del vendedor"+" "+j);
                for (int i = 0; i <5; i++){
                    suma_columnas=suma_columnas+ventas[i][j];  
                }
                 System.out.println(suma_columnas);
                 suma_columnas=0;
            }
    } 
}
