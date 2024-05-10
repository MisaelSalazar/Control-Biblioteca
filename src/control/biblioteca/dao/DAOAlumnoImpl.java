/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.biblioteca.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import control.biblioteca.controlador.Mensajes;
import control.biblioteca.interfaces.DAOAlumnos;
import control.biblioteca.model.Alumno;
import control.biblioteca.model.conexion;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Antonio
 */
public class DAOAlumnoImpl extends conexion implements DAOAlumnos {

    private Mensajes msj = new Mensajes();

    @Override
    public List<Alumno> obtenerAlumnos() {
        // Crear lista para los alumnos
        List<Alumno> listaAlumnos = new ArrayList<>();

        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection alumnos = db.getCollection("alumnos");

            // Obtener todos los documentos de ALUMNOS
            DBCursor cursor = alumnos.find();

            // Mientras existan documentos por leer...
            while (cursor.hasNext()) {
                // Objeto para obtener un documento
                DBObject alumnoDBObject = cursor.next();
                // Obtener los datos del alumno
                ObjectId id = (ObjectId) alumnoDBObject.get("_id");
                String noCtrl = (String) alumnoDBObject.get("noCtrl");
                String nombre = (String) alumnoDBObject.get("nombre");
                String apellidos = (String) alumnoDBObject.get("apellidos");
                String carrera = (String) alumnoDBObject.get("carrera");
                String semestre = (String) alumnoDBObject.get("semestre");

                // Crear una instancia del alumno
                Alumno alumno = new Alumno(id, noCtrl, nombre, apellidos, carrera, semestre);
                // Almacenarla en la lista de alumnos 
                listaAlumnos.add(alumno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Devuelve la lista con los alumnos
        return listaAlumnos;
    }

    @Override
    public Alumno buscarAlumnoPorNumeroControl(String numControl) {
        try {
            // Conectarse a la BD
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection alumnos = db.getCollection("alumnos");

            // Preparar consulta para encontrar el alumno por su Numero de Control
            BasicDBObject encontrar = new BasicDBObject("noCtrl", numControl);
            DBObject alumnoEncontrado = alumnos.findOne(encontrar);

            // Si encuentra un alumno entonces...
            if (alumnoEncontrado != null) {
                // Instancia un nuevo alumno con los datos
                Alumno alumno = new Alumno(
                        (ObjectId) alumnoEncontrado.get("_id"),
                        alumnoEncontrado.get("noCtrl").toString(),
                        alumnoEncontrado.get("nombre").toString(),
                        alumnoEncontrado.get("apellidos").toString(),
                        alumnoEncontrado.get("semestre").toString(),
                        alumnoEncontrado.get("carrera").toString()
                );
                // Devuelve el alumno encontrado
                return alumno;
            } else {
                msj.MensajeError("No se encontró al alumno con el número de control:\n " + numControl, "Buscar Alumno");
                return null;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al buscar al alumno con el número de control:\n " + numControl + "\n" + e.getMessage(), "Buscar Alumno");
            return null;
        }
    }

    @Override
    public boolean insertarAlumno(Alumno alumno) {
        try {
            // Si alumno es diferente de nulo o vacio entonces...
            if (alumno != null) {
                // Conectarse a la BD
                DB db = this.Conexion().getDB("biblioteca");
                DBCollection alumnos = db.getCollection("alumnos");

                // Preparar consulta
                BasicDBObject consulta = new BasicDBObject();
                consulta.put("noCtrl", alumno.getNumControl());
                consulta.put("nombre", alumno.getNombre());
                consulta.put("apellidos", alumno.getApellidos());
                consulta.put("carrera", alumno.getCarrera());
                consulta.put("semestre", alumno.getSemestre());

                // Insertamos el alumno
                alumnos.insert(consulta);
                // Retornamos TRUE
                return true;
            } else {
                msj.MensajeError("Los datos del alumno estan incompletos", "Registro de Alumno");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al insertar el Alumno", "Registro de Alumno");
            return false;
        }
    }

    @Override
    public void actualizarAlumno(Alumno alumno) {
        try {
            // Si alumno es diferente de nulo entonces...
            if (alumno != null) {
                // Nos conectamos a la BD
                DB db = this.Conexion().getDB("biblioteca");
                DBCollection alumnos = db.getCollection("alumnos");

                // Preparar consulta para encontrar al alumno.
                BasicDBObject encontrar = new BasicDBObject("_id", alumno.getId());
                // Almacenamos al alumno encontrado
                DBObject alumnoEncotrado = alumnos.findOne(encontrar);
                // Si se encontró un alumno entonces...
                if (alumnoEncotrado != null) {
                    // Prepararmos la consulta
                    BasicDBObject consulta = new BasicDBObject();
                    consulta.put("noCtrl", alumno.getNumControl());
                    consulta.put("nombre", alumno.getNombre());
                    consulta.put("apellidos", alumno.getApellidos());
                    consulta.put("carrera", alumno.getCarrera());
                    consulta.put("semestre", alumno.getSemestre());

                    // Actualizamos los datos del alumno encontrado
                    WriteResult resultado = alumnos.update(alumnoEncotrado, consulta);
                    
                    if (resultado.getN() > 0) {
                        msj.MensajeExitoso("El alumno fue actualizado con éxito", "Actualizar Alumno");
                    } else {
                        msj.MensajeError("No se realizó la actualización de datos del alumno", "Actualizar Alumno");
                    }
                } else {
                    msj.MensajeError("El alumno no fue encontrado", "Actualizar Alumno");
                }
            }
        } catch (Exception e) {
            msj.MensajeError("Error al actualizar los datos del alumno", "Actualizar Alumno");
        }
    }

    @Override
    public boolean eliminarAlumno(ObjectId id) {
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection alumnos = db.getCollection("alumnos");

            BasicDBObject encontrar = new BasicDBObject("_id", id);
            DBObject alumnoEncontrado = alumnos.findOne(encontrar);
            if (alumnoEncontrado != null) {
                boolean eliminar = msj.MensajeConfirmar("¿Estás seguro que deseas eliminar a este alumno?, \n"
                        + "esta acción es irreversible.", "Eliminar Alumno");
                if (eliminar) {
                    alumnos.remove(alumnoEncontrado);
                    msj.MensajeExitoso("Alumno elimiinado exitosamente.", "Eliminar Alumno");
                    return true;
                } else {
                    msj.MensajeError("Acción cancelada, el alumno no se eliminó", "Eliminar Alumno");
                    return false;
                }
            } else {
                msj.MensajeError("El alumno no se ha encontrado", "Eliminar Alumno");
                return false;
            }
        } catch (Exception e) {
            msj.MensajeError("Error al intentar elimimar el alumno.", "Eliminar Alumno");
            return false;
        }
    }

}
