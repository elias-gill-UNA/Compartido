package ejercicio1;

// @author Abeld
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    private int ddd;
    private String mesS;
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private int[] cantiDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Primer caso
    Fecha(int mes, int dia, int anio) {
        if (validar(mes, dia, anio)) {
            this.mes = mes;
            this.dia = dia;
            this.anio = anio;
            numDia(dia, mes);
        } else {
            System.out.println("Fecha inválida!");
        }
    }

    // Segundo Caso
    Fecha(String mes, int dia, int anio) {
        if (validar(mes, dia, anio)) {
            this.mesS = mes;
            this.dia = dia;
            this.anio = anio;
            numDia(dia, this.mes);
        } else {
            System.out.println("Fecha inválida!");
        }
    }

    // Tercer caso
    Fecha(int dia, int anio) {
        if (validar(dia, anio)) {
            this.anio = anio;
            this.ddd = dia;
        } else {
            System.out.println("Fecha inválida!");
        }
    }

    // Calcula el número de día en el año
    private void numDia(int dia, int mes) {
        for (int i = 0; i < 12; i++) {
            if (i != mes - 1) {
                this.ddd += cantiDias[i];
            } else {
                this.ddd += dia;
                break;
            }

        }
    }

    // Métodos de validación
    // Primer caso
    private boolean validar(int mes, int dia, int anio) {
        int[] cantiDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes > 12 || mes < 1 || dia < 1 || dia > 31 || anio < 1) {
            return false;
        }

        // Comprueba si el año es bisiesto
        if (anio % 4 == 0 && anio % 100 != 0 && anio % 400 == 0) {
            cantiDias[1] = 29;
        }

        if (dia > cantiDias[mes - 1]) {
            return false;
        }

        this.mesS = meses[mes - 1];
        return true;
    }

    // Segundo caso
    private boolean validar(String mes, int dia, int anio) {
        int i;
        boolean bandera = false;
        for (i = 0; i < 12; i++) {
            if (meses[i].toLowerCase().equals(mes.toLowerCase())) {
                bandera = true;
                break;
            }
        }

        // El mes ingresado no existe
        if (!bandera) {
            return false;
        }

        // Comprueba si el año es bisiesto
        if (anio % 4 == 0 && anio % 100 != 0 && anio % 400 == 0) {
            cantiDias[1] = 29;
        }

        // Valida la cantidad de días en el mes
        if (dia > cantiDias[i]) {
            return false;
        }

        if (dia < 1 || dia > 31 || anio < 1) {
            return false;
        }

        this.mes = i + 1;
        return true;
    }

    // Tercer caso
    private boolean validar(int dia, int anio) {
        if (dia < 1 || dia > 365 || anio < 1) {
            return false;
        }

        int i;
        for (i = 0; i < 12; i++) {
            if (dia - cantiDias[i] <= 0) {
                break;
            }
            dia = dia - cantiDias[i];
        }

        this.dia = dia;
        this.mes = i + 1;
        this.mesS = meses[i];
        return true;
    }

    // Método de impresion
    public void imprimirFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);
        System.out.println(mesS + " " + dia + ", " + anio);
        System.out.println(ddd + " " + anio);
    }

}
