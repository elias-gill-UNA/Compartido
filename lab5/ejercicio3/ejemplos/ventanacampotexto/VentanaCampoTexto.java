/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanacampotexto;

/**
 *
 * @author Rodrigo
 */
// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class VentanaCampoTexto extends JFrame 
{
   private final JTextField campoTexto1; // text field with set size
   private final JTextField campoTexto2; // text field with text
   private final JTextField campoTexto3; // text field with text and size
   private final JPasswordField campoContrasenha; // password field with text

   // TextFieldFrame constructor adds JTextFields to JFrame
   public VentanaCampoTexto(){
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

      // construct passwordfield with default text
      campoContrasenha = new JPasswordField("Texto oculto");
      add(campoContrasenha); // add passwordField to JFrame

      // register event handlers
      ManejadorCampoTexto handler = new ManejadorCampoTexto();
      campoTexto1.addActionListener(handler);
      campoTexto2.addActionListener(handler);
      campoTexto3.addActionListener(handler);
      campoContrasenha.addActionListener(handler);
   } // end TextFieldFrame constructor

   //clase interna privada para el manejo de eventos
  private class ManejadorCampoTexto implements ActionListener {
    // procesa los eventos de campo de texto
    @Override
    public void actionPerformed(ActionEvent evento){
        String cadena = "";
        // el usuario oprimió Intro en el objeto JTextField campoTexto1
        if(evento.getSource() == campoTexto1)
        cadena = String.format("campoTexto1: %s",
        evento.getActionCommand());

        // el usuario oprimió Intro en el objeto JTextField campoTexto2
        else if(evento.getSource() == campoTexto2)
        cadena = String.format("campoTexto2: %s",
        evento.getActionCommand() );

        // el usuario oprimió Intro en el objeto JTextField campoTexto3
        else if(evento.getSource() == campoTexto3)
        cadena = String.format("campoTexto3: %s", 
        evento.getActionCommand());

        // el usuario oprimió Intro en el objeto JTextField campoContrasenia
        else if(evento.getSource() == campoContrasenha)
        cadena = String.format("campoContrasenia: %s", 
        evento.getActionCommand());

        // muestra el contenido del objeto JTextField
        JOptionPane.showMessageDialog(null, cadena); 
    }
   } // fin de la clase interna privada ManejadorCampoTexto
} // end class TextFieldFrame
