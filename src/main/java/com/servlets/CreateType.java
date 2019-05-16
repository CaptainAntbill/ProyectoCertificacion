package com.servlets;

import com.models.Type;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En CreateType ejecutamos la creacion de un nuevo Tipo de Calzado
 *
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "CreateType", urlPatterns = {"/CreateType"})
public class CreateType extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            com.dao.TypeDao.add(new Type(name));
            response.sendRedirect("TypeList");
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
