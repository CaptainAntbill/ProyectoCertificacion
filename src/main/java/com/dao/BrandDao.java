package com.dao;

import com.connection1.Connection1;
import com.models.Brand;
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
public class BrandDao {

    /**
     * En el Metodo add podremos insertar nuevas registros en este caso marcas
     */
    public static boolean add(Brand brand) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar, nuestra variable de conexion,
         * nuestra sentencia sql y nuestra sentencia
         */
        Connection con;
        PreparedStatement ps;
        String sql = "insert into brand values (null, ?)";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, brand.getName_brand());
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
    public static List<Brand> getAll() throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Brand> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from brand order by id";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Brand(
                        rs.getInt("id"),
                        rs.getString("name_brand")
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
    public static Brand getById(int id) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de las variables que necesitaremos
         */
        Brand bra;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from brand where id = ?";
        ResultSet rs;

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            bra = new Brand(rs.getInt("id"), rs.getString("name_brand")
            );
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            bra = null;
        }
        return bra;
    }

    /**
     * El Metodo update nos ayuda a actualizar los campos de alguna Marca
     */
    public static boolean update(Brand brand) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de nuestras varialbes
         */
        Connection con;
        PreparedStatement ps;
        String sql = " update brand set name_brand =? where id=?";
        int rowAffected;

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, brand.getName_brand());
            ps.setInt(2, brand.getId());
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
