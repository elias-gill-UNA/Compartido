/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 * @author Andres Moises
 */
public class vehiculo extends motorizado
        implements accionesAuto { // clase vehiculo que hereda de la clase maquina
    private int ruedas;

    public void arrancar() {
        System.out.println("Has arrancado el vehiculo");
    }

    public void frenar() {
        System.out.println("has frenado el vehiculo");
    }

    public void parar() {
        System.out.println("has parado el vehiculo");
    }

    public void acelerar() {
        System.out.println("has acelerado el vehiculo");
    }

    public void sonarVocina() {
        System.out.println("PI PI PIIIIII");
    }

    public void cantidadRuedas() {
        System.out.println("no se sabe la cantidad");
    }
}
