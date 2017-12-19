package com.codeup.lister.controllers;

import com.codeup.lister.dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ItemDeleteServlet", urlPatterns = "/items/delete")
public class ItemDeleteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = (long) Integer.parseInt(request.getParameter("id"));
        boolean itemDeleted = DaoFactory.getItemsDao().deleteItem(id);
        response.sendRedirect("/items");
    }

}
