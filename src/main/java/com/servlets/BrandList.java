package com.servlets;

import com.models.Brand;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En este servlet desplegamos la lista con todas las marcas
 *
 * @author Anthony Mejía
 * @version 21/03/2019A
 */
@WebServlet(name = "BrandList", urlPatterns = {"/BrandList"})
public class BrandList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<Brand> list = com.dao.BrandDao.getAll();

            request.setAttribute("lista", list);
            request.getRequestDispatcher("list_brand.jsp").include(request, response);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
