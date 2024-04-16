/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.biblioteca.controlador;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class Mensajes {
    
    public void MensajeExitoso(String mensaje, String titulo){
        Icon icono = new ImageIcon(getClass().getResource("../img/comprobado.png"));
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, icono);
    }
    
    public void MensajeError(String mensaje, String titulo){
        Icon icono = new ImageIcon(getClass().getResource("../img/error.png"));
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, icono);
    }
    
}
