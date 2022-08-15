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
public class AppAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objetos distintos pero con comportamientos similares(metodos similares)
        automovil auto = new automovil();
        vehiculo movil = new vehiculo();
        
        usarInterfaz prueba = new usarInterfaz(movil);//si le pasas el objeto movil, sus metodos van a ser distintos
        //comportamientos comunes de los autos
        prueba.arrancar();
        prueba.acelerar();
        prueba.frenar();
        prueba.sonarVocina();
        prueba.frenar();
        prueba.cantidadRuedas();
    }
    
}
