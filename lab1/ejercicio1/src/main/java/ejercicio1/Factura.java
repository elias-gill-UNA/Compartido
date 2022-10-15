package ejercicio1;

public class Factura {
    String numero_pieza;
    String descripcion_pieza;
    int cant_articulos;
    double precio;

    // constructor de la clase
    public Factura(String pieza, String descripcion, int cantidad, double precio) {
        this.numero_pieza = pieza;
        this.descripcion_pieza = descripcion;

        // definir cant de articulos
        if (precio < 0) {
            this.cant_articulos = 0;
        } else {
            this.cant_articulos = cantidad;
        }

        // definir el precio
        if (precio < 0) {
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
    }

    // metodo para obtener el monto de la factura
    public double obtenerMontoFactura() {
        return this.precio * this.cant_articulos;
    }

    // setters y getters
    public String getIdentificadorArticulo() {
        return numero_pieza;
    }

    public void setIdentificadorArticulo(String numero_pieza) {
        this.numero_pieza = numero_pieza;
    }

    public String getDescripcionArticulo() {
        return descripcion_pieza;
    }

    public void setDescripcionArticulo(String descripcion_pieza) {
        this.descripcion_pieza = descripcion_pieza;
    }

    public int getCantArticulos() {
        return cant_articulos;
    }

    public void setCantArticulos(int cant_articulos) {
        if (cant_articulos < 0) {
            this.cant_articulos = 0;
        } else {
            this.cant_articulos = cant_articulos;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
    }

    public void imprimir() {
        System.out.println("Codigo: " + this.numero_pieza);
        System.out.println("Descripcion: " + this.descripcion_pieza);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cant_articulos);
    }
}
