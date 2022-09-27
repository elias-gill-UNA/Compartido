/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasaccion;

/**
 *
 * @author Admin
 */
public class Trasaccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        costo cliente=new costo(456789,10,5,120000);
        cliente.costo_trasanccion();
    }
    
}
