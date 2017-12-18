package com.codeup.lister.controllers;

import com.codeup.lister.dao.DaoFactory;
import com.codeup.lister.dao.Items;
import com.codeup.lister.dao.models.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ItemIndexServlet", urlPatterns = "/items")
public class ItemIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // logic here to pull all record objects from the DB and return them as a list
        ArrayList<Item> items = DaoFactory.getItemsDao().getAllItems();
        request.setAttribute("items", items);
        request.getRequestDispatcher("WEB-INF/item/index.jsp").forward(request, response);
    }
}
