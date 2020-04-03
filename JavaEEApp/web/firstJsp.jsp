<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 02.04.2020
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date, ru.rogi.logic.TestClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <% Date now = new Date();
            String str = "Time is " + now;
            TestClass testClass = new TestClass();
        %>

        <%= "<p>" +  str  + "</p>" +
                "<p>" + testClass.info() + "</p>"
        %>

        <% for (int i = 0; i < 10; i++) {
            out.println("<p>" + "Number: " + i + "</p>"); }
        %>
    </p>
</body>
</html>
