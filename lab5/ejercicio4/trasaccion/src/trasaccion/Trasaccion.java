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
        costo cliente2=new costo(456,9,12,2400000);
        cliente2.costo_trasanccion();
        costo client3=new costo(987789,8,6,980000);
        client3.costo_trasanccion();
    }
    
}
