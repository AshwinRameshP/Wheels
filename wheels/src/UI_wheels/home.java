/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_wheels;

import java.sql.Connection;

/**
 *
 * @author PlayGOD
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    Connection conn=null;
    public home() {
        initComponents();
        conn=DBConnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        billing = new javax.swing.JButton();
        btspares = new javax.swing.JButton();
        btjc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bthistoryjc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        homedesktop = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1900, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billing.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        billing.setText("billing");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        jPanel1.add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 180, 60));

        btspares.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        btspares.setText("Spares");
        btspares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsparesActionPerformed(evt);
            }
        });
        jPanel1.add(btspares, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, 60));

        btjc.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        btjc.setText("Jobcard");
        btjc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjcActionPerformed(evt);
            }
        });
        jPanel1.add(btjc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton1.setText("Add Spares");
        jButton1.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton1.setPreferredSize(new java.awt.Dimension(101, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 180, 60));

        bthistoryjc.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        bthistoryjc.setText("history");
        bthistoryjc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthistoryjcActionPerformed(evt);
            }
        });
        jPanel1.add(bthistoryjc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 180, 60));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wheels ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1644, 110));

        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 630));

        homedesktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout homedesktopLayout = new javax.swing.GroupLayout(homedesktop);
        homedesktop.setLayout(homedesktopLayout);
        homedesktopLayout.setHorizontalGroup(
            homedesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1410, Short.MAX_VALUE)
        );
        homedesktopLayout.setVerticalGroup(
            homedesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        jPanel1.add(homedesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 1410, 760));

        jMenu3.setText("File");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu3.add(exit);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsparesActionPerformed
        // TODO add your handling code here:
      homedesktop.removeAll();
      Spares s=new Spares();
      homedesktop.add(s).setVisible(true);
    }//GEN-LAST:event_btsparesActionPerformed

    private void btjcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjcActionPerformed
        // TODO add your handling code here:
        homedesktop.removeAll();
        Jobcard jc=new Jobcard();
        homedesktop.add(jc).setVisible(true);
    }//GEN-LAST:event_btjcActionPerformed

    private void bthistoryjcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthistoryjcActionPerformed
        // TODO add your handling code here:
        homedesktop.removeAll();
        History h=new History();
        homedesktop.add(h).setVisible(true);
    }//GEN-LAST:event_bthistoryjcActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        // TODO add your handling code here:
        homedesktop.removeAll();
        Bill b=new Bill();
        homedesktop.add(b).setVisible(true);
    }//GEN-LAST:event_billingActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        homedesktop.removeAll();
        addsp as=new addsp();
        homedesktop.add(as).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billing;
    private javax.swing.JButton bthistoryjc;
    private javax.swing.JButton btjc;
    private javax.swing.JButton btspares;
    private javax.swing.JMenuItem exit;
    private javax.swing.JDesktopPane homedesktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
