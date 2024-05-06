/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.biblioteca.model;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author patinho
 */
public class Prestamo {

    private ObjectId id;
    private ObjectId alumno_id;
    private ObjectId libro_id;
    private Date fecha_prestamo;
    private Date fecha_devolucion;

    public Prestamo(ObjectId id, ObjectId alumno_id, ObjectId libro_id, Date fecha_prestamo, Date fecha_devolucion) {
        this.id = id;
        this.alumno_id = alumno_id;
        this.libro_id = libro_id;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(ObjectId alumno_id) {
        this.alumno_id = alumno_id;
    }

    public ObjectId getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(ObjectId libro_id) {
        this.libro_id = libro_id;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }
}
