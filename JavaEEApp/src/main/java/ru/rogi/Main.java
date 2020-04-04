package ru.rogi;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("There are no Driver");
        }

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/java_ee_db", "igor", "A1a2a3a4a5");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM books");
            while (rs.next()){

                String author = rs.getString("author");
                String title = rs.getString("title");
                System.out.println(author + " : " + title);
            }
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
