/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio2;

/**
 *
 * @author Andres Moises
 */
public class pruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaramos los objetos
        Empleado empleado1 = new Empleado("Federico","Gonzalez",30000);
        Empleado empleado2 = new Empleado("Claudia","Melano",15000);
        //hacemos las llamadas a los metodos
        empleado1.mostrarSalarioAnual();
        empleado2.mostrarSalarioAnual();
        
        empleado1.aumentar10();
        empleado2.aumentar10();
        
        empleado1.mostrarSalarioAnual();
        empleado2.mostrarSalarioAnual();
    }
    
}
