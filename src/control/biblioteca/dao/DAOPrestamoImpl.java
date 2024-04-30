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
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            BasicDBObject consulta = new BasicDBObject();
            consulta.put("alumno_id", prestamo.getAlumno_id());
            consulta.put("libro_id", prestamo.getLibro_id());
            consulta.put("fecha_prestamo", prestamo.getFecha_prestamo());
            consulta.put("fecha_devolucion", prestamo.getFecha_devolucion());

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

    }

    @Override
    public boolean eliminarPrestamo(ObjectId id) {
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            BasicDBObject query = new BasicDBObject();
            query.put("_id", id);

            prestamos.remove(query);

            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar el préstamo: " + e);
            return false;
        }
    }

    @Override
    public List<Prestamo> obtenerPrestamos() {
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            DBCursor cursor = prestamos.find();
            List<Prestamo> listaPrestamos = new ArrayList<>();

            while (cursor.hasNext()) {
                DBObject prestamoDBObject = cursor.next();
                ObjectId id = (ObjectId) prestamoDBObject.get("_id");
                Prestamo prestamo = new Prestamo(
                        id,
                        prestamoDBObject.get("alumno_id").toString(),
                        prestamoDBObject.get("libro_id").toString(),
                        (Date) prestamoDBObject.get("fecha_prestamo"),
                        (Date) prestamoDBObject.get("fecha_devolucion")
                );

                listaPrestamos.add(prestamo);
            }

            return listaPrestamos;
        } catch (Exception e) {
            System.out.println("Error al obtener los préstamos: " + e);
            return null;
        }
    }

    @Override
    public boolean realizarDevolucion(ObjectId alumno_id, ObjectId libro_id) {
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            // Imprimir IDs para depuración
            System.out.println("Alumno ID: " + alumno_id);
            System.out.println("Libro ID: " + libro_id);

            // Construir la consulta para buscar el préstamo
            BasicDBObject query = new BasicDBObject();
            query.put("alumno_id", alumno_id.toString());
            query.put("libro_id", libro_id.toString());

            // Realizar la búsqueda del préstamo
            DBCursor cursor = prestamos.find(query);
            if (cursor.hasNext()) {
                DBObject prestamoDBObject = cursor.next();
                ObjectId id = (ObjectId) prestamoDBObject.get("_id");

                // Actualizar la fecha de devolución
                BasicDBObject updateQuery = new BasicDBObject();
                updateQuery.put("$set", new BasicDBObject("fecha_devolucion", new Date()));

                // Construir la consulta para actualizar el préstamo
                BasicDBObject searchQuery = new BasicDBObject("_id", id);
                prestamos.update(searchQuery, updateQuery);

                msj.MensajeExitoso("Devolución realizada con éxito", "Devolución de Libro");
                return true;
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
