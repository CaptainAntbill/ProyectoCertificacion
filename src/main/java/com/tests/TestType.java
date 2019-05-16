package com.tests;

import com.dao.TypeDao;
import com.models.Type;
import java.sql.SQLException;
import java.util.List;

/**
 * En esta clase realizamos las pruebas de nuestros metodos Dao de Type
 *
 * @author Anthony Mejía
 * @version 03/03/2019/A
 */
public class TestType {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*boolean inserted = TypeDao.add(
                new Type("Tennis"));
        System.out.println(inserted);*/

        List<Type> list = com.dao.TypeDao.getAll();
        for (Type e : list) {
            System.out.println(e.getType_shoe());
        }

    }

}
