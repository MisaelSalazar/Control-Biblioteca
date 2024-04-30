/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.biblioteca.controlador;

import control.biblioteca.interfaces.DAOLibros;
import control.biblioteca.model.Libro;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonio
 */
public class FiltrarLibros {

    private final DAOLibros daoLibros;
    private final JTextField txtBuscarLibro;
    private final JTable tblLibros;

    public FiltrarLibros(DAOLibros daoLibros, JTextField txtBuscarLibro, JTable tblLibros) {
        this.daoLibros = daoLibros;
        this.txtBuscarLibro = txtBuscarLibro;
        this.tblLibros = tblLibros;

        txtBuscarLibro.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarLibros();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarLibros();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
    }

    private void filtrarLibros() {
        String filtro = txtBuscarLibro.getText().trim().toLowerCase();
        DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();
        limpiarTabla(modelo);

        List<Libro> libros = daoLibros.obtenerLibros();

        for (Libro libro : libros) {
            // Verifica si el título o el identificador del libro contienen el filtro
            if (libro.getTitulo().toLowerCase().contains(filtro) || libro.getIdentificador().toLowerCase().contains(filtro)) {
                Object[] fila = {
                    libro.getTitulo(),
                    libro.getEditorial(),
                    libro.getPaginas(),
                    libro.getIdentificador()
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
