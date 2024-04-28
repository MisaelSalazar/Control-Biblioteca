/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views;

import control.biblioteca.controlador.Mensajes;
import control.biblioteca.controlador.TextPrompt;
import control.biblioteca.dao.DAOUsuarioImpl;
import control.biblioteca.model.Usuario;
import control.biblioteca.controlador.TextPrompt;

/**
 *
 * @author Misae
 */
public class login extends javax.swing.JFrame {

    private DAOUsuarioImpl usuarioDAO;
    private Mensajes msj = new Mensajes();
    public login() {
        super("Control Biblioteca");
        usuarioDAO = new DAOUsuarioImpl();
        initComponents();
        TextPrompt placeholder = new TextPrompt("Ingresa tu usuario", txtUserName);
        placeholder = new TextPrompt("Ingresa tu contraseña", txtUserPassword);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JTextField();
        btnCambiarContrasenha = new javax.swing.JButton();
        btnNuevaCuenta = new javax.swing.JButton();
        btnAcceder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("¡Bienvenido de Nuevo!");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        txtUserName.setBackground(new java.awt.Color(204, 204, 204));
        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUserName.setToolTipText("");
        txtUserName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtUserPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtUserPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUserPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserPasswordActionPerformed(evt);
            }
        });

        btnCambiarContrasenha.setBackground(new java.awt.Color(255, 206, 84));
        btnCambiarContrasenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCambiarContrasenha.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiarContrasenha.setText("Cambiar contraseña");
        btnCambiarContrasenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        btnCambiarContrasenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarContrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContrasenhaActionPerformed(evt);
            }
        });

        btnNuevaCuenta.setBackground(new java.awt.Color(93, 156, 236));
        btnNuevaCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevaCuenta.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaCuenta.setText("Crear cuenta");
        btnNuevaCuenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        btnNuevaCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuentaActionPerformed(evt);
            }
        });

        btnAcceder.setBackground(new java.awt.Color(160, 212, 104));
        btnAcceder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(0, 0, 0));
        btnAcceder.setText("Acceder");
        btnAcceder.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 206, 84));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control/biblioteca/img/librero.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(169, 169, 169)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserName)
                                    .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCambiarContrasenha)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnNuevaCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnCambiarContrasenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
        txtUserName.setText("Nombre de Usuario");
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserPasswordActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        if ("".equals(txtUserName.getText()) || "".equals(txtUserPassword.getText())) {
            msj.MensajeError("Rellena todos los campos", "Iniciar Sesión");
        } else {
            // Instanciar un nuevo usuario
            Usuario usuario = new Usuario(txtUserName.getText(), txtUserPassword.getText());
            // Almacenar el valor V/F que retorna al validar las credenciales del usuario
            boolean inicio = usuarioDAO.validarCredenciales(usuario);
            // Si las credenciales son correctas, entonces accede
            if (inicio == true) {
                System.out.println("*Accede al Panel Principal*");
            } else {
                System.out.println("*Mensaje de Error*");
            }
        }
        menuPrincipal obj = new menuPrincipal(); obj.setVisible(true); obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuentaActionPerformed
        // TODO add your handling code here:
        //Objeto ventana nueva cuenta
        nuevaCuenta objNuevaCuenta = new nuevaCuenta();
        //Centrar la ventana en la pantalla
        objNuevaCuenta.setLocationRelativeTo(null);
        //Hacer Visible la ventana
        objNuevaCuenta.setVisible(true);
    }//GEN-LAST:event_btnNuevaCuentaActionPerformed

    private void btnCambiarContrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContrasenhaActionPerformed
        // TODO add your handling code here:
        //Crear objeto ventana cambiar contraseña
        cambiarContrasenha objCambiarContrasenha = new cambiarContrasenha();
        //Centrar la ventana en la pantalla
        objCambiarContrasenha.setLocationRelativeTo(null);
        //Hcer visible la ventana
        objCambiarContrasenha.setVisible(true);
    }//GEN-LAST:event_btnCambiarContrasenhaActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnCambiarContrasenha;
    private javax.swing.JButton btnNuevaCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassword;
    // End of variables declaration//GEN-END:variables
}
