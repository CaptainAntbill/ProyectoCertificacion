package com.dao;

import com.connection1.Connection1;
import com.models.Brand;
import com.models.Model;
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
public class ModelDao {

    /**
     * En el Metodo add podremos insertar nuevas registros en este caso modelos
     * de zapato
     */
    public static boolean add(Model model) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar, nuestra variable de conexion,
         * nuestra sentencia sql y nuestra sentencia
         */
        Connection con;
        PreparedStatement ps;
        String sql = "insert into model values (null, ?, ?, ?, ?, ?)";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, model.getName_model());
            ps.setString(2, model.getPrice());
            ps.setString(3, model.getUnits());
            ps.setInt(4, model.getType_id());
            ps.setInt(5, model.getBrand_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            return false;
        }
    }

    /**
     * En el Metodo getAll realizamos un select que muestra todos los elementos
     * de la tabla
     */
    public static List<Model> getAll() throws ClassNotFoundException, SQLException {
        List<Model> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select model.id, model.name_model, model.price, model.units, brand.name_brand, type.type_shoe  from model, brand, type where model.brand_id = brand.id and model.type_id = type.id order by id;";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Model(
                        rs.getInt("model.id"),
                        rs.getString("model.name_model"),
                        rs.getString("model.price"),
                        rs.getString("model.units"),
                        rs.getString("brand.name_brand"),
                        rs.getString("type.type_shoe")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }

    /**
     * Metodo update nos ayudara a actualizar los campos de mercaderia que sean
     * necesarios modificar
     */
    public static boolean update(Model model) throws SQLException, ClassNotFoundException {
        /**
         * Creamos nuestras variables, nuestro objeto conexion, sentencia y un
         * int rowAffected
         */
        Connection con;
        PreparedStatement ps;
        String sql = "update model set name_model = ?, price = ?, units = ? where id = ?";
        int rowAffected;

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, model.getName_model());
            ps.setString(2, model.getPrice());
            ps.setString(3, model.getUnits());
            ps.setInt(4, model.getId());
            rowAffected = ps.executeUpdate();//filas afectadas
            ps.close();
            con.close();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            return false;
        }
    }

    /**
     * De nuevo el metodo getById para poder tomar un id seleccionado
     */
    public static Model getById(int id) throws SQLException, ClassNotFoundException {
        /**
         * Creamos las variables, un objeto modelo, nuestra conexion y las
         * sentencias
         */
        Model model;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from model where id = ?";
        ResultSet rs;

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            model = new Model(rs.getInt("id"), rs.getString("name_model"), rs.getString("price"), rs.getString("units")
            );
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            model = null;
        }
        return model;
    }

    /**
     * Este metodo nos sirve para realizar un filtrado por marcas de mercaderias
     */
    public static List<Model> getFiltrer(String id) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Model> listf = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select model.id idModel, model.name_model, brand.name_brand, brand.id from model, brand where model.brand_id = brand.id and brand.id = ?";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                listf.add(
                        new Model(
                                rs.getInt("idModel"),
                                rs.getString("name_model"),
                                new Brand(rs.getInt("id"),
                                        rs.getString("name_brand")
                                )));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            listf.clear();
        }
        return listf;
    }

    /**
     * Este metodo nos sirve para realizar otro filtrado pero este lo hace por
     * medio de tipos
     */
    public static List<Model> getFiltrerType(String id) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Model> listt = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select model.id idModel, model.name_model, type.type_shoe, type.id from model, type where model.type_id = type.id and type.id = ?";

        try {
            con = Connection1.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                listt.add(
                        new Model(
                                rs.getInt("idModel"),
                                rs.getString("name_model"),
                                new Type(rs.getInt("id"),
                                        rs.getString("type_shoe")
                                )));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            listt.clear();
        }
        return listt;
    }
}
