package ejercicio3;

import javax.swing.*;
// @Autor Elias Gill

public class ejercicio3 extends plantilla implements test_interface {
    // inputs

    static JTextPane listaInputs[] = new JTextPane[] {
            new JTextPane(),
            new JTextPane(),
            new JTextPane(), };

    // difinir el titulo del input
    static String listaTitulos[] = new String[] {
            "Monto de transaccion",
            "Limite Transacciones",
            "Total de Transacciones", };
    // panel de resultado (pueden usar a7 nomas)
    static JTextPane res = new JTextPane();

    public ejercicio3() throws Exception {
        super(res, listaInputs, listaTitulos);
    }

    // modificar esta funcion a discrecion
    @Override
    public void calcular() {
        try {
            // aca estiran los datos de sus inputs
            Float monto = Float.parseFloat(listaInputs[0].getText());
            Float limite = Float.parseFloat(listaInputs[1].getText());
            Float transacciones = Float.parseFloat(listaInputs[2].getText());

            if (limite < transacciones) {
                logica(transacciones - limite, monto);
            } else {
                res.setText("Transaccion gratuita");
            }
        } catch (Exception e) {
            res.setText("VALORES INVALIDOS");
        }
    }

    // funcion donde se realiza la logica del calculo
    public void logica(Float... parametros) {
        if (parametros[0] <= 5) {
            Double r = parametros[1] * 0.02;
            res.setText("Costo de transaccion: " + r.toString());
        } else {
            Double r = parametros[1] * 0.05;
            res.setText("Costo de transaccion: " + r.toString());
        }
    }

    public static void main(String[] args) {
        try {
            res.setEditable(false);
            new ejercicio3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
