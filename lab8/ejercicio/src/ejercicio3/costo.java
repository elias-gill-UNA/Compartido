/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Admin
 */
public class costo {
     public int numero_cuenta, total_trasanciones_mes, limite_transacciones, monto_total;

    public costo(
            int numero_cuenta,
            int total_trasanciones_mes,
            int limite_transacciones,
            int monto_total) {
        this.numero_cuenta = numero_cuenta;
        this.total_trasanciones_mes = total_trasanciones_mes;
        this.limite_transacciones = limite_transacciones;
        this.monto_total = monto_total;
    }

    public void costo_trasanccion() {
        if (total_trasanciones_mes > limite_transacciones) {

            System.out.print("Costo a pagar: ");
            if ((total_trasanciones_mes - limite_transacciones) <= 5) {
                System.out.println(monto_total * 0.02);
               
                            
            } else {
                System.out.println(monto_total * 0.05);
            }
            
        } else {
            System.out.println("No se ha excedido en el limite de transacciones");
        }
       
    }
    
}
