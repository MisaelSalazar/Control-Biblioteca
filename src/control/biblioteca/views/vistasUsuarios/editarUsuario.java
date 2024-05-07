/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views.vistasUsuarios;

import control.biblioteca.controlador.Mensajes;
import control.biblioteca.views.*;
import control.biblioteca.controlador.TextPrompt;
import control.biblioteca.dao.DAOUsuarioImpl;
import control.biblioteca.model.Usuario;

/**
 *
 * @author Misae
 */
public class editarUsuario extends javax.swing.JFrame {

    private Usuario usuario;
    private DAOUsuarioImpl usuarioDAO;
    private Mensajes msj;

    public editarUsuario() {
        super("Control Biblioteca");
        initComponents();
        msj = new Mensajes();
        usuarioDAO = new DAOUsuarioImpl();
        TextPrompt placeholder = new TextPrompt("Ingrese el nombre", txtNombreUsuario);
        placeholder = new TextPrompt("Ingrese la contraseña", txtContrasenhaUsuario);
        placeholder = new TextPrompt("Repita la contraeña", txtRepetirContrasenha);
    }

    // Traer la instancia del usuario seleccionado con sus datos
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        mostrarDatos();
    }

    private void mostrarDatos() {
        txtNombreUsuario.setText(usuario.getNombreUsuario());
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
        btnActualizarUsuario = new javax.swing.JButton();
        txtContrasenhaUsuario = new javax.swing.JTextField();
        txtRepetirContrasenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Editar Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nuevo nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nueva contraseña");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Repita la contraseña");

        txtNombreUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreUsuario.setToolTipText("");
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        btnActualizarUsuario.setBackground(new java.awt.Color(255, 206, 84));
        btnActualizarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarUsuario.setText("Actualizar");
        btnActualizarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
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
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(txtRepetirContrasenha)
                            .addComponent(txtContrasenhaUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel5)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContrasenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtRepetirContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed

    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        if (txtNombreUsuario.getText().trim().equals("") || txtContrasenhaUsuario.getText().trim().equals("")
                || txtRepetirContrasenha.getText().trim().equals("")) {
            msj.MensajeError("Por favor, rellena todos los campos", "Actualizar Usuario");
        } else {
            if (txtContrasenhaUsuario.getText().trim().equals(txtRepetirContrasenha.getText().trim())) {
                Usuario usuarioAct = new Usuario(
                        usuario.getId(),
                        txtNombreUsuario.getText().trim(),
                        txtContrasenhaUsuario.getText().trim()
                );
                usuarioDAO.actualizarUsuario(usuarioAct);
            } else {
                msj.MensajeError("Las contraseñas no coinciden", "Actualizar Usuario");
            }
        }
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContrasenhaUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtRepetirContrasenha;
    // End of variables declaration//GEN-END:variables
}
