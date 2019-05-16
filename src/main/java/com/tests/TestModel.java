package com.tests;

import com.dao.ModelDao;
import com.models.Model;
import java.sql.SQLException;
import java.util.List;

/**
 * En esta clase realizamos las pruebas de nuestros metodos Dao de Model
 *
 * @author Anthony Mejía
 * @version 03/03/2019/A
 */
public class TestModel {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*boolean inserted = ModelDao.add(
                new Model("Zoom X", "380", "12", 1, 1));
        System.out.println(inserted);*/

        List<Model> list = com.dao.ModelDao.getAll();
        for (Model e : list) {
            System.out.println(e.getId()
                    + e.getName_model()
                    + e.getPrice()
                    + e.getUnits()
                    + e.getBranShoe()
                    + e.getTypeShoe());
        }

    }
}
