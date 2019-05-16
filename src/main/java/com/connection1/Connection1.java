package com.connection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase define el metodo Conexion con la Base de Datos
 * @author Anthony Mejía
 * @version 02/03/2019/A
 */
public class Connection1 {

    /**
     * Las variables que necesitaremos para la creacion de los metodos
     */
    private static Connection con;
    private static String stringConnection;
    private static boolean conected = false;

    /**
     * Metodo que nos sirve para realizar la conexion con la Base de Datos
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        stringConnection = "jdbc:mysql://localhost:3306/merchandise?useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(stringConnection, "root", "1234");
            conected = true;
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en la Conexion: " + ex.getMessage());
            return null;
        }
    }

    /**
     * Metodo con el cual cerramos la conexion de la Base de Datos
     */
    public static void close() throws SQLException {
        if (conected) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("No se pudo Cerrar: " + ex);
            }
        }
    }
}
