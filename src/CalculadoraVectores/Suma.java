
package CalculadoraVectores;


public class Suma extends javax.swing.JFrame {

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
    public Suma() {
        initComponents();
    }
 
    public void entrada(){
        Xa= Double.parseDouble(Suma3vXA.getText());
        Ya= Double.parseDouble(Suma3vYA.getText());
        Za= Double.parseDouble(Suma3vZA.getText());
        Xb= Double.parseDouble(Suma3vXB.getText());
        Yb= Double.parseDouble(Suma3vYB.getText());
        Zb= Double.parseDouble(Suma3vZB.getText());
        Xc= Double.parseDouble(Suma3vXC.getText());
        Yc= Double.parseDouble(Suma3vYC.getText());
        Zc= Double.parseDouble(Suma3vZC.getText());   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jlabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Suma3vXA = new javax.swing.JTextField();
        Suma3vYA = new javax.swing.JTextField();
        Suma3vZA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Jlabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Suma3vXB = new javax.swing.JTextField();
        Suma3vYB = new javax.swing.JTextField();
        Suma3vZB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Jlabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Suma3vXC = new javax.swing.JTextField();
        Suma3vYC = new javax.swing.JTextField();
        Suma3vZC = new javax.swing.JTextField();
        btnSumaCalcular = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        labSumaResultado = new javax.swing.JLabel();
        volverSuma = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel3.setText("suma DE 3 VECTORES EN 3 DIMENSIONES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel4.setText("VECTOR A");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        Jlabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Jlabel5.setText("Xa");
        getContentPane().add(Jlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel6.setText("YA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel7.setText("ZA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(Suma3vXA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 69, -1));
        getContentPane().add(Suma3vYA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, -1));
        getContentPane().add(Suma3vZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setText("VECTOR b");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        Jlabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Jlabel6.setText("Xb");
        getContentPane().add(Jlabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Yb");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel9.setText("zb");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));
        getContentPane().add(Suma3vXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 69, -1));
        getContentPane().add(Suma3vYB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 70, -1));
        getContentPane().add(Suma3vZB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 70, -1));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel5.setText("VECTOR c");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        Jlabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Jlabel7.setText("Xc");
        getContentPane().add(Jlabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Yc");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel11.setText("zc");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));
        getContentPane().add(Suma3vXC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 69, -1));
        getContentPane().add(Suma3vYC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 70, -1));
        getContentPane().add(Suma3vZC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 70, -1));

        btnSumaCalcular.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        btnSumaCalcular.setText("CALCULAR");
        btnSumaCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnSumaCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 453, 53));

        jLabel23.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel23.setText("RESULTADO:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        labSumaResultado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(labSumaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 277, 30));

        volverSuma.setText("<--");
        volverSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverSumaActionPerformed(evt);
            }
        });
        getContentPane().add(volverSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-educacion-cientifica-vintage_23-2148483430.jpg"))); // NOI18N
        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaCalcularActionPerformed
        entrada();

        operar.calcsuma(Xa, Ya, Za, Xb, Yb, Zb, Xc, Yc, Zc);

        labSumaResultado.setText(String.valueOf(operar.result));
    }//GEN-LAST:event_btnSumaCalcularActionPerformed

    private void volverSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverSumaActionPerformed
        Inicio a = new Inicio();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverSumaActionPerformed

     
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
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel5;
    private javax.swing.JLabel Jlabel6;
    private javax.swing.JLabel Jlabel7;
    private javax.swing.JTextField Suma3vXA;
    private javax.swing.JTextField Suma3vXB;
    private javax.swing.JTextField Suma3vXC;
    private javax.swing.JTextField Suma3vYA;
    private javax.swing.JTextField Suma3vYB;
    private javax.swing.JTextField Suma3vYC;
    private javax.swing.JTextField Suma3vZA;
    private javax.swing.JTextField Suma3vZB;
    private javax.swing.JTextField Suma3vZC;
    private javax.swing.JButton btnSumaCalcular;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labSumaResultado;
    private javax.swing.JButton volverSuma;
    // End of variables declaration//GEN-END:variables
}
