package com.codeup.lister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ItemShowServlet", urlPatterns = "/items/show")
public class ItemShowServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // store id of item to be shown
        // get that record object from DB using model logic
        request.getRequestDispatcher("/WEB-INF/item/show.jsp").forward(request, response);
    }

}
