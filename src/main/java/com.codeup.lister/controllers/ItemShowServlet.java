package com.codeup.lister.controllers;

import com.codeup.lister.dao.DaoFactory;
import com.codeup.lister.dao.models.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ItemShowServlet", urlPatterns = "/items/show")
public class ItemShowServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long searchId = (long) Integer.parseInt(request.getParameter("id"));
        Item item = DaoFactory.getItemsDao().findItemById(searchId);
        request.setAttribute("item", item);
        request.getRequestDispatcher("/WEB-INF/item/show.jsp").forward(request, response);
    }

}
