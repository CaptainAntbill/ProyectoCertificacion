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
 * En el servlet CreateBrand realizamos la creacion de las marcas existentes
 *
 * @author Anthony Mejía
 * @version 21/03/2019A
 */
@WebServlet(name = "CreateBrand", urlPatterns = {"/CreateBrand"})
public class CreateBrand extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            com.dao.BrandDao.add(new Brand(name));
            response.sendRedirect("BrandList");
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
