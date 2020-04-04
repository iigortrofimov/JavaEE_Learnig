package ru.rogi.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer enterCount = (Integer) session.getAttribute("count");
        if (enterCount == null){
            session.setAttribute("count", 1);
            enterCount = 1;
        } else {
            session.setAttribute("count", ++enterCount);
        }


        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>\n<h1>Hello, "  + name + " " + surname + ", today you entered: " + enterCount + " times " +  "<h1>\n</html>");
/*        response.sendRedirect("https://www.google.com");
        response.sendRedirect("/firstJsp.jsp");
        response.sendRedirect("/test-jsp" + "?name=" + name +"&" + "surname=" + surname);*/
/*
        RequestDispatcher dispatcher = request.getRequestDispatcher("/test-jsp");
        dispatcher.forward(request, response);*/
    }
}
