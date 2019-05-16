/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.models.Brand;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En el servlet BrandUpdate realizamos el update de alguna Marca en especifico
 *
 * @author Anthony Mejía
 * @version 21/03/2019A
 */
@WebServlet(name = "BrandUpdate", urlPatterns = {"/BrandUpdate"})
public class BrandUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Brand brand;
            int id = Integer.parseInt(request.getParameter("id"));
            String name_brand = request.getParameter("name_brand");

            brand = new Brand(id, name_brand);
            com.dao.BrandDao.update(brand);
            response.sendRedirect("BrandId?id=" + id);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
