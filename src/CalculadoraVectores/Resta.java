
package CalculadoraVectores;

public class Resta extends javax.swing.JFrame {

    Operaciones operar = new Operaciones();
    double Xa;
    double Ya;
    double Za;
    double Xb;
    double Yb;
    double Zb;
    double Xc;
    double Yc;
    double Zc;
    public Resta() {
        
        initComponents();
    }
    public void entrada(){
        Xa= Double.parseDouble(Resta3vXA.getText());
        Ya= Double.parseDouble(Resta3vYA.getText());
        Za= Double.parseDouble(Resta3vZA.getText());
        Xb= Double.parseDouble(Resta3vXB.getText());
        Yb= Double.parseDouble(Resta3vYB.getText());
        Zb= Double.parseDouble(Resta3vZB.getText());
        Xc= Double.parseDouble(Resta3vXC.getText());
        Yc= Double.parseDouble(Resta3vYC.getText());
        Zc= Double.parseDouble(Resta3vZC.getText());   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Resta3vYC = new javax.swing.JTextField();
        Resta3vZC = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        labRestaResultado = new javax.swing.JLabel();
        Resta3vZA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Jlabel6 = new javax.swing.JLabel();
        Resta3vXB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Resta3vYB = new javax.swing.JTextField();
        Resta3vZB = new javax.swing.JTextField();
        btnRestaCalcular = new javax.swing.JButton();
        Jlabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jlabel5 = new javax.swing.JLabel();
        Resta3vXA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Resta3vYA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Resta3vXC = new javax.swing.JTextField();
        volverResta = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel3.setText("resta DE 3 VECTORES EN 3 DIMENSIONES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Yc");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 127, -1, -1));

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel11.setText("zc");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 166, -1, -1));
        getContentPane().add(Resta3vYC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 125, 70, -1));
        getContentPane().add(Resta3vZC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 164, 70, -1));

        jLabel23.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel23.setText("RESULTADO:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 273, -1, -1));

        labRestaResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(labRestaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 262, 277, 30));
        getContentPane().add(Resta3vZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 164, 70, -1));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setText("VECTOR A");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 56, -1, -1));

        Jlabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Jlabel6.setText("Xb");
        getContentPane().add(Jlabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 88, -1, -1));
        getContentPane().add(Resta3vXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 86, 69, -1));

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Yb");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 127, -1, -1));

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel9.setText("zb");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 166, -1, -1));
        getContentPane().add(Resta3vYB, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 125, 70, -1));
        getContentPane().add(Resta3vZB, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 164, 70, -1));

        btnRestaCalcular.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btnRestaCalcular.setText("CALCULAR");
        btnRestaCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestaCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 453, 53));

        Jlabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Jlabel7.setText("Xc");
        getContentPane().add(Jlabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 88, -1, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setText("VECTOR b");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 56, -1, -1));

        Jlabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Jlabel5.setText("Xa");
        getContentPane().add(Jlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 88, -1, -1));
        getContentPane().add(Resta3vXA, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 86, 69, -1));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel6.setText("YA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 127, -1, -1));

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setText("ZA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 166, -1, -1));
        getContentPane().add(Resta3vYA, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 125, 70, -1));

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel12.setText("VECTOR c");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 56, -1, -1));
        getContentPane().add(Resta3vXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 86, 69, -1));

        volverResta.setText("<--");
        volverResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverRestaActionPerformed(evt);
            }
        });
        getContentPane().add(volverResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 280, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-educacion-cientifica-vintage_23-2148483430.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaCalcularActionPerformed
        entrada();

        operar.calcresta(Xa, Ya, Za, Xb, Yb, Zb, Xc, Yc, Zc);
        labRestaResultado.setText(String.valueOf(operar.result));

    }//GEN-LAST:event_btnRestaCalcularActionPerformed

    private void volverRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverRestaActionPerformed
        Inicio a = new Inicio();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverRestaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel5;
    private javax.swing.JLabel Jlabel6;
    private javax.swing.JLabel Jlabel7;
    private javax.swing.JTextField Resta3vXA;
    private javax.swing.JTextField Resta3vXB;
    private javax.swing.JTextField Resta3vXC;
    private javax.swing.JTextField Resta3vYA;
    private javax.swing.JTextField Resta3vYB;
    private javax.swing.JTextField Resta3vYC;
    private javax.swing.JTextField Resta3vZA;
    private javax.swing.JTextField Resta3vZB;
    private javax.swing.JTextField Resta3vZC;
    private javax.swing.JButton btnRestaCalcular;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labRestaResultado;
    private javax.swing.JButton volverResta;
    // End of variables declaration//GEN-END:variables
}
