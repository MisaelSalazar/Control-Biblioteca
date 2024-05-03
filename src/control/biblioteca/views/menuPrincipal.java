/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control.biblioteca.views;

import control.biblioteca.controlador.FiltrarAlumnos;
import control.biblioteca.controlador.FiltrarLibros;
import control.biblioteca.controlador.Mensajes;
import control.biblioteca.controlador.TextPrompt;
import control.biblioteca.dao.DAOAlumnoImpl;
import control.biblioteca.dao.DAOLibroImpl;
import control.biblioteca.dao.DAOPrestamoImpl;
import control.biblioteca.dao.DAOUsuarioImpl;
import control.biblioteca.model.Alumno;
import control.biblioteca.model.Libro;
import control.biblioteca.model.Prestamo;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Misae
 */
public class menuPrincipal extends javax.swing.JFrame {

    private DAOUsuarioImpl usuarioDAO;
    private DAOLibroImpl libroDAO;
    private DAOPrestamoImpl prestamoDAO;
    private DAOAlumnoImpl alumnoDAO;
    private Mensajes msj = new Mensajes();
    private FiltrarLibros filtroLibros;
    private FiltrarAlumnos filtroalAlumnos;

    public menuPrincipal() {
        super("Control Biblioteca");
        usuarioDAO = new DAOUsuarioImpl();
        libroDAO = new DAOLibroImpl();
        prestamoDAO = new DAOPrestamoImpl();
        alumnoDAO = new DAOAlumnoImpl();
        initComponents();
        this.filtroLibros = new FiltrarLibros(libroDAO, txtBuscarLibro, tblLibros);
        this.filtroalAlumnos = new FiltrarAlumnos(alumnoDAO, txtBuscarAlumnos, tblAlumnos);
        mostrarLibrosEnTabla();
        mostrarAlumnosEnTabla();
        TextPrompt placeholder = new TextPrompt("Ingrese el número de control", txtNumControl);
        placeholder = new TextPrompt("Ingresa el código del libro", txtCodigoLibro);
        placeholder = new TextPrompt("Ingrese el número de control", txtNumControlDevolucion);
        placeholder = new TextPrompt("Ingresa el código del libro", txtCodigoLibroDevolucion);
        placeholder = new TextPrompt("Ingresa el nombre del usuario a buscar", txtBuscarUsuario);
        placeholder = new TextPrompt("Ingresa el nombre del libro a buscar", txtBuscarLibro);
        placeholder = new TextPrompt("Ingresa el nombre del alumno a buscar", txtBuscarAlumnos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnPrestamos = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        reportes = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        inicio = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        libros = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarLibro = new javax.swing.JTextField();
        btnBuscarLibro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        btnBorrarLibro = new javax.swing.JButton();
        btnEditarLibro = new javax.swing.JButton();
        btnAgregarLibro = new javax.swing.JButton();
        prestamos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCodigoLibro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNumControl = new javax.swing.JTextField();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnVerPrestamos = new javax.swing.JButton();
        btnPrestar = new javax.swing.JButton();
        Image1 = new javax.swing.JLabel();
        devoluciones = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoLibroDevolucion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNumControlDevolucion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNombreAlumnoDevolucion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JButton();
        Image2 = new javax.swing.JLabel();
        alumnos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarAlumnos = new javax.swing.JTextField();
        btnBuscarAlumnos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnAgregarAlumno = new javax.swing.JButton();
        btnEditarAlumno = new javax.swing.JButton();
        btnBorrarAlumno = new javax.swing.JButton();
        usuarios = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtBuscarUsuario = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        btnBorrarUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(148, 81, 54));

        btnInicio.setBackground(new java.awt.Color(148, 81, 54));
        btnInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnLibros.setBackground(new java.awt.Color(148, 81, 54));
        btnLibros.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setText("Libros");
        btnLibros.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibros.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        btnPrestamos.setBackground(new java.awt.Color(148, 81, 54));
        btnPrestamos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamos.setText("Prestamos ");
        btnPrestamos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestamos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });

        btnDevoluciones.setBackground(new java.awt.Color(148, 81, 54));
        btnDevoluciones.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnDevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevoluciones.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionesActionPerformed(evt);
            }
        });

        btnAlumnos.setBackground(new java.awt.Color(148, 81, 54));
        btnAlumnos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnAlumnos.setText("Alumnos");
        btnAlumnos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlumnos.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(148, 81, 54));
        btnUsuarios.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(148, 81, 54));
        btnReportes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuarios)
                    .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrestamos)
                    .addComponent(btnDevoluciones)
                    .addComponent(btnAlumnos)
                    .addComponent(btnInicio)
                    .addComponent(btnReportes))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnInicio)
                .addGap(18, 18, 18)
                .addComponent(btnLibros)
                .addGap(18, 18, 18)
                .addComponent(btnPrestamos)
                .addGap(18, 18, 18)
                .addComponent(btnDevoluciones)
                .addGap(18, 18, 18)
                .addComponent(btnAlumnos)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios)
                .addGap(18, 18, 18)
                .addComponent(btnReportes)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 520));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        reportes.setVisible(false);
        reportes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel23.setText("Reportes");

        javax.swing.GroupLayout reportesLayout = new javax.swing.GroupLayout(reportes);
        reportes.setLayout(reportesLayout);
        reportesLayout.setHorizontalGroup(
            reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        reportesLayout.setVerticalGroup(
            reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(454, 454, 454))
        );

        inicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Bienvenido");

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Sistema de Gestión para Centro de Información. Controle y administre de");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("forma óptima y fácil el flujo de préstamos y devoluciones de Libros. ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Esta herramienta permite llevar un control completo y detallado del Centro de Información,");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("tendrá acceso a herramientas especiales para tareas específicas, como lo son:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("• Préstamos");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("• Devoluciones");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("• Registro de Usuarios y Libros Nuevos");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("• Edición de Usuarios y Libros existentes");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("• Eliminar todo tipo de Registros");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("• Sección de Reportes de acciones en el sistema");

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control/biblioteca/img/libro.png"))); // NOI18N

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text1)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4))
                    .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        libros.setVisible(false);
        libros.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Libros");

        txtBuscarLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscarLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscarLibro.setToolTipText("");
        txtBuscarLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarLibroActionPerformed(evt);
            }
        });

        btnBuscarLibro.setBackground(new java.awt.Color(160, 212, 104));
        btnBuscarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnBuscarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título", "Editorial", "Paginas", "Adquisición "
            }
        ));
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLibros);

        btnBorrarLibro.setBackground(new java.awt.Color(218, 68, 83));
        btnBorrarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBorrarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarLibro.setText("Borrar");
        btnBorrarLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnBorrarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarLibroActionPerformed(evt);
            }
        });

        btnEditarLibro.setBackground(new java.awt.Color(255, 206, 84));
        btnEditarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarLibro.setText("Editar");
        btnEditarLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnEditarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLibroActionPerformed(evt);
            }
        });

        btnAgregarLibro.setBackground(new java.awt.Color(93, 156, 236));
        btnAgregarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarLibro.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarLibro.setText("Nuevo");
        btnAgregarLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnAgregarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout librosLayout = new javax.swing.GroupLayout(libros);
        libros.setLayout(librosLayout);
        librosLayout.setHorizontalGroup(
            librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(librosLayout.createSequentialGroup()
                        .addComponent(txtBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(librosLayout.createSequentialGroup()
                        .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        librosLayout.setVerticalGroup(
            librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librosLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarLibro)
                    .addComponent(btnBorrarLibro)
                    .addComponent(btnEditarLibro))
                .addGap(120, 120, 120))
        );

        prestamos.setVisible(false);
        prestamos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Nuevo Prestamo");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Código Del Libro:");

        txtCodigoLibro.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCodigoLibro.setToolTipText("");
        txtCodigoLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtCodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Num. Control:");

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

        txtNombreLibro.setEditable(false);
        txtNombreLibro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreLibro.setToolTipText("");
        txtNombreLibro.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtNombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreLibroActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Nombre del Libro");

        txtNombreAlumno.setEditable(false);
        txtNombreAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreAlumno.setToolTipText("");
        txtNombreAlumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Nombre del Alumno");

        btnVerPrestamos.setBackground(new java.awt.Color(93, 156, 236));
        btnVerPrestamos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerPrestamos.setForeground(new java.awt.Color(0, 0, 0));
        btnVerPrestamos.setText("Ver Prestamos");
        btnVerPrestamos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnVerPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPrestamosActionPerformed(evt);
            }
        });

        btnPrestar.setBackground(new java.awt.Color(160, 212, 104));
        btnPrestar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrestar.setForeground(new java.awt.Color(0, 0, 0));
        btnPrestar.setText("Prestar");
        btnPrestar.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnPrestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        Image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control/biblioteca/img/pedir-prestado.png"))); // NOI18N

        javax.swing.GroupLayout prestamosLayout = new javax.swing.GroupLayout(prestamos);
        prestamos.setLayout(prestamosLayout);
        prestamosLayout.setHorizontalGroup(
            prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prestamosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigoLibro)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Image1)
                                .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreLibro)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(118, 118, 118))
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(btnPrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        prestamosLayout.setVerticalGroup(
            prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(12, 12, 12)
                        .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(prestamosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        devoluciones.setVisible(false);
        devoluciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Devolución de Libro");

        txtCodigoLibroDevolucion.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoLibroDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCodigoLibroDevolucion.setToolTipText("");
        txtCodigoLibroDevolucion.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtCodigoLibroDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroDevolucionActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Código Del Libro:");

        txtNumControlDevolucion.setBackground(new java.awt.Color(204, 204, 204));
        txtNumControlDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNumControlDevolucion.setToolTipText("");
        txtNumControlDevolucion.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtNumControlDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumControlDevolucionActionPerformed(evt);
            }
        });
        txtNumControlDevolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumControlDevolucionKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Num. Control:");

        txtNombreAlumnoDevolucion.setEditable(false);
        txtNombreAlumnoDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreAlumnoDevolucion.setToolTipText("");
        txtNombreAlumnoDevolucion.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtNombreAlumnoDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoDevolucionActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Nombre del Alumno");

        btnDevolver.setBackground(new java.awt.Color(160, 212, 104));
        btnDevolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDevolver.setForeground(new java.awt.Color(0, 0, 0));
        btnDevolver.setText("Devolver");
        btnDevolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        Image2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control/biblioteca/img/librero.png"))); // NOI18N

        javax.swing.GroupLayout devolucionesLayout = new javax.swing.GroupLayout(devoluciones);
        devoluciones.setLayout(devolucionesLayout);
        devolucionesLayout.setHorizontalGroup(
            devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(devolucionesLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(devolucionesLayout.createSequentialGroup()
                        .addGroup(devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDevolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(devolucionesLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoLibroDevolucion)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumControlDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreAlumnoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Image2))
                        .addGap(119, 119, 119))))
        );
        devolucionesLayout.setVerticalGroup(
            devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(devolucionesLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(12, 12, 12)
                        .addComponent(txtNumControlDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22)
                    .addGroup(devolucionesLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtNombreAlumnoDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(devolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(devolucionesLayout.createSequentialGroup()
                        .addComponent(txtCodigoLibroDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        alumnos.setVisible(false);
        alumnos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Alumnos");

        txtBuscarAlumnos.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscarAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscarAlumnos.setToolTipText("");
        txtBuscarAlumnos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtBuscarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAlumnosActionPerformed(evt);
            }
        });

        btnBuscarAlumnos.setBackground(new java.awt.Color(160, 212, 104));
        btnBuscarAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarAlumnos.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarAlumnos.setText("Buscar");
        btnBuscarAlumnos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnBuscarAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnosActionPerformed(evt);
            }
        });

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num Control", "Nombre(s)", "Apellidos", "Carrera", "Semestre"
            }
        ));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAlumnos);

        btnAgregarAlumno.setBackground(new java.awt.Color(93, 156, 236));
        btnAgregarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarAlumno.setText("Nuevo");
        btnAgregarAlumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnAgregarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });

        btnEditarAlumno.setBackground(new java.awt.Color(255, 206, 84));
        btnEditarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarAlumno.setText("Editar");
        btnEditarAlumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnEditarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlumnoActionPerformed(evt);
            }
        });

        btnBorrarAlumno.setBackground(new java.awt.Color(218, 68, 83));
        btnBorrarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBorrarAlumno.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarAlumno.setText("Borrar");
        btnBorrarAlumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnBorrarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alumnosLayout = new javax.swing.GroupLayout(alumnos);
        alumnos.setLayout(alumnosLayout);
        alumnosLayout.setHorizontalGroup(
            alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(alumnosLayout.createSequentialGroup()
                        .addComponent(txtBuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnBuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(alumnosLayout.createSequentialGroup()
                        .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        alumnosLayout.setVerticalGroup(
            alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAlumno)
                    .addComponent(btnBorrarAlumno)
                    .addComponent(btnEditarAlumno))
                .addGap(94, 94, 94))
        );

        usuarios.setVisible(false);
        usuarios.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("Usuarios");

        txtBuscarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscarUsuario.setToolTipText("");
        txtBuscarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 5));
        txtBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUsuarioActionPerformed(evt);
            }
        });

        btnAgregarUsuario.setBackground(new java.awt.Color(93, 156, 236));
        btnAgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarUsuario.setText("Nuevo");
        btnAgregarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnAgregarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setHeaderValue("Código");
        }

        btnBuscar1.setBackground(new java.awt.Color(160, 212, 104));
        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar1.setText("Buscar");
        btnBuscar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnBorrarUsuario.setBackground(new java.awt.Color(218, 68, 83));
        btnBorrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBorrarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrarUsuario.setText("Borrar");
        btnBorrarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnBorrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setBackground(new java.awt.Color(255, 206, 84));
        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnEditarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usuariosLayout = new javax.swing.GroupLayout(usuarios);
        usuarios.setLayout(usuariosLayout);
        usuariosLayout.setHorizontalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(usuariosLayout.createSequentialGroup()
                        .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(usuariosLayout.createSequentialGroup()
                            .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        usuariosLayout.setVerticalGroup(
            usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario)
                    .addComponent(btnBorrarUsuario)
                    .addComponent(btnEditarUsuario))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(devoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(devoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
        );

        jPanel1.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 730, 520));

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

    private void mostrarAlumnosEnTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();
        limpiarTabla(modelo); // Limpia la tabla antes de agregar nuevos datos

        List<Alumno> alumnos = alumnoDAO.obtenerAlumnos();

        for (Alumno alumno : alumnos) {
            Object[] fila = {
                alumno.getNumControl(),
                alumno.getNombre(),
                alumno.getApellidos(),
                alumno.getCarrera(),
                alumno.getSemestre()
            };
            modelo.addRow(fila);
        }
    }

    private void mostrarLibrosEnTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();
        limpiarTabla(modelo);

        List<Libro> libros = libroDAO.obtenerLibros();

        for (Libro libro : libros) {
            Object[] fila = {
                libro.getTitulo(),
                libro.getEditorial(),
                libro.getPaginas(),
                libro.getIdentificador()
            };
            modelo.addRow(fila);
        }
    }

    private void limpiarTabla(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void limitarNoCtrl(JTextField txtNoCtrl, KeyEvent evt) {
        if (txtNoCtrl.getText().length() >= 8) {
            evt.consume();
        }
    }

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        inicio.setVisible(true);
        libros.setVisible(false);
        prestamos.setVisible(false);
        devoluciones.setVisible(false);
        alumnos.setVisible(false);
        usuarios.setVisible(false);
        reportes.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        // TODO add your handling code here:
        inicio.setVisible(false);
        libros.setVisible(true);
        prestamos.setVisible(false);
        devoluciones.setVisible(false);
        alumnos.setVisible(false);
        usuarios.setVisible(false);
        reportes.setVisible(false);
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        // TODO add your handling code here:
        inicio.setVisible(false);
        libros.setVisible(false);
        prestamos.setVisible(true);
        devoluciones.setVisible(false);
        alumnos.setVisible(false);
        usuarios.setVisible(false);
        reportes.setVisible(false);
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void btnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionesActionPerformed
        // TODO add your handling code here:
        inicio.setVisible(false);
        libros.setVisible(false);
        prestamos.setVisible(false);
        devoluciones.setVisible(true);
        alumnos.setVisible(false);
        usuarios.setVisible(false);
        reportes.setVisible(false);
    }//GEN-LAST:event_btnDevolucionesActionPerformed

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        // TODO add your handling code here:
        inicio.setVisible(false);
        libros.setVisible(false);
        prestamos.setVisible(false);
        devoluciones.setVisible(false);
        alumnos.setVisible(true);
        usuarios.setVisible(false);
        reportes.setVisible(false);
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        inicio.setVisible(false);
        libros.setVisible(false);
        prestamos.setVisible(false);
        devoluciones.setVisible(false);
        alumnos.setVisible(false);
        usuarios.setVisible(true);
        reportes.setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void txtNumControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumControlActionPerformed

    private void txtCodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoLibroActionPerformed

    private void txtNombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreLibroActionPerformed

    private void txtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoActionPerformed

    private void btnVerPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPrestamosActionPerformed

    }//GEN-LAST:event_btnVerPrestamosActionPerformed

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        // Obtener los datos del formulario (txtNumControl, txtCodigoLibro)
        String numControl = txtNumControl.getText().trim().toUpperCase();
        String codigoLibro = txtCodigoLibro.getText().trim().toUpperCase();
        // Comprobar que los campos están llenados
        if (numControl.isEmpty() || codigoLibro.isEmpty()) {
            msj.MensajeError("Por favor, rellena todos los campos", "Devolución de Libro");
        } else {
            // Buscar al alumno en la base de datos
            Alumno alumno = alumnoDAO.buscarAlumnoPorNumeroControl(numControl);
            // Buscar el libro en la base de datos
            Libro libro = libroDAO.buscarLibroPorIdentificador(codigoLibro);

            if (alumno != null && libro != null) {
                txtNombreAlumno.setText(alumno.getNombre());
                txtNombreLibro.setText(libro.getTitulo());

                // Crear un objeto Prestamo con los datos obtenidos
                Prestamo prestamo = new Prestamo(null, alumno.getId().toString(), libro.getId().toString(), new Date(), null);

                // Realizar el préstamo
                boolean prestado = prestamoDAO.nuevoPrestamo(prestamo);

                // Mostrar MSJ dependiendo
                if (prestado) {
                    msj.MensajeExitoso("Préstamo realizado con éxito.", "Préstamo de Libro");
                } else {
                    msj.MensajeError("Error al realizar el préstamo.", "Préstamo de Libro");
                }
            }
        }
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void txtNombreAlumnoDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoDevolucionActionPerformed

    private void txtNumControlDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumControlDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumControlDevolucionActionPerformed

    private void txtCodigoLibroDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoLibroDevolucionActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        if (txtNumControlDevolucion.getText().trim().toUpperCase().isEmpty() || txtCodigoLibroDevolucion.getText().trim().toUpperCase().isEmpty()) {
            msj.MensajeError("Por favor, rellena todos los campos", "Devolución de Libro");
        } else {
            // Obtener el número de control del alumno y el código del libro desde los jTextField
            String numControlAlumno = txtNumControlDevolucion.getText().trim().toUpperCase();
            String codigoLibro = txtCodigoLibroDevolucion.getText().trim().toUpperCase();

            // Buscar el alumno y el libro en la base de datos para obtener sus ID's
            Alumno alumno = alumnoDAO.buscarAlumnoPorNumeroControl(numControlAlumno);
            Libro libro = libroDAO.buscarLibroPorIdentificador(codigoLibro);

            if (alumno != null && libro != null) {
                // Imprimir los datoss del Alumno
                System.out.println("Datos del alumno:");
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Apellidos: " + alumno.getApellidos());
                System.out.println("Carrera: " + alumno.getCarrera());
                System.out.println("Semestre: " + alumno.getSemestre());

                // Imprimir los datos del Libro
                System.out.println("\nDatos del libro:");
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Editorial: " + libro.getEditorial());
                System.out.println("Año: " + libro.getAnho());
                System.out.println("Páginas: " + libro.getPaginas());
                System.out.println("ISBN: " + libro.getIsbn());

                // Imprimir los ID's 
                System.out.println("ID del alumno: " + alumno.getId());
                System.out.println("ID del libro: " + libro.getId());

                // Almacenar los ID's
                ObjectId alumnoId = alumno.getId();
                ObjectId libroId = libro.getId();

                // Realizar la devolución del libro
                boolean devolucionExitosa = prestamoDAO.realizarDevolucion(alumnoId, libroId);
                System.out.println("ID del alumno: " + alumnoId);
                System.out.println("ID del libro: " + libroId);

                if (devolucionExitosa) {
                    // devolucionExitosa == true, funcionó
                    txtNombreAlumnoDevolucion.setText(alumno.getNombre() + " " + alumno.getApellidos());
                }
            }
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
        inicio.setVisible(false);
        libros.setVisible(false);
        prestamos.setVisible(false);
        devoluciones.setVisible(false);
        alumnos.setVisible(false);
        usuarios.setVisible(false);
        reportes.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void txtBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUsuarioActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed

    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void txtBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarLibroActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnBorrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarLibroActionPerformed

    private void btnEditarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarLibroActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void txtBuscarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarAlumnosActionPerformed

    private void btnBuscarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAlumnosActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        nuevoAlumno objnuevoAlumno = new nuevoAlumno();
        objnuevoAlumno.setVisible(true);
        objnuevoAlumno.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnEditarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlumnoActionPerformed
        // TODO add your handling code here:
        editarAlumno objEditarAlumno = new editarAlumno();
        objEditarAlumno.setVisible(true);
        objEditarAlumno.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEditarAlumnoActionPerformed

    private void btnBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlumnoActionPerformed
        // TODO add your handling code here:
        eliminarAlumno objEliminarAlumno = new eliminarAlumno();
        objEliminarAlumno.setVisible(true);
        objEliminarAlumno.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBorrarAlumnoActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        // Seleccionar fila
        int filaSeleccionada = tblAlumnos.getSelectedRow();
        // Si se ha seleccionado una fila entonces
        if (filaSeleccionada != -1) {
            // Obtener el objeto Alumno correspondiente a la fila seleccionada
            Alumno alumnoSeleccionado = alumnoDAO.obtenerAlumnos().get(filaSeleccionada);
            // Guardamos el id del alumno seleccionado
            ObjectId idAlumno = alumnoSeleccionado.getId();
            System.out.println("ID del alumno seleccionado: " + idAlumno.toHexString());
        }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
        int filaSeleccionada = tblLibros.getSelectedRow();

        if (filaSeleccionada != -1) {

            Libro libroSeleccionado = libroDAO.obtenerLibros().get(filaSeleccionada);

            ObjectId idLibro = libroSeleccionado.getId();

            System.out.println("ID del libro seleccionado: " + idLibro.toHexString());
        }
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void txtNumControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumControlKeyTyped
        limitarNoCtrl(txtNumControl, evt);
    }//GEN-LAST:event_txtNumControlKeyTyped

    private void txtNumControlDevolucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumControlDevolucionKeyTyped
        limitarNoCtrl(txtNumControlDevolucion, evt);
    }//GEN-LAST:event_txtNumControlDevolucionKeyTyped

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel Text1;
    private javax.swing.JPanel alumnos;
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnBorrarAlumno;
    private javax.swing.JButton btnBorrarLibro;
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscarAlumnos;
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnEditarAlumno;
    private javax.swing.JButton btnEditarLibro;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVerPrestamos;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel devoluciones;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel libros;
    private javax.swing.JPanel prestamos;
    private javax.swing.JPanel reportes;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscarAlumnos;
    private javax.swing.JTextField txtBuscarLibro;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtCodigoLibro;
    private javax.swing.JTextField txtCodigoLibroDevolucion;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNombreAlumnoDevolucion;
    private javax.swing.JTextField txtNombreLibro;
    private javax.swing.JTextField txtNumControl;
    private javax.swing.JTextField txtNumControlDevolucion;
    private javax.swing.JPanel usuarios;
    // End of variables declaration//GEN-END:variables
}
