package trasaccion;

// @author Rodrigo Alvarenga
public class Trasaccion {

    public static void main(String[] args) {
        // Casos de prueba por defecto
        costo cliente = new costo(456789, 10, 5, 120000);
        cliente.costo_trasanccion();
        costo cliente2 = new costo(456, 9, 12, 2400000);
        cliente2.costo_trasanccion();
        costo client3 = new costo(987789, 18, 6, 980000);
        client3.costo_trasanccion();
    }
}
