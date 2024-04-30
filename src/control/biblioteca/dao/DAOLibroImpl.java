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
    public void registrarLibro(Libro libro) {
        try {
            if (libro != null) {
                DB db = this.Conexion().getDB("biblioteca");
                DBCollection libros = db.getCollection("libros");

                BasicDBObject consulta = new BasicDBObject();
                consulta.put("identificador", libro.getIdentificador());
                consulta.put("titulo", libro.getTitulo());
                consulta.put("autor", libro.getAutor());
                consulta.put("editorial", libro.getEditorial());
                consulta.put("año", libro.getAnho());
                consulta.put("paginas", libro.getPaginas());
                consulta.put("ISBN", libro.getIsbn());

                libros.insert(consulta);
                msj.MensajeExitoso("Libro registrado exitosamente", "Registro de Libro");
            } else {
                msj.MensajeError("Los datos del libro estan incompletos", "Registro de Libro");
            }
        } catch (Exception e) {
            msj.MensajeError("Error al registrar el nuevo libro \n" + e.getMessage(), "Registro de Libro");
        }
    }

    @Override
    public void actualizarLibro(Libro libro) {
        try {
            if (libro != null) {
                DB db = this.Conexion().getDB("biblioteca");
                DBCollection libros = db.getCollection("libros");

                BasicDBObject encontrar = new BasicDBObject("identificador", libro.getIdentificador());
                DBObject libroEncontrado = libros.findOne(encontrar);
                if (libroEncontrado != null) {
                    BasicDBObject consulta = new BasicDBObject();
                    consulta.put("identificador", libro.getIdentificador());
                    consulta.put("titulo", libro.getTitulo());
                    consulta.put("autor", libro.getAutor());
                    consulta.put("editorial", libro.getEditorial());
                    consulta.put("año", libro.getAnho());
                    consulta.put("paginas", libro.getPaginas());
                    consulta.put("ISBN", libro.getIsbn());

                    libros.update(consulta, libroEncontrado);
                    msj.MensajeExitoso("El libro con el identificador " + libro.getIdentificador() + " fue actualizado con éxito", "Actualizar Libro");
                } else {
                    msj.MensajeError("El libro con el identificador " + libro.getIdentificador() + " no fue encontrado", "Actualizar Libro");
                }
            }
        } catch (Exception e) {
            msj.MensajeError("Error al actualizar los datos del libro \n" + e.getMessage(), "Actualizar Libro");
        }
    }

    @Override
    public void eliminarLibro(String identificador) {
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection libros = db.getCollection("libros");

            BasicDBObject encontrar = new BasicDBObject("identificador", identificador);
            DBObject libroEncontrado = libros.findOne(encontrar);
            if (libroEncontrado != null) {
                libros.remove(libroEncontrado);
                msj.MensajeExitoso("El libro con el identificador " + identificador + " fue eliminado con exito", "Eliminar Libro");
            } else {
                msj.MensajeError("No se encontró ningún libro con el identificador " + identificador, "Eliminar Libro");
            }
        } catch (Exception e) {
            msj.MensajeError("Error al intentar eliminar el libro \n" + e.getMessage(), "Eliminar Libro");
        }
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
                libro.setIdentificador((String) libroDBObject.get("identificador"));
                libro.setTitulo((String) libroDBObject.get("titulo"));
                libro.setEditorial((String) libroDBObject.get("editorial"));
                libro.setPaginas((String) libroDBObject.get("paginas"));
                libros.add(libro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return libros;
    }

}
