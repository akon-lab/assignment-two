<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ak_he
  Date: 12.09.2020
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../style/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital@1&display=swap" rel="stylesheet">

</head>
<%PrintWriter write = response.getWriter();%>
<body>
<div class="welcome">
    <h1>Welcome</h1>
</div>
<form action="Calc" method="post">
    <h2>Calculator "+"</h2>

    First:<input type="number" name="first">
    Second:<input type="number" name="second">

    <input type="submit" value="calculate">
    <%
        if (request.getAttribute("ans") != null) {
            write.print("Answer: " + request.getAttribute("ans"));
        }
    %>
</form>
</body>
</html>
