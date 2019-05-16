package com.servlets;

import com.models.Type;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En este servlet deplegamos toda la lista de Tipo de Calzado
 * 
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "TypeList", urlPatterns = {"/TypeList"})
public class TypeList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<Type> list = com.dao.TypeDao.getAll();

            request.setAttribute("lista", list);
            request.getRequestDispatcher("list_type.jsp").include(request, response);
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
