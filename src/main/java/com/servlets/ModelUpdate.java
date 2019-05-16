/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * En ModelUpdate realizamos el update de nuestro Modelo
 *
 * @author Anthony Mejía
 * @version 22/03/2019A
 */
@WebServlet(name = "ModelUpdate", urlPatterns = {"/ModelUpdate"})
public class ModelUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Model model;
            int id = Integer.parseInt(request.getParameter("id"));
            String name_model = request.getParameter("name_model");
            String price = request.getParameter("price");
            String units = request.getParameter("units");
            model = new Model(id, name_model, price, units);
            com.dao.ModelDao.update(model);
            response.sendRedirect("ModelId?id=" + id);
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
