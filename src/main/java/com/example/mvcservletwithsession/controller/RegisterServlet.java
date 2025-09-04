package com.example.mvcservletwithsession.controller;

import com.example.mvcservletwithsession.model.Customer;
import com.example.mvcservletwithsession.model.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

import java.io.IOException;
import java.util.UUID;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Simple Validation
        if (name == null || name.isBlank() ||
                email == null || email.isBlank() ||
                password == null || password.isBlank()) {

            request.setAttribute("error", "All fields are required!");
            request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
            return;
        }

        // Create Customer and Account
        Customer customer = new Customer(name, email, password);
        String accountNumber = UUID.randomUUID().toString().substring(0, 8); // simple account number
        Account account = new Account(accountNumber, 1000.00); // initial balance

        // Store in session (later we’ll use DB)
        HttpSession session = request.getSession();
        session.setAttribute("customer", customer);
        session.setAttribute("account", account);

        // Success message
        request.setAttribute("success", "Registration successful! Your account number is: " + accountNumber);
        request.getRequestDispatcher("/WEB-INF/views/account.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
    }
}

