package eje3_gradle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCampoTexto extends JFrame {
    private final JTextField campoTexto1; // text field with set size
    private final JTextField campoTexto2; // text field with text
    private final JTextField campoTexto3; // text field with text and size

    // TextFieldFrame constructor adds JTextFields to JFrame
    public VentanaCampoTexto() {
        super("Probando JTextField y JPasswordField");
        setLayout(new FlowLayout());

        // construct textfield with 10 columns
        campoTexto1 = new JTextField(10);
        add(campoTexto1); // add textField1 to JFrame

        // construct textfield with default text
        campoTexto2 = new JTextField("Ingrese aquí el texto");
        add(campoTexto2); // add textField2 to JFrame

        // construct textfield with default text and 21 columns
        campoTexto3 = new JTextField("No se puede editar", 21);
        campoTexto3.setEditable(false); // disable editing
        add(campoTexto3); // add textField3 to JFrame

        // register event handlers
        ManejadorCampoTexto handler = new ManejadorCampoTexto();
        campoTexto1.addActionListener(handler);
        campoTexto2.addActionListener(handler);
        campoTexto3.addActionListener(handler);
    } // end TextFieldFrame constructor

    //clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent evento) {
            // el usuario oprimió Intro en el objeto JTextField campoTexto2
            if (evento.getSource() == campoTexto2) {
                try {
                    int res = Integer.parseInt(campoTexto2.getText()) + Integer.parseInt(campoTexto1.getText());
                    campoTexto3.setText(String.valueOf(res));
                } catch(NumberFormatException e){
                    // muestra el contenido del objeto JTextField
                    JOptionPane.showMessageDialog(null, "Invalid values provided");
                }
            }
        }
    }
}
