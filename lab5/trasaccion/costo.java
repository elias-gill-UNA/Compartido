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
class costo {
    int numero_cuenta,total_trasanciones_mes,limite_transacciones,monto_total;

    public costo(int numero_cuenta, int total_trasanciones_mes, int limite_transacciones,int monto_total) {
        this.numero_cuenta = numero_cuenta;
        this.total_trasanciones_mes = total_trasanciones_mes;
        this.limite_transacciones = limite_transacciones;
        this.monto_total=monto_total;
    }
    public void costo_trasanccion(){
        if(total_trasanciones_mes>limite_transacciones){
            System.out.println("Se ha excedido en el limite de transacciones");
            if((total_trasanciones_mes-limite_transacciones)<=5){
                
                System.out.println("Costo a pagar ");
                System.out.println(monto_total*0.02);
            }else{
                System.out.println("Costo a pagar ");
                System.out.println(monto_total*(0.05));
            }
        }else{
             System.out.println("No Se ha excedido en el limite de transacciones");
        }
    }
}
