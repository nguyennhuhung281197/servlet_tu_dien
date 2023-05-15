<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/15/2023
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Title</title>
    <link rel="stylesheet" type="text/html" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>

<form method="post" action="/translate">
    <input type="text" name="txtSearch" placeholder="Enter your word : ">
    <input type="submit" id="submit" value="Search">
</form>
</body>
</html>
