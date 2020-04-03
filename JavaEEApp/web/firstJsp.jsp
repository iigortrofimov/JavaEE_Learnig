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
        <%
            Date date = new Date();
            String timeStr = "Time is " + date;
            TestClass testClass = new TestClass();
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
        %>

        <%=
                "<p>" + "Hello, " + name + " " + surname + "</p>" +
                "<p>" +  timeStr  + "</p>" +
                "<p>" + testClass.info() + "</p>"
        %>

    </p>
</body>
</html>
