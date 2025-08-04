<%--
  Created by IntelliJ IDEA.
  User: arifa
  Date: 04-08-2025
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Help page</title>
</head>
<body>

<%
  String name = (String)request.getAttribute("name");
%>

    <h1>Example of help page (ModelViewController Functionality</h1>
      <h2>My name is <%=name%></h2>

</body>
</html>
