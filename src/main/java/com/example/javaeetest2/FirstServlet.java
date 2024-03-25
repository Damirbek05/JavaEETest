package com.example.javaeetest2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Cart cart = (Cart)session.getAttribute("cart");

        String name = req.getParameter("name");

        int quantity = Integer.parseInt(req.getParameter("quantity"));

        if(cart == null){
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart",cart);

//        PrintWriter pw = resp.getWriter();
//        pw.println("<html>");
//        pw.println("<h1> Your count is: " + count + "</h1>");
//        pw.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req,resp);

    }

}
