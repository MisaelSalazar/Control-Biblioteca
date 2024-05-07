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
import com.mongodb.WriteResult;
import control.biblioteca.controlador.Mensajes;
import control.biblioteca.interfaces.DAOLibros;
import control.biblioteca.model.Libro;
import control.biblioteca.model.conexion;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author patinho
 */
public class DAOLibroImpl extends conexion implements DAOLibros {
    
    private Mensajes msj = new Mensajes();
    
    @Override
    public boolean registrarLibro(Libro libro) {
        try {
            // Si libro es diferente de nulo entonces...
            if (libro != null) {
                // Conectarse a la BD
                DB db = this.Conexion().getDB("biblioteca");
                DBCollection libros = db.getCollection("libros");

                // Preparar consulta
                BasicDBObject consulta = new BasicDBObject();
                consulta.put("identificador", libro.getIdentificador());
                consulta.put("titulo", libro.getTitulo());
                consulta.put("autor", libro.getAutor());
                consulta.put("editorial", libro.getEditorial());
                consulta.put("año", libro.getAnho());
                consulta.put("paginas", libro.getPaginas());
                consulta.put("ISBN", libro.getIsbn());

                // Almacenamos el resultado de la insercion
                WriteResult resultado = libros.insert(consulta);
                // Verificamos que se realizo una insercion en la BD
                if (resultado.getN() > 0) {
                    // De ser asi entonces muestra un msj de exito y retorna verdadero
                    msj.MensajeExitoso("Libro registrado exitosamente", "Registro de Libro");
                    return true;
                } else {
                    msj.MensajeError("No se realizó el registro del Libro", "Registro de Libro");
                    return false;
                }
            } else {
                msj.MensajeError("Los datos del libro estan incompletos", "Registro de Libro");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al registrar el nuevo libro \n" + e.getMessage(), "Registro de Libro");
            return false;
        }
    }
    
    @Override
    public void actualizarLibro(Libro libro) {
        try {
            // Si libro es diferente de nulo entonces...
            if (libro != null) {
                // Conectarse a la BD
                DB db = this.Conexion().getDB("biblioteca");
                DBCollection libros = db.getCollection("libros");

                // Preparar consulta para encontrar el libro por su ID
                BasicDBObject encontrar = new BasicDBObject("_id", libro.getId());
                // Almacenar el libro encontrado
                DBObject libroEncontrado = libros.findOne(encontrar);
                // Si es diferente de nulo entonces...
                if (libroEncontrado != null) {
                    // Preparar consulta para actualizar el libro
                    BasicDBObject consulta = new BasicDBObject();
                    consulta.put("identificador", libro.getIdentificador());
                    consulta.put("titulo", libro.getTitulo());
                    consulta.put("autor", libro.getAutor());
                    consulta.put("editorial", libro.getEditorial());
                    consulta.put("año", libro.getAnho());
                    consulta.put("paginas", libro.getPaginas());
                    consulta.put("ISBN", libro.getIsbn());

                    // Almacenamos el resultado de la consulta
                    WriteResult resultado = libros.update(libroEncontrado, consulta);
                    // Verificamos que se realizo una consulta en la BD
                    if (resultado.getN() > 0) {
                        msj.MensajeExitoso("El libro fue actualizado con éxito", "Actualizar Libro");
                    } else {
                        msj.MensajeError("No se actualizaron los datos del libro", "Actualizar Libro");
                    }
                } else {
                    msj.MensajeError("El libro con el identificador " + libro.getIdentificador() + " no fue encontrado", "Actualizar Libro");
                }
            }
        } catch (Exception e) {
            msj.MensajeError("Error al actualizar los datos del libro \n" + e.getMessage(), "Actualizar Libro");
        }
    }
    
    @Override
    public boolean eliminarLibro(ObjectId id) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection libros = db.getCollection("libros");

            // Preparar consulta para encontrar el Libro
            BasicDBObject encontrar = new BasicDBObject("_id", id);
            DBObject libroEncontrado = libros.findOne(encontrar);
            // Si el libro se encontro entonces...
            if (libroEncontrado != null) {
                // Almacenamos la variable del identificador
                String identificador = (String) libroEncontrado.get("identificador");
                // Eliminamos el libro de la base de datos
                boolean eliminar = msj.MensajeConfirmar("Estas seguro que deseas eliminar el libro con el identificador " + identificador + "?, \n"
                        + "Esta acción es irreversible.", "Eliminar Libro");
                if (eliminar) {
                    // almacenamos el resultado de la eliminacion del Libro
                    WriteResult resultado = libros.remove(libroEncontrado);
                    // Verifica que se realizo la consulta...
                    if (resultado.getN() > 0) {
                        // Si se realizo entonces muestra un msj de exito y retorna verdadero.
                        msj.MensajeExitoso("El libro con el identificador " + identificador + " fue eliminado con exito", "Eliminar Libro");
                        return true;
                    }
                } else {
                    msj.MensajeError("No se pudo eliminar el libro con el identificador " + identificador, "Eliminar Libro");
                    return false;
                }
            } else {
                msj.MensajeError("No se encontró ningún libro", "Eliminar Libro");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al intentar eliminar el libro \n" + e.getMessage(), "Eliminar Libro");
            return false;
        }
        return false;
    }
    
    @Override
    public Libro buscarLibroPorIdentificador(String identificador) {
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection libros = db.getCollection("libros");
            
            BasicDBObject encontrar = new BasicDBObject("identificador", identificador);
            DBObject libroEncontrado = libros.findOne(encontrar);
            
            if (libroEncontrado != null) {
                Libro libro = new Libro();
                libro.setId((ObjectId) libroEncontrado.get("_id"));
                libro.setIdentificador((String) libroEncontrado.get("identificador"));
                libro.setTitulo((String) libroEncontrado.get("titulo"));
                libro.setAutor((String) libroEncontrado.get("autor"));
                libro.setEditorial((String) libroEncontrado.get("editorial"));
                libro.setAnho((String) libroEncontrado.get("año"));
                libro.setPaginas((String) libroEncontrado.get("paginas"));
                libro.setIsbn((String) libroEncontrado.get("ISBN"));
                
                return libro;
            } else {
                msj.MensajeError("No se encontró el libro con el identificador:\n " + identificador, "Buscar Libro");
            }
        } catch (Exception e) {
            msj.MensajeError("Error al buscar el libro con el identificador:\n " + identificador + "\n" + e.getMessage(), "Buscar Libro");
            return null;
        }
        return null;
    }
    
    @Override
    public List<Libro> obtenerLibros() {
        List<Libro> libros = new ArrayList<>();
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection librosCollection = db.getCollection("libros");
            
            DBCursor cursor = librosCollection.find();
            while (cursor.hasNext()) {
                DBObject libroDBObject = cursor.next();
                Libro libro = new Libro();
                libro.setId((ObjectId) libroDBObject.get("_id"));
                libro.setTitulo((String) libroDBObject.get("titulo"));
                libro.setIdentificador((String) libroDBObject.get("identificador"));
                libro.setAutor((String) libroDBObject.get("autor"));
                libro.setEditorial((String) libroDBObject.get("editorial"));
                libro.setAnho((String) libroDBObject.get("año"));
                libro.setPaginas((String) libroDBObject.get("paginas"));
                libro.setIsbn((String) libroDBObject.get("ISBN"));
                
                libros.add(libro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return libros;
    }
    
}
