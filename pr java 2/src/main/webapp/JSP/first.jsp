<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ak_he
  Date: 12.09.2020
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flower</title>
    <link rel="stylesheet" href="../style/index.css">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital@1&display=swap" rel="stylesheet">

</head>
<body>
<% PrintWriter write = response.getWriter();%>
<form action="Entering.java" method="post">
    <h1>Form</h1>
    <p>
        <% if(request.getAttribute("message") != null)
       write.print(request.getAttribute("message"));
        %>
    </p>

    <input placeholder="email" type="email" name="email">
    <input placeholder="pasword" type="password" name="pass">
    <input type="submit" value="submit">
</form>
</body>
</html>
