/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control.biblioteca.interfaces;

import control.biblioteca.model.Prestamo;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author patinho
 */
public interface DAOPrestamos {
    boolean nuevoPrestamo(Prestamo prestamo);
    void modificarPrestamo(Prestamo prestamo);
    boolean eliminarPrestamo(ObjectId id);
    List<Prestamo> obtenerPrestamos();
    boolean realizarDevolucion(ObjectId alumno_id, ObjectId libro_id);
}
