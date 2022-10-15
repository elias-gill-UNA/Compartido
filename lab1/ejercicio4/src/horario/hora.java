/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

/**
 * @author Admin
 */
public class hora {
    private int h;
    private int m;
    private int s;

    public hora(int hora, int minuto, int segundo) {
        this.h = hora;
        this.m = minuto;
        this.s = segundo;
    }

    public void setHora() {
        System.out.println(h);
    }

    public void setMinuto() {
        System.out.println(m);
    }

    public void setSegundo() {
        System.out.println(s);
    }

    public void adelantar_hora(int hor, int min, int seg) {
        System.out.println("El Horario Adelantado es ");
        System.out.println((this.h + hor) + " " + (this.m + min) + " " + (this.s + seg));
    }

    public void reinicializar(int hor, int min, int seg) {
        System.out.println((hor - this.h) + " " + (min - this.m) + " " + (seg - this.s));
    }

    public void setHorario() {
        System.out.println("El Horario Actual es: ");
        System.out.println(
                (this.h) + " horas" + " " + (this.m) + " minutos" + " " + (this.s) + " segundos");
    }
}
