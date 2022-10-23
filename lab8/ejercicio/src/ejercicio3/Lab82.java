package ejercicio3;

import javax.swing.*;
// @Autor Elias Gill

public class Lab82 extends plantilla implements test_interface {

    // primero definen sus inputs
    static JTextPane listaInputs[] = new JTextPane[]{
        new JTextPane(), // input neovim
        new JTextPane() // input calc. dif
    };

    // difinir el titulo del input
    static String listaTitulos[] = new String[]{
        "Poblacion mundial",
        "Tasa de crecimiento anual"
    };
    // panel de resultado (pueden usar a7 nomas)
    static JTextArea res = new JTextArea();

    public Lab82() throws Exception {
        super(res, listaInputs, listaTitulos);
    }

    // modificar esta funcion a discrecion
    @Override
    public void calcular() {
        // aca estiran los datos de sus inputs
        Float input1 = Float.parseFloat(listaInputs[0].getText()); // saca de neovim
        Float input2 = Float.parseFloat(listaInputs[1].getText()); // saca de calculo
        // actualizar el resultado
        //res.setText(logica(input1,input2));
        logica(input1, input2);
    }

    // funcion donde se realiza la logica del calculo
    public void logica(Float... arreglo) {
        //unir todo
        Float poblacion = arreglo[0];
        String r = new String();
        r += ("La poblacion mundial hoy es: " + poblacion);
        poblacion = (poblacion + (poblacion * arreglo[1]));
        r += ("\nLa poblacion mundial dentro de 1 año aproximadamente sera: " + poblacion);
        poblacion = (poblacion + (poblacion * arreglo[1]));
        r += ("\nLa poblacion mundial dentro de 2 años aproximadamente sera: " + poblacion);
        poblacion = (poblacion + (poblacion * arreglo[1]));
        r += ("\nLa poblacion mundial dentro de 3 años aproximadamente sera: " + poblacion);
        poblacion = (poblacion + (poblacion * arreglo[1]));
        r += ("\nLa poblacion mundial dentro de 4 años aproximadamente sera: " + poblacion);
        poblacion = (poblacion + (poblacion * arreglo[1]));
        r += ("\nLa poblacion mundial dentro de 5 años aproximadamente sera: " + poblacion);
        res.setText(r);
    }

    public static void main(String[] args) {
        try {
            res.setEditable(false);
            new Lab82();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
