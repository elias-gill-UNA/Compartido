package trasaccion;

class costo {

    private int numero_cuenta, total_trasanciones_mes, limite_transacciones, monto_total;

    public costo(int numero_cuenta, int total_trasanciones_mes, int limite_transacciones, int monto_total) {
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
                System.out.println("Se excediò el lìmite de operaciones gratuitas y "
                        + "el sistema generarà un costo de 2% sobre el monto de transacciòn");

            } else {
                System.out.println(monto_total * 0.05);
                System.out.println("Se excediò el lìmite de operaciones gratuitas y el sistema generarà un costo de 5%"
                        + " sobre el monto de transacciòn");
            }
        } else {
            System.out.println("No se ha excedido en el limite de transacciones");
        }
        System.out.println("/------------------------------------------------------"
                + "---------------------------------------------------------------------------\n");
    }
}
