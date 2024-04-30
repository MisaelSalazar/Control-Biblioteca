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
        List<Alumno> listaAlumnos = new ArrayList<>();

        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection alumnos = db.getCollection("alumnos");

            DBCursor cursor = alumnos.find();

            while (cursor.hasNext()) {
                DBObject alumnoDBObject = cursor.next();
                ObjectId id = (ObjectId) alumnoDBObject.get("_id");
                String noCtrl = (String) alumnoDBObject.get("noCtrl");
                String nombre = (String) alumnoDBObject.get("nombre");
                String apellidos = (String) alumnoDBObject.get("apellidos");
                String carrera = (String) alumnoDBObject.get("carrera");
                String semestre = (String) alumnoDBObject.get("semestre");

                Alumno alumno = new Alumno(id, noCtrl, nombre, apellidos, carrera, semestre);
                listaAlumnos.add(alumno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaAlumnos;
    }

    @Override
    public Alumno buscarAlumnoPorNumeroControl(String numControl) {
        try {
            DB db = this.Conexion().getDB("biblioteca");
            DBCollection alumnos = db.getCollection("alumnos");

            BasicDBObject encontrar = new BasicDBObject("noCtrl", numControl);
            DBObject alumnoEncontrado = alumnos.findOne(encontrar);

            if (alumnoEncontrado != null) {
                Alumno alumno = new Alumno(
                        (ObjectId) alumnoEncontrado.get("_id"),
                        alumnoEncontrado.get("noCtrl").toString(),
                        alumnoEncontrado.get("nombre").toString(),
                        alumnoEncontrado.get("apellidos").toString(),
                        alumnoEncontrado.get("semestre").toString(),
                        alumnoEncontrado.get("carrera").toString()
                );
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

}
