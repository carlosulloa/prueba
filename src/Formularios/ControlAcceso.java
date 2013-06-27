package Formularios;

import BaseDatos.ConexionAccess;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControlAcceso extends javax.swing.JFrame {

    /** Creates new form ControlAcceso */

    MenuBD men;

    ConexionAccess acc=null;
    Connection con;
    Statement stm=null;
    ResultSet rs=null;

    String sql=null;

    String nomUsuario="",claUsuario="";
    int perUsuario=0;

    public ControlAcceso() {
        acc = ConexionAccess.getInstance();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jpfClave = new javax.swing.JPasswordField();
        jbtAceptar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Clave");

        jbtAceptar.setText("Aceptar");
        jbtAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAceptarActionPerformed(evt);
            }
        });

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jbtCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfUsuario)
                            .addComponent(jpfClave, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAceptar)
                    .addComponent(jbtCancelar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-408)/2, (screenSize.height-250)/2, 408, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAceptarActionPerformed
        // TODO add your handling code here:
        // TAREA: MAS ADELANTE SE DEBE HACER EL CONTROL DE ACCESO
        // PARA ELLO SE DEBEN RESCATAR LOS USUARIO Y CLAVES DE LA TABLA
        // CORRESPONDIENTE
        nomUsuario=jtfUsuario.getText();
        claUsuario=jpfClave.getText();

        sql="Select *From Usuarios where nombreUsuario='"+nomUsuario+"';";

        rs=acc.ejecutarQuery(sql);
        try
        {
            if (rs.next())
            {
                
                String nomCla = rs.getString(3);
                if (nomCla.equalsIgnoreCase(claUsuario))
                {
                    this.setVisible(false);
                    men=new MenuBD();
                    men.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                                "Clave Incorrecta",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    if(nomCla!=claUsuario)
                    {
                        jpfClave.requestFocus();
                        jpfClave.setText("");
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                                "Usuario No Existe",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                jtfUsuario.setText("");
                jtfUsuario.requestFocus();
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtAceptarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);// error asdjibqgyqweruipwefhio
    }//GEN-LAST:event_jbtCancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlAcceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtAceptar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JPasswordField jpfClave;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

}
