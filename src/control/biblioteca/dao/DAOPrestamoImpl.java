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
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Patinho
 */
public class DAOPrestamoImpl extends conexion implements DAOPrestamos {

    private Mensajes msj = new Mensajes();

    @Override
    public boolean nuevoPrestamo(Prestamo prestamo) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            // Verificar si el libro ya está prestado (fecha_devolucion es null)
            BasicDBObject consultaBuscarLibro = new BasicDBObject();
            consultaBuscarLibro.put("libro_id", prestamo.getLibro_id());
            consultaBuscarLibro.put("fecha_devolucion", null);

            DBObject libroPrestado = prestamos.findOne(consultaBuscarLibro);
            if (libroPrestado != null) {
                msj.MensajeError("El libro ya está prestado", "Préstamo de Libro");
                return false;
            }

            // Verificar la cantidad de préstamos activos del alumno (sin fecha_devolucion)
            BasicDBObject consultaCantidadPrestamos = new BasicDBObject();
            consultaCantidadPrestamos.put("alumno_id", prestamo.getAlumno_id());
            consultaCantidadPrestamos.put("fecha_devolucion", null); // Sin fecha de devolución
            // COUNT devuelve el valor en tipo LONG
            long prestamosActivos = prestamos.count(consultaCantidadPrestamos);
            // int prestamosActivos = (int) prestamosActivosLong;

            // Si ya tiene 3 o más préstamos activos, no se permitirá otro préstamo
            if (prestamosActivos >= 3) {
                msj.MensajeError("El alumno ya tiene 3 préstamos activos. \nDebe devolver al menos un libro antes de solicitar otro.", "Préstamo de Libro");
                return false;
            }

            // Preparar consulta para insertar nuevo préstamo
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("alumno_id", prestamo.getAlumno_id());
            consulta.put("libro_id", prestamo.getLibro_id());
            consulta.put("fecha_prestamo", prestamo.getFecha_prestamo());
            consulta.put("fecha_devolucion", null); // Asegurarse de que sea null al momento del préstamo

            // Ejecutar consulta (inserción)
            prestamos.insert(consulta);

            //msj.MensajeExitoso("Préstamo Concedido al Alumno con el ID \n" + prestamo.getAlumno_id(), "Préstamo de Libro");
            return true;
        } catch (Exception e) {
            msj.MensajeError("Error al Realizar el Préstamo del Libro: " + e.getMessage(), "Préstamo de Libro");
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

            // Obtener el préstamo activo
            DBObject prestamoDBObject = obtenerPrestamoActivo(alumno_id, libro_id, prestamos);
            if (prestamoDBObject != null) {
                // Calcular el costo de retraso
                double costoRetraso = calcularCostoRetraso(prestamoDBObject);

                // Actualizar el préstamo en la base de datos
                boolean actualizado = actualizarPrestamoConDevolucion(prestamoDBObject, costoRetraso, prestamos);

                if (actualizado) {
                    msj.MensajeExitoso("Devolución realizada con éxito. El costo por retraso es de " + costoRetraso + " pesos.", "Devolución de Libro");
                    return true;
                } else {
                    msj.MensajeError("Error al actualizar el préstamo", "Devolución de Libro");
                    return false;
                }
            } else {
                msj.MensajeError("No se encontró un préstamo activo para el alumno y libro especificados", "Devolución de Libro");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al realizar la devolución: " + e.getMessage(), "Devolución de Libro");
            return false;
        }
    }

    @Override
    public List<Prestamo> obtenerPrestamosActivosPorAlumno(ObjectId alumno_id) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection prestamos = db.getCollection("prestamos");

            // Preparar consulta para buscar los préstamos activos del alumno
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("alumno_id", alumno_id);
            // Solo los préstamos sin fecha de devolución
            consulta.put("fecha_devolucion", null);

            // Realizar la búsqueda de préstamos activos del alumno
            DBCursor cursor = prestamos.find(consulta);

            // Convertir los resultados a una lista de Prestamo
            List<Prestamo> prestamosActivos = new ArrayList<>();
            while (cursor.hasNext()) {
                DBObject prestamoDBObject = cursor.next();
                ObjectId id = (ObjectId) prestamoDBObject.get("_id");
                Prestamo prestamo = new Prestamo(
                        id,
                        (ObjectId) prestamoDBObject.get("alumno_id"),
                        (ObjectId) prestamoDBObject.get("libro_id"),
                        (Date) prestamoDBObject.get("fecha_prestamo"),
                        (Date) prestamoDBObject.get("fecha_devolucion")
                );
                prestamosActivos.add(prestamo);
            }
            // Devolver la lista con los prestamos activos.
            return prestamosActivos;
        } catch (Exception e) {
            msj.MensajeError("Error al obtener los préstamos activos del alumno: " + e.getMessage(), "Consulta de Préstamos Activos");
            return null;
        }
    }

    @Override
    public void obtenerPrestamosActivosPorNumControl(String numeroControl, JTable tabla) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            // Obtiene las colecciones -- prestamos, alumnos y libros --
            DBCollection prestamosCollection = db.getCollection("prestamos");
            DBCollection alumnosCollection = db.getCollection("alumnos");
            DBCollection librosCollection = db.getCollection("libros");

            // Preparar consulta para buscar los préstamos activos del alumno usando el número de control
            BasicDBObject consultaAlumno = new BasicDBObject("noCtrl", numeroControl);
            // Almacenar el documento en "alumno"
            DBObject alumno = alumnosCollection.findOne(consultaAlumno);

            if (alumno != null) {
                // Obtenemos el modelo de la tabla
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                // Limpiar la tabla antes de agregar nuevos datos
                modelo.setRowCount(0);

                // Consultar los préstamos activos del alumno
                BasicDBObject consultaPrestamos = new BasicDBObject("alumno_id", alumno.get("_id"));
                // Solo los que tengan la fecha de devolucion en "null"
                consultaPrestamos.put("fecha_devolucion", null);
                DBCursor cursorPrestamos = prestamosCollection.find(consultaPrestamos);

                // Mientras que cursor tenga documentos que leer sigue en el ciclo
                while (cursorPrestamos.hasNext()) {
                    // Lee un documento y se almacena en prestamo en cada iteracion
                    DBObject prestamo = cursorPrestamos.next();
                    // Obtiene el id del libro de la coleccion prestamos
                    String idLibro = ((ObjectId) prestamo.get("libro_id")).toString();

                    // Crea una consulta para buscar el libro por el ID obtenido de la coleccion prestamos
                    BasicDBObject consultaLibro = new BasicDBObject("_id", new ObjectId(idLibro));
                    // Se realiza la consulta a la colección libros para encontrar los datos del libro relacionado al prestamo
                    DBObject libro = librosCollection.findOne(consultaLibro);
                    // Damos formato a la fecha de prestamo y devolucion
                    Date fechaPrestamo = (Date) prestamo.get("fecha_prestamo");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaPrestFormat = dateFormat.format(fechaPrestamo);
                    // Calcular el costo por retraso
                    double costoRetraso = calcularCostoRetraso(prestamo);

                    // Añadimos los datos a la tabla
                    modelo.addRow(new Object[]{
                        alumno.get("noCtrl"),
                        alumno.get("nombre") + " " + alumno.get("apellidos"),
                        libro.get("titulo"),
                        libro.get("identificador"),
                        fechaPrestFormat,
                        costoRetraso
                    });
                }
            } else {
                msj.MensajeError("No se encontró al alumno con el número de control: " + numeroControl, "Alumno no encontrado");
            }
        } catch (Exception e) {
            msj.MensajeError("Error al obtener los préstamos activos del alumno: " + e.getMessage(), "Error");
        }
    }

    private DBObject obtenerPrestamoActivo(ObjectId alumno_id, ObjectId libro_id, DBCollection prestamos) {
        BasicDBObject consultaBuscar = new BasicDBObject();
        consultaBuscar.put("alumno_id", alumno_id);
        consultaBuscar.put("libro_id", libro_id);
        consultaBuscar.put("fecha_devolucion", null);

        return prestamos.findOne(consultaBuscar);
    }

    private double calcularCostoRetraso(DBObject prestamoDBObject) {
        Date fechaPrestamo = (Date) prestamoDBObject.get("fecha_prestamo");

        // Calcular fecha límite (3 días después del préstamo)
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaPrestamo);
        cal.add(Calendar.DAY_OF_MONTH, 3);
        Date fechaLimite = cal.getTime();

        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Calcular días de retraso
        long diasRetraso = TimeUnit.DAYS.convert(fechaActual.getTime() - fechaLimite.getTime(), TimeUnit.MILLISECONDS);

        // Calcular costo de retraso
        if (fechaActual.after(fechaLimite)) {
             // 5 pesos por día de retraso
            return diasRetraso * 5;
        }
        return 0;
    }

    private boolean actualizarPrestamoConDevolucion(DBObject prestamoDBObject, double costoRetraso, DBCollection prestamos) {
        // Nueva fecha (actual) para la devolucion
        Date fechaActual = new Date();
        // Preparamos la consulta para actualizar el Prestamo (devolverlo)
        BasicDBObject consultaActualizar = new BasicDBObject();
        consultaActualizar.put("$set", new BasicDBObject("fecha_devolucion", fechaActual)
                .append("costo_retraso", costoRetraso));

        BasicDBObject consulta = new BasicDBObject("_id", prestamoDBObject.get("_id"));
        WriteResult resultado = prestamos.update(consulta, consultaActualizar);
        // Devolvemos un valor V/F en base a la consulta hecha en la bd 
        return resultado.getN() > 0;
    }

}
