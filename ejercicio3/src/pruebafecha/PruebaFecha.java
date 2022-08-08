package pruebafecha;
// @author Abeld

public class PruebaFecha {

    public static void main(String[] args) {
        // Se instancia el objeto
        Fecha fecha1 = new Fecha();
        // Se establecen los valores
        fecha1.setMes(8);
        fecha1.setDia(6);
        fecha1.setAnio(2022);
        // Se obtienen los valores
        System.out.println("Dia: " + fecha1.getDia());
        System.out.println("Mes: " + fecha1.getMes());
        System.out.println("Año: " + fecha1.getAnio());
        System.out.print("FECHA: ");
        fecha1.mostrarFecha();
        System.out.println("*************************************");
        Fecha fecha2 = new Fecha(15, 9, 2021);
        System.out.println("Dia: " + fecha2.getDia());
        System.out.println("Mes: " + fecha2.getMes());
        System.out.println("Año: " + fecha2.getAnio());
        System.out.print("FECHA: ");
        fecha2.mostrarFecha();

    }

}
