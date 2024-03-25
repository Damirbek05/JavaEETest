<%@ page import="com.example.javaeetest2.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Damir
  Date: 25.03.2024
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName() %></p>
    <p> Количество: <%= cart.getQuantity() %></p>
</body>
</html>
