package com.example.mvcservletwithsession.controller;

// src/main/java/com/example/mvc/controller/LoginServlet.java

// ✅ Correct for Tomcat 9
import com.example.mvcservletwithsession.model.User;
import com.example.mvcservletwithsession.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("currentUser") != null) {
            // Already logged in → redirect
            response.sendRedirect(request.getContextPath() + "/dashboard");
        } else {
            // Not logged in → show login page
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Example check
        if ("admin".equals(username) && "123".equals(password)) {
            HttpSession session = request.getSession();
            User user = new User(username, "ADMIN"); // role can be dynamic later
            session.setAttribute("currentUser", user);
            response.sendRedirect(request.getContextPath() + "/dashboard");
        }
        else {
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }
}
