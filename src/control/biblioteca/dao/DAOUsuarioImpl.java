/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.biblioteca.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import control.biblioteca.controlador.Encriptar;
import control.biblioteca.controlador.Mensajes;
import control.biblioteca.interfaces.DAOUsuario;
import control.biblioteca.model.Usuario;
import control.biblioteca.model.conexion;
import org.bson.types.ObjectId;

/**
 *
 * @author patinho
 */
public class DAOUsuarioImpl extends conexion implements DAOUsuario {

    private final Mensajes msj = new Mensajes();

    @Override
    public void registrarUsuario(String usuario, String contrasena) {
        try {
            // Encriptar la contrasena
            String contraEncrip = Encriptar.encriptarContrasena(contrasena);
            // Conectarse a la BD y obtener la coleccion USUARIOS
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection usuarios = db.getCollection("usuarios");
            // Preparar consulta de registro (insercion)
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("nombreUsuario", usuario);
            consulta.put("contrasena", contraEncrip);
            // Ejecutar la consulta (registro del usuario)
            usuarios.insert(consulta);
            msj.MensajeExitoso("Usuario registrado exitosamente", "Registrar Usuario");
        } catch (Exception e) {
            msj.MensajeError("Error al guardar el usuario \n" + e.getMessage(), "Registrar Usuario");
        }
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        try {
            // Conectarse a la BD y obtener la coleccion USUARIOS
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection usuarios = db.getCollection("usuarios");
            // Preparar consulta para encontrar al usuario en la BD
            BasicDBObject consulta = new BasicDBObject("nombreUsuario", usuario.getNombreUsuario());
            DBObject usuarioEncontrado = usuarios.findOne(consulta);
            // Si encontró un usuario entonces...
            if (usuarioEncontrado != null) {
                // Prepara la consulta para actualizar los datos del usuario (contrasena)
                DBObject usuarioActualizado = new BasicDBObject("nombreUsuario", usuario.getNombreUsuario())
                        .append("contrasena", usuario.getContrasena());
                // Actualizar los datos del usuario (contrasena)
                usuarios.update(consulta, usuarioActualizado);
                msj.MensajeExitoso("Usuario Actualizado Correctamente", "Actualizar Usuario");
            } else {
                msj.MensajeError("Usuario inexistente en la base de datos", "Actualizar Usuario");
            }
        } catch (Exception e) {
            msj.MensajeError("Error al actualizar el usuario \n" + e.getMessage(), "Actualizar Usuario");
        }
    }

    @Override
    public Usuario buscarUsuarioPorNombre(String nombreUsuario) {
        try {
            // Conectarse a la BD y obtener la coleccion USUARIOS
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection usuarios = db.getCollection("usuarios");
            // Preparar consulta para encontrar al usuario en la BD
            BasicDBObject consulta = new BasicDBObject("nombreUsuario", nombreUsuario);
            DBObject usuarioEncontrado = usuarios.findOne(consulta);
            // Si encontró un usuario entonces...
            if (usuarioEncontrado != null) {
                // Retorna al Usuario (contrasena)
                return new Usuario((ObjectId) usuarioEncontrado.get("_id"), (String) usuarioEncontrado.get("nombreUsuario"), (String) usuarioEncontrado.get("contrasena"));
            } else {
                msj.MensajeError("Usuario no encontrado", "Buscar Usuario");
                return null;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al buscar el usuario \n" + e.getMessage(), "Buscar Usuario");
            return null;
        }
    }

    @Override
    public boolean validarCredenciales(String usuario, String contrasena) {
        try {
            // Encriptar la contrasena ingresada
            String hashedPassword = Encriptar.encriptarContrasena(contrasena);
            // Conectarse a la BD y obtener la coleccion USUARIOS
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection usuarios = db.getCollection("usuarios");
            // Preparar consulta para encontrar al usuario en la BD
            BasicDBObject consulta = new BasicDBObject("nombreUsuario", usuario);
            DBObject usuarioEncontrado = usuarios.findOne(consulta);
            // Si se encontró un usuario y la contrasena ingresada es igual a la que esta en la BD entonces...
            if (usuarioEncontrado != null && hashedPassword.equals(usuarioEncontrado.get("contrasena"))) {
                msj.MensajeExitoso("Inicio de sesión exitoso. Bienvenido " + usuario, "Inicio Exitoso");
                return true;
            } else {
                msj.MensajeError("Usuario o contraseña incorrectos", "Inicio Fallido");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al validar las credenciales de inicio \n" + e.getMessage(), "Inicio Fallido");
            return false;
        }
    }
}
