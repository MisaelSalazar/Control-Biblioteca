/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control.biblioteca;

import control.biblioteca.views.login;

/**
 *
 * @author Misae
 */
public class ControlBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear objeto ventana login
        login objLogin = new login();
        //Centrar ventana en la pantalla
        objLogin.setLocationRelativeTo(null);
        //Hacer visible la ventana
        objLogin.setVisible(true);
    }
    
}
