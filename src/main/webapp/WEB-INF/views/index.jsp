<%--
  Created by IntelliJ IDEA.
  User: arifa
  Date: 04-08-2025
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Testing Page</title>
</head>
<body>

<h1>Testing the configuration</h1>

<%
    String name = (String) request.getAttribute("name");
    String email = (String) request.getAttribute("email");
%>

<h1> My userid is <%=name%> </h1>
<h2> My email id is <%=email%></h2>

</body>
</html>
