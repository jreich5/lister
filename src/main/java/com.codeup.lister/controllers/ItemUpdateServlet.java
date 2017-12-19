package com.codeup.lister.controllers;

import com.codeup.lister.dao.DaoFactory;
import com.codeup.lister.dao.models.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "ItemUpdateServlet", urlPatterns = "/items/edit")
public class ItemUpdateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = (long) Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Item item = new Item(id, name);
        long numberOfRowsAffected = DaoFactory.getItemsDao().updateItem(item);
        System.out.println(numberOfRowsAffected);
        request.setAttribute("item", item);
        request.getRequestDispatcher("/WEB-INF/item/show.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long editId = (long) Integer.parseInt(request.getParameter("id"));
        Item item = DaoFactory.getItemsDao().findItemById(editId);
        request.setAttribute("item", item);
        request.getRequestDispatcher("/WEB-INF/item/edit.jsp").forward(request, response);
    }

}
