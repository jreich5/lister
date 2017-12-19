package com.codeup.lister.controllers;

import com.codeup.lister.dao.DaoFactory;
import com.codeup.lister.dao.models.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ItemCreateServlet", urlPatterns = "/items/create")
public class ItemCreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // validate inputs
        // if valid, create the new item object and add to DB and redirect to index page
        // if invalid redirect back to the create form

        String name = request.getParameter("name");
        Item item = new Item(name);

        long lastInsertId = DaoFactory.getItemsDao().createItem(item);

        response.sendRedirect("/items");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/item/create.jsp").forward(request, response);
    }
}

