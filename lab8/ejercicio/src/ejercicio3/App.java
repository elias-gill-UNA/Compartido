package ejercicio3;

import javax.swing.*;
// @Autor Elias Gill

public class App extends plantilla implements test_interface {
    // primero definen sus inputs
    static JTextPane listaInputs[] = new JTextPane[] { new JTextPane(), new JTextPane() };
    static String listaTitulos[] = new String[] { "neovim", "calculo diferencial" };
    static JTextPane res = new JTextPane();

    public App() throws Exception {
        super(res, listaInputs, listaTitulos);
    }

    @Override
    public void calcular() {
        // aca calculan las cosas
        Integer neovim = Integer.parseInt(listaInputs[0].getText());
        Integer calculo = Integer.parseInt(listaInputs[0].getText());
        Integer x = calculo + neovim;

        // actualizar el resultado
        res.setText(x.toString());
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
