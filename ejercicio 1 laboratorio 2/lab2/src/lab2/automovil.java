/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Andres Moises
 */
public class automovil extends vehiculo{//clase automovil que hereda de la clase vehiculo
    private int ruedas=4;
    
    public void cantidadRuedas(){
        System.out.println("la cantidad de ruedas es "+4);
    }
    
    public void sonarVocina(){
        System.out.println("CLAN CLAAAAAAN");
    }
    
    public void arrancar(){
        System.out.println("Has arrancado el auto");
    }
    
    public void frenar(){
        System.out.println("has frenado el auto");
    }
    
    public void parar(){
        System.out.println("has parado el auto");
    }
    
    public void acelerar(){
        System.out.println("has acelerado el auto");
    }
}
