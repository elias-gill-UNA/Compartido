package pruebafecha;

// @author Abeld
public class Fecha {

    // Variables de instancia (Atributos)
    private int mes;
    private int dia;
    private int anio;

    // Constructor que inicializa las tres variables de instancia
    Fecha() {
    }

    Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos set y get para cada atributo
    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAnio() {
        return anio;
    }

    // Metodo para impresión de fecha
    public void mostrarFecha() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }

}
