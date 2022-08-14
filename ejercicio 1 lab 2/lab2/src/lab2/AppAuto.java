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
        automovil auto = new automovil();
        vehiculo movil = new vehiculo();
        
        usarInterfaz prueba = new usarInterfaz(auto);
        prueba.parar();
    }
    
}
