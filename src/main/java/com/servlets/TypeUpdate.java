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
 * En TypeUpdate podemos realizar la actualizacion de algun Tipo de Calzado
 *
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "TypeUpdate", urlPatterns = {"/TypeUpdate"})
public class TypeUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Type type;
            int id = Integer.parseInt(request.getParameter("id"));
            String type_shoe = request.getParameter("type_shoe");

            type = new Type(id, type_shoe);
            com.dao.TypeDao.update(type);
            response.sendRedirect("TypeId?id=" + id);
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
