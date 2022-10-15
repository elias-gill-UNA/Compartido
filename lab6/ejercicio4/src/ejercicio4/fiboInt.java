package ejercicio4;

import javax.swing.JOptionPane;

/*
   @author Abel Díaz
   El número mas grande es n=47 ya que con n=48 se supera el rango máximo de int
*/
public class fiboInt extends javax.swing.JFrame {

    public fiboInt() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cargaNum = new javax.swing.JTextPane();
        btn_calc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel2.setText("Serie de Fibonacci");

        jScrollPane1.setViewportView(cargaNum);

        btn_calc.setText("Calcular");
        btn_calc.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btn_calcActionPerformed(evt);
                    }
                });

        jLabel1.setText("Resultado:");

        jLabel3.setText("Valor");

        jLabel4.setText(".............................................................");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .LEADING)
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(119, 119, 119)
                                                                        .addComponent(jLabel2))
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(34, 34, 34)
                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                                javax
                                                                                                        .swing
                                                                                                        .GroupLayout
                                                                                                        .Alignment
                                                                                                        .TRAILING)
                                                                                        .addComponent(
                                                                                                btn_calc)
                                                                                        .addGroup(
                                                                                                layout.createParallelGroup(
                                                                                                                javax
                                                                                                                        .swing
                                                                                                                        .GroupLayout
                                                                                                                        .Alignment
                                                                                                                        .LEADING)
                                                                                                        .addGroup(
                                                                                                                layout.createSequentialGroup()
                                                                                                                        .addComponent(
                                                                                                                                jLabel1)
                                                                                                                        .addPreferredGap(
                                                                                                                                javax
                                                                                                                                        .swing
                                                                                                                                        .LayoutStyle
                                                                                                                                        .ComponentPlacement
                                                                                                                                        .RELATED)
                                                                                                                        .addComponent(
                                                                                                                                jLabel4))
                                                                                                        .addComponent(
                                                                                                                jScrollPane1,
                                                                                                                javax
                                                                                                                        .swing
                                                                                                                        .GroupLayout
                                                                                                                        .PREFERRED_SIZE,
                                                                                                                320,
                                                                                                                javax
                                                                                                                        .swing
                                                                                                                        .GroupLayout
                                                                                                                        .PREFERRED_SIZE)
                                                                                                        .addComponent(
                                                                                                                jLabel3)))))
                                        .addContainerGap(46, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(
                                                jScrollPane1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btn_calc)
                                        .addGap(18, 18, 18)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel4))
                                        .addContainerGap(19, Short.MAX_VALUE)));

        pack();
    } // </editor-fold>//GEN-END:initComponents

    private void btn_calcActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btn_calcActionPerformed
        int n;
        // guarda el valor cargado en la caja de texto
        try {
            n = Integer.parseInt(cargaNum.getText());
            jLabel4.setText(Integer.toString(fibonacci(n)));
        } catch (NumberFormatException e) {
            // muestra el mensaje de error
            JOptionPane.showMessageDialog(
                    this, "Ingrese un valor valido", "Error", JOptionPane.ERROR_MESSAGE);
            // reset valor
            cargaNum.setText(null);
        }
    } // GEN-LAST:event_btn_calcActionPerformed
    // halla el enésimo número de fibonacci de manera iterativa
    private int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // n1: n-1, n2: n-2
        int n1 = 0, n2 = 1, aux;
        for (int i = 1; i < n; i++) {
            aux = n1 + n2;
            n1 = n2;
            n2 = aux;
        }
        return n2;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fiboInt.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fiboInt.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fiboInt.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fiboInt.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        new fiboInt().setVisible(true);
                    }
                });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calc;
    private javax.swing.JTextPane cargaNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
