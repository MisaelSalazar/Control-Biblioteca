/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views.vistasUsuarios;

import control.biblioteca.controlador.Mensajes;
import control.biblioteca.views.*;
import control.biblioteca.controlador.TextPrompt;
import control.biblioteca.dao.DAOUsuarioImpl;

/**
 *
 * @author Misae
 * @author Patino
 */
public class nuevoUsuario extends javax.swing.JFrame {

    private DAOUsuarioImpl usuarioDAO;
    private Mensajes msj = new Mensajes();

    public nuevoUsuario() {
        super("Control Biblioteca");
        this.usuarioDAO = new DAOUsuarioImpl();
        initComponents();
        TextPrompt placeholder = new TextPrompt("Ingrese el nombre", txtNombreUsuario);
        placeholder = new TextPrompt("Ingrese la contraseña", txtContrasenhaUsuario);
        placeholder = new TextPrompt("Repita la contraeña", txtRepetirContrasenha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        txtContrasenhaUsuario = new javax.swing.JTextField();
        txtRepetirContrasenha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Nuevo Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Rol");

        txtNombreUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreUsuario.setToolTipText("");
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setBackground(new java.awt.Color(93, 156, 236));
        btnAgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarUsuario.setText("Agregar");
        btnAgregarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        txtContrasenhaUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtContrasenhaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContrasenhaUsuario.setToolTipText("");
        txtContrasenhaUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtContrasenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenhaUsuarioActionPerformed(evt);
            }
        });

        txtRepetirContrasenha.setBackground(new java.awt.Color(204, 204, 204));
        txtRepetirContrasenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRepetirContrasenha.setToolTipText("");
        txtRepetirContrasenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtRepetirContrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepetirContrasenhaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Repita la contraseña");

        cbxRol.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asistente", "Administrador" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(txtRepetirContrasenha)
                            .addComponent(txtContrasenhaUsuario)
                            .addComponent(cbxRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContrasenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepetirContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed

    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        try {
            // Obtenemos las credenciales del usuario
            String usuario = txtNombreUsuario.getText().trim();
            String contra1 = txtContrasenhaUsuario.getText().trim();
            String contra2 = txtRepetirContrasenha.getText().trim();
            String rol = cbxRol.getSelectedItem().toString();
            System.out.println("ROL SELECCIONADO: " + rol);
            // Comprobamos que los campos no esten vacios
            if ("".equals(usuario) || "".equals(contra1) || "".equals(contra2)) {
                msj.MensajeError("Rellena todos los campos", "Registar Usuario");
            } else {
                // Comparar si las cotrasenas ingresadas son iguales
                if (contra1.equals(contra2)) {
                    // Llamar al metodo registrarUsuario
                    boolean insertado = usuarioDAO.registrarUsuario(usuario, contra1, rol);
                    if (insertado) {
                        msj.MensajeExitoso("Cuenta creada con éxito", "Registar Usuario");
                    } else {
                        msj.MensajeError("Error al registrar al usuario", "Registar Usuario");
                    }
                } else {
                    msj.MensajeError("Las contraseñas no coinciden", "Registar Usuario");
                }
            }
        } catch (Exception e) {
            msj.MensajeError("Error de creación de cuenta: " + e, "Registar Usuario");
        }
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void txtContrasenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenhaUsuarioActionPerformed

    private void txtRepetirContrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepetirContrasenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepetirContrasenhaActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContrasenhaUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtRepetirContrasenha;
    // End of variables declaration//GEN-END:variables
}
