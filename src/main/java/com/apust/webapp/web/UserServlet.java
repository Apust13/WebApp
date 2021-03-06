package com.apust.webapp.web;

import com.apust.webapp.LoggerWrapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by GUN
 * on 07.07.2016.
 */
public class UserServlet extends HttpServlet {

    public static final LoggerWrapper LOG = LoggerWrapper.get(UserServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       LOG.debug("redirect to userList");
        request.getRequestDispatcher("/userList.jsp").forward(request, response);
        //response.sendRedirect("userList.jsp");

    }
}
