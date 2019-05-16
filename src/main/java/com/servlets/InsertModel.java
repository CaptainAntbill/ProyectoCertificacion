package com.servlets;

import com.models.Brand;
import com.models.Type;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En InsertModel llamamos la lista de de Tipos de Calzado y Marca para poder
 * insertarlos en la Tabla Modelo
 *
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "InsertModel", urlPatterns = {"/InsertModel"})
public class InsertModel extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<Type> list;
            list = com.dao.TypeDao.getAll();
            request.setAttribute("list", list);
            List<Brand> list1;
            list1 = com.dao.BrandDao.getAll();
            request.setAttribute("list1", list1);
            request.getRequestDispatcher("insert_model.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
