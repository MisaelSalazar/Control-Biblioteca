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
import control.biblioteca.interfaces.DAOPrestamos;
import control.biblioteca.model.Prestamo;
import control.biblioteca.model.conexion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author pepe_
 */
public class DAOPrestamoImpl extends conexion implements DAOPrestamos {

    private Mensajes msj = new Mensajes();

    @Override
    public boolean nuevoPrestamo(Prestamo prestamo) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            // Preparar consulta
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("alumno_id", prestamo.getAlumno_id());
            consulta.put("libro_id", prestamo.getLibro_id());
            consulta.put("fecha_prestamo", prestamo.getFecha_prestamo());
            consulta.put("fecha_devolucion", prestamo.getFecha_devolucion());

            // Ejecutar consulta (insercion)
            prestamos.insert(consulta);

            //msj.MensajeExitoso("Prestamo Concedido al Alumno con el ID \n" + prestamo.getAlumno_id(), "Préstamo de Libro");
            return true;
        } catch (Exception e) {
            msj.MensajeError("Error al Realizar el Prestamo del Libro", "Préstamo de Libro");
            return false;
        }
    }

    @Override
    public void modificarPrestamo(Prestamo prestamo) {
        // Pendiente
    }

    @Override
    public boolean eliminarPrestamo(ObjectId id) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            // Preparar consulta
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("_id", id);

            // Eliminar el documento con el id obtenido
            WriteResult resultado = prestamos.remove(consulta);

            // Verificamos si se eliminó correctamente
            if (resultado.getN() > 0) {
                msj.MensajeExitoso("El préstamo se eliminó correctamente.", "Eliminar Préstamo");
                return true;
            } else {
                msj.MensajeError("No se encontró ningún préstamo con el ID proporcionado.", "Eliminar Préstamo");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al eliminar el préstamo: " + e, "Eliminar Préstamo");
            return false;
        }
    }

    @Override
    public List<Prestamo> obtenerPrestamos() {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");
            
            // Obtener todos los prestamos
            DBCursor cursor = prestamos.find();
            // Creamos una lista para los prestamos
            List<Prestamo> listaPrestamos = new ArrayList<>();

            // Mientras existan documentos que leer...
            while (cursor.hasNext()) {
                // Almacena un documento
                DBObject prestamoDBObject = cursor.next();
                // Obtiene el id de ese documento
                ObjectId id = (ObjectId) prestamoDBObject.get("_id");
                //Instancia prestamo con los datos obtenidos.
                Prestamo prestamo = new Prestamo(
                        id,
                        (ObjectId) prestamoDBObject.get("alumno_id"),
                        (ObjectId) prestamoDBObject.get("libro_id"),
                        (Date) prestamoDBObject.get("fecha_prestamo"),
                        (Date) prestamoDBObject.get("fecha_devolucion")
                );

                // Se agrega a la lista de prestamos
                listaPrestamos.add(prestamo);
            }
            
            // Devuelve una lista con los prestamos
            return listaPrestamos;
        } catch (Exception e) {
            msj.MensajeError("Error al obtener los préstamos: " + e, "Préstamos");
            return null;
        }
    }

    @Override
    public boolean realizarDevolucion(ObjectId alumno_id, ObjectId libro_id) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            // Imprimir IDs para depuración
            System.out.println("Alumno ID: " + alumno_id);
            System.out.println("Libro ID: " + libro_id);

            // Preparar consulta para buscar el préstamo
            BasicDBObject consultaBuscar = new BasicDBObject();
            consultaBuscar.put("alumno_id", alumno_id);
            consultaBuscar.put("libro_id", libro_id);

            // Realizar la búsqueda del préstamo
            DBCursor cursor = prestamos.find(consultaBuscar);
            if (cursor.hasNext()) {
                // Objecto para almacenar el documento de prestamo
                DBObject prestamoDBObject = cursor.next();
                // Almacenar id del prestamo
                ObjectId id = (ObjectId) prestamoDBObject.get("_id");

                // Consulta para actualizar la fecha de devolución
                BasicDBObject consultaActualizar = new BasicDBObject();
                consultaActualizar.put("$set", new BasicDBObject("fecha_devolucion", new Date()));

                // Preparar la consulta para actualizar el préstamo
                BasicDBObject consulta = new BasicDBObject("_id", id);
                WriteResult resultado = prestamos.update(consulta, consultaActualizar);

                // Verificar si se actualizó correctamente
                if (resultado.getN() > 0) {
                    msj.MensajeExitoso("Devolución realizada con éxito", "Devolución de Libro");
                    return true;
                } else {
                    msj.MensajeError("Error al actualizar el préstamo", "Devolución de Libro");
                    return false;
                }
            } else {
                msj.MensajeError("No se encontró un préstamo para el alumno y libro especificados", "Devolución de Libro");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al realizar la devolución: " + e.getMessage(), "Devolución de Libro");
            return false;
        }
    }

}
