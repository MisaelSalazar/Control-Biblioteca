/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views.vistasLibros;

import control.biblioteca.controlador.Mensajes;
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
    private Mensajes msj;

    public editarLibro() {
        super("Control Biblioteca");
        initComponents();
        msj = new Mensajes();
        libroDAO = new DAOLibroImpl();
        TextPrompt placeholder = new TextPrompt("Ingrese el titulo del libro", txtTituloLibro);
        placeholder = new TextPrompt("Ingrese el autor", txtAutorLibro);
        placeholder = new TextPrompt("Ingrese el Num. de adquisicion", txtIdentificadorLibro);
        placeholder = new TextPrompt("Ingrese el editorial", txtEditorialLibro);
        placeholder = new TextPrompt("Ingrese el año del libro", txtAnhoLibro1);
        placeholder = new TextPrompt("Ingrese el Num. de paginas", txtPaginaLibro1);
        placeholder = new TextPrompt("Ingrese el Num. ISBN", txtIsbnLibro);
    }

    // Traer la instancia del libro seleccionado con sus datos
    public void setLibro(Libro libro) {
        this.libro = libro;
        mostrarDatos();
    }

    private void mostrarDatos() {
        txtTituloLibro.setText(libro.getTitulo());
        txtAutorLibro.setText(libro.getAutor());
        txtEditorialLibro.setText(libro.getEditorial());
        txtIdentificadorLibro.setText(libro.getIdentificador());
        txtAnhoLibro1.setText(libro.getAnho());
        txtPaginaLibro1.setText(libro.getPaginas());
        txtIsbnLibro.setText(libro.getIsbn());
    }

    private void limpiar() {
        String t = "";
        txtTituloLibro.setText(t);
        txtEditorialLibro.setText(t);
        txtAutorLibro.setText(t);
        txtPaginaLibro1.setText(t);
        txtIdentificadorLibro.setText(t);
        txtAnhoLibro1.setText(t);
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
        btnActualizarLibro = new javax.swing.JButton();
        txtAutorLibro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdentificadorLibro = new javax.swing.JTextField();
        txtEditorialLibro = new javax.swing.JTextField();
        txtPaginaLibro1 = new javax.swing.JTextField();
        txtAnhoLibro1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIsbnLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Editar Libro");

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

        txtPaginaLibro1.setBackground(new java.awt.Color(204, 204, 204));
        txtPaginaLibro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPaginaLibro1.setToolTipText("");
        txtPaginaLibro1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtPaginaLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaginaLibro1ActionPerformed(evt);
            }
        });

        txtAnhoLibro1.setBackground(new java.awt.Color(204, 204, 204));
        txtAnhoLibro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAnhoLibro1.setToolTipText("");
        txtAnhoLibro1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtAnhoLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnhoLibro1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Año");

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
                        .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(txtAnhoLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txtPaginaLibro1)
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
                    .addComponent(txtPaginaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnhoLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIsbnLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLibroActionPerformed

    }//GEN-LAST:event_txtTituloLibroActionPerformed

    private void btnActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLibroActionPerformed
        if (txtIdentificadorLibro.getText().trim().equals("") || txtTituloLibro.getText().trim().equals("")
                || txtAutorLibro.getText().trim().equals("") || txtEditorialLibro.getText().trim().equals("") || txtAnhoLibro1.getText().trim().equals("")
                || txtPaginaLibro1.getText().trim().equals("") || txtIsbnLibro.getText().trim().equals("")) {
            msj.MensajeError("Por favor, rellena todos los campos", "Actualizar Libro");
        } else {
            Libro libroAct = new Libro(
                    libro.getId(),
                    txtIdentificadorLibro.getText().trim().toUpperCase(),
                    txtTituloLibro.getText().trim(),
                    txtAutorLibro.getText().trim(),
                    txtEditorialLibro.getText().trim(),
                    txtAnhoLibro1.getText().trim(),
                    txtPaginaLibro1.getText().trim(),
                    txtIsbnLibro.getText().trim());

            boolean insertado = libroDAO.actualizarLibro(libroAct);
            if (insertado) {
                msj.MensajeExitoso("El libro fue actualizado con éxito", "Actualizar Libro");
                limpiar();
            } else {
                msj.MensajeError("No se actualizaron los datos del libro", "Actualizar Libro");
            }
        }
    }//GEN-LAST:event_btnActualizarLibroActionPerformed

    private void txtAutorLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorLibroActionPerformed

    private void txtIdentificadorLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificadorLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorLibroActionPerformed

    private void txtEditorialLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialLibroActionPerformed

    private void txtPaginaLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaginaLibro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginaLibro1ActionPerformed

    private void txtAnhoLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnhoLibro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnhoLibro1ActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnhoLibro1;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtEditorialLibro;
    private javax.swing.JTextField txtIdentificadorLibro;
    private javax.swing.JTextField txtIsbnLibro;
    private javax.swing.JTextField txtPaginaLibro1;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
