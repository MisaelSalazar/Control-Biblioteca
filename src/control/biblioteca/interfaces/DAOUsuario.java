/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control.biblioteca.interfaces;

import control.biblioteca.model.Usuario;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author patinho
 */
public interface DAOUsuario {
    void registrarUsuario(String usuario, String contrasena);
    void actualizarUsuario(Usuario usuario);
    boolean eliminarUsuario(ObjectId id);
    Usuario buscarUsuarioPorNombre(String nombreUsuario);
    boolean validarCredenciales(String usuario, String contrasena);
    List<Usuario> obtenerUsuarios();
}
