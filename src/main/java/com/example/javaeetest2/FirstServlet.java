package com.example.javaeetest2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname= req.getParameter("surname");
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<h1> Hello, " + name + " " + surname + " </h1>");
        pw.println("</html>");



        RequestDispatcher dispatcher = req.getRequestDispatcher("/testJsp.jsp");
        dispatcher.forward(req,resp);
    }

}
