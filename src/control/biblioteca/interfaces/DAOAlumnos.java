/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.biblioteca.interfaces;

import control.biblioteca.model.Alumno;
import java.util.List;

/**
 *
 * @author Antonio
 */
public interface DAOAlumnos {
    List<Alumno> obtenerAlumnos ();
    Alumno buscarAlumnoPorNumeroControl(String numControl);
}