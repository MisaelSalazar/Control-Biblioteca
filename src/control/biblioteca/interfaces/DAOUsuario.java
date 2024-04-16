/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control.biblioteca.interfaces;

import control.biblioteca.model.Usuario;

/**
 *
 * @author patinho
 */
public interface DAOUsuario {
    void registrarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    Usuario buscarUsuarioPorNombre(String nombreUsuario);
    boolean validarCredenciales(Usuario usuario);
}
