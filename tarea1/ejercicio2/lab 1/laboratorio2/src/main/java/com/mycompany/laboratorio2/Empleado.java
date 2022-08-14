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
public class Empleado {
    //variables de instancia de la clase
    String nombre;
    String apellidoPaterno;
    double salarioMensual;
    
    public Empleado(String nombre,String apellido,double salario){//constructor de la clase empleado
        this.nombre=nombre;
        this.apellidoPaterno=apellido;
        this.salarioMensual=salario;
    }
    
    //setters
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        if(this.salarioMensual>=0){
            this.salarioMensual = salarioMensual;
        }
    }
    
    //getters
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
    
    //metodos para el salario anual
    
    public void mostrarSalarioAnual(){
        double aux = getSalarioMensual()*12;
        System.out.println("su salario anual de "+getNombre()+" "+getApellidoPaterno()+" es de "+aux);
    }
    
    public void aumentar10(){
        double aux = getSalarioMensual();
        aux = aux + 0.1*aux;
        this.salarioMensual = aux;
    }
}
