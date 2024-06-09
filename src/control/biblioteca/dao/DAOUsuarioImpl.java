/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.biblioteca.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import control.biblioteca.controlador.Encriptar;
import control.biblioteca.controlador.Mensajes;
import control.biblioteca.interfaces.DAOUsuario;
import control.biblioteca.model.Usuario;
import control.biblioteca.model.conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author patinho
 */
public class DAOUsuarioImpl extends conexion implements DAOUsuario {

    private final Mensajes msj = new Mensajes();

    public Usuario validarCredencialesUs(String usuario, String contrasena) {
        Usuario usuarioLogeado = null;

        try {
            // Encriptar la contrasena ingresada
            String hashedPassword = Encriptar.encriptarContrasena(contrasena);

            // Conectarse a la BD y obtener la colección USUARIOS
            MongoClient mongoClient = this.Conexion(); // Asegúrate de que este método devuelva un MongoClient
            DB db = mongoClient.getDB("biblioteca");
            DBCollection usuarios = db.getCollection("usuarios");

            // Preparar consulta para encontrar al usuario en la BD
            BasicDBObject consulta = new BasicDBObject("nombreUsuario", usuario);
            DBObject usuarioEncontrado = usuarios.findOne(consulta);

            // Si se encontró un usuario y la contrasena ingresada es igual a la que está en la BD
            if (usuarioEncontrado != null && hashedPassword.equals(usuarioEncontrado.get("contrasena"))) {
                msj.MensajeExitoso("Inicio de sesión exitoso. Bienvenido " + usuario, "Inicio Exitoso");

                // Crear el objeto Usuario con los datos de la base de datos
                usuarioLogeado = new Usuario();
                usuarioLogeado.setId((ObjectId) usuarioEncontrado.get("_id"));
                usuarioLogeado.setNombreUsuario((String) usuarioEncontrado.get("nombreUsuario"));
                usuarioLogeado.setContrasena((String) usuarioEncontrado.get("contrasena"));
                usuarioLogeado.setRol((String) usuarioEncontrado.get("rol"));
            } else {
                msj.MensajeError("Usuario o contraseña incorrectos", "Inicio Fallido");
            }
        } catch (Exception e) {
            msj.MensajeError("Error al validar las credenciales de inicio \n" + e.getMessage(), "Inicio Fallido");
        }

        return usuarioLogeado; // Retornar el usuario logeado o null si no se encontraron las credenciales
    }

    public Usuario log(String usuario, String pass) {
        Usuario usuarioLogeado = new Usuario();
        // Conectarse a la BD y obtener la coleccion USUARIOS
        DB db = this.Conexion().getDB("biblioteca");
        DBCollection usuarios = db.getCollection("usuarios");

        BasicDBObject encontrar = new BasicDBObject(usuario, pass);
        DBObject usuarioEncontrado = usuarios.findOne(encontrar);

        if (usuarioEncontrado != null) {
            usuarioLogeado.setId((ObjectId) usuarioEncontrado.get("_id"));
            usuarioLogeado.setNombreUsuario((String) usuarioEncontrado.get("nombre"));
            usuarioLogeado.setContrasena((String) usuarioEncontrado.get("contrasena"));
            usuarioLogeado.setRol((String) usuarioEncontrado.get("rol"));
        }
        return usuarioLogeado;
    }

    @Override
    public boolean registrarUsuario(String usuario, String contrasena, String rol) {
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
            consulta.put("rol", rol);
            // Ejecutar la consulta (registro del usuario)
            usuarios.insert(consulta);
            msj.MensajeExitoso("Usuario registrado exitosamente", "Registrar Usuario");
            return true;

        } catch (Exception e) {
            msj.MensajeError("Error al guardar el usuario \n" + e.getMessage(), "Registrar Usuario");
            return false;
        }
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        try {
            // Conectarse a la BD y obtener la coleccion USUARIOS
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection usuarios = db.getCollection("usuarios");

            // Preparar consulta para encontrar al usuario en la BD
            BasicDBObject consulta = new BasicDBObject("_id", usuario.getId());
            DBObject usuarioEncontrado = usuarios.findOne(consulta);
            // Si encontró un usuario entonces...
            if (usuarioEncontrado != null) {
                // Encriptar la contrasena
                String contraEncrip = Encriptar.encriptarContrasena(usuario.getContrasena());
                // Prepara la consulta para actualizar los datos del usuario (contrasena)
                DBObject usuarioActualizado = new BasicDBObject("nombreUsuario", usuario.getNombreUsuario())
                        .append("contrasena", contraEncrip)
                        .append("rol", usuarioEncontrado.get("rol").toString());
                // Actualizar los datos del usuario (contrasena)
                usuarios.update(consulta, usuarioActualizado);
                msj.MensajeExitoso("Usuario Actualizado Correctamente", "Actualizar Usuario");
                return true;
            } else {
                msj.MensajeError("Usuario inexistente en la base de datos", "Actualizar Usuario");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al actualizar el usuario \n" + e.getMessage(), "Actualizar Usuario");
            return false;
        }
    }

    @Override
    public boolean eliminarUsuario(ObjectId id) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection usuariosColec = db.getCollection("usuarios");

            // Preparar consulta para encontrar el Usuario
            BasicDBObject encontrar = new BasicDBObject("_id", id);
            DBObject usuarioEncontrado = usuariosColec.findOne(encontrar);
            // Si el usuario se encontro entonces...
            if (usuarioEncontrado != null) {
                // Almacenamos la variable del identificador
                String nombreUsuario = (String) usuarioEncontrado.get("nombreUsuario");
                // Eliminamos el usuario de la base de datos
                boolean eliminar = msj.MensajeConfirmar("Estas seguro que deseas eliminar al usuario " + nombreUsuario + "?, \n"
                        + "Esta acción es irreversible.", "Eliminar Usuario");
                if (eliminar) {
                    // almacenamos el resultado de la eliminacion del Usuario
                    WriteResult resultado = usuariosColec.remove(usuarioEncontrado);
                    // Verifica que se realizo la consulta...
                    if (resultado.getN() > 0) {
                        // Si se realizo entonces muestra un msj de exito y retorna verdadero.
                        msj.MensajeExitoso("El usuario " + nombreUsuario + " fue eliminado con exito", "Eliminar Usuario");
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                msj.MensajeError("No se encontró ningún usuario", "Eliminar Usuario");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al intentar eliminar el usuario \n" + e.getMessage(), "Eliminar Usuario");
            return false;
        }
        return false;
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
                return new Usuario((ObjectId) usuarioEncontrado.get("_id"), (String) usuarioEncontrado.get("nombreUsuario"), (String) usuarioEncontrado.get("contrasena"), (String) usuarioEncontrado.get("rol"));
            } else {
                msj.MensajeError("Usuario no encontrado", "Buscar Usuario");
                return null;
            }
        } catch (Exception e) {
            //msj.MensajeError("Error al buscar el usuario \n" + e.getMessage(), "Buscar Usuario");
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
                //msj.MensajeExitoso("Inicio de sesión exitoso. Bienvenido " + usuario, "Inicio Exitoso");
                return true;
            } else {
                //msj.MensajeError("Usuario o contraseña incorrectos", "Inicio Fallido");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al validar las credenciales de inicio \n" + e.getMessage(), "Inicio Fallido");
            return false;
        }
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        try {
            List<Usuario> listaUsuarios = new ArrayList<>();
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection usuariosColec = db.getCollection("usuarios");

            DBCursor cursor = usuariosColec.find();
            while (cursor.hasNext()) {
                DBObject libroDBObject = cursor.next();
                ObjectId id = (ObjectId) libroDBObject.get("_id");
                String nombreUsuario = (String) libroDBObject.get("nombreUsuario");
                String contrasena = (String) libroDBObject.get("contrasena");
                String rol = (String) libroDBObject.get("rol");
                Usuario usuario = new Usuario(id, nombreUsuario, contrasena, rol);

                listaUsuarios.add(usuario);
            }
            if (listaUsuarios != null) {
                return listaUsuarios;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

}
