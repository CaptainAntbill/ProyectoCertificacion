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
 * En TypeFiltrer realizamos el filtrado por Tipo de Calzado
 * 
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "TypeFiltrer", urlPatterns = {"/TypeFiltrer"})
public class TypeFiltrer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String id = request.getParameter("id");
            System.out.println("Id: " + id);
            List<Model> model = new ArrayList();
            model = com.dao.ModelDao.getFiltrerType(id);
            for(Model mod:model){
                System.out.println(mod.getTypeShoe());
            }
            request.setAttribute("models", model);
            request.getRequestDispatcher("type_filtrer.jsp").forward(request, response);
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
