package eje3_gradle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    TrayIcon trayIcon;
    SystemTray tray;

    App() {
        VentanaCampoTexto textFieldFrame = new VentanaCampoTexto();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(450, 200);
        textFieldFrame.setVisible(true);
        textFieldFrame.setLocation(450, 200);

        System.out.println("Creando la instancia");

        // En esta sección se agrega el código que podría lanzar error
        // en tiempo de ejecución
        try {
            System.out.println("Configurando vista y funcionamiento");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // se captura el error
            System.out.println("No se pudo configurar");
        }

        // crear el nuevo systray si es que el SO lo permite
        if (SystemTray.isSupported()) {
            System.out.println("Bandeja de sistema soportada");

            // get the system tray and add an image to it
            tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit()
                    .getImage("C:\\iconos-vista\\_conos\\+ìconos\\Finanzas\\finance_icons\\PNG\\png128\\coins.png");

            // crear el menu del tray
            PopupMenu popup = new PopupMenu();
            // asignar el boton de salir
            MenuItem defaultItem = new MenuItem("Salir");
            // nueva funcion para salir
            ActionListener exitListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Cerrando....");
                    System.exit(0);
                }
            };
            defaultItem.addActionListener(exitListener);
            popup.add(defaultItem);

            // asignar el boton de abrir
            defaultItem = new MenuItem("Abrir");
            // funcion de abrir ventana
            defaultItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(true);
                    setExtendedState(JFrame.NORMAL);
                }
            });
            popup.add(defaultItem);

            // crear el icono del tray con autoSize
            trayIcon = new TrayIcon(image, "Servicio", popup);
            trayIcon.setImageAutoSize(true);

        } else {
            System.out.println("Bandeja de sistema no soportada");
        }

        // inicio del método para gestionar la bandeja de sistema
        addWindowStateListener(new WindowStateListener() {
            public void windowStateChanged(WindowEvent e) {
                if (e.getNewState() == ICONIFIED) {
                    try {
                        tray.add(trayIcon);
                        setVisible(false);
                        System.out.println("Agregando a bandeja de sistema");
                    } catch (AWTException ex) {
                        System.out.println("No se pudo agregar a la bandeja de sistema");
                    }
                }

                if (e.getNewState() == 7) {
                    try {
                        tray.add(trayIcon);
                        setVisible(false);
                        System.out.println("Agregado a la bandeja de sistema");
                    } catch (AWTException ex) {
                        System.out.println("No se puede agregar");
                    }
                }

                if (e.getNewState() == MAXIMIZED_BOTH) {
                    tray.remove(trayIcon);
                    setVisible(true);
                    System.out.println("Icono removido de la bandeja de sistema");
                }

                if (e.getNewState() == NORMAL) {
                    tray.remove(trayIcon);
                    setVisible(true);
                    System.out.println("Icono removido");
                }
            }
        });

        // fin del método para bandeja de sistema
        setIconImage(Toolkit.getDefaultToolkit().getImage("coins.png"));
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new App();
    }
}
