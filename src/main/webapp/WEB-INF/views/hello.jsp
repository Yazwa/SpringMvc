<%--
  Created by IntelliJ IDEA.
  User: syazwa
  Date: 2021-10-06
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- basially EL means Expression language , by default isELIgnored is true , if we make it false we can use ${attributeName} to get attributes instead of doing  String name = (String) request.getAttribute("name"); --%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Hello jsp page is the title</title>
</head>
<body>
    <h1>This is the hello heading</h1>
<%--<% String name = (String) request.getAttribute("name"); %>--%>
<h1> My  name is ${name}</h1>
</body>
</html>
