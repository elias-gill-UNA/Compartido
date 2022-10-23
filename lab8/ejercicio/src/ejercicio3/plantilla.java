package ejercicio3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class plantilla extends JFrame implements ActionListener {
    public JComponent[] listaInputs;
    public String listaTitulos[];
    public JComponent res;

    // clase que crea la parte del contenido que es modificable
    private class contenidoModificable extends JComponent {
        public contenidoModificable(JComponent components[], String titulos[]) throws Exception {
            // nueva lista de maximo 6 elementos y con 1 sola columna
            setLayout(new GridLayout(6, 1));
            if (components.length < titulos.length) {
                throw new Exception(
                        "NO estas proporcionando todos los datos necesarios. Existen titulos vacios o titulos sin input");
            }
            for (int i = 0; i < titulos.length; i++) {
                add(new nuevoInput(components[i], titulos[i]));
            }
        }
    }

    // crea un nuevo input en base al texto y al componente que se le proporciona
    private class nuevoInput extends JComponent {
        public nuevoInput(JComponent comp, String titulo) {
            setLayout(new GridLayout(1, 2));
            add(new JLabel(titulo));
            add(comp);
        }

        public nuevoInput(JComponent comp, JComponent titulo) {
            setLayout(new GridLayout(1, 2));
            add(titulo);
            add(comp);
        }
    }

    public void actionPerformed(ActionEvent e) {
        calcular();
    }

    abstract public void calcular();

    // TextFieldFrame constructor adds JTextFields to JFrame
    public plantilla(JComponent res, JComponent listaInputs[], String listaTitulos[]) throws Exception {

        super("Calculadora");
        setLayout(new BorderLayout());
        this.listaTitulos = listaTitulos;
        this.listaInputs = listaInputs;
        this.res = res;

        // boton de calcular
        JButton button = new JButton("Calcular");
        button.addActionListener(this);

        // contenido modificable
        add("Center", new contenidoModificable(listaInputs, listaTitulos));
        add("South", new nuevoInput(button, res));

        // defualt size and options
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setVisible(true);
        setLocation(450, 200);
    }

    public plantilla() {
    }
}
