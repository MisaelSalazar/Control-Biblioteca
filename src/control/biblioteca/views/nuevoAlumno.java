/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views;

import control.biblioteca.controlador.Mensajes;
import control.biblioteca.controlador.TextPrompt;
import control.biblioteca.dao.DAOAlumnoImpl;
import control.biblioteca.dao.DAOUsuarioImpl;
import control.biblioteca.model.Alumno;

/**
 *
 * @author Patinho
 */
public class nuevoAlumno extends javax.swing.JFrame {

    private final Mensajes msj;
    private DAOAlumnoImpl alumnoDAO;

    /**
     * Creates new form nuevoAlumno
     */
    public nuevoAlumno() {
        super("Control Biblioteca");
        msj = new Mensajes();
        alumnoDAO = new DAOAlumnoImpl();
        initComponents();

        TextPrompt placeholder = new TextPrompt("Ingrese el nombre", txtNombreAlumno);
        placeholder = new TextPrompt("Ingrese los apellidos", txtApellidosAlumno);
        placeholder = new TextPrompt("Ingrese el Num. Control", txtNumControl);
    }

    private void limpiar() {
        txtNombreAlumno.setText("");
        txtApellidosAlumno.setText("");
        txtNumControl.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        btnAgregarAlumno = new javax.swing.JButton();
        jcbSemestre = new javax.swing.JComboBox<>();
        txtApellidosAlumno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbCarrera = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNumControl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Nuevo Alumno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre(s)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Carrera");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Semestre");

        txtNombreAlumno.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreAlumno.setToolTipText("");
        txtNombreAlumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));

        btnAgregarAlumno.setBackground(new java.awt.Color(93, 156, 236));
        btnAgregarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarAlumno.setText("Agregar");
        btnAgregarAlumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });

        jcbSemestre.setBackground(new java.awt.Color(204, 204, 204));
        jcbSemestre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        txtApellidosAlumno.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidosAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtApellidosAlumno.setToolTipText("");
        txtApellidosAlumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtApellidosAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosAlumnoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Apellidos");

        jcbCarrera.setBackground(new java.awt.Color(204, 204, 204));
        jcbCarrera.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ing. Industrial", "Ing. Sistemas Computacionales" }));
        jcbCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCarreraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Num. Control");

        txtNumControl.setBackground(new java.awt.Color(204, 204, 204));
        txtNumControl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNumControl.setToolTipText("");
        txtNumControl.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtNumControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumControlActionPerformed(evt);
            }
        });
        txtNumControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumControlKeyTyped(evt);
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbSemestre, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbCarrera, javax.swing.GroupLayout.Alignment.LEADING, 0, 188, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidosAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumControl, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel5)
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
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidosAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jcbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        // Obtenemos los datos de los JTextField
        String nombre = txtNombreAlumno.getText().trim();
        String apellidos = txtApellidosAlumno.getText().trim();
        String numCtrl = txtNumControl.getText().trim().toUpperCase();
        String carrera = jcbCarrera.getSelectedItem().toString();
        String semestre = jcbSemestre.getSelectedItem().toString();

        // Verificamos que los campos no esten vacios, y si lo estan aparece un msj
        if (numCtrl.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || carrera.isEmpty() || semestre.isEmpty()) {
            msj.MensajeError("Por favor, Rellena todos los campos", "Datos Incompletos");
        } else {
            // Si no entonces, instanciamos un nuevo alumno
            Alumno alumno = new Alumno(null, numCtrl, nombre, apellidos, carrera, semestre);

            // Mandamos los datos del alumno a insertarAlumno
            boolean insertado = alumnoDAO.insertarAlumno(alumno);

            // Si insertado (true) entonces msj de exito
            if (insertado) {
                limpiar();
                msj.MensajeExitoso("El alumno ha sido registrado correctamente", "Registro de Alumno");
            } else {
                msj.MensajeError("Error al registrar el alumno", "Registro de Alumno");
            }
        }

    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void txtApellidosAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosAlumnoActionPerformed

    private void txtNumControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumControlActionPerformed

    private void jcbCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCarreraActionPerformed

    private void txtNumControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumControlKeyTyped
        if (txtNumControl.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumControlKeyTyped

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
            java.util.logging.Logger.getLogger(nuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevoAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbCarrera;
    private javax.swing.JComboBox<String> jcbSemestre;
    private javax.swing.JTextField txtApellidosAlumno;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNumControl;
    // End of variables declaration//GEN-END:variables
}
