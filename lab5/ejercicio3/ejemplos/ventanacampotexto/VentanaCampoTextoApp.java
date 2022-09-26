/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ventanacampotexto;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rodrigo
 */
public class VentanaCampoTextoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      VentanaCampoTexto textFieldFrame = new VentanaCampoTexto(); 
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldFrame.setSize(450, 200); 
      textFieldFrame.setVisible(true); 
      textFieldFrame.setLocation(450,200);

    }
    
}
