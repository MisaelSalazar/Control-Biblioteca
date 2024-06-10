/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views.vistasLibros;

import control.biblioteca.controlador.Mensajes;
import control.biblioteca.views.*;
import control.biblioteca.controlador.TextPrompt;
import control.biblioteca.dao.DAOLibroImpl;
import control.biblioteca.dao.DAOUsuarioImpl;
import control.biblioteca.model.Libro;

/**
 *
 * @author Misae
 */
public class nuevoLibro extends javax.swing.JFrame {

    private final Mensajes msj;
    private DAOLibroImpl libroDAO;

    public nuevoLibro() {
        super("Control Biblioteca");
        msj = new Mensajes();
        libroDAO = new DAOLibroImpl();
        initComponents();

        TextPrompt placeholder = new TextPrompt("Ingrese el titulo del libro", txtTituloLibro);
        placeholder = new TextPrompt("Ingrese el autor", txtAutorLibro);
        placeholder = new TextPrompt("Ingrese el Num. de adquisicion", txtIdentificadorLibro);
        placeholder = new TextPrompt("Ingrese el editorial", txtEditorialLibro);
        placeholder = new TextPrompt("Ingrese el año del libro", txtAnhoLibro);
        placeholder = new TextPrompt("Ingrese el Num. de paginas", txtPaginasLibro);
        placeholder = new TextPrompt("Ingrese el Num. ISBN", txtIsbnLibro);
    }

    private void limpiar() {
        String t = "";
        txtTituloLibro.setText(t);
        txtEditorialLibro.setText(t);
        txtAutorLibro.setText(t);
        txtPaginasLibro.setText(t);
        txtIdentificadorLibro.setText(t);
        txtAnhoLibro.setText(t);
        txtIsbnLibro.setText(t);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        btnAgregarLibro = new javax.swing.JButton();
        txtAutorLibro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdentificadorLibro = new javax.swing.JTextField();
        txtEditorialLibro = new javax.swing.JTextField();
        txtPaginasLibro = new javax.swing.JTextField();
        txtAnhoLibro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIsbnLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Nuevo Libro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Titulo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Editorial");

        txtTituloLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtTituloLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTituloLibro.setToolTipText("");
        txtTituloLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtTituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLibroActionPerformed(evt);
            }
        });

        btnAgregarLibro.setBackground(new java.awt.Color(93, 156, 236));
        btnAgregarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarLibro.setText("Agregar");
        btnAgregarLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        txtAutorLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtAutorLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAutorLibro.setToolTipText("");
        txtAutorLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtAutorLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorLibroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Autor");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Identificador");

        txtIdentificadorLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtIdentificadorLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIdentificadorLibro.setToolTipText("");
        txtIdentificadorLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtIdentificadorLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificadorLibroActionPerformed(evt);
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

        txtPaginasLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtPaginasLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPaginasLibro.setToolTipText("");
        txtPaginasLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtPaginasLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaginasLibroActionPerformed(evt);
            }
        });

        txtAnhoLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtAnhoLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAnhoLibro.setToolTipText("");
        txtAnhoLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtAnhoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnhoLibroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Años");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Paginas");

        txtIsbnLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtIsbnLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtIsbnLibro.setToolTipText("");
        txtIsbnLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtIsbnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnLibroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("ISBN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAnhoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAutorLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIsbnLibro)
                            .addComponent(txtPaginasLibro)
                            .addComponent(txtIdentificadorLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))))
                .addGap(41, 41, 41))
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
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtIdentificadorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtPaginasLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnhoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIsbnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLibroActionPerformed

    }//GEN-LAST:event_txtTituloLibroActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        // Obtenemos los datos de los JTextField
        String titulo = txtTituloLibro.getText().trim();
        String editorial = txtEditorialLibro.getText().trim();
        String paginas = txtPaginasLibro.getText().trim();
        String adquisicion = txtIdentificadorLibro.getText().trim().toUpperCase();
        String anho = txtAnhoLibro.getText().trim();
        String autor = txtAutorLibro.getText().trim();
        String isbn = txtIsbnLibro.getText().trim();

        // Verificamos que los campos no esten vacios, y si lo estan aparece un msj
        if (titulo.isEmpty() || editorial.isEmpty() || paginas.isEmpty() || adquisicion.isEmpty()
                || anho.isEmpty() || autor.isEmpty() || isbn.isEmpty()) {
            msj.MensajeError("Por favor, Rellena todos los campos", "Datos Incompletos");
        } else {
            // Si no entonces, instanciamos un nuevo libro
            Libro libro = new Libro(null, adquisicion, titulo, autor, editorial, anho, paginas, isbn);

            // Mandamos los datos del libro a registrarLibro
            boolean insertado = libroDAO.registrarLibro(libro);

            // Si insertado (true) entonces msj de exito
            if (insertado) {
                msj.MensajeExitoso("El libro ha sido registrado correctamente", "Registro de Libro");
                limpiar();
            } else {
                msj.MensajeError("Error al registrar el libro", "Registro de Libro");
            }
        }
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void txtAutorLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorLibroActionPerformed

    private void txtIdentificadorLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificadorLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorLibroActionPerformed

    private void txtEditorialLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialLibroActionPerformed

    private void txtPaginasLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaginasLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginasLibroActionPerformed

    private void txtAnhoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnhoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnhoLibroActionPerformed

    private void txtIsbnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnLibroActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnhoLibro;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtEditorialLibro;
    private javax.swing.JTextField txtIdentificadorLibro;
    private javax.swing.JTextField txtIsbnLibro;
    private javax.swing.JTextField txtPaginasLibro;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
