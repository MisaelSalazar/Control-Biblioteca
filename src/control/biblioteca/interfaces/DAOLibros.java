/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control.biblioteca.interfaces;

import control.biblioteca.model.Libro;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author patinho
 */
public interface DAOLibros {
    boolean registrarLibro(Libro libro);
    boolean actualizarLibro(Libro libro);
    boolean eliminarLibro(ObjectId id);
    List<Libro> obtenerLibros();
    Libro buscarLibroPorIdentificador(String identificador);
}
