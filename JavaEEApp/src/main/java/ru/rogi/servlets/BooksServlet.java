package ru.rogi.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class BooksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("There are no Driver");
        }
        writer.println("<html>");


        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/java_ee_db", "igor", "A1a2a3a4a5");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM books");
            while (rs.next()){

                String author = rs.getString("author");
                String title = rs.getString("title");
                writer.println("<p>" + author + " : " + title  + "</p>");
                System.out.println(author + " : " + title);
            }
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
