package ru.rogi.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter writer = response.getWriter();

        writer.println("<html>");

        for (Cookie cookie: cookies){
            writer.println("<p>" + cookie.getName() + " : " + cookie.getValue() + "</p>");
        }
        writer.println("</html>");
    }
}
