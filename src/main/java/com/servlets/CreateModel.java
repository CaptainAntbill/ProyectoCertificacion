package com.servlets;

import com.models.Model;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En CreateModel hacemos el insert de un Modelo de Calzado
 *
 * @author Anthony Mejía
 * @version 21/03/2019A
 */
@WebServlet(name = "CreateModel", urlPatterns = {"/CreateModel"})
public class CreateModel extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String name_model = request.getParameter("name_model");
            String price = request.getParameter("price");
            String units = request.getParameter("units");
            int type_id = Integer.parseInt(request.getParameter("type_id"));
            int brand_id = Integer.parseInt(request.getParameter("brand_id"));

            Model model = new Model(name_model, price, units, type_id, brand_id);
            com.dao.ModelDao.add(model);
            response.sendRedirect("ModelList");
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
