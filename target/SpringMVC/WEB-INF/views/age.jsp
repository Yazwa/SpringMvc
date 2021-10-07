<%--
  Created by IntelliJ IDEA.
  User: syazwa
  Date: 2021-10-06
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Age</title>
</head>
<body>
<% int age = (int) request.getAttribute("age"); %>
<h1>My age is <%=age%></h1>


</body>
</html>
