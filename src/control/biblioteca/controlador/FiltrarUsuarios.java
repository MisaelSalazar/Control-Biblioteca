package control.biblioteca.controlador;

import control.biblioteca.interfaces.DAOUsuario;
import control.biblioteca.model.Usuario;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class FiltrarUsuarios {

    private final DAOUsuario daoUsuarios;
    private final JTextField txtBuscarUsuarios;
    private final JTable tblUsuarios;

    public FiltrarUsuarios(DAOUsuario daoUsuarios, JTextField txtBuscarUsuarios, JTable tblUsuarios) {
        this.daoUsuarios = daoUsuarios;
        this.txtBuscarUsuarios = txtBuscarUsuarios;
        this.tblUsuarios = tblUsuarios;

        txtBuscarUsuarios.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarUsuarios();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarUsuarios();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }

    private void filtrarUsuarios() {
        String filtro = txtBuscarUsuarios.getText().trim().toLowerCase();
        DefaultTableModel modelo = (DefaultTableModel) tblUsuarios.getModel();
        limpiarTabla(modelo);

        List<Usuario> usuarios = daoUsuarios.obtenerUsuarios();

        for (Usuario usuario : usuarios) {
            // Verifica si el nombre del usuario contiene el filtro
            if (usuario.getNombreUsuario().toLowerCase().contains(filtro)) {
                Object[] fila = {
                    usuario.getId(),
                    usuario.getNombreUsuario()
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
