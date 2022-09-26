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
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class TrayApp extends JFrame{
    TrayIcon trayIcon;
    SystemTray tray;
    TrayApp(){
        super("Barra de servicios - App");
        System.out.println("Creando la instancia");
        try{
            //En esta sección se agrega el código que podría lanzar error
            //en tiempo de ejecución
            System.out.println("Configurando vista y funcionamiento");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            //se captura el error
            System.out.println("No se pudo configurar");
        }
        if(SystemTray.isSupported()){
            System.out.println("Bandeja de sistema soportada");
            tray=SystemTray.getSystemTray();

            Image image=Toolkit.getDefaultToolkit().getImage("C:\\iconos-vista\\_conos\\+ìconos\\Finanzas\\finance_icons\\PNG\\png128\\coins.png");
            ActionListener exitListener=new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Cerrando....");
                    System.exit(0);
                }
            };
            PopupMenu popup=new PopupMenu();
            MenuItem defaultItem=new MenuItem("Salir");
            defaultItem.addActionListener(exitListener);
            popup.add(defaultItem);
            defaultItem=new MenuItem("Abrir");
            defaultItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(true);
                    setExtendedState(JFrame.NORMAL);
                }
            });
            popup.add(defaultItem);
            trayIcon=new TrayIcon(image, "Servicio", popup);
            trayIcon.setImageAutoSize(true);
        }else{
            System.out.println("Bandeja de sistema no soportada");
        }
        //inicio del método para gestionar la bandeja de sistema
        addWindowStateListener(new WindowStateListener() {
            public void windowStateChanged(WindowEvent e) {
                if(e.getNewState()==ICONIFIED){
                    try {
                        tray.add(trayIcon);
                        setVisible(false);
                        System.out.println("Agregando a bandeja de sistema");
                    } catch (AWTException ex) {
                        System.out.println("No se pudo agregar a la bandeja de sistema");
                    }
                }
        if(e.getNewState()==7){
            try{
                tray.add(trayIcon);
                setVisible(false);
                System.out.println("Agregado a la bandeja de sistema");
            }catch(AWTException ex){
                System.out.println("No se puede agregar");
            }
        }
        if(e.getNewState()==MAXIMIZED_BOTH){
            tray.remove(trayIcon);
            setVisible(true);
            System.out.println("Icono removido de la bandeja de sistema");
        }
        if(e.getNewState()==NORMAL){
            tray.remove(trayIcon);
            setVisible(true);
            System.out.println("Icono removido");
        }
        }
        });//fin del método para bandeja de sistema
        setIconImage(Toolkit.getDefaultToolkit().getImage("coins.png"));

        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new TrayApp();
    }
}
