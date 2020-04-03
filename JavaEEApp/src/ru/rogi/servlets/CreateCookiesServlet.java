package ru.rogi.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", "999");
        cookie.setMaxAge(60 * 60 * 24);

        Cookie cookie2 = new Cookie("some_name", "Bill");
        cookie2.setMaxAge(60 * 60 * 24);

        response.addCookie(cookie);
        response.addCookie(cookie2);

    }
}
