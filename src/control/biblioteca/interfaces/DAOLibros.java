/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control.biblioteca.interfaces;

import control.biblioteca.model.Libro;
import java.util.List;

/**
 *
 * @author patinho
 */
public interface DAOLibros {
    void registrarLibro(Libro libro);
    void actualizarLibro(Libro libro);
    void eliminarLibro(String identificador);
    List<Libro> obtenerLibros();
    Libro buscarLibroPorIdentificador(String identificador);
}
