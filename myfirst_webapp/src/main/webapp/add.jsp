<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
       int n1=Integer.parseInt(request.getParameter("n1"));
       int n2=Integer.parseInt(request.getParameter("n2"));
    %>
    <h1>Sum is:<%=(n1+n2) %></h1>

</body>
</html>