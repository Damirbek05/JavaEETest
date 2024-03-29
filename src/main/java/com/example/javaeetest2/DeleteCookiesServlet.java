package com.example.javaeetest2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id","");
        Cookie cookie2 = new Cookie("some_name","Damirbek");
        cookie.setMaxAge(0);
        cookie2.setMaxAge(0);

        resp.addCookie(cookie);
        resp.addCookie(cookie2);
    }
}
