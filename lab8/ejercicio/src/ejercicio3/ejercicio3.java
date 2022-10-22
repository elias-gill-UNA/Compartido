package ejercicio3;

import javax.swing.*;
// @Autor Elias Gill

public class ejercicio3 extends plantilla implements test_interface {
    private class costo {
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

    // primero definen sus inputs
    private costo cliente[] = new costo[] {
            new costo(456789, 10, 5, 120000),
            new costo(456, 9, 12, 2400000),
            new costo(987789, 18, 6, 980000)

    };

    static JTextPane listaInputs[] = new JTextPane[] {
            new JTextPane(), // input neovim
            new JTextPane(),
            new JTextPane(), // input calc. dif
            new JTextPane()// input calc. dif
    };

    // difinir el titulo del input
    static String listaTitulos[] = new String[] {
            "Numero de cuenta",
            "Limite Transacciones",
            "Total de Transacciones",
            "Monto total"
    };
    // panel de resultado (pueden usar a7 nomas)
    static JTextPane res = new JTextPane();

    public ejercicio3() throws Exception {
        super(res, listaInputs, listaTitulos);
    }

    // modificar esta funcion a discrecion
    @Override
    public void calcular() {
        int resultado = 0;
        // aca estiran los datos de sus inputs
        Integer input1 = Integer.parseInt(listaInputs[0].getText());
        Integer input2 = Integer.parseInt(listaInputs[1].getText());
        Integer input3 = Integer.parseInt(listaInputs[2].getText());
        Integer input4 = Integer.parseInt(listaInputs[3].getText());
        for (costo c : cliente) {
            if (input1 == c.numero_cuenta) {
                if (c.total_trasanciones_mes > c.limite_transacciones) {
                    resultado = logica(c.total_trasanciones_mes, c.limite_transacciones, c.monto_total);
                    if (resultado == 1) {
                        res.setText(
                                "El cliente se excede en el limite y debe pagar" + " " + "" + (c.monto_total * 0.02));
                    } else if (resultado == 2) {
                        res.setText(
                                "El cliente se excede en el limite y debe pagar" + " " + "" + (c.monto_total * 0.05));
                    } else {
                        res.setText("El Cliente NO se ha excedido en sus transacciones");
                    }
                }
            }
        }

    }

    // funcion donde se realiza la logica del calculo
    public Integer logica(Integer... parametros) {

        if ((parametros[0] - parametros[1]) <= 5) {
            System.out.println(parametros[3] * 0.02);
            return 1;
        } else if ((parametros[0] - parametros[1]) > 5) {
            System.out.println(parametros[3] * 0.05);
            return 2;
        } else {
            return 3;
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
