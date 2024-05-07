/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views.vistasLibros;

import control.biblioteca.controlador.TextPrompt;
import control.biblioteca.dao.DAOLibroImpl;
import control.biblioteca.model.Libro;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Misae
 */
public class editarLibro extends javax.swing.JFrame {

    private Libro libro;
    private DAOLibroImpl libroDAO;

    public editarLibro() {
        super("Control Biblioteca");
        initComponents();
        libroDAO = new DAOLibroImpl();
        TextPrompt placeholder = new TextPrompt("Ingrese el titulo del libro", txtTituloLibro);
        placeholder = new TextPrompt("Ingrese la editorial", txtEditorialLibro);
        placeholder = new TextPrompt("Ingrese el Num. de adquisicion", txtAdquisicionLibro);
        placeholder = new TextPrompt("Ingrese el Num. de paginas", txtPaginasLibro);
    }

    // Traer la instancia del libro seleccionado con sus datos
    public void setLibro(Libro libro) {
        this.libro = libro;
        mostrarDatos();
    }

    private void mostrarDatos() {
        txtTituloLibro.setText(libro.getTitulo());
        txtEditorialLibro.setText(libro.getEditorial());
        txtPaginasLibro.setText(libro.getPaginas());
        txtAdquisicionLibro.setText(libro.getIdentificador());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        btnActualizarLibro = new javax.swing.JButton();
        txtEditorialLibro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAdquisicionLibro = new javax.swing.JTextField();
        txtPaginasLibro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Editar Libro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nuevo titulo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nuevo num. paginas");

        txtTituloLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtTituloLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTituloLibro.setToolTipText("");
        txtTituloLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLibroActionPerformed(evt);
            }
        });

        btnActualizarLibro.setBackground(new java.awt.Color(255, 206, 84));
        btnActualizarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarLibro.setText("Actualizar");
        btnActualizarLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLibroActionPerformed(evt);
            }
        });

        txtEditorialLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtEditorialLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEditorialLibro.setToolTipText("");
        txtEditorialLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtEditorialLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialLibroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Nueva editorial");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Adquisición");

        txtAdquisicionLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtAdquisicionLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAdquisicionLibro.setToolTipText("");
        txtAdquisicionLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtAdquisicionLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdquisicionLibroActionPerformed(evt);
            }
        });

        txtPaginasLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtPaginasLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPaginasLibro.setToolTipText("");
        txtPaginasLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtPaginasLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaginasLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaginasLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEditorialLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdquisicionLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtAdquisicionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaginasLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLibroActionPerformed

    }//GEN-LAST:event_txtTituloLibroActionPerformed

    private void btnActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLibroActionPerformed
        String autor = libro.getAutor();
        String anho = libro.getAnho();
        String isbn = libro.getIsbn();

        Libro libroAct = new Libro(
                libro.getId(),
                txtAdquisicionLibro.getText().trim(),
                txtTituloLibro.getText().trim(),
                autor,
                txtEditorialLibro.getText().trim(),
                anho,
                txtPaginasLibro.getText().trim(),
                isbn
        );
        System.out.println("xd " + isbn);
        libroDAO.actualizarLibro(libroAct);

    }//GEN-LAST:event_btnActualizarLibroActionPerformed

    private void txtEditorialLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialLibroActionPerformed

    private void txtAdquisicionLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdquisicionLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdquisicionLibroActionPerformed

    private void txtPaginasLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaginasLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginasLibroActionPerformed

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
            java.util.logging.Logger.getLogger(editarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarLibro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdquisicionLibro;
    private javax.swing.JTextField txtEditorialLibro;
    private javax.swing.JTextField txtPaginasLibro;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
