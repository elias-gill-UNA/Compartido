package ejercicio3;

import javax.swing.*;
// @Autor Elias Gill

public class App extends plantilla implements calculadora {
    // primero definen sus inputs
    JTextArea listaInputs[] = new JTextArea[] { new JTextArea() };
    String listaTitulos[] = new String[] { "Ingrese monto" };
    JLabel res;

    // ingrese monto       |  2000  |
    public App() throws Exception {
        nuevaPlantilla(listaInputs, listaTitulos);
    }

    public void calcular() {
        Integer nuevo = 1 + 2;
        res.setText(nuevo.toString());
    }

    public static void main(String[] args) {
        try {
            new App();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
