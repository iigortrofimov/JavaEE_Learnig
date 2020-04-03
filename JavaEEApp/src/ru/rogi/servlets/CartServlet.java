package ru.rogi.servlets;

import ru.rogi.cart.Cart;
import ru.rogi.cart.Good;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebServlet(name = "CartServlet")
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        String goodName= request.getParameter("goodname");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Good newGood = new Good(goodName, quantity);
        if (cart == null){
            cart = new Cart();
        }
        cart.addGood(newGood);
        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/cartJsp.jsp").forward(request, response);
    }
}
