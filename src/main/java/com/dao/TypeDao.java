package com.dao;

import com.connection1.Connection1;
import com.models.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase realizaremos los elementos CRUD que necesitaremos para el
 * proyecto
 *
 * @author Anthony Mejía
 * @version 03/03/2019/A
 */
public class TypeDao {

    /**
     * En el Metodo add podremos insertar nuevas registros en este caso tipos de
     * zapato
     */
    public static boolean add(Type type) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar, nuestra variable de conexion,
         * nuestra sentencia sql y nuestra sentencia
         */
        Connection con;
        PreparedStatement ps;
        String sql = "insert into type values (null, ?)";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, type.getType_shoe());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e);
            return false;
        }
    }

    /**
     * En el Metodo getAll realizamos un select que muestra todos los elementos
     * de la tabla
     */
    public static List<Type> getAll() throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Type> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from type order by id";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Type(
                        rs.getInt("id"),
                        rs.getString("type_shoe")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }

     /**
     * El Metodo getById nos sirve para tomar un id en especifico que
     * necesitemos
     */
    public static Type getById(int id) throws SQLException, ClassNotFoundException {
        Type type;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from type where id = ?";
        ResultSet rs;

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            type = new Type(rs.getInt("id"), rs.getString("type_shoe")
            );
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            type = null;
        }
        return type;
    }

    /**
     * El Metodo update nos ayuda a actualizar los campos de algun Tipo de
     * Calzado
     */
    public static boolean update(Type type) throws SQLException, ClassNotFoundException {
        Connection con;
        PreparedStatement ps;
        String sql = "update type set type_shoe = ? where id = ?";
        int rowAffected;

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, type.getType_shoe());
            ps.setInt(2, type.getId());
            rowAffected = ps.executeUpdate();//filas afectadas
            ps.close();
            con.close();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            return false;
        }
    }
}
