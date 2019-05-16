package com.tests;

import com.dao.BrandDao;
import com.models.Brand;
import java.sql.SQLException;
import java.util.List;

/**
 * En esta clase realizamos las pruebas de nuestros metodos Dao de Brand
 *
 * @author Anthony Mejía
 * @version 03/03/2019/A
 */
public class TestBrand {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       /* boolean inserted = BrandDao.add(
                new Brand("Nike"));
        System.out.println(inserted);*/

        List<Brand> list = com.dao.BrandDao.getAll();
        for (Brand e : list) {
            System.out.println(e.getName_brand());
        }

    }

}
