/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.models.Model;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En este servlet desplegamos la lista con todos los elementos de Modelo
 *
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "ModelList", urlPatterns = {"/ModelList"})
public class ModelList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<Model> list;
            list = com.dao.ModelDao.getAll();
            request.setAttribute("lista", list);
            request.getRequestDispatcher("list_models.jsp").forward(request, response);
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
