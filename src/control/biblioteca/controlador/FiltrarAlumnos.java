package control.biblioteca.controlador;

import control.biblioteca.interfaces.DAOAlumnos;
import control.biblioteca.model.Alumno;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class FiltrarAlumnos {

    private final DAOAlumnos daoAlumnos;
    private final JTextField txtBuscarAlumnos;
    private final JTable tblAlumnos;

    public FiltrarAlumnos(DAOAlumnos daoAlumnos, JTextField txtBuscarAlumnos, JTable tblAlumnos) {
        this.daoAlumnos = daoAlumnos;
        this.txtBuscarAlumnos = txtBuscarAlumnos;
        this.tblAlumnos = tblAlumnos;

        txtBuscarAlumnos.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarAlumnos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarAlumnos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }

    private void filtrarAlumnos() {
        String filtro = txtBuscarAlumnos.getText().trim().toLowerCase();
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();
        limpiarTabla(modelo);

        List<Alumno> alumnos = daoAlumnos.obtenerAlumnos();

        for (Alumno alumno : alumnos) {
            // Verifica si el número de control, nombre o apellidos del alumno contienen el filtro
            if (alumno.getNumControl().toLowerCase().contains(filtro)
                    || alumno.getNombre().toLowerCase().contains(filtro)
                    || alumno.getApellidos().toLowerCase().contains(filtro)) {
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
    }

    private void limpiarTabla(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
}
