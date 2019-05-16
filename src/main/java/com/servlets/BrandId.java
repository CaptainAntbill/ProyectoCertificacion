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
 * En el servlet BrandId obtenemos el Id con el metodo getById de una Marca para
 * poder actualizarlo
 *
 * @author Anthony Mejía
 * @version 21/03/2019A
 */
@WebServlet(name = "BrandId", urlPatterns = {"/BrandId"})
public class BrandId extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Brand brand = com.dao.BrandDao.getById(id);
            request.setAttribute("brand", brand);
            request.getRequestDispatcher("brand_update.jsp").forward(request, response);
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
