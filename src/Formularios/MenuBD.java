/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author 18341155-1
 */
public class MenuBD extends javax.swing.JFrame {

    /**
     * Creates new form MenuBD
     */
    Mantenedor man;
    private int opcion;
    
    public MenuBD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiIngresar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jmiMantener = new javax.swing.JMenuItem();
        jmiConsultar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmiFinalizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Mantenedor");

        jmiIngresar.setText("Ingresar");
        jmiIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIngresarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiIngresar);

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEliminar);

        jmiMantener.setText("Mantener");
        jmiMantener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMantenerActionPerformed(evt);
            }
        });
        jMenu1.add(jmiMantener);

        jmiConsultar.setText("Consultar");
        jmiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiConsultar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proceso");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");

        jmiFinalizar.setText("Finalizar");
        jmiFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFinalizarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiFinalizar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIngresarActionPerformed
        // TODO add your handling code here:
                    this.setVisible(false);
                    man=new Mantenedor(1);
                    man.setVisible(true);
    }//GEN-LAST:event_jmiIngresarActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        // TODO add your handling code here:
                    this.setVisible(false);
                    man=new Mantenedor(2);
                    man.setVisible(true);
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void jmiMantenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMantenerActionPerformed
        // TODO add your handling code here:
                  this.setVisible(false);
                   man=new Mantenedor(3);
                    man.setVisible(true);
    }//GEN-LAST:event_jmiMantenerActionPerformed

    private void jmiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarActionPerformed
        // TODO add your handling code here:
                    this.setVisible(false);
                    man=new Mantenedor(4);
                    man.setVisible(true);
    }//GEN-LAST:event_jmiConsultarActionPerformed

    private void jmiFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFinalizarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmiFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiConsultar;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiFinalizar;
    private javax.swing.JMenuItem jmiIngresar;
    private javax.swing.JMenuItem jmiMantener;
    // End of variables declaration//GEN-END:variables
}