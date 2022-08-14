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
public class usarInterfaz{//clase donde voy a probar la interfaz, va a ejecutar un metodo distinto para objeto que se le pase
    private accionesAuto a;
    
    public usarInterfaz(accionesAuto a){
        this.a=a;
    }
    
    public void cantidadRuedas(){
        this.a.cantidadRuedas();
    }
    
    public void sonarVocina(){
        this.a.sonarVocina();
    }
    
    public void acelerar(){
        this.a.acelerar();
    }
    
    public void frenar(){
        this.a.frenar();
    }
    
    public void parar(){
        this.a.parar();
    }
    
    public void arrancar(){
        this.a.arrancar();
    }
}
