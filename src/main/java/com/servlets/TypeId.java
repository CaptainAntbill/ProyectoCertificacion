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
 * En el servlet TypeId obtenemos el Id de algun Tipo es necesario para su
 * actualizacion
 *
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "TypeId", urlPatterns = {"/TypeId"})
public class TypeId extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Type type = com.dao.TypeDao.getById(id);
            request.setAttribute("type", type);
            request.getRequestDispatcher("type_update.jsp").forward(request, response);
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
