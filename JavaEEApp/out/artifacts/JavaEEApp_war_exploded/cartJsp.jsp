<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 03.04.2020
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CartJsp</title>
</head>
<body>
        <%@page import="ru.rogi.cart.Cart, ru.rogi.cart.Good" %>
        <%
            Cart cart = (Cart) session.getAttribute("cart");
            for (Good good: cart.getGoods()){
                out.println("<p>" + good.toString() + "</p>");
            }
        %>
</body>
</html>
