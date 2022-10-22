package ejercicio3;

import javax.swing.*;
// @Autor Elias Gill

public class App extends plantilla implements test_interface {
    // primero definen sus inputs
    static JTextPane listaInputs[] = new JTextPane[] { 
        new JTextPane(),  // input neovim
        new JTextPane()  // input calc. dif
    };

    // difinir el titulo del input
    static String listaTitulos[] = new String[] { 
        "monto anual", 
        "porcentaje de descuento"
    };
    // panel de resultado (pueden usar a7 nomas)
    static JTextPane res = new JTextPane();

    public App() throws Exception {
        super(res, listaInputs, listaTitulos);
    }

    // modificar esta funcion a discrecion
    @Override
    public void calcular() {
        // aca estiran los datos de sus inputs
        Integer input1 = Integer.parseInt(listaInputs[0].getText()); // saca de neovim
        Integer input2 = Integer.parseInt(listaInputs[0].getText()); // saca de calculo

        // actualizar el resultado
        res.setText("el monto total es: " + logica (new Integer[]{input1, input2}).toString());
    }

    // funcion donde se realiza la logica del calculo
    public Integer logica(Integer parametros[]) {
        return parametros[0] / parametros[1];
    }

    public static void main(String[] args) {
        try {
            res.setEditable(false);
            new App();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
