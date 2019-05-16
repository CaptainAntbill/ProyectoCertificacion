package com.servlets;

import com.models.Model;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En el servlet BrandFiltrer se ejecuta el filtrado por Marca donde llamamos al
 * metodo getFiltrer
 *
 * @author Anthony Mejía
 * @version 20/03/2019A
 */
@WebServlet(name = "BrandFiltrer", urlPatterns = {"/BrandFiltrer"})
public class BrandFiltrer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            System.out.println("ID: " + id);
            List<Model> model = new ArrayList();
            model = com.dao.ModelDao.getFiltrer(id);
            for (Model mod : model) {
                System.out.println(mod.getBrand());
            }
            request.setAttribute("models", model);
            request.getRequestDispatcher("brand_filtrer.jsp").forward(request, response);
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
