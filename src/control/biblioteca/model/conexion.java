/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control.biblioteca.model;

import com.mongodb.MongoClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patinho
 */
public class conexion {

    private static final Logger mongoLogger = Logger.getLogger("org.mongodb.driver");

    static {
        // Desactivar los mensajes de MongoDB
        mongoLogger.setLevel(Level.WARNING);
    }

    public MongoClient mongo = null;

    public MongoClient Conexion() {
        try {
            mongo = new MongoClient("localhost", 27017);
            if (mongo != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error en la conexion:" + e);
        }
        return mongo;
    }//Fin metod conexion
}
